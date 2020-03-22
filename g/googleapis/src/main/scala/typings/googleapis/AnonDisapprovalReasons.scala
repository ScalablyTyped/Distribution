package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisapprovalReasons extends js.Object {
  var contexts: js.UndefOr[js.Array[AnonAuctionType]] = js.native
  var disapprovalReasons: js.UndefOr[js.Array[AnonDetails]] = js.native
  var reason: js.UndefOr[String] = js.native
}

object AnonDisapprovalReasons {
  @scala.inline
  def apply(
    contexts: js.Array[AnonAuctionType] = null,
    disapprovalReasons: js.Array[AnonDetails] = null,
    reason: String = null
  ): AnonDisapprovalReasons = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisapprovalReasons]
  }
}


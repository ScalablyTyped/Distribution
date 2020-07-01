package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisapprovalReasons extends js.Object {
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.native
  var disapprovalReasons: js.UndefOr[js.Array[Details]] = js.native
  var reason: js.UndefOr[String] = js.native
}

object DisapprovalReasons {
  @scala.inline
  def apply(
    contexts: js.Array[AuctionType] = null,
    disapprovalReasons: js.Array[Details] = null,
    reason: String = null
  ): DisapprovalReasons = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisapprovalReasons]
  }
}


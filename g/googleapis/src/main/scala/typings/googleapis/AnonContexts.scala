package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContexts extends js.Object {
  var contexts: js.UndefOr[js.Array[AnonAuctionType]] = js.native
  var details: js.UndefOr[js.Array[String]] = js.native
  var reason: js.UndefOr[String] = js.native
}

object AnonContexts {
  @scala.inline
  def apply(
    contexts: js.Array[AnonAuctionType] = null,
    details: js.Array[String] = null,
    reason: String = null
  ): AnonContexts = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContexts]
  }
}


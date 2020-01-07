package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ContextsDisapprovalReasons extends js.Object {
  var contexts: js.UndefOr[js.Array[Anon_AuctionType]] = js.native
  var disapprovalReasons: js.UndefOr[js.Array[Anon_Details]] = js.native
  var reason: js.UndefOr[String] = js.native
}

object Anon_ContextsDisapprovalReasons {
  @scala.inline
  def apply(
    contexts: js.Array[Anon_AuctionType] = null,
    disapprovalReasons: js.Array[Anon_Details] = null,
    reason: String = null
  ): Anon_ContextsDisapprovalReasons = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (disapprovalReasons != null) __obj.updateDynamic("disapprovalReasons")(disapprovalReasons.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextsDisapprovalReasons]
  }
}


package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Contexts extends js.Object {
  var contexts: js.UndefOr[js.Array[Anon_AuctionType]] = js.native
  var details: js.UndefOr[js.Array[String]] = js.native
  var reason: js.UndefOr[String] = js.native
}

object Anon_Contexts {
  @scala.inline
  def apply(
    contexts: js.Array[Anon_AuctionType] = null,
    details: js.Array[String] = null,
    reason: String = null
  ): Anon_Contexts = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Contexts]
  }
}


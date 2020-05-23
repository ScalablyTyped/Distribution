package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contexts extends js.Object {
  /** All known serving contexts containing serving status information. */
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.undefined
  /** Additional details about the correction. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  /** The type of correction that was applied to the creative. */
  var reason: js.UndefOr[String] = js.undefined
}

object Contexts {
  @scala.inline
  def apply(contexts: js.Array[AuctionType] = null, details: js.Array[String] = null, reason: String = null): Contexts = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contexts]
  }
}


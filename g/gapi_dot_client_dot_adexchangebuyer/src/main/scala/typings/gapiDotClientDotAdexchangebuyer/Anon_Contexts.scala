package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contexts extends js.Object {
  /** All known serving contexts containing serving status information. */
  var contexts: js.UndefOr[js.Array[Anon_AuctionType]] = js.undefined
  /** Additional details about the correction. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  /** The type of correction that was applied to the creative. */
  var reason: js.UndefOr[String] = js.undefined
}

object Anon_Contexts {
  @scala.inline
  def apply(
    contexts: js.Array[Anon_AuctionType] = null,
    details: js.Array[String] = null,
    reason: String = null
  ): Anon_Contexts = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Anon_Contexts]
  }
}


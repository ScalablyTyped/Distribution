package typings.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetails extends js.Object {
  /** Additional details about the reason for disapproval. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  /** The categorized reason for disapproval. */
  var reason: js.UndefOr[String] = js.undefined
}

object AnonDetails {
  @scala.inline
  def apply(details: js.Array[String] = null, reason: String = null): AnonDetails = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
}


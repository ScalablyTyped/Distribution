package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disapproval extends js.Object {
  /** Additional details about the reason for disapproval. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  /** The categorized reason for disapproval. */
  var reason: js.UndefOr[String] = js.undefined
}

object Disapproval {
  @scala.inline
  def apply(details: js.Array[String] = null, reason: String = null): Disapproval = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Disapproval]
  }
}


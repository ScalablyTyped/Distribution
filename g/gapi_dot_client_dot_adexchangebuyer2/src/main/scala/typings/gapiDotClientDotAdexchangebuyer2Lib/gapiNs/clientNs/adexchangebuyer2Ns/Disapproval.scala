package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disapproval extends js.Object {
  /** Additional details about the reason for disapproval. */
  var details: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The categorized reason for disapproval. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

object Disapproval {
  @scala.inline
  def apply(details: js.Array[java.lang.String] = null, reason: java.lang.String = null): Disapproval = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Disapproval]
  }
}


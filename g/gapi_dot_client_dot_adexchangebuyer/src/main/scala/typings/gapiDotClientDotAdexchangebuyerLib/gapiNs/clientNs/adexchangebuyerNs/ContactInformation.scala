package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactInformation extends js.Object {
  /** Email address of the contact. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the contact. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ContactInformation {
  @scala.inline
  def apply(email: java.lang.String = null, name: java.lang.String = null): ContactInformation = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ContactInformation]
  }
}


package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vcard extends js.Object {
  /** The street address of the entity. */
  var adr: js.UndefOr[VcardAddress] = js.undefined
  /** An email address that can be used to reach the contact. */
  var email: js.UndefOr[VcardTypedText] = js.undefined
  /** The full name of the contact person. For example: John A. Smith. */
  var fn: js.UndefOr[java.lang.String] = js.undefined
  /** The organization associated with the registering entity. */
  var org: js.UndefOr[VcardTypedText] = js.undefined
  /** A telephone number that can be used to call the contact. */
  var tel: js.UndefOr[VcardTelephone] = js.undefined
}

object Vcard {
  @scala.inline
  def apply(
    adr: VcardAddress = null,
    email: VcardTypedText = null,
    fn: java.lang.String = null,
    org: VcardTypedText = null,
    tel: VcardTelephone = null
  ): Vcard = {
    val __obj = js.Dynamic.literal()
    if (adr != null) __obj.updateDynamic("adr")(adr)
    if (email != null) __obj.updateDynamic("email")(email)
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (org != null) __obj.updateDynamic("org")(org)
    if (tel != null) __obj.updateDynamic("tel")(tel)
    __obj.asInstanceOf[Vcard]
  }
}


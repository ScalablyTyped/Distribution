package typings.gapiDotClientDotSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vcard extends js.Object {
  /** The street address of the entity. */
  var adr: js.UndefOr[VcardAddress] = js.undefined
  /** An email address that can be used to reach the contact. */
  var email: js.UndefOr[VcardTypedText] = js.undefined
  /** The full name of the contact person. For example: John A. Smith. */
  var fn: js.UndefOr[String] = js.undefined
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
    fn: String = null,
    org: VcardTypedText = null,
    tel: VcardTelephone = null
  ): Vcard = {
    val __obj = js.Dynamic.literal()
    if (adr != null) __obj.updateDynamic("adr")(adr.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(fn.asInstanceOf[js.Any])
    if (org != null) __obj.updateDynamic("org")(org.asInstanceOf[js.Any])
    if (tel != null) __obj.updateDynamic("tel")(tel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vcard]
  }
}


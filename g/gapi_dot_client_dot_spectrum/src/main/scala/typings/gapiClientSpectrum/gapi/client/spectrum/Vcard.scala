package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vcard extends js.Object {
  /** The street address of the entity. */
  var adr: js.UndefOr[VcardAddress] = js.native
  /** An email address that can be used to reach the contact. */
  var email: js.UndefOr[VcardTypedText] = js.native
  /** The full name of the contact person. For example: John A. Smith. */
  var fn: js.UndefOr[String] = js.native
  /** The organization associated with the registering entity. */
  @JSName("org")
  var org_ : js.UndefOr[VcardTypedText] = js.native
  /** A telephone number that can be used to call the contact. */
  var tel: js.UndefOr[VcardTelephone] = js.native
}

object Vcard {
  @scala.inline
  def apply(): Vcard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vcard]
  }
  @scala.inline
  implicit class VcardOps[Self <: Vcard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdr(value: VcardAddress): Self = this.set("adr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdr: Self = this.set("adr", js.undefined)
    @scala.inline
    def setEmail(value: VcardTypedText): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFn(value: String): Self = this.set("fn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setOrg_(value: VcardTypedText): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrg_ : Self = this.set("org", js.undefined)
    @scala.inline
    def setTel(value: VcardTelephone): Self = this.set("tel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTel: Self = this.set("tel", js.undefined)
  }
  
}


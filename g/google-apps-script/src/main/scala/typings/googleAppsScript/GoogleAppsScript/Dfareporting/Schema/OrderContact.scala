package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderContact extends js.Object {
  var contactInfo: js.UndefOr[String] = js.native
  var contactName: js.UndefOr[String] = js.native
  var contactTitle: js.UndefOr[String] = js.native
  var contactType: js.UndefOr[String] = js.native
  var signatureUserProfileId: js.UndefOr[String] = js.native
}

object OrderContact {
  @scala.inline
  def apply(): OrderContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderContact]
  }
  @scala.inline
  implicit class OrderContactOps[Self <: OrderContact] (val x: Self) extends AnyVal {
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
    def setContactInfo(value: String): Self = this.set("contactInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactInfo: Self = this.set("contactInfo", js.undefined)
    @scala.inline
    def setContactName(value: String): Self = this.set("contactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactName: Self = this.set("contactName", js.undefined)
    @scala.inline
    def setContactTitle(value: String): Self = this.set("contactTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactTitle: Self = this.set("contactTitle", js.undefined)
    @scala.inline
    def setContactType(value: String): Self = this.set("contactType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactType: Self = this.set("contactType", js.undefined)
    @scala.inline
    def setSignatureUserProfileId(value: String): Self = this.set("signatureUserProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureUserProfileId: Self = this.set("signatureUserProfileId", js.undefined)
  }
  
}


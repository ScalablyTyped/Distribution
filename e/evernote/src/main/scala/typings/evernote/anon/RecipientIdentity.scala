package typings.evernote.anon

import typings.evernote.mod.Types.Identity
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientIdentity extends js.Object {
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientIdentity: js.UndefOr[Identity] = js.native
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  var sharerUserID: js.UndefOr[UserID] = js.native
}

object RecipientIdentity {
  @scala.inline
  def apply(): RecipientIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentity]
  }
  @scala.inline
  implicit class RecipientIdentityOps[Self <: RecipientIdentity] (val x: Self) extends AnyVal {
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
    def setPrivilege(value: SharedNotePrivilegeLevel): Self = this.set("privilege", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    @scala.inline
    def setRecipientIdentity(value: Identity): Self = this.set("recipientIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientIdentity: Self = this.set("recipientIdentity", js.undefined)
    @scala.inline
    def setServiceAssigned(value: Timestamp): Self = this.set("serviceAssigned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAssigned: Self = this.set("serviceAssigned", js.undefined)
    @scala.inline
    def setServiceCreated(value: Timestamp): Self = this.set("serviceCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCreated: Self = this.set("serviceCreated", js.undefined)
    @scala.inline
    def setServiceUpdated(value: Timestamp): Self = this.set("serviceUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdated: Self = this.set("serviceUpdated", js.undefined)
    @scala.inline
    def setSharerUserID(value: UserID): Self = this.set("sharerUserID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharerUserID: Self = this.set("sharerUserID", js.undefined)
  }
  
}


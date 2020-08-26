package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import typings.evernote.mod.Types.SharedNotebookRecipientSettings
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  var email: js.UndefOr[String] = js.native
  var globalId: js.UndefOr[String] = js.native
  var id: js.UndefOr[Double] = js.native
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var notebookModifiable: js.UndefOr[Boolean] = js.native
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  var recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.native
  var recipientSettings: js.UndefOr[SharedNotebookRecipientSettings] = js.native
  var recipientUserId: js.UndefOr[UserID] = js.native
  var recipientUsername: js.UndefOr[String] = js.native
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
  var userId: js.UndefOr[UserID] = js.native
  var username: js.UndefOr[String] = js.native
}

object Email {
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setGlobalId(value: String): Self = this.set("globalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalId: Self = this.set("globalId", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNotebookGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("notebookGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookGuid: Self = this.set("notebookGuid", js.undefined)
    @scala.inline
    def setNotebookModifiable(value: Boolean): Self = this.set("notebookModifiable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotebookModifiable: Self = this.set("notebookModifiable", js.undefined)
    @scala.inline
    def setPrivilege(value: SharedNotebookPrivilegeLevel): Self = this.set("privilege", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivilege: Self = this.set("privilege", js.undefined)
    @scala.inline
    def setRecipientIdentityId(value: typings.evernote.mod.Types.IdentityID): Self = this.set("recipientIdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientIdentityId: Self = this.set("recipientIdentityId", js.undefined)
    @scala.inline
    def setRecipientSettings(value: SharedNotebookRecipientSettings): Self = this.set("recipientSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientSettings: Self = this.set("recipientSettings", js.undefined)
    @scala.inline
    def setRecipientUserId(value: UserID): Self = this.set("recipientUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientUserId: Self = this.set("recipientUserId", js.undefined)
    @scala.inline
    def setRecipientUsername(value: String): Self = this.set("recipientUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientUsername: Self = this.set("recipientUsername", js.undefined)
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
    def setSharerUserId(value: UserID): Self = this.set("sharerUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharerUserId: Self = this.set("sharerUserId", js.undefined)
    @scala.inline
    def setUserId(value: UserID): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}


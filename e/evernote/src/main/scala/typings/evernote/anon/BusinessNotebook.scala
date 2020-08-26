package typings.evernote.anon

import typings.evernote.mod.Types.NotebookRecipientSettings
import typings.evernote.mod.Types.NotebookRestrictions
import typings.evernote.mod.Types.Publishing
import typings.evernote.mod.Types.SharedNotebook
import typings.evernote.mod.Types.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessNotebook extends js.Object {
  var businessNotebook: js.UndefOr[typings.evernote.mod.Types.BusinessNotebook] = js.native
  var contact: js.UndefOr[User] = js.native
  var defaultNotebook: js.UndefOr[Boolean] = js.native
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.native
  var name: js.UndefOr[String] = js.native
  var published: js.UndefOr[Boolean] = js.native
  var publishing: js.UndefOr[Publishing] = js.native
  var recipientSettings: js.UndefOr[NotebookRecipientSettings] = js.native
  var restrictions: js.UndefOr[NotebookRestrictions] = js.native
  var serviceCreated: js.UndefOr[Double] = js.native
  var serviceUpdated: js.UndefOr[Double] = js.native
  var sharedNotebookIds: js.UndefOr[js.Array[Double]] = js.native
  var sharedNotebooks: js.UndefOr[js.Array[SharedNotebook]] = js.native
  var stack: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
}

object BusinessNotebook {
  @scala.inline
  def apply(): BusinessNotebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessNotebook]
  }
  @scala.inline
  implicit class BusinessNotebookOps[Self <: BusinessNotebook] (val x: Self) extends AnyVal {
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
    def setBusinessNotebook(value: typings.evernote.mod.Types.BusinessNotebook): Self = this.set("businessNotebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessNotebook: Self = this.set("businessNotebook", js.undefined)
    @scala.inline
    def setContact(value: User): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setDefaultNotebook(value: Boolean): Self = this.set("defaultNotebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNotebook: Self = this.set("defaultNotebook", js.undefined)
    @scala.inline
    def setGuid(value: typings.evernote.mod.Types.Guid): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setPublishing(value: Publishing): Self = this.set("publishing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishing: Self = this.set("publishing", js.undefined)
    @scala.inline
    def setRecipientSettings(value: NotebookRecipientSettings): Self = this.set("recipientSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientSettings: Self = this.set("recipientSettings", js.undefined)
    @scala.inline
    def setRestrictions(value: NotebookRestrictions): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
    @scala.inline
    def setServiceCreated(value: Double): Self = this.set("serviceCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCreated: Self = this.set("serviceCreated", js.undefined)
    @scala.inline
    def setServiceUpdated(value: Double): Self = this.set("serviceUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdated: Self = this.set("serviceUpdated", js.undefined)
    @scala.inline
    def setSharedNotebookIdsVarargs(value: Double*): Self = this.set("sharedNotebookIds", js.Array(value :_*))
    @scala.inline
    def setSharedNotebookIds(value: js.Array[Double]): Self = this.set("sharedNotebookIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedNotebookIds: Self = this.set("sharedNotebookIds", js.undefined)
    @scala.inline
    def setSharedNotebooksVarargs(value: SharedNotebook*): Self = this.set("sharedNotebooks", js.Array(value :_*))
    @scala.inline
    def setSharedNotebooks(value: js.Array[SharedNotebook]): Self = this.set("sharedNotebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedNotebooks: Self = this.set("sharedNotebooks", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setUpdateSequenceNum(value: Double): Self = this.set("updateSequenceNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSequenceNum: Self = this.set("updateSequenceNum", js.undefined)
  }
  
}


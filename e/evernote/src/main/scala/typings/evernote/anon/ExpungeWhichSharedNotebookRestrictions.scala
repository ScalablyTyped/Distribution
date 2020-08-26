package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebookInstanceRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpungeWhichSharedNotebookRestrictions extends js.Object {
  var expungeWhichSharedNotebookRestrictions: js.UndefOr[SharedNotebookInstanceRestrictions] = js.native
  var noCreateNotes: js.UndefOr[Boolean] = js.native
  var noCreateSharedNotebooks: js.UndefOr[Boolean] = js.native
  var noCreateTags: js.UndefOr[Boolean] = js.native
  var noEmailNotes: js.UndefOr[Boolean] = js.native
  var noExpungeNotebook: js.UndefOr[Boolean] = js.native
  var noExpungeNotes: js.UndefOr[Boolean] = js.native
  var noExpungeTags: js.UndefOr[Boolean] = js.native
  var noPublishToBusinessLibrary: js.UndefOr[Boolean] = js.native
  var noPublishToPublic: js.UndefOr[Boolean] = js.native
  var noReadNotes: js.UndefOr[Boolean] = js.native
  var noRenameNotebook: js.UndefOr[Boolean] = js.native
  var noSendMessageToRecipients: js.UndefOr[Boolean] = js.native
  var noSetDefaultNotebook: js.UndefOr[Boolean] = js.native
  var noSetNotebookStack: js.UndefOr[Boolean] = js.native
  var noSetParentTag: js.UndefOr[Boolean] = js.native
  var noShareNotes: js.UndefOr[Boolean] = js.native
  var noShareNotesWithBusiness: js.UndefOr[Boolean] = js.native
  var noUpdateNotebook: js.UndefOr[Boolean] = js.native
  var noUpdateNotes: js.UndefOr[Boolean] = js.native
  var noUpdateTags: js.UndefOr[Boolean] = js.native
  var updateWhichSharedNotebookRestrictions: js.UndefOr[SharedNotebookInstanceRestrictions] = js.native
}

object ExpungeWhichSharedNotebookRestrictions {
  @scala.inline
  def apply(): ExpungeWhichSharedNotebookRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpungeWhichSharedNotebookRestrictions]
  }
  @scala.inline
  implicit class ExpungeWhichSharedNotebookRestrictionsOps[Self <: ExpungeWhichSharedNotebookRestrictions] (val x: Self) extends AnyVal {
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
    def setExpungeWhichSharedNotebookRestrictions(value: SharedNotebookInstanceRestrictions): Self = this.set("expungeWhichSharedNotebookRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpungeWhichSharedNotebookRestrictions: Self = this.set("expungeWhichSharedNotebookRestrictions", js.undefined)
    @scala.inline
    def setNoCreateNotes(value: Boolean): Self = this.set("noCreateNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCreateNotes: Self = this.set("noCreateNotes", js.undefined)
    @scala.inline
    def setNoCreateSharedNotebooks(value: Boolean): Self = this.set("noCreateSharedNotebooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCreateSharedNotebooks: Self = this.set("noCreateSharedNotebooks", js.undefined)
    @scala.inline
    def setNoCreateTags(value: Boolean): Self = this.set("noCreateTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCreateTags: Self = this.set("noCreateTags", js.undefined)
    @scala.inline
    def setNoEmailNotes(value: Boolean): Self = this.set("noEmailNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEmailNotes: Self = this.set("noEmailNotes", js.undefined)
    @scala.inline
    def setNoExpungeNotebook(value: Boolean): Self = this.set("noExpungeNotebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoExpungeNotebook: Self = this.set("noExpungeNotebook", js.undefined)
    @scala.inline
    def setNoExpungeNotes(value: Boolean): Self = this.set("noExpungeNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoExpungeNotes: Self = this.set("noExpungeNotes", js.undefined)
    @scala.inline
    def setNoExpungeTags(value: Boolean): Self = this.set("noExpungeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoExpungeTags: Self = this.set("noExpungeTags", js.undefined)
    @scala.inline
    def setNoPublishToBusinessLibrary(value: Boolean): Self = this.set("noPublishToBusinessLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoPublishToBusinessLibrary: Self = this.set("noPublishToBusinessLibrary", js.undefined)
    @scala.inline
    def setNoPublishToPublic(value: Boolean): Self = this.set("noPublishToPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoPublishToPublic: Self = this.set("noPublishToPublic", js.undefined)
    @scala.inline
    def setNoReadNotes(value: Boolean): Self = this.set("noReadNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoReadNotes: Self = this.set("noReadNotes", js.undefined)
    @scala.inline
    def setNoRenameNotebook(value: Boolean): Self = this.set("noRenameNotebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRenameNotebook: Self = this.set("noRenameNotebook", js.undefined)
    @scala.inline
    def setNoSendMessageToRecipients(value: Boolean): Self = this.set("noSendMessageToRecipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSendMessageToRecipients: Self = this.set("noSendMessageToRecipients", js.undefined)
    @scala.inline
    def setNoSetDefaultNotebook(value: Boolean): Self = this.set("noSetDefaultNotebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSetDefaultNotebook: Self = this.set("noSetDefaultNotebook", js.undefined)
    @scala.inline
    def setNoSetNotebookStack(value: Boolean): Self = this.set("noSetNotebookStack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSetNotebookStack: Self = this.set("noSetNotebookStack", js.undefined)
    @scala.inline
    def setNoSetParentTag(value: Boolean): Self = this.set("noSetParentTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSetParentTag: Self = this.set("noSetParentTag", js.undefined)
    @scala.inline
    def setNoShareNotes(value: Boolean): Self = this.set("noShareNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoShareNotes: Self = this.set("noShareNotes", js.undefined)
    @scala.inline
    def setNoShareNotesWithBusiness(value: Boolean): Self = this.set("noShareNotesWithBusiness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoShareNotesWithBusiness: Self = this.set("noShareNotesWithBusiness", js.undefined)
    @scala.inline
    def setNoUpdateNotebook(value: Boolean): Self = this.set("noUpdateNotebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUpdateNotebook: Self = this.set("noUpdateNotebook", js.undefined)
    @scala.inline
    def setNoUpdateNotes(value: Boolean): Self = this.set("noUpdateNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUpdateNotes: Self = this.set("noUpdateNotes", js.undefined)
    @scala.inline
    def setNoUpdateTags(value: Boolean): Self = this.set("noUpdateTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoUpdateTags: Self = this.set("noUpdateTags", js.undefined)
    @scala.inline
    def setUpdateWhichSharedNotebookRestrictions(value: SharedNotebookInstanceRestrictions): Self = this.set("updateWhichSharedNotebookRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateWhichSharedNotebookRestrictions: Self = this.set("updateWhichSharedNotebookRestrictions", js.undefined)
  }
  
}


package typings.evernote

import typings.evernote.mod.Evernote.SharedNotebookInstanceRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpungeWhichSharedNotebookRestrictions extends js.Object {
  var expungeWhichSharedNotebookRestrictions: js.UndefOr[SharedNotebookInstanceRestrictions] = js.undefined
  var noCreateNotes: js.UndefOr[Boolean] = js.undefined
  var noCreateSharedNotebooks: js.UndefOr[Boolean] = js.undefined
  var noCreateTags: js.UndefOr[Boolean] = js.undefined
  var noEmailNotes: js.UndefOr[Boolean] = js.undefined
  var noExpungeNotebook: js.UndefOr[Boolean] = js.undefined
  var noExpungeNotes: js.UndefOr[Boolean] = js.undefined
  var noExpungeTags: js.UndefOr[Boolean] = js.undefined
  var noPublishToBusinessLibrary: js.UndefOr[Boolean] = js.undefined
  var noPublishToPublic: js.UndefOr[Boolean] = js.undefined
  var noReadNotes: js.UndefOr[Boolean] = js.undefined
  var noSendMessageToRecipients: js.UndefOr[Boolean] = js.undefined
  var noSetDefaultNotebook: js.UndefOr[Boolean] = js.undefined
  var noSetNotebookStack: js.UndefOr[Boolean] = js.undefined
  var noSetParentTag: js.UndefOr[Boolean] = js.undefined
  var noShareNotes: js.UndefOr[Boolean] = js.undefined
  var noUpdateNotebook: js.UndefOr[Boolean] = js.undefined
  var noUpdateNotes: js.UndefOr[Boolean] = js.undefined
  var noUpdateTags: js.UndefOr[Boolean] = js.undefined
  var updateWhichSharedNotebookRestrictions: js.UndefOr[SharedNotebookInstanceRestrictions] = js.undefined
}

object AnonExpungeWhichSharedNotebookRestrictions {
  @scala.inline
  def apply(
    expungeWhichSharedNotebookRestrictions: SharedNotebookInstanceRestrictions = null,
    noCreateNotes: js.UndefOr[Boolean] = js.undefined,
    noCreateSharedNotebooks: js.UndefOr[Boolean] = js.undefined,
    noCreateTags: js.UndefOr[Boolean] = js.undefined,
    noEmailNotes: js.UndefOr[Boolean] = js.undefined,
    noExpungeNotebook: js.UndefOr[Boolean] = js.undefined,
    noExpungeNotes: js.UndefOr[Boolean] = js.undefined,
    noExpungeTags: js.UndefOr[Boolean] = js.undefined,
    noPublishToBusinessLibrary: js.UndefOr[Boolean] = js.undefined,
    noPublishToPublic: js.UndefOr[Boolean] = js.undefined,
    noReadNotes: js.UndefOr[Boolean] = js.undefined,
    noSendMessageToRecipients: js.UndefOr[Boolean] = js.undefined,
    noSetDefaultNotebook: js.UndefOr[Boolean] = js.undefined,
    noSetNotebookStack: js.UndefOr[Boolean] = js.undefined,
    noSetParentTag: js.UndefOr[Boolean] = js.undefined,
    noShareNotes: js.UndefOr[Boolean] = js.undefined,
    noUpdateNotebook: js.UndefOr[Boolean] = js.undefined,
    noUpdateNotes: js.UndefOr[Boolean] = js.undefined,
    noUpdateTags: js.UndefOr[Boolean] = js.undefined,
    updateWhichSharedNotebookRestrictions: SharedNotebookInstanceRestrictions = null
  ): AnonExpungeWhichSharedNotebookRestrictions = {
    val __obj = js.Dynamic.literal()
    if (expungeWhichSharedNotebookRestrictions != null) __obj.updateDynamic("expungeWhichSharedNotebookRestrictions")(expungeWhichSharedNotebookRestrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(noCreateNotes)) __obj.updateDynamic("noCreateNotes")(noCreateNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(noCreateSharedNotebooks)) __obj.updateDynamic("noCreateSharedNotebooks")(noCreateSharedNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(noCreateTags)) __obj.updateDynamic("noCreateTags")(noCreateTags.asInstanceOf[js.Any])
    if (!js.isUndefined(noEmailNotes)) __obj.updateDynamic("noEmailNotes")(noEmailNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(noExpungeNotebook)) __obj.updateDynamic("noExpungeNotebook")(noExpungeNotebook.asInstanceOf[js.Any])
    if (!js.isUndefined(noExpungeNotes)) __obj.updateDynamic("noExpungeNotes")(noExpungeNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(noExpungeTags)) __obj.updateDynamic("noExpungeTags")(noExpungeTags.asInstanceOf[js.Any])
    if (!js.isUndefined(noPublishToBusinessLibrary)) __obj.updateDynamic("noPublishToBusinessLibrary")(noPublishToBusinessLibrary.asInstanceOf[js.Any])
    if (!js.isUndefined(noPublishToPublic)) __obj.updateDynamic("noPublishToPublic")(noPublishToPublic.asInstanceOf[js.Any])
    if (!js.isUndefined(noReadNotes)) __obj.updateDynamic("noReadNotes")(noReadNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(noSendMessageToRecipients)) __obj.updateDynamic("noSendMessageToRecipients")(noSendMessageToRecipients.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetDefaultNotebook)) __obj.updateDynamic("noSetDefaultNotebook")(noSetDefaultNotebook.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetNotebookStack)) __obj.updateDynamic("noSetNotebookStack")(noSetNotebookStack.asInstanceOf[js.Any])
    if (!js.isUndefined(noSetParentTag)) __obj.updateDynamic("noSetParentTag")(noSetParentTag.asInstanceOf[js.Any])
    if (!js.isUndefined(noShareNotes)) __obj.updateDynamic("noShareNotes")(noShareNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(noUpdateNotebook)) __obj.updateDynamic("noUpdateNotebook")(noUpdateNotebook.asInstanceOf[js.Any])
    if (!js.isUndefined(noUpdateNotes)) __obj.updateDynamic("noUpdateNotes")(noUpdateNotes.asInstanceOf[js.Any])
    if (!js.isUndefined(noUpdateTags)) __obj.updateDynamic("noUpdateTags")(noUpdateTags.asInstanceOf[js.Any])
    if (updateWhichSharedNotebookRestrictions != null) __obj.updateDynamic("updateWhichSharedNotebookRestrictions")(updateWhichSharedNotebookRestrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpungeWhichSharedNotebookRestrictions]
  }
}


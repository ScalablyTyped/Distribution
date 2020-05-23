package typings.evernote.anon

import typings.evernote.mod.Types.NotebookRecipientSettings
import typings.evernote.mod.Types.NotebookRestrictions
import typings.evernote.mod.Types.Publishing
import typings.evernote.mod.Types.SharedNotebook
import typings.evernote.mod.Types.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessNotebook extends js.Object {
  var businessNotebook: js.UndefOr[typings.evernote.mod.Types.BusinessNotebook] = js.undefined
  var contact: js.UndefOr[User] = js.undefined
  var defaultNotebook: js.UndefOr[Boolean] = js.undefined
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var published: js.UndefOr[Boolean] = js.undefined
  var publishing: js.UndefOr[Publishing] = js.undefined
  var recipientSettings: js.UndefOr[NotebookRecipientSettings] = js.undefined
  var restrictions: js.UndefOr[NotebookRestrictions] = js.undefined
  var serviceCreated: js.UndefOr[Double] = js.undefined
  var serviceUpdated: js.UndefOr[Double] = js.undefined
  var sharedNotebookIds: js.UndefOr[js.Array[Double]] = js.undefined
  var sharedNotebooks: js.UndefOr[js.Array[SharedNotebook]] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object BusinessNotebook {
  @scala.inline
  def apply(
    businessNotebook: typings.evernote.mod.Types.BusinessNotebook = null,
    contact: User = null,
    defaultNotebook: js.UndefOr[Boolean] = js.undefined,
    guid: typings.evernote.mod.Types.Guid = null,
    name: String = null,
    published: js.UndefOr[Boolean] = js.undefined,
    publishing: Publishing = null,
    recipientSettings: NotebookRecipientSettings = null,
    restrictions: NotebookRestrictions = null,
    serviceCreated: js.UndefOr[Double] = js.undefined,
    serviceUpdated: js.UndefOr[Double] = js.undefined,
    sharedNotebookIds: js.Array[Double] = null,
    sharedNotebooks: js.Array[SharedNotebook] = null,
    stack: String = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined
  ): BusinessNotebook = {
    val __obj = js.Dynamic.literal()
    if (businessNotebook != null) __obj.updateDynamic("businessNotebook")(businessNotebook.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultNotebook)) __obj.updateDynamic("defaultNotebook")(defaultNotebook.get.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(published)) __obj.updateDynamic("published")(published.get.asInstanceOf[js.Any])
    if (publishing != null) __obj.updateDynamic("publishing")(publishing.asInstanceOf[js.Any])
    if (recipientSettings != null) __obj.updateDynamic("recipientSettings")(recipientSettings.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceCreated)) __obj.updateDynamic("serviceCreated")(serviceCreated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceUpdated)) __obj.updateDynamic("serviceUpdated")(serviceUpdated.get.asInstanceOf[js.Any])
    if (sharedNotebookIds != null) __obj.updateDynamic("sharedNotebookIds")(sharedNotebookIds.asInstanceOf[js.Any])
    if (sharedNotebooks != null) __obj.updateDynamic("sharedNotebooks")(sharedNotebooks.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessNotebook]
  }
}


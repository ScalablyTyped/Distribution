package typings.evernote

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.MessageThreadID
import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotebookGuid extends js.Object {
  var notebookGuid: js.UndefOr[Guid] = js.undefined
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.undefined
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
}

object AnonNotebookGuid {
  @scala.inline
  def apply(
    notebookGuid: Guid = null,
    privilege: SharedNotebookPrivilegeLevel = null,
    recipientContacts: js.Array[Contact] = null,
    recipientThreadId: Int | Double = null
  ): AnonNotebookGuid = {
    val __obj = js.Dynamic.literal()
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientContacts != null) __obj.updateDynamic("recipientContacts")(recipientContacts.asInstanceOf[js.Any])
    if (recipientThreadId != null) __obj.updateDynamic("recipientThreadId")(recipientThreadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotebookGuid]
  }
}


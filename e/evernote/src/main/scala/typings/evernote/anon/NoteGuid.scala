package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.MessageThreadID
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteGuid extends js.Object {
  var noteGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.undefined
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
}

object NoteGuid {
  @scala.inline
  def apply(
    noteGuid: typings.evernote.mod.Types.Guid = null,
    privilege: SharedNotePrivilegeLevel = null,
    recipientContacts: js.Array[Contact] = null,
    recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
  ): NoteGuid = {
    val __obj = js.Dynamic.literal()
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientContacts != null) __obj.updateDynamic("recipientContacts")(recipientContacts.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientThreadId)) __obj.updateDynamic("recipientThreadId")(recipientThreadId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteGuid]
  }
}


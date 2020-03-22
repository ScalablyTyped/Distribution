package typings.evernote

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.MessageThreadID
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoteGuid extends js.Object {
  var noteGuid: js.UndefOr[Guid] = js.undefined
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.undefined
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.undefined
}

object AnonNoteGuid {
  @scala.inline
  def apply(
    noteGuid: Guid = null,
    privilege: SharedNotePrivilegeLevel = null,
    recipientContacts: js.Array[Contact] = null,
    recipientThreadId: Int | Double = null
  ): AnonNoteGuid = {
    val __obj = js.Dynamic.literal()
    if (noteGuid != null) __obj.updateDynamic("noteGuid")(noteGuid.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientContacts != null) __obj.updateDynamic("recipientContacts")(recipientContacts.asInstanceOf[js.Any])
    if (recipientThreadId != null) __obj.updateDynamic("recipientThreadId")(recipientThreadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoteGuid]
  }
}


package typings.evernote.mod.NoteStore

import typings.evernote.anon.NoteGuid
import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.MessageThreadID
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.SharedNoteTemplate")
@js.native
class SharedNoteTemplate () extends js.Object {
  def this(args: NoteGuid) = this()
  var noteGuid: js.UndefOr[Guid] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}


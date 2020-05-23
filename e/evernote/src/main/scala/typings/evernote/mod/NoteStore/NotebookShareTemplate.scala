package typings.evernote.mod.NoteStore

import typings.evernote.anon.NotebookGuid
import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.MessageThreadID
import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NotebookShareTemplate")
@js.native
class NotebookShareTemplate () extends js.Object {
  def this(args: NotebookGuid) = this()
  var notebookGuid: js.UndefOr[Guid] = js.native
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  var recipientContacts: js.UndefOr[js.Array[Contact]] = js.native
  var recipientThreadId: js.UndefOr[MessageThreadID] = js.native
}


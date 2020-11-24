package typings.evernote.mod.NoteStore

import typings.evernote.anon.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.UpdateNoteIfUsnMatchesResult")
@js.native
class UpdateNoteIfUsnMatchesResult () extends js.Object {
  def this(args: Note) = this()
  
  var note: js.UndefOr[typings.evernote.mod.Types.Note] = js.native
  
  var updated: js.UndefOr[Boolean] = js.native
}

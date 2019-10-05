package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_IncludeAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure is provided to the findNotesMetadata function to specify
  * the subset of fields that should be included in each NoteMetadata element
  * that is returned in the NotesMetadataList.
  * Each field on this structure is a boolean flag that indicates whether the
  * corresponding field should be included in the NoteMetadata structure when
  * it is returned.    For example, if the 'includeTitle' field is set on this
  * structure when calling findNotesMetadata, then each NoteMetadata in the
  * list should have its 'title' field set.
  * If one of the fields in this spec is not set, then it will be treated as
  * 'false' by the server, so the default behavior is to include nothing in
  * replies (but the mandatory GUID)
  */
@JSImport("evernote", "Evernote.NotesMetadataResultSpec")
@js.native
class NotesMetadataResultSpec () extends js.Object {
  def this(args: Anon_IncludeAttributes) = this()
  var includeAttributes: Boolean = js.native
  var includeContentLength: Boolean = js.native
  var includeCreated: Boolean = js.native
  var includeDeleted: Boolean = js.native
  var includeLargestResourceMime: Boolean = js.native
  var includeLargestResourceSize: Boolean = js.native
  var includeNotebookGuid: Boolean = js.native
  var includeTagGuids: Boolean = js.native
  var includeTitle: Boolean = js.native
  var includeUpdateSequenceNum: Boolean = js.native
  var includeUpdated: Boolean = js.native
}


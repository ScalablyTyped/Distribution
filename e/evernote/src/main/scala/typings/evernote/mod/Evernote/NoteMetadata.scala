package typings.evernote.mod.Evernote

import typings.evernote.AnonAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure is used in the set of results returned by the
  * findNotesMetadata function.    It represents the high-level information about
  * a single Note, without some of the larger deep structure.    This allows
  * for the information about a list of Notes to be returned relatively quickly
  * with less marshalling and data transfer to remote clients.
  * Most fields in this structure are identical to the corresponding field in
  * the Note structure, with the exception of:
  *
  * <dl>
  * <dt>largestResourceMime</dt>
  *     <dd>If set, then this will contain the MIME type of the largest Resource
  *     (in bytes) within the Note.    This may be useful, for example, to choose
  *     an appropriate icon or thumbnail to represent the Note.
  *     </dd>
  *
  * <dt>largestResourceSize</dt>
  *    <dd>If set, this will contain the size of the largest Resource file, in
  *    bytes, within the Note.    This may be useful, for example, to decide whether
  *    to ask the server for a thumbnail to represent the Note.
  *    </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.NoteMetadata")
@js.native
class NoteMetadata () extends js.Object {
  def this(args: AnonAttributes) = this()
  var attributes: NoteAttributes = js.native
  var contentLength: Double = js.native
  var created: Double = js.native
  var deleted: Double = js.native
  var guid: String = js.native
  var largestResourceMime: String = js.native
  var largestResourceSize: Double = js.native
  var notebookGuid: String = js.native
  var tagGuids: js.Array[String] = js.native
  var title: String = js.native
  var updateSequenceNum: Double = js.native
  var updated: Double = js.native
}


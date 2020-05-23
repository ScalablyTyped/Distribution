package typings.evernote.mod.NoteStore

import typings.evernote.anon.Attributes
import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.NoteAttributes
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteMetadata")
@js.native
class NoteMetadata () extends js.Object {
  def this(args: Attributes) = this()
  var attributes: js.UndefOr[NoteAttributes] = js.native
  var contentLength: js.UndefOr[Double] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var deleted: js.UndefOr[Timestamp] = js.native
  var guid: js.UndefOr[Guid] = js.native
  var largestResourceMime: js.UndefOr[String] = js.native
  var largestResourceSize: js.UndefOr[Double] = js.native
  var notebookGuid: js.UndefOr[String] = js.native
  var tagGuids: js.UndefOr[js.Array[Guid]] = js.native
  var title: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}


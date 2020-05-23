package typings.evernote.mod.NoteStore

import typings.evernote.anon.LastEditorId
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteVersionId")
@js.native
class NoteVersionId () extends js.Object {
  def this(args: LastEditorId) = this()
  var lastEditorId: js.UndefOr[UserID] = js.native
  var saved: js.UndefOr[Timestamp] = js.native
  var title: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}


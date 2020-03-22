package typings.evernote.mod.NoteStore

import typings.evernote.AnonNoSetModify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ShareRelationshipRestrictions")
@js.native
class ShareRelationshipRestrictions () extends js.Object {
  def this(args: AnonNoSetModify) = this()
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  var noSetModify: js.UndefOr[Boolean] = js.native
  var noSetReadOnly: js.UndefOr[Boolean] = js.native
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.native
}


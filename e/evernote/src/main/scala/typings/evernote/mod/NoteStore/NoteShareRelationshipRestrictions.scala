package typings.evernote.mod.NoteStore

import typings.evernote.anon.NoSetFullAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteShareRelationshipRestrictions")
@js.native
class NoteShareRelationshipRestrictions () extends js.Object {
  def this(args: NoSetFullAccess) = this()
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  var noSetModifyNote: js.UndefOr[Boolean] = js.native
  var noSetReadNote: js.UndefOr[Boolean] = js.native
}


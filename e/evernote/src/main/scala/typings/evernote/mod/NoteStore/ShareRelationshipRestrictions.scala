package typings.evernote.mod.NoteStore

import typings.evernote.anon.NoSetModify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ShareRelationshipRestrictions")
@js.native
class ShareRelationshipRestrictions () extends js.Object {
  def this(args: NoSetModify) = this()
  
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  
  var noSetModify: js.UndefOr[Boolean] = js.native
  
  var noSetReadOnly: js.UndefOr[Boolean] = js.native
  
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.native
}

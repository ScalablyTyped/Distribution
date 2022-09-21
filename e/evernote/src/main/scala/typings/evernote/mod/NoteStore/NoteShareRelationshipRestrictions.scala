package typings.evernote.mod.NoteStore

import typings.evernote.anon.NoSetFullAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteShareRelationshipRestrictions")
@js.native
open class NoteShareRelationshipRestrictions () extends StObject {
  def this(args: NoSetFullAccess) = this()
  
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  
  var noSetModifyNote: js.UndefOr[Boolean] = js.native
  
  var noSetReadNote: js.UndefOr[Boolean] = js.native
}

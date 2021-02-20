package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedNotePrivilegeLevel extends StObject
@JSImport("evernote", "Types.SharedNotePrivilegeLevel")
@js.native
object SharedNotePrivilegeLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotePrivilegeLevel with Double] = js.native
  
  @js.native
  sealed trait FULL_ACCESS extends SharedNotePrivilegeLevel
  /* 2 */ val FULL_ACCESS: typings.evernote.mod.Types.SharedNotePrivilegeLevel.FULL_ACCESS with Double = js.native
  
  @js.native
  sealed trait MODIFY_NOTE extends SharedNotePrivilegeLevel
  /* 1 */ val MODIFY_NOTE: typings.evernote.mod.Types.SharedNotePrivilegeLevel.MODIFY_NOTE with Double = js.native
  
  @js.native
  sealed trait READ_NOTE extends SharedNotePrivilegeLevel
  /* 0 */ val READ_NOTE: typings.evernote.mod.Types.SharedNotePrivilegeLevel.READ_NOTE with Double = js.native
}

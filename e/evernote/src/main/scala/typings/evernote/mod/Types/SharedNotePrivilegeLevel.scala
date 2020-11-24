package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedNotePrivilegeLevel extends js.Object
@JSImport("evernote", "Types.SharedNotePrivilegeLevel")
@js.native
object SharedNotePrivilegeLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotePrivilegeLevel with Double] = js.native
  
  @js.native
  sealed trait FULL_ACCESS extends SharedNotePrivilegeLevel
  /* 2 */ @js.native
  object FULL_ACCESS extends TopLevel[FULL_ACCESS with Double]
  
  @js.native
  sealed trait MODIFY_NOTE extends SharedNotePrivilegeLevel
  /* 1 */ @js.native
  object MODIFY_NOTE extends TopLevel[MODIFY_NOTE with Double]
  
  @js.native
  sealed trait READ_NOTE extends SharedNotePrivilegeLevel
  /* 0 */ @js.native
  object READ_NOTE extends TopLevel[READ_NOTE with Double]
}

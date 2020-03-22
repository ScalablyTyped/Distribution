package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SharedNotePrivilegeLevel extends js.Object

@JSImport("evernote", "Types.SharedNotePrivilegeLevel")
@js.native
object SharedNotePrivilegeLevel extends js.Object {
  @js.native
  sealed trait FULL_ACCESS extends SharedNotePrivilegeLevel
  
  @js.native
  sealed trait MODIFY_NOTE extends SharedNotePrivilegeLevel
  
  @js.native
  sealed trait READ_NOTE extends SharedNotePrivilegeLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotePrivilegeLevel with Double] = js.native
  /* 2 */ @js.native
  object FULL_ACCESS extends TopLevel[FULL_ACCESS with Double]
  
  /* 1 */ @js.native
  object MODIFY_NOTE extends TopLevel[MODIFY_NOTE with Double]
  
  /* 0 */ @js.native
  object READ_NOTE extends TopLevel[READ_NOTE with Double]
  
}


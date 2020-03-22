package typings.evernote.mod.NoteStore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShareRelationshipPrivilegeLevel extends js.Object

@JSImport("evernote", "NoteStore.ShareRelationshipPrivilegeLevel")
@js.native
object ShareRelationshipPrivilegeLevel extends js.Object {
  @js.native
  sealed trait FULL_ACCESS extends ShareRelationshipPrivilegeLevel
  
  @js.native
  sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY extends ShareRelationshipPrivilegeLevel
  
  @js.native
  sealed trait READ_NOTEBOOK extends ShareRelationshipPrivilegeLevel
  
  @js.native
  sealed trait READ_NOTEBOOK_PLUS_ACTIVITY extends ShareRelationshipPrivilegeLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShareRelationshipPrivilegeLevel with Double] = js.native
  /* 30 */ @js.native
  object FULL_ACCESS extends TopLevel[FULL_ACCESS with Double]
  
  /* 20 */ @js.native
  object MODIFY_NOTEBOOK_PLUS_ACTIVITY extends TopLevel[MODIFY_NOTEBOOK_PLUS_ACTIVITY with Double]
  
  /* 0 */ @js.native
  object READ_NOTEBOOK extends TopLevel[READ_NOTEBOOK with Double]
  
  /* 10 */ @js.native
  object READ_NOTEBOOK_PLUS_ACTIVITY extends TopLevel[READ_NOTEBOOK_PLUS_ACTIVITY with Double]
  
}


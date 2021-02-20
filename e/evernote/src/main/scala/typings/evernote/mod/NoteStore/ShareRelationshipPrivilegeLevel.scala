package typings.evernote.mod.NoteStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShareRelationshipPrivilegeLevel extends StObject
@JSImport("evernote", "NoteStore.ShareRelationshipPrivilegeLevel")
@js.native
object ShareRelationshipPrivilegeLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShareRelationshipPrivilegeLevel with Double] = js.native
  
  @js.native
  sealed trait FULL_ACCESS extends ShareRelationshipPrivilegeLevel
  /* 30 */ val FULL_ACCESS: typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.FULL_ACCESS with Double = js.native
  
  @js.native
  sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY extends ShareRelationshipPrivilegeLevel
  /* 20 */ val MODIFY_NOTEBOOK_PLUS_ACTIVITY: typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.MODIFY_NOTEBOOK_PLUS_ACTIVITY with Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK extends ShareRelationshipPrivilegeLevel
  /* 0 */ val READ_NOTEBOOK: typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.READ_NOTEBOOK with Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK_PLUS_ACTIVITY extends ShareRelationshipPrivilegeLevel
  /* 10 */ val READ_NOTEBOOK_PLUS_ACTIVITY: typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.READ_NOTEBOOK_PLUS_ACTIVITY with Double = js.native
}

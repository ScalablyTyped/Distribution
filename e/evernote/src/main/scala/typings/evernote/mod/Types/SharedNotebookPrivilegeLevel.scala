package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedNotebookPrivilegeLevel extends StObject
@JSImport("evernote", "Types.SharedNotebookPrivilegeLevel")
@js.native
object SharedNotebookPrivilegeLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotebookPrivilegeLevel with Double] = js.native
  
  @js.native
  sealed trait BUSINESS_FULL_ACCESS extends SharedNotebookPrivilegeLevel
  /* 5 */ val BUSINESS_FULL_ACCESS: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.BUSINESS_FULL_ACCESS with Double = js.native
  
  @js.native
  sealed trait FULL_ACCESS extends SharedNotebookPrivilegeLevel
  /* 4 */ val FULL_ACCESS: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.FULL_ACCESS with Double = js.native
  
  @js.native
  sealed trait GROUP extends SharedNotebookPrivilegeLevel
  /* 3 */ val GROUP: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.GROUP with Double = js.native
  
  @js.native
  sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY extends SharedNotebookPrivilegeLevel
  /* 1 */ val MODIFY_NOTEBOOK_PLUS_ACTIVITY: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.MODIFY_NOTEBOOK_PLUS_ACTIVITY with Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK extends SharedNotebookPrivilegeLevel
  /* 0 */ val READ_NOTEBOOK: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.READ_NOTEBOOK with Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK_PLUS_ACTIVITY extends SharedNotebookPrivilegeLevel
  /* 2 */ val READ_NOTEBOOK_PLUS_ACTIVITY: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.READ_NOTEBOOK_PLUS_ACTIVITY with Double = js.native
}

package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedNotebookPrivilegeLevel extends StObject
@JSImport("evernote", "Types.SharedNotebookPrivilegeLevel")
@js.native
object SharedNotebookPrivilegeLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotebookPrivilegeLevel & Double] = js.native
  
  @js.native
  sealed trait BUSINESS_FULL_ACCESS
    extends StObject
       with SharedNotebookPrivilegeLevel
  /* 5 */ val BUSINESS_FULL_ACCESS: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.BUSINESS_FULL_ACCESS & Double = js.native
  
  @js.native
  sealed trait FULL_ACCESS
    extends StObject
       with SharedNotebookPrivilegeLevel
  /* 4 */ val FULL_ACCESS: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.FULL_ACCESS & Double = js.native
  
  @js.native
  sealed trait GROUP
    extends StObject
       with SharedNotebookPrivilegeLevel
  /* 3 */ val GROUP: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.GROUP & Double = js.native
  
  @js.native
  sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY
    extends StObject
       with SharedNotebookPrivilegeLevel
  /* 1 */ val MODIFY_NOTEBOOK_PLUS_ACTIVITY: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.MODIFY_NOTEBOOK_PLUS_ACTIVITY & Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK
    extends StObject
       with SharedNotebookPrivilegeLevel
  /* 0 */ val READ_NOTEBOOK: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.READ_NOTEBOOK & Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK_PLUS_ACTIVITY
    extends StObject
       with SharedNotebookPrivilegeLevel
  /* 2 */ val READ_NOTEBOOK_PLUS_ACTIVITY: typings.evernote.mod.Types.SharedNotebookPrivilegeLevel.READ_NOTEBOOK_PLUS_ACTIVITY & Double = js.native
}

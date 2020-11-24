package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedNotebookPrivilegeLevel extends js.Object
@JSImport("evernote", "Types.SharedNotebookPrivilegeLevel")
@js.native
object SharedNotebookPrivilegeLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotebookPrivilegeLevel with Double] = js.native
  
  @js.native
  sealed trait BUSINESS_FULL_ACCESS extends SharedNotebookPrivilegeLevel
  /* 5 */ @js.native
  object BUSINESS_FULL_ACCESS extends TopLevel[BUSINESS_FULL_ACCESS with Double]
  
  @js.native
  sealed trait FULL_ACCESS extends SharedNotebookPrivilegeLevel
  /* 4 */ @js.native
  object FULL_ACCESS extends TopLevel[FULL_ACCESS with Double]
  
  @js.native
  sealed trait GROUP extends SharedNotebookPrivilegeLevel
  /* 3 */ @js.native
  object GROUP extends TopLevel[GROUP with Double]
  
  @js.native
  sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY extends SharedNotebookPrivilegeLevel
  /* 1 */ @js.native
  object MODIFY_NOTEBOOK_PLUS_ACTIVITY extends TopLevel[MODIFY_NOTEBOOK_PLUS_ACTIVITY with Double]
  
  @js.native
  sealed trait READ_NOTEBOOK extends SharedNotebookPrivilegeLevel
  /* 0 */ @js.native
  object READ_NOTEBOOK extends TopLevel[READ_NOTEBOOK with Double]
  
  @js.native
  sealed trait READ_NOTEBOOK_PLUS_ACTIVITY extends SharedNotebookPrivilegeLevel
  /* 2 */ @js.native
  object READ_NOTEBOOK_PLUS_ACTIVITY extends TopLevel[READ_NOTEBOOK_PLUS_ACTIVITY with Double]
}

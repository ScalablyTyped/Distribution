package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedNotebookInstanceRestrictions extends StObject
@JSImport("evernote", "Types.SharedNotebookInstanceRestrictions")
@js.native
object SharedNotebookInstanceRestrictions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotebookInstanceRestrictions with Double] = js.native
  
  @js.native
  sealed trait NO_SHARED_NOTEBOOKS extends SharedNotebookInstanceRestrictions
  /* 2 */ val NO_SHARED_NOTEBOOKS: typings.evernote.mod.Types.SharedNotebookInstanceRestrictions.NO_SHARED_NOTEBOOKS with Double = js.native
  
  @js.native
  sealed trait ONLY_JOINED_OR_PREVIEW extends SharedNotebookInstanceRestrictions
  /* 1 */ val ONLY_JOINED_OR_PREVIEW: typings.evernote.mod.Types.SharedNotebookInstanceRestrictions.ONLY_JOINED_OR_PREVIEW with Double = js.native
}

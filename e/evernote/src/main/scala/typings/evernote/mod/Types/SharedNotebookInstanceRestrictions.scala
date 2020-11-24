package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SharedNotebookInstanceRestrictions extends js.Object
@JSImport("evernote", "Types.SharedNotebookInstanceRestrictions")
@js.native
object SharedNotebookInstanceRestrictions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SharedNotebookInstanceRestrictions with Double] = js.native
  
  @js.native
  sealed trait NO_SHARED_NOTEBOOKS extends SharedNotebookInstanceRestrictions
  /* 2 */ @js.native
  object NO_SHARED_NOTEBOOKS extends TopLevel[NO_SHARED_NOTEBOOKS with Double]
  
  @js.native
  sealed trait ONLY_JOINED_OR_PREVIEW extends SharedNotebookInstanceRestrictions
  /* 1 */ @js.native
  object ONLY_JOINED_OR_PREVIEW extends TopLevel[ONLY_JOINED_OR_PREVIEW with Double]
}

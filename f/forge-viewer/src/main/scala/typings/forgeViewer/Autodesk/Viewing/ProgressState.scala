package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProgressState extends StObject
@JSGlobal("Autodesk.Viewing.ProgressState")
@js.native
object ProgressState extends StObject {
  
  @js.native
  sealed trait LOADING
    extends StObject
       with ProgressState
  
  @js.native
  sealed trait RENDERING
    extends StObject
       with ProgressState
  
  @js.native
  sealed trait ROOT_LOADED
    extends StObject
       with ProgressState
}

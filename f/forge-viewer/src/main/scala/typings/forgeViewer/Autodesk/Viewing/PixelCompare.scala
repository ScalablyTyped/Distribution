package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PixelCompare {
  
  @js.native
  sealed trait DIFF_MODES extends StObject
  @JSGlobal("Autodesk.Viewing.PixelCompare.DIFF_MODES")
  @js.native
  object DIFF_MODES extends StObject {
    
    @js.native
    sealed trait OVERLAY
      extends StObject
         with DIFF_MODES
    
    @js.native
    sealed trait SIDE_BY_SIDE
      extends StObject
         with DIFF_MODES
  }
  
  @js.native
  sealed trait EVENTS extends StObject
  @JSGlobal("Autodesk.Viewing.PixelCompare.EVENTS")
  @js.native
  object EVENTS extends StObject {
    
    @js.native
    sealed trait DIFF_TOOL_DEACTIVATED
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait DIFF_TOOL_DIFF_MODE_CHANGED
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait DIFF_TOOL_MODEL_VISIBILITY_CHANGED
      extends StObject
         with EVENTS
  }
}

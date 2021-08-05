package typings.forgeViewer.Autodesk.Viewing.UI

import typings.forgeViewer.forgeViewerStrings.ButtonDotStateChanged
import typings.forgeViewer.forgeViewerStrings.ControlDotCollapsedChanged
import typings.forgeViewer.forgeViewerStrings.ControlDotVisibilityChanged
import typings.forgeViewer.forgeViewerStrings.RadioButtonGroupDotActiveButtonChanged
import typings.forgeViewer.forgeViewerStrings.click
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlEventArgs extends StObject {
  
  var ACTIVE_BUTTON_CHANGED: RadioButtonGroupDotActiveButtonChanged
  
  var CLICK: click
  
  var COLLAPSED_CHANGED: ControlDotCollapsedChanged
  
  var STATE_CHANGED: ButtonDotStateChanged
  
  var VISIBILITY_CHANGED: ControlDotVisibilityChanged
}
object ControlEventArgs {
  
  inline def apply(): ControlEventArgs = {
    val __obj = js.Dynamic.literal(ACTIVE_BUTTON_CHANGED = "RadioButtonGroup.ActiveButtonChanged", CLICK = "click", COLLAPSED_CHANGED = "Control.CollapsedChanged", STATE_CHANGED = "Button.StateChanged", VISIBILITY_CHANGED = "Control.VisibilityChanged")
    __obj.asInstanceOf[ControlEventArgs]
  }
  
  extension [Self <: ControlEventArgs](x: Self) {
    
    inline def setACTIVE_BUTTON_CHANGED(value: RadioButtonGroupDotActiveButtonChanged): Self = StObject.set(x, "ACTIVE_BUTTON_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setCLICK(value: click): Self = StObject.set(x, "CLICK", value.asInstanceOf[js.Any])
    
    inline def setCOLLAPSED_CHANGED(value: ControlDotCollapsedChanged): Self = StObject.set(x, "COLLAPSED_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setSTATE_CHANGED(value: ButtonDotStateChanged): Self = StObject.set(x, "STATE_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setVISIBILITY_CHANGED(value: ControlDotVisibilityChanged): Self = StObject.set(x, "VISIBILITY_CHANGED", value.asInstanceOf[js.Any])
  }
}

package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxSpeedDialAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionElementComponent extends StObject {
  
  var actionElement: js.UndefOr[dxElement] = js.undefined
  
  var component: js.UndefOr[dxSpeedDialAction] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ActionElementComponent {
  
  inline def apply(): ActionElementComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionElementComponent]
  }
  
  extension [Self <: ActionElementComponent](x: Self) {
    
    inline def setActionElement(value: dxElement): Self = StObject.set(x, "actionElement", value.asInstanceOf[js.Any])
    
    inline def setActionElementUndefined: Self = StObject.set(x, "actionElement", js.undefined)
    
    inline def setComponent(value: dxSpeedDialAction): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}

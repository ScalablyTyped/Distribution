package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.viz.dxPolarChart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentComponent extends StObject {
  
  var argument: js.UndefOr[typings.std.Date | Double | String] = js.undefined
  
  var component: js.UndefOr[dxPolarChart] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ArgumentComponent {
  
  inline def apply(): ArgumentComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentComponent]
  }
  
  extension [Self <: ArgumentComponent](x: Self) {
    
    inline def setArgument(value: typings.std.Date | Double | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setComponent(value: dxPolarChart): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}

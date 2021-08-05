package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.viz.dxRangeSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventModelPreviousValue extends StObject {
  
  var component: js.UndefOr[dxRangeSelector] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var previousValue: js.UndefOr[js.Array[Double | String | typings.std.Date]] = js.undefined
  
  var value: js.UndefOr[js.Array[Double | String | typings.std.Date]] = js.undefined
}
object EventModelPreviousValue {
  
  inline def apply(): EventModelPreviousValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventModelPreviousValue]
  }
  
  extension [Self <: EventModelPreviousValue](x: Self) {
    
    inline def setComponent(value: dxRangeSelector): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setPreviousValue(value: js.Array[Double | String | typings.std.Date]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    inline def setPreviousValueVarargs(value: (Double | String | typings.std.Date)*): Self = StObject.set(x, "previousValue", js.Array(value :_*))
    
    inline def setValue(value: js.Array[Double | String | typings.std.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: (Double | String | typings.std.Date)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

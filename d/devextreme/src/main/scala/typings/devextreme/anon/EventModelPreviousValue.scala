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
  
  @scala.inline
  def apply(): EventModelPreviousValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventModelPreviousValue]
  }
  
  @scala.inline
  implicit class EventModelPreviousValueMutableBuilder[Self <: EventModelPreviousValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxRangeSelector): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setPreviousValue(value: js.Array[Double | String | typings.std.Date]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    @scala.inline
    def setPreviousValueVarargs(value: (Double | String | typings.std.Date)*): Self = StObject.set(x, "previousValue", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[Double | String | typings.std.Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (Double | String | typings.std.Date)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

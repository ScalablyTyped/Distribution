package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxFileUploader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousValueValue extends StObject {
  
  var component: js.UndefOr[dxFileUploader] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var previousValue: js.UndefOr[js.Array[typings.std.File]] = js.undefined
  
  var value: js.UndefOr[js.Array[typings.std.File]] = js.undefined
}
object PreviousValueValue {
  
  inline def apply(): PreviousValueValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousValueValue]
  }
  
  extension [Self <: PreviousValueValue](x: Self) {
    
    inline def setComponent(value: dxFileUploader): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setPreviousValue(value: js.Array[typings.std.File]): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
    
    inline def setPreviousValueVarargs(value: typings.std.File*): Self = StObject.set(x, "previousValue", js.Array(value :_*))
    
    inline def setValue(value: js.Array[typings.std.File]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: typings.std.File*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

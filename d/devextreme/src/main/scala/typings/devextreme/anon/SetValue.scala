package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFilterBuilderField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetValue extends StObject {
  
  var field: js.UndefOr[dxFilterBuilderField] = js.undefined
  
  var setValue: js.UndefOr[js.Function] = js.undefined
  
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
}
object SetValue {
  
  inline def apply(): SetValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetValue]
  }
  
  extension [Self <: SetValue](x: Self) {
    
    inline def setField(value: dxFilterBuilderField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setValue(value: String | Double | typings.std.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

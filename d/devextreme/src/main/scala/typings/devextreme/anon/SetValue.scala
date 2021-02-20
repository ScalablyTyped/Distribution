package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxFilterBuilderField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetValue extends StObject {
  
  var field: js.UndefOr[dxFilterBuilderField] = js.native
  
  var setValue: js.UndefOr[js.Function] = js.native
  
  var value: js.UndefOr[String | Double | typings.std.Date] = js.native
}
object SetValue {
  
  @scala.inline
  def apply(): SetValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetValue]
  }
  
  @scala.inline
  implicit class SetValueMutableBuilder[Self <: SetValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: dxFilterBuilderField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

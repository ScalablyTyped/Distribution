package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object Value {
  
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

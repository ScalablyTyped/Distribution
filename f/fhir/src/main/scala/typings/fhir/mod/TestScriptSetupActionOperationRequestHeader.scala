package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionOperationRequestHeader
  extends StObject
     with BackboneElement {
  
  var _field: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The HTTP header field e.g. "Accept".
    */
  var field: String
  
  /**
    * The value of the header e.g. "application/xml".
    */
  var value: String
}
object TestScriptSetupActionOperationRequestHeader {
  
  inline def apply(field: String, value: String): TestScriptSetupActionOperationRequestHeader = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionOperationRequestHeader]
  }
  
  extension [Self <: TestScriptSetupActionOperationRequestHeader](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_field(value: Element): Self = StObject.set(x, "_field", value.asInstanceOf[js.Any])
    
    inline def set_fieldUndefined: Self = StObject.set(x, "_field", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}

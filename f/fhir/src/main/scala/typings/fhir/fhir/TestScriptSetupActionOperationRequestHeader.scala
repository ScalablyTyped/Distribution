package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each operation can have one or more header elements
  */
@js.native
trait TestScriptSetupActionOperationRequestHeader extends BackboneElement {
  
  /**
    * Contains extended information for property 'field'.
    */
  var _field: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  
  /**
    * HTTP header field name
    */
  var field: String = js.native
  
  /**
    * HTTP headerfield value
    */
  var value: String = js.native
}
object TestScriptSetupActionOperationRequestHeader {
  
  @scala.inline
  def apply(field: String, value: String): TestScriptSetupActionOperationRequestHeader = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionOperationRequestHeader]
  }
  
  @scala.inline
  implicit class TestScriptSetupActionOperationRequestHeaderMutableBuilder[Self <: TestScriptSetupActionOperationRequestHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_field(value: Element): Self = StObject.set(x, "_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fieldUndefined: Self = StObject.set(x, "_field", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}

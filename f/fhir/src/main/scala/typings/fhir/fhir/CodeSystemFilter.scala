package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter that can be used in a value set
  */
trait CodeSystemFilter
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'operator'.
    */
  var _operator: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Code that identifies the filter
    */
  var code: typings.fhir.fhir.code
  
  /**
    * How or why the filter is used
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Operators that can be used with filter
    */
  var operator: js.Array[code]
  
  /**
    * What to use for the value
    */
  var value: String
}
object CodeSystemFilter {
  
  inline def apply(code: code, operator: js.Array[code], value: String): CodeSystemFilter = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemFilter]
  }
  
  extension [Self <: CodeSystemFilter](x: Self) {
    
    inline def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOperator(value: js.Array[code]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorVarargs(value: code*): Self = StObject.set(x, "operator", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_operator(value: js.Array[Element]): Self = StObject.set(x, "_operator", value.asInstanceOf[js.Any])
    
    inline def set_operatorUndefined: Self = StObject.set(x, "_operator", js.undefined)
    
    inline def set_operatorVarargs(value: Element*): Self = StObject.set(x, "_operator", js.Array(value :_*))
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}

package typings.fhir.r5Mod

import typings.fhir.fhirStrings.Equalssign
import typings.fhir.fhirStrings.`child-of`
import typings.fhir.fhirStrings.`descendent-leaf`
import typings.fhir.fhirStrings.`descendent-of`
import typings.fhir.fhirStrings.`is-a`
import typings.fhir.fhirStrings.`is-not-a`
import typings.fhir.fhirStrings.`not-in`
import typings.fhir.fhirStrings.exists
import typings.fhir.fhirStrings.generalizes
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.regex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSystemFilter
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _operator: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The code that identifies this filter when it is used as a filter in [ValueSet](valueset.html#).compose.include.filter.
    */
  var code: String
  
  /**
    * A description of how or why the filter is used.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A list of operators that can be used with the filter.
    */
  var operator: js.Array[
    Equalssign | `is-a` | `descendent-of` | `is-not-a` | regex | in | `not-in` | generalizes | `child-of` | `descendent-leaf` | exists
  ]
  
  /**
    * A description of what the value for the filter should be.
    */
  var value: String
}
object CodeSystemFilter {
  
  inline def apply(
    code: String,
    operator: js.Array[
      Equalssign | `is-a` | `descendent-of` | `is-not-a` | regex | in | `not-in` | generalizes | `child-of` | `descendent-leaf` | exists
    ],
    value: String
  ): CodeSystemFilter = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemFilter]
  }
  
  extension [Self <: CodeSystemFilter](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOperator(
      value: js.Array[
          Equalssign | `is-a` | `descendent-of` | `is-not-a` | regex | in | `not-in` | generalizes | `child-of` | `descendent-leaf` | exists
        ]
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorVarargs(
      value: (Equalssign | `is-a` | `descendent-of` | `is-not-a` | regex | in | `not-in` | generalizes | `child-of` | `descendent-leaf` | exists)*
    ): Self = StObject.set(x, "operator", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_operator(value: js.Array[Element]): Self = StObject.set(x, "_operator", value.asInstanceOf[js.Any])
    
    inline def set_operatorUndefined: Self = StObject.set(x, "_operator", js.undefined)
    
    inline def set_operatorVarargs(value: Element*): Self = StObject.set(x, "_operator", js.Array(value*))
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}

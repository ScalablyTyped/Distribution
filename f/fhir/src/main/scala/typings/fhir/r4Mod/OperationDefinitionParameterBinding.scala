package typings.fhir.r4Mod

import typings.fhir.fhirStrings.example
import typings.fhir.fhirStrings.extensible
import typings.fhir.fhirStrings.preferred
import typings.fhir.fhirStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDefinitionParameterBinding
  extends StObject
     with BackboneElement {
  
  var _strength: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  /**
    * For further discussion, see [Using Terminologies](terminologies.html).
    */
  var strength: required | extensible | preferred | example
  
  /**
    * For value sets with a referenceResource, the display can contain the value set description.  The reference may be version-specific or not.
    */
  var valueSet: String
}
object OperationDefinitionParameterBinding {
  
  inline def apply(strength: required | extensible | preferred | example, valueSet: String): OperationDefinitionParameterBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any], valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameterBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationDefinitionParameterBinding] (val x: Self) extends AnyVal {
    
    inline def setStrength(value: required | extensible | preferred | example): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def set_strength(value: Element): Self = StObject.set(x, "_strength", value.asInstanceOf[js.Any])
    
    inline def set_strengthUndefined: Self = StObject.set(x, "_strength", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
  }
}

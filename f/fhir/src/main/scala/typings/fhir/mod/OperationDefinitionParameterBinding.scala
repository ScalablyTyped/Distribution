package typings.fhir.mod

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
  
  var _valueSetUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
    */
  var strength: required | extensible | preferred | example
  
  /**
    * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used.
    */
  var valueSetUri: js.UndefOr[String] = js.undefined
}
object OperationDefinitionParameterBinding {
  
  inline def apply(strength: required | extensible | preferred | example): OperationDefinitionParameterBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameterBinding]
  }
  
  extension [Self <: OperationDefinitionParameterBinding](x: Self) {
    
    inline def setStrength(value: required | extensible | preferred | example): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setValueSetReference(value: Reference): Self = StObject.set(x, "valueSetReference", value.asInstanceOf[js.Any])
    
    inline def setValueSetReferenceUndefined: Self = StObject.set(x, "valueSetReference", js.undefined)
    
    inline def setValueSetUri(value: String): Self = StObject.set(x, "valueSetUri", value.asInstanceOf[js.Any])
    
    inline def setValueSetUriUndefined: Self = StObject.set(x, "valueSetUri", js.undefined)
    
    inline def set_strength(value: Element): Self = StObject.set(x, "_strength", value.asInstanceOf[js.Any])
    
    inline def set_strengthUndefined: Self = StObject.set(x, "_strength", js.undefined)
    
    inline def set_valueSetUri(value: Element): Self = StObject.set(x, "_valueSetUri", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUriUndefined: Self = StObject.set(x, "_valueSetUri", js.undefined)
  }
}

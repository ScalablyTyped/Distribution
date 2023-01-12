package typings.fhir.r3Mod

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
    * For further discussion, see [Using Terminologies](terminologies.html).
    */
  var strength: required | extensible | preferred | example
  
  /**
    * For value sets with a referenceResource, the display can contain the value set description.  The reference may be version-specific or not.
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * For value sets with a referenceResource, the display can contain the value set description.  The reference may be version-specific or not.
    */
  var valueSetUri: js.UndefOr[String] = js.undefined
}
object OperationDefinitionParameterBinding {
  
  inline def apply(strength: required | extensible | preferred | example): OperationDefinitionParameterBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameterBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationDefinitionParameterBinding] (val x: Self) extends AnyVal {
    
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

package typings.fhir.r5Mod

import typings.fhir.fhirStrings.example
import typings.fhir.fhirStrings.extensible
import typings.fhir.fhirStrings.preferred
import typings.fhir.fhirStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionBinding
  extends StObject
     with Element {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _strength: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the intended use of this particular set of codes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * For further discussion, see [Using Terminologies](terminologies.html).
    */
  var strength: required | extensible | preferred | example
  
  /**
    * The reference may be version-specific or not (e.g. have a |[version] at the end of the canonical URL).
    */
  var valueSet: js.UndefOr[String] = js.undefined
}
object ElementDefinitionBinding {
  
  inline def apply(strength: required | extensible | preferred | example): ElementDefinitionBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinitionBinding] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStrength(value: required | extensible | preferred | example): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_strength(value: Element): Self = StObject.set(x, "_strength", value.asInstanceOf[js.Any])
    
    inline def set_strengthUndefined: Self = StObject.set(x, "_strength", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
  }
}

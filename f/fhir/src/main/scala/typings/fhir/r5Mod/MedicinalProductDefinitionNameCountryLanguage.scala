package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionNameCountryLanguage
  extends StObject
     with BackboneElement {
  
  /**
    * Country code for where this name applies.
    */
  var country: CodeableConcept
  
  /**
    * Jurisdiction code for where this name applies.
    */
  var jurisdiction: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Language code for this name.
    */
  var language: CodeableConcept
}
object MedicinalProductDefinitionNameCountryLanguage {
  
  inline def apply(country: CodeableConcept, language: CodeableConcept): MedicinalProductDefinitionNameCountryLanguage = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionNameCountryLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinitionNameCountryLanguage] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: CodeableConcept): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setJurisdiction(value: CodeableConcept): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}

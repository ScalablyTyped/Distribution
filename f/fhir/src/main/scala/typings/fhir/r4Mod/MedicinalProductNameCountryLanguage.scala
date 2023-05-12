package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductNameCountryLanguage
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
object MedicinalProductNameCountryLanguage {
  
  inline def apply(country: CodeableConcept, language: CodeableConcept): MedicinalProductNameCountryLanguage = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductNameCountryLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductNameCountryLanguage] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: CodeableConcept): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setJurisdiction(value: CodeableConcept): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}

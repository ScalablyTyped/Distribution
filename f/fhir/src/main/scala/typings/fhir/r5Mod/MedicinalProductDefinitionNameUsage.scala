package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductDefinitionNameUsage
  extends StObject
     with BackboneElement {
  
  /**
    * Country code for where this name applies.
    */
  var country: CodeableConcept
  
  /**
    * Jurisdiction code for where this name applies. A jurisdiction may be a sub- or supra-national entity (e.g. a state or a geographic region).
    */
  var jurisdiction: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Language code for this name.
    */
  var language: CodeableConcept
}
object MedicinalProductDefinitionNameUsage {
  
  inline def apply(country: CodeableConcept, language: CodeableConcept): MedicinalProductDefinitionNameUsage = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductDefinitionNameUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductDefinitionNameUsage] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: CodeableConcept): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setJurisdiction(value: CodeableConcept): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setLanguage(value: CodeableConcept): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}

package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`replaced-by`
import typings.fhir.fhirStrings.refer
import typings.fhir.fhirStrings.replaces
import typings.fhir.fhirStrings.seealso
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientLink
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Referencing a RelatedPerson here removes the need to use a Person record to associate a Patient and RelatedPerson as the same individual.
    */
  var other: Reference
  
  /**
    * The type of link between this patient resource and another patient resource.
    */
  var `type`: `replaced-by` | replaces | refer | seealso
}
object PatientLink {
  
  inline def apply(other: Reference, `type`: `replaced-by` | replaces | refer | seealso): PatientLink = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientLink]
  }
  
  extension [Self <: PatientLink](x: Self) {
    
    inline def setOther(value: Reference): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setType(value: `replaced-by` | replaces | refer | seealso): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}

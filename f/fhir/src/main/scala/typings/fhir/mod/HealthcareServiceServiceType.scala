package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthcareServiceServiceType
  extends StObject
     with BackboneElement {
  
  /**
    * Collection of specialties handled by the service site. This is more of a medical term.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The specific type of service being delivered or performed.
    */
  var `type`: CodeableConcept
}
object HealthcareServiceServiceType {
  
  inline def apply(`type`: CodeableConcept): HealthcareServiceServiceType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthcareServiceServiceType]
  }
  
  extension [Self <: HealthcareServiceServiceType](x: Self) {
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

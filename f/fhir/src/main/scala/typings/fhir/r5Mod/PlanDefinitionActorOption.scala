package typings.fhir.r5Mod

import typings.fhir.fhirStrings.careteam_
import typings.fhir.fhirStrings.device_
import typings.fhir.fhirStrings.group_
import typings.fhir.fhirStrings.healthcareservice_
import typings.fhir.fhirStrings.location_
import typings.fhir.fhirStrings.organization_
import typings.fhir.fhirStrings.patient_
import typings.fhir.fhirStrings.practitioner_
import typings.fhir.fhirStrings.practitionerrole_
import typings.fhir.fhirStrings.relatedperson_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanDefinitionActorOption
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The role the participant should play in performing the described action.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of participant in the action.
    */
  var `type`: js.UndefOr[
    careteam_ | device_ | group_ | healthcareservice_ | location_ | organization_ | patient_ | practitioner_ | practitionerrole_ | relatedperson_
  ] = js.undefined
  
  /**
    * When this element is a reference, it SHOULD be a reference to a definitional resource (for example, a location type, rather than a specific location).
    */
  var typeReference: js.UndefOr[Reference] = js.undefined
}
object PlanDefinitionActorOption {
  
  inline def apply(): PlanDefinitionActorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanDefinitionActorOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanDefinitionActorOption] (val x: Self) extends AnyVal {
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setType(
      value: careteam_ | device_ | group_ | healthcareservice_ | location_ | organization_ | patient_ | practitioner_ | practitionerrole_ | relatedperson_
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeReference(value: Reference): Self = StObject.set(x, "typeReference", value.asInstanceOf[js.Any])
    
    inline def setTypeReferenceUndefined: Self = StObject.set(x, "typeReference", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}

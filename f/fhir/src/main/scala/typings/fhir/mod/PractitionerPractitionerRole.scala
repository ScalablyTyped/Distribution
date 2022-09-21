package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PractitionerPractitionerRole
  extends StObject
     with BackboneElement {
  
  /**
    * The list of healthcare services that this worker provides for this role's Organization/Location(s).
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The location(s) at which this practitioner provides care.
    */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The organization where the Practitioner performs the roles associated.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Even after the agencies is revoked, the fact that it existed must still be recorded.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Need to know what authority the practitioner has - what can they do?
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specific specialty of the practitioner.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object PractitionerPractitionerRole {
  
  inline def apply(): PractitionerPractitionerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerPractitionerRole]
  }
  
  extension [Self <: PractitionerPractitionerRole](x: Self) {
    
    inline def setHealthcareService(value: js.Array[Reference]): Self = StObject.set(x, "healthcareService", value.asInstanceOf[js.Any])
    
    inline def setHealthcareServiceUndefined: Self = StObject.set(x, "healthcareService", js.undefined)
    
    inline def setHealthcareServiceVarargs(value: Reference*): Self = StObject.set(x, "healthcareService", js.Array(value*))
    
    inline def setLocation(value: js.Array[Reference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Reference*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
  }
}

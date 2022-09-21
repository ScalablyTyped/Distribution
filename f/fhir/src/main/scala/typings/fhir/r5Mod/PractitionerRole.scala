package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PractitionerRole
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  
  /**
    * If this value is false, you may refer to the period to see when the role was in active use. If there is no period specified, no inference can be made about when it was active.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
    */
  var availabilityExceptions: js.UndefOr[String] = js.undefined
  
  /**
    * More detailed availability information may be provided in associated Schedule/Slot resources.
    */
  var availableTime: js.UndefOr[js.Array[PractitionerRoleAvailableTime]] = js.undefined
  
  /**
    * A person may have more than one role.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the practitioner with this role.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The list of healthcare services that this worker provides for this role's Organization/Location(s).
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Business Identifiers that are specific to a role/location.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The location(s) at which this practitioner provides care.
    */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The practitioner is not available or performing this role during this period of time due to the provided reason.
    */
  var notAvailable: js.UndefOr[js.Array[PractitionerRoleNotAvailable]] = js.undefined
  
  /**
    * The organization where the Practitioner performs the roles associated.
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period during which the person is authorized to act as a practitioner in these role(s) for the organization.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Practitioner that is able to provide the defined services for the organization.
    */
  var practitioner: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_PractitionerRole: typings.fhir.fhirStrings.PractitionerRole
  
  /**
    * Specific specialty of the practitioner.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contact details that are specific to the role/location/service.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object PractitionerRole {
  
  inline def apply(): PractitionerRole = {
    val __obj = js.Dynamic.literal(resourceType = "PractitionerRole")
    __obj.asInstanceOf[PractitionerRole]
  }
  
  extension [Self <: PractitionerRole](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAvailabilityExceptions(value: String): Self = StObject.set(x, "availabilityExceptions", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityExceptionsUndefined: Self = StObject.set(x, "availabilityExceptions", js.undefined)
    
    inline def setAvailableTime(value: js.Array[PractitionerRoleAvailableTime]): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    inline def setAvailableTimeVarargs(value: PractitionerRoleAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value*))
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setHealthcareService(value: js.Array[Reference]): Self = StObject.set(x, "healthcareService", value.asInstanceOf[js.Any])
    
    inline def setHealthcareServiceUndefined: Self = StObject.set(x, "healthcareService", js.undefined)
    
    inline def setHealthcareServiceVarargs(value: Reference*): Self = StObject.set(x, "healthcareService", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: js.Array[Reference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Reference*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setNotAvailable(value: js.Array[PractitionerRoleNotAvailable]): Self = StObject.set(x, "notAvailable", value.asInstanceOf[js.Any])
    
    inline def setNotAvailableUndefined: Self = StObject.set(x, "notAvailable", js.undefined)
    
    inline def setNotAvailableVarargs(value: PractitionerRoleNotAvailable*): Self = StObject.set(x, "notAvailable", js.Array(value*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPractitioner(value: Reference): Self = StObject.set(x, "practitioner", value.asInstanceOf[js.Any])
    
    inline def setPractitionerUndefined: Self = StObject.set(x, "practitioner", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.PractitionerRole): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_availabilityExceptions(value: Element): Self = StObject.set(x, "_availabilityExceptions", value.asInstanceOf[js.Any])
    
    inline def set_availabilityExceptionsUndefined: Self = StObject.set(x, "_availabilityExceptions", js.undefined)
  }
}

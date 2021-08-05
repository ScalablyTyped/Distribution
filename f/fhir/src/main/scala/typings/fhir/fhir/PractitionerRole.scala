package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Roles/organizations the practitioner is associated with
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait PractitionerRole
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.undefined
  
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[PractitionerRoleAvailableTime]] = js.undefined
  
  /**
    * Roles which this practitioner may perform
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the practitioner with this role
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The list of healthcare services that this worker provides for this role's Organization/Location(s)
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Business Identifiers that are specific to a role/location
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The location(s) at which this practitioner provides care
    */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[PractitionerRoleNotAvailable]] = js.undefined
  
  /**
    * Organization where the roles are available
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period during which the practitioner is authorized to perform in these role(s)
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Practitioner that is able to provide the defined services for the organation
    */
  var practitioner: js.UndefOr[Reference] = js.undefined
  
  /**
    * Specific specialty of the practitioner
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contact details that are specific to the role/location/service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object PractitionerRole {
  
  inline def apply(): PractitionerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerRole]
  }
  
  extension [Self <: PractitionerRole](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAvailabilityExceptions(value: String): Self = StObject.set(x, "availabilityExceptions", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityExceptionsUndefined: Self = StObject.set(x, "availabilityExceptions", js.undefined)
    
    inline def setAvailableTime(value: js.Array[PractitionerRoleAvailableTime]): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    inline def setAvailableTimeVarargs(value: PractitionerRoleAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value :_*))
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    inline def setHealthcareService(value: js.Array[Reference]): Self = StObject.set(x, "healthcareService", value.asInstanceOf[js.Any])
    
    inline def setHealthcareServiceUndefined: Self = StObject.set(x, "healthcareService", js.undefined)
    
    inline def setHealthcareServiceVarargs(value: Reference*): Self = StObject.set(x, "healthcareService", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setLocation(value: js.Array[Reference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Reference*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setNotAvailable(value: js.Array[PractitionerRoleNotAvailable]): Self = StObject.set(x, "notAvailable", value.asInstanceOf[js.Any])
    
    inline def setNotAvailableUndefined: Self = StObject.set(x, "notAvailable", js.undefined)
    
    inline def setNotAvailableVarargs(value: PractitionerRoleNotAvailable*): Self = StObject.set(x, "notAvailable", js.Array(value :_*))
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPractitioner(value: Reference): Self = StObject.set(x, "practitioner", value.asInstanceOf[js.Any])
    
    inline def setPractitionerUndefined: Self = StObject.set(x, "practitioner", js.undefined)
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value :_*))
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_availabilityExceptions(value: Element): Self = StObject.set(x, "_availabilityExceptions", value.asInstanceOf[js.Any])
    
    inline def set_availabilityExceptionsUndefined: Self = StObject.set(x, "_availabilityExceptions", js.undefined)
  }
}

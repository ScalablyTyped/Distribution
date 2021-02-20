package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Roles/organizations the practitioner is associated with
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait PractitionerRole extends DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.native
  
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.native
  
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[PractitionerRoleAvailableTime]] = js.native
  
  /**
    * Roles which this practitioner may perform
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Technical endpoints providing access to services operated for the practitioner with this role
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * The list of healthcare services that this worker provides for this role's Organization/Location(s)
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Business Identifiers that are specific to a role/location
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * The location(s) at which this practitioner provides care
    */
  var location: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[PractitionerRoleNotAvailable]] = js.native
  
  /**
    * Organization where the roles are available
    */
  var organization: js.UndefOr[Reference] = js.native
  
  /**
    * The period during which the practitioner is authorized to perform in these role(s)
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Practitioner that is able to provide the defined services for the organation
    */
  var practitioner: js.UndefOr[Reference] = js.native
  
  /**
    * Specific specialty of the practitioner
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Contact details that are specific to the role/location/service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}
object PractitionerRole {
  
  @scala.inline
  def apply(): PractitionerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerRole]
  }
  
  @scala.inline
  implicit class PractitionerRoleMutableBuilder[Self <: PractitionerRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAvailabilityExceptions(value: String): Self = StObject.set(x, "availabilityExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityExceptionsUndefined: Self = StObject.set(x, "availabilityExceptions", js.undefined)
    
    @scala.inline
    def setAvailableTime(value: js.Array[PractitionerRoleAvailableTime]): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    @scala.inline
    def setAvailableTimeVarargs(value: PractitionerRoleAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setHealthcareService(value: js.Array[Reference]): Self = StObject.set(x, "healthcareService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthcareServiceUndefined: Self = StObject.set(x, "healthcareService", js.undefined)
    
    @scala.inline
    def setHealthcareServiceVarargs(value: Reference*): Self = StObject.set(x, "healthcareService", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[Reference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Reference*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setNotAvailable(value: js.Array[PractitionerRoleNotAvailable]): Self = StObject.set(x, "notAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAvailableUndefined: Self = StObject.set(x, "notAvailable", js.undefined)
    
    @scala.inline
    def setNotAvailableVarargs(value: PractitionerRoleNotAvailable*): Self = StObject.set(x, "notAvailable", js.Array(value :_*))
    
    @scala.inline
    def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPractitioner(value: Reference): Self = StObject.set(x, "practitioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPractitionerUndefined: Self = StObject.set(x, "practitioner", js.undefined)
    
    @scala.inline
    def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    @scala.inline
    def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    @scala.inline
    def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    @scala.inline
    def set_availabilityExceptions(value: Element): Self = StObject.set(x, "_availabilityExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_availabilityExceptionsUndefined: Self = StObject.set(x, "_availabilityExceptions", js.undefined)
  }
}

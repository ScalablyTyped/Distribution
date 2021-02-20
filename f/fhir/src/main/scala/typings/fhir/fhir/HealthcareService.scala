package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The details of a healthcare service available at a location
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait HealthcareService extends DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'appointmentRequired'.
    */
  var _appointmentRequired: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'eligibilityNote'.
    */
  var _eligibilityNote: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'extraDetails'.
    */
  var _extraDetails: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'programName'.
    */
  var _programName: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Whether this healthcareservice is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * If an appointment is required for access to this service
    */
  var appointmentRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.native
  
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[HealthcareServiceAvailableTime]] = js.native
  
  /**
    * Broad category of service being performed or delivered
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Collection of characteristics (attributes)
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Additional description and/or any specific issues not covered elsewhere
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Location(s) service is inteded for/available to
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Specific eligibility requirements required to use the service
    */
  var eligibility: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Describes the eligibility conditions for the service
    */
  var eligibilityNote: js.UndefOr[String] = js.native
  
  /**
    * Technical endpoints providing access to services operated for the location
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Extra details about the service that can't be placed in the other fields
    */
  var extraDetails: js.UndefOr[String] = js.native
  
  /**
    * External identifiers for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Location(s) where service may be provided
    */
  var location: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Description of service as presented to a consumer while searching
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[HealthcareServiceNotAvailable]] = js.native
  
  /**
    * Facilitates quick identification of the service
    */
  var photo: js.UndefOr[Attachment] = js.native
  
  /**
    * Program Names that categorize the service
    */
  var programName: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Organization that provides this service
    */
  var providedBy: js.UndefOr[Reference] = js.native
  
  /**
    * Ways that the service accepts referrals
    */
  var referralMethod: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Conditions under which service is available/offered
    */
  var serviceProvisionCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Specialties handled by the HealthcareService
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Contacts related to the healthcare service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
  
  /**
    * Type of service that may be delivered or performed
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object HealthcareService {
  
  @scala.inline
  def apply(): HealthcareService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthcareService]
  }
  
  @scala.inline
  implicit class HealthcareServiceMutableBuilder[Self <: HealthcareService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAppointmentRequired(value: Boolean): Self = StObject.set(x, "appointmentRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentRequiredUndefined: Self = StObject.set(x, "appointmentRequired", js.undefined)
    
    @scala.inline
    def setAvailabilityExceptions(value: String): Self = StObject.set(x, "availabilityExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityExceptionsUndefined: Self = StObject.set(x, "availabilityExceptions", js.undefined)
    
    @scala.inline
    def setAvailableTime(value: js.Array[HealthcareServiceAvailableTime]): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    @scala.inline
    def setAvailableTimeVarargs(value: HealthcareServiceAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCharacteristic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    @scala.inline
    def setCharacteristicVarargs(value: CodeableConcept*): Self = StObject.set(x, "characteristic", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCoverageArea(value: js.Array[Reference]): Self = StObject.set(x, "coverageArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageAreaUndefined: Self = StObject.set(x, "coverageArea", js.undefined)
    
    @scala.inline
    def setCoverageAreaVarargs(value: Reference*): Self = StObject.set(x, "coverageArea", js.Array(value :_*))
    
    @scala.inline
    def setEligibility(value: CodeableConcept): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibilityNote(value: String): Self = StObject.set(x, "eligibilityNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibilityNoteUndefined: Self = StObject.set(x, "eligibilityNote", js.undefined)
    
    @scala.inline
    def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setExtraDetails(value: String): Self = StObject.set(x, "extraDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDetailsUndefined: Self = StObject.set(x, "extraDetails", js.undefined)
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotAvailable(value: js.Array[HealthcareServiceNotAvailable]): Self = StObject.set(x, "notAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAvailableUndefined: Self = StObject.set(x, "notAvailable", js.undefined)
    
    @scala.inline
    def setNotAvailableVarargs(value: HealthcareServiceNotAvailable*): Self = StObject.set(x, "notAvailable", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: Attachment): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setProgramName(value: js.Array[String]): Self = StObject.set(x, "programName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramNameUndefined: Self = StObject.set(x, "programName", js.undefined)
    
    @scala.inline
    def setProgramNameVarargs(value: String*): Self = StObject.set(x, "programName", js.Array(value :_*))
    
    @scala.inline
    def setProvidedBy(value: Reference): Self = StObject.set(x, "providedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedByUndefined: Self = StObject.set(x, "providedBy", js.undefined)
    
    @scala.inline
    def setReferralMethod(value: js.Array[CodeableConcept]): Self = StObject.set(x, "referralMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralMethodUndefined: Self = StObject.set(x, "referralMethod", js.undefined)
    
    @scala.inline
    def setReferralMethodVarargs(value: CodeableConcept*): Self = StObject.set(x, "referralMethod", js.Array(value :_*))
    
    @scala.inline
    def setServiceProvisionCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceProvisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceProvisionCodeUndefined: Self = StObject.set(x, "serviceProvisionCode", js.undefined)
    
    @scala.inline
    def setServiceProvisionCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceProvisionCode", js.Array(value :_*))
    
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
    def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    @scala.inline
    def set_appointmentRequired(value: Element): Self = StObject.set(x, "_appointmentRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_appointmentRequiredUndefined: Self = StObject.set(x, "_appointmentRequired", js.undefined)
    
    @scala.inline
    def set_availabilityExceptions(value: Element): Self = StObject.set(x, "_availabilityExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_availabilityExceptionsUndefined: Self = StObject.set(x, "_availabilityExceptions", js.undefined)
    
    @scala.inline
    def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    @scala.inline
    def set_eligibilityNote(value: Element): Self = StObject.set(x, "_eligibilityNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eligibilityNoteUndefined: Self = StObject.set(x, "_eligibilityNote", js.undefined)
    
    @scala.inline
    def set_extraDetails(value: Element): Self = StObject.set(x, "_extraDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_extraDetailsUndefined: Self = StObject.set(x, "_extraDetails", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_programName(value: js.Array[Element]): Self = StObject.set(x, "_programName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_programNameUndefined: Self = StObject.set(x, "_programName", js.undefined)
    
    @scala.inline
    def set_programNameVarargs(value: Element*): Self = StObject.set(x, "_programName", js.Array(value :_*))
  }
}

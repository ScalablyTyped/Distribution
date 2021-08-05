package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The details of a healthcare service available at a location
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait HealthcareService
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'appointmentRequired'.
    */
  var _appointmentRequired: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'eligibilityNote'.
    */
  var _eligibilityNote: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'extraDetails'.
    */
  var _extraDetails: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'programName'.
    */
  var _programName: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Whether this healthcareservice is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If an appointment is required for access to this service
    */
  var appointmentRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.undefined
  
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[HealthcareServiceAvailableTime]] = js.undefined
  
  /**
    * Broad category of service being performed or delivered
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Collection of characteristics (attributes)
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Additional description and/or any specific issues not covered elsewhere
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Location(s) service is inteded for/available to
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Specific eligibility requirements required to use the service
    */
  var eligibility: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Describes the eligibility conditions for the service
    */
  var eligibilityNote: js.UndefOr[String] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the location
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Extra details about the service that can't be placed in the other fields
    */
  var extraDetails: js.UndefOr[String] = js.undefined
  
  /**
    * External identifiers for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Location(s) where service may be provided
    */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Description of service as presented to a consumer while searching
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[HealthcareServiceNotAvailable]] = js.undefined
  
  /**
    * Facilitates quick identification of the service
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Program Names that categorize the service
    */
  var programName: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Organization that provides this service
    */
  var providedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * Ways that the service accepts referrals
    */
  var referralMethod: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Conditions under which service is available/offered
    */
  var serviceProvisionCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Specialties handled by the HealthcareService
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contacts related to the healthcare service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * Type of service that may be delivered or performed
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object HealthcareService {
  
  inline def apply(): HealthcareService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthcareService]
  }
  
  extension [Self <: HealthcareService](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAppointmentRequired(value: Boolean): Self = StObject.set(x, "appointmentRequired", value.asInstanceOf[js.Any])
    
    inline def setAppointmentRequiredUndefined: Self = StObject.set(x, "appointmentRequired", js.undefined)
    
    inline def setAvailabilityExceptions(value: String): Self = StObject.set(x, "availabilityExceptions", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityExceptionsUndefined: Self = StObject.set(x, "availabilityExceptions", js.undefined)
    
    inline def setAvailableTime(value: js.Array[HealthcareServiceAvailableTime]): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    inline def setAvailableTimeVarargs(value: HealthcareServiceAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value :_*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCharacteristic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: CodeableConcept*): Self = StObject.set(x, "characteristic", js.Array(value :_*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCoverageArea(value: js.Array[Reference]): Self = StObject.set(x, "coverageArea", value.asInstanceOf[js.Any])
    
    inline def setCoverageAreaUndefined: Self = StObject.set(x, "coverageArea", js.undefined)
    
    inline def setCoverageAreaVarargs(value: Reference*): Self = StObject.set(x, "coverageArea", js.Array(value :_*))
    
    inline def setEligibility(value: CodeableConcept): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityNote(value: String): Self = StObject.set(x, "eligibilityNote", value.asInstanceOf[js.Any])
    
    inline def setEligibilityNoteUndefined: Self = StObject.set(x, "eligibilityNote", js.undefined)
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    inline def setExtraDetails(value: String): Self = StObject.set(x, "extraDetails", value.asInstanceOf[js.Any])
    
    inline def setExtraDetailsUndefined: Self = StObject.set(x, "extraDetails", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setLocation(value: js.Array[Reference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Reference*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotAvailable(value: js.Array[HealthcareServiceNotAvailable]): Self = StObject.set(x, "notAvailable", value.asInstanceOf[js.Any])
    
    inline def setNotAvailableUndefined: Self = StObject.set(x, "notAvailable", js.undefined)
    
    inline def setNotAvailableVarargs(value: HealthcareServiceNotAvailable*): Self = StObject.set(x, "notAvailable", js.Array(value :_*))
    
    inline def setPhoto(value: Attachment): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setProgramName(value: js.Array[String]): Self = StObject.set(x, "programName", value.asInstanceOf[js.Any])
    
    inline def setProgramNameUndefined: Self = StObject.set(x, "programName", js.undefined)
    
    inline def setProgramNameVarargs(value: String*): Self = StObject.set(x, "programName", js.Array(value :_*))
    
    inline def setProvidedBy(value: Reference): Self = StObject.set(x, "providedBy", value.asInstanceOf[js.Any])
    
    inline def setProvidedByUndefined: Self = StObject.set(x, "providedBy", js.undefined)
    
    inline def setReferralMethod(value: js.Array[CodeableConcept]): Self = StObject.set(x, "referralMethod", value.asInstanceOf[js.Any])
    
    inline def setReferralMethodUndefined: Self = StObject.set(x, "referralMethod", js.undefined)
    
    inline def setReferralMethodVarargs(value: CodeableConcept*): Self = StObject.set(x, "referralMethod", js.Array(value :_*))
    
    inline def setServiceProvisionCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceProvisionCode", value.asInstanceOf[js.Any])
    
    inline def setServiceProvisionCodeUndefined: Self = StObject.set(x, "serviceProvisionCode", js.undefined)
    
    inline def setServiceProvisionCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceProvisionCode", js.Array(value :_*))
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value :_*))
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_appointmentRequired(value: Element): Self = StObject.set(x, "_appointmentRequired", value.asInstanceOf[js.Any])
    
    inline def set_appointmentRequiredUndefined: Self = StObject.set(x, "_appointmentRequired", js.undefined)
    
    inline def set_availabilityExceptions(value: Element): Self = StObject.set(x, "_availabilityExceptions", value.asInstanceOf[js.Any])
    
    inline def set_availabilityExceptionsUndefined: Self = StObject.set(x, "_availabilityExceptions", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_eligibilityNote(value: Element): Self = StObject.set(x, "_eligibilityNote", value.asInstanceOf[js.Any])
    
    inline def set_eligibilityNoteUndefined: Self = StObject.set(x, "_eligibilityNote", js.undefined)
    
    inline def set_extraDetails(value: Element): Self = StObject.set(x, "_extraDetails", value.asInstanceOf[js.Any])
    
    inline def set_extraDetailsUndefined: Self = StObject.set(x, "_extraDetails", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_programName(value: js.Array[Element]): Self = StObject.set(x, "_programName", value.asInstanceOf[js.Any])
    
    inline def set_programNameUndefined: Self = StObject.set(x, "_programName", js.undefined)
    
    inline def set_programNameVarargs(value: Element*): Self = StObject.set(x, "_programName", js.Array(value :_*))
  }
}

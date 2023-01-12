package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthcareService
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _appointmentRequired: js.UndefOr[Element] = js.undefined
  
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _eligibilityNote: js.UndefOr[Element] = js.undefined
  
  var _extraDetails: js.UndefOr[Element] = js.undefined
  
  var _programName: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _publicKey: js.UndefOr[Element] = js.undefined
  
  var _serviceName: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
    */
  var appointmentRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
    */
  var availabilityExceptions: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of times that the Service Site is available.
    */
  var availableTime: js.UndefOr[js.Array[HealthcareServiceAvailableTime]] = js.undefined
  
  /**
    * Collection of characteristics (attributes).
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * The location(s) that this service is available to (not where the service is provided).
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Does this service have specific eligibility requirements that need to be met in order to use the service?
    */
  var eligibility: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Describes the eligibility conditions for the service.
    */
  var eligibilityNote: js.UndefOr[String] = js.undefined
  
  /**
    * Extra details about the service that can't be placed in the other fields.
    */
  var extraDetails: js.UndefOr[String] = js.undefined
  
  /**
    * External identifiers for this item.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The location where this healthcare service may be provided.
    */
  var location: Reference
  
  /**
    * The HealthcareService is not available during this period of time due to the provided reason.
    */
  var notAvailable: js.UndefOr[js.Array[HealthcareServiceNotAvailable]] = js.undefined
  
  /**
    * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Program Names that can be used to categorize the service.
    */
  var programName: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The organization that provides this healthcare service.
    */
  var providedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available.
    */
  var publicKey: js.UndefOr[String] = js.undefined
  
  /**
    * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
    */
  var referralMethod: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_HealthcareService: typings.fhir.fhirStrings.HealthcareService
  
  /**
    * Identifies the broad category of service being performed or delivered.
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Further description of the service as it would be presented to a consumer while searching.
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The code(s) that detail the conditions under which the healthcare service is available/offered.
    */
  var serviceProvisionCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A specific type of service that may be delivered or performed.
    */
  var serviceType: js.UndefOr[js.Array[HealthcareServiceServiceType]] = js.undefined
  
  /**
    * List of contacts related to this specific healthcare service.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object HealthcareService {
  
  inline def apply(location: Reference): HealthcareService = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], resourceType = "HealthcareService")
    __obj.asInstanceOf[HealthcareService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthcareService] (val x: Self) extends AnyVal {
    
    inline def setAppointmentRequired(value: Boolean): Self = StObject.set(x, "appointmentRequired", value.asInstanceOf[js.Any])
    
    inline def setAppointmentRequiredUndefined: Self = StObject.set(x, "appointmentRequired", js.undefined)
    
    inline def setAvailabilityExceptions(value: String): Self = StObject.set(x, "availabilityExceptions", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityExceptionsUndefined: Self = StObject.set(x, "availabilityExceptions", js.undefined)
    
    inline def setAvailableTime(value: js.Array[HealthcareServiceAvailableTime]): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    inline def setAvailableTimeVarargs(value: HealthcareServiceAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value*))
    
    inline def setCharacteristic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: CodeableConcept*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCoverageArea(value: js.Array[Reference]): Self = StObject.set(x, "coverageArea", value.asInstanceOf[js.Any])
    
    inline def setCoverageAreaUndefined: Self = StObject.set(x, "coverageArea", js.undefined)
    
    inline def setCoverageAreaVarargs(value: Reference*): Self = StObject.set(x, "coverageArea", js.Array(value*))
    
    inline def setEligibility(value: CodeableConcept): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityNote(value: String): Self = StObject.set(x, "eligibilityNote", value.asInstanceOf[js.Any])
    
    inline def setEligibilityNoteUndefined: Self = StObject.set(x, "eligibilityNote", js.undefined)
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setExtraDetails(value: String): Self = StObject.set(x, "extraDetails", value.asInstanceOf[js.Any])
    
    inline def setExtraDetailsUndefined: Self = StObject.set(x, "extraDetails", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNotAvailable(value: js.Array[HealthcareServiceNotAvailable]): Self = StObject.set(x, "notAvailable", value.asInstanceOf[js.Any])
    
    inline def setNotAvailableUndefined: Self = StObject.set(x, "notAvailable", js.undefined)
    
    inline def setNotAvailableVarargs(value: HealthcareServiceNotAvailable*): Self = StObject.set(x, "notAvailable", js.Array(value*))
    
    inline def setPhoto(value: Attachment): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setProgramName(value: js.Array[String]): Self = StObject.set(x, "programName", value.asInstanceOf[js.Any])
    
    inline def setProgramNameUndefined: Self = StObject.set(x, "programName", js.undefined)
    
    inline def setProgramNameVarargs(value: String*): Self = StObject.set(x, "programName", js.Array(value*))
    
    inline def setProvidedBy(value: Reference): Self = StObject.set(x, "providedBy", value.asInstanceOf[js.Any])
    
    inline def setProvidedByUndefined: Self = StObject.set(x, "providedBy", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setReferralMethod(value: js.Array[CodeableConcept]): Self = StObject.set(x, "referralMethod", value.asInstanceOf[js.Any])
    
    inline def setReferralMethodUndefined: Self = StObject.set(x, "referralMethod", js.undefined)
    
    inline def setReferralMethodVarargs(value: CodeableConcept*): Self = StObject.set(x, "referralMethod", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.HealthcareService): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceCategory(value: CodeableConcept): Self = StObject.set(x, "serviceCategory", value.asInstanceOf[js.Any])
    
    inline def setServiceCategoryUndefined: Self = StObject.set(x, "serviceCategory", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceProvisionCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceProvisionCode", value.asInstanceOf[js.Any])
    
    inline def setServiceProvisionCodeUndefined: Self = StObject.set(x, "serviceProvisionCode", js.undefined)
    
    inline def setServiceProvisionCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceProvisionCode", js.Array(value*))
    
    inline def setServiceType(value: js.Array[HealthcareServiceServiceType]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setServiceTypeVarargs(value: HealthcareServiceServiceType*): Self = StObject.set(x, "serviceType", js.Array(value*))
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
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
    
    inline def set_programName(value: js.Array[Element]): Self = StObject.set(x, "_programName", value.asInstanceOf[js.Any])
    
    inline def set_programNameUndefined: Self = StObject.set(x, "_programName", js.undefined)
    
    inline def set_programNameVarargs(value: Element*): Self = StObject.set(x, "_programName", js.Array(value*))
    
    inline def set_publicKey(value: Element): Self = StObject.set(x, "_publicKey", value.asInstanceOf[js.Any])
    
    inline def set_publicKeyUndefined: Self = StObject.set(x, "_publicKey", js.undefined)
    
    inline def set_serviceName(value: Element): Self = StObject.set(x, "_serviceName", value.asInstanceOf[js.Any])
    
    inline def set_serviceNameUndefined: Self = StObject.set(x, "_serviceName", js.undefined)
  }
}

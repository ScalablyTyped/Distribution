package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthcareService
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _appointmentRequired: js.UndefOr[Element] = js.undefined
  
  var _availabilityExceptions: js.UndefOr[Element] = js.undefined
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _eligibilityNote: js.UndefOr[Element] = js.undefined
  
  var _extraDetails: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _programName: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * This element is labeled as a modifier because it may be used to mark that the resource was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
    */
  var appointmentRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times.
    */
  var availabilityExceptions: js.UndefOr[String] = js.undefined
  
  /**
    * More detailed availability information may be provided in associated Schedule/Slot resources.
    */
  var availableTime: js.UndefOr[js.Array[HealthcareServiceAvailableTime]] = js.undefined
  
  /**
    * Selecting a Service Category then determines the list of relevant service types that can be selected in the primary service type.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * These could be such things as is wheelchair accessible.
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Would expect that a user would not see this information on a search results, and it would only be available when viewing the complete details of the service.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * The locations referenced by the coverage area can include both specific locations, including areas, and also conceptual domains too (mode = kind), such as a physical area (tri-state area) and some other attribute (covered by Example Care Organization). These types of Locations are often not managed by any specific organization. This could also include generic locations such as "in-home".
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Does this service have specific eligibility requirements that need to be met in order to use the service?
    */
  var eligibility: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The description of service eligibility should, in general, not exceed one or two paragraphs. It should be sufficient for a prospective consumer to determine if they are likely to be eligible or not. Where eligibility requirements and conditions are complex, it may simply be noted that an eligibility assessment is required. Where eligibility is determined by an outside source, such as an Act of Parliament, this should be noted, preferably with a reference to a commonly available copy of the source document such as a web page.
    */
  var eligibilityNote: js.UndefOr[String] = js.undefined
  
  /**
    * Technical endpoints providing access to services operated for the specific healthcare services defined at this resource.
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Extra details about the service that can't be placed in the other fields.
    */
  var extraDetails: js.UndefOr[String] = js.undefined
  
  /**
    * External identifiers for this item.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The location(s) where this healthcare service may be provided.
    */
  var location: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Further description of the service as it would be presented to a consumer while searching.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The HealthcareService is not available during this period of time due to the provided reason.
    */
  var notAvailable: js.UndefOr[js.Array[HealthcareServiceNotAvailable]] = js.undefined
  
  /**
    * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Programs are often defined externally to an Organization, commonly by governments; e.g. Home and Community Care Programs, Homeless Program, ….
    */
  var programName: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This property is recommended to be the same as the Location's managingOrganization, and if not provided should be interpreted as such. If the Location does not have a managing Organization, then this property should be populated.
    */
  var providedBy: js.UndefOr[Reference] = js.undefined
  
  /**
    * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required.
    */
  var referralMethod: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_HealthcareService: typings.fhir.fhirStrings.HealthcareService
  
  /**
    * The provision means being commissioned by, contractually obliged or financially sourced. Types of costings that may apply to this healthcare service, such if the service may be available for free, some discounts available, or fees apply.
    */
  var serviceProvisionCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Collection of specialties handled by the service site. This is more of a medical term.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If this is empty, then refer to the location's contacts.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  
  /**
    * The specific type of service that may be delivered or performed.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object HealthcareService {
  
  inline def apply(): HealthcareService = {
    val __obj = js.Dynamic.literal(resourceType = "HealthcareService")
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
    
    inline def setAvailableTimeVarargs(value: HealthcareServiceAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
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
    
    inline def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value*))
    
    inline def setExtraDetails(value: String): Self = StObject.set(x, "extraDetails", value.asInstanceOf[js.Any])
    
    inline def setExtraDetailsUndefined: Self = StObject.set(x, "extraDetails", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: js.Array[Reference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Reference*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
    
    inline def setReferralMethod(value: js.Array[CodeableConcept]): Self = StObject.set(x, "referralMethod", value.asInstanceOf[js.Any])
    
    inline def setReferralMethodUndefined: Self = StObject.set(x, "referralMethod", js.undefined)
    
    inline def setReferralMethodVarargs(value: CodeableConcept*): Self = StObject.set(x, "referralMethod", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.HealthcareService): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setServiceProvisionCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "serviceProvisionCode", value.asInstanceOf[js.Any])
    
    inline def setServiceProvisionCodeUndefined: Self = StObject.set(x, "serviceProvisionCode", js.undefined)
    
    inline def setServiceProvisionCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "serviceProvisionCode", js.Array(value*))
    
    inline def setSpecialty(value: js.Array[CodeableConcept]): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def setSpecialtyVarargs(value: CodeableConcept*): Self = StObject.set(x, "specialty", js.Array(value*))
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
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
    
    inline def set_programNameVarargs(value: Element*): Self = StObject.set(x, "_programName", js.Array(value*))
  }
}

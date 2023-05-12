package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthcareService
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _appointmentRequired: js.UndefOr[Element] = js.undefined
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  var _extraDetails: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * This element is labeled as a modifier because it may be used to mark that the resource was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
    */
  var appointmentRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * More detailed availability information may be provided in associated Schedule/Slot resources.
    * Systems may choose to render availability differently than it is exchanged on the interface. For example, rather than "Mon, Tue, Wed, Thur, Fri from 9am-12am; Mon, Tue, Wed, Thur, Fri from 1pm-5pm" as would be implied by two availableTime repetitions, an application could render this information as "Mon-Fri 9-12am and 1-5pm".
    * The NotAvailableTime(s) included indicate the general days/periods where the service is not available (for things such as public holidays).
    */
  var availability: js.UndefOr[js.Array[Availability]] = js.undefined
  
  /**
    * Selecting a Service Category then determines the list of relevant service types that can be selected in the primary service type.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * These could be such things as is wheelchair accessible.
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Would expect that a user would not see this information on a search results, and it would only be available when viewing the complete details of the service.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * When using this property it indicates that the service is available with this language, it is not derived from the practitioners, and not all are required to use this language, just that this language is available while scheduling.
    */
  var communication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The address/telecom use code 'home' are not to be used. Note that these contacts are not the contact details of people who provide the service (that would be through PractitionerRole), these are official contacts for the HealthcareService itself for specific purposes. E.g. Mailing Addresses, Billing Addresses, Contact numbers for Booking or Billing Enquiries, general web address, web address for online bookings etc.
    * If this is empty (or the type of interest is empty), refer to the location's contacts.
    */
  var contact: js.UndefOr[js.Array[ExtendedContactDetail]] = js.undefined
  
  /**
    * The locations referenced by the coverage area can include both specific locations, including areas, and also conceptual domains too (mode = kind), such as a physical area (tri-state area) and some other attribute (covered by Example Care Organization). These types of Locations are often not managed by any specific organization. This could also include generic locations such as "in-home".
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Does this service have specific eligibility requirements that need to be met in order to use the service?
    */
  var eligibility: js.UndefOr[js.Array[HealthcareServiceEligibility]] = js.undefined
  
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
    * For example, if there is a generic Radiology service that offers CT Scans, MRIs, etc.  You could have HealthcareService resources for the CT Scans and MRIs, which have an offeredIn reference to the Radiology HealthcareService.
    */
  var offeredIn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list.
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Programs are often defined externally to an Organization, commonly by governments; e.g. Home and Community Care Programs, Homeless Program, ….
    */
  var program: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
    * Collection of specialties handled by the Healthcare service. This is more of a medical term.
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthcareService] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAppointmentRequired(value: Boolean): Self = StObject.set(x, "appointmentRequired", value.asInstanceOf[js.Any])
    
    inline def setAppointmentRequiredUndefined: Self = StObject.set(x, "appointmentRequired", js.undefined)
    
    inline def setAvailability(value: js.Array[Availability]): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setAvailabilityVarargs(value: Availability*): Self = StObject.set(x, "availability", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCharacteristic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: CodeableConcept*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCommunication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    inline def setCommunicationUndefined: Self = StObject.set(x, "communication", js.undefined)
    
    inline def setCommunicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "communication", js.Array(value*))
    
    inline def setContact(value: js.Array[ExtendedContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ExtendedContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCoverageArea(value: js.Array[Reference]): Self = StObject.set(x, "coverageArea", value.asInstanceOf[js.Any])
    
    inline def setCoverageAreaUndefined: Self = StObject.set(x, "coverageArea", js.undefined)
    
    inline def setCoverageAreaVarargs(value: Reference*): Self = StObject.set(x, "coverageArea", js.Array(value*))
    
    inline def setEligibility(value: js.Array[HealthcareServiceEligibility]): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setEligibilityVarargs(value: HealthcareServiceEligibility*): Self = StObject.set(x, "eligibility", js.Array(value*))
    
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
    
    inline def setOfferedIn(value: js.Array[Reference]): Self = StObject.set(x, "offeredIn", value.asInstanceOf[js.Any])
    
    inline def setOfferedInUndefined: Self = StObject.set(x, "offeredIn", js.undefined)
    
    inline def setOfferedInVarargs(value: Reference*): Self = StObject.set(x, "offeredIn", js.Array(value*))
    
    inline def setPhoto(value: Attachment): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setProgram(value: js.Array[CodeableConcept]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setProgramVarargs(value: CodeableConcept*): Self = StObject.set(x, "program", js.Array(value*))
    
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
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_appointmentRequired(value: Element): Self = StObject.set(x, "_appointmentRequired", value.asInstanceOf[js.Any])
    
    inline def set_appointmentRequiredUndefined: Self = StObject.set(x, "_appointmentRequired", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_extraDetails(value: Element): Self = StObject.set(x, "_extraDetails", value.asInstanceOf[js.Any])
    
    inline def set_extraDetailsUndefined: Self = StObject.set(x, "_extraDetails", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}

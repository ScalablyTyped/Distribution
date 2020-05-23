package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details of a healthcare service available at a location
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait HealthcareService extends DomainResource {
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
  @scala.inline
  def apply(
    _active: Element = null,
    _appointmentRequired: Element = null,
    _availabilityExceptions: Element = null,
    _comment: Element = null,
    _eligibilityNote: Element = null,
    _extraDetails: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _programName: js.Array[Element] = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    appointmentRequired: js.UndefOr[Boolean] = js.undefined,
    availabilityExceptions: String = null,
    availableTime: js.Array[HealthcareServiceAvailableTime] = null,
    category: CodeableConcept = null,
    characteristic: js.Array[CodeableConcept] = null,
    comment: String = null,
    contained: js.Array[Resource] = null,
    coverageArea: js.Array[Reference] = null,
    eligibility: CodeableConcept = null,
    eligibilityNote: String = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    extraDetails: String = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    location: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    notAvailable: js.Array[HealthcareServiceNotAvailable] = null,
    photo: Attachment = null,
    programName: js.Array[String] = null,
    providedBy: Reference = null,
    referralMethod: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    serviceProvisionCode: js.Array[CodeableConcept] = null,
    specialty: js.Array[CodeableConcept] = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): HealthcareService = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_appointmentRequired != null) __obj.updateDynamic("_appointmentRequired")(_appointmentRequired.asInstanceOf[js.Any])
    if (_availabilityExceptions != null) __obj.updateDynamic("_availabilityExceptions")(_availabilityExceptions.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_eligibilityNote != null) __obj.updateDynamic("_eligibilityNote")(_eligibilityNote.asInstanceOf[js.Any])
    if (_extraDetails != null) __obj.updateDynamic("_extraDetails")(_extraDetails.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_programName != null) __obj.updateDynamic("_programName")(_programName.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appointmentRequired)) __obj.updateDynamic("appointmentRequired")(appointmentRequired.get.asInstanceOf[js.Any])
    if (availabilityExceptions != null) __obj.updateDynamic("availabilityExceptions")(availabilityExceptions.asInstanceOf[js.Any])
    if (availableTime != null) __obj.updateDynamic("availableTime")(availableTime.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (characteristic != null) __obj.updateDynamic("characteristic")(characteristic.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (coverageArea != null) __obj.updateDynamic("coverageArea")(coverageArea.asInstanceOf[js.Any])
    if (eligibility != null) __obj.updateDynamic("eligibility")(eligibility.asInstanceOf[js.Any])
    if (eligibilityNote != null) __obj.updateDynamic("eligibilityNote")(eligibilityNote.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (extraDetails != null) __obj.updateDynamic("extraDetails")(extraDetails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notAvailable != null) __obj.updateDynamic("notAvailable")(notAvailable.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (programName != null) __obj.updateDynamic("programName")(programName.asInstanceOf[js.Any])
    if (providedBy != null) __obj.updateDynamic("providedBy")(providedBy.asInstanceOf[js.Any])
    if (referralMethod != null) __obj.updateDynamic("referralMethod")(referralMethod.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceProvisionCode != null) __obj.updateDynamic("serviceProvisionCode")(serviceProvisionCode.asInstanceOf[js.Any])
    if (specialty != null) __obj.updateDynamic("specialty")(specialty.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthcareService]
  }
}


package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an individual or animal receiving health care services
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Patient extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deceasedBoolean'.
    */
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deceasedDateTime'.
    */
  var _deceasedDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'multipleBirthBoolean'.
    */
  var _multipleBirthBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'multipleBirthInteger'.
    */
  var _multipleBirthInteger: js.UndefOr[Element] = js.undefined
  /**
    * Whether this patient's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Addresses for the individual
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * This patient is known to be an animal (non-human)
    */
  var animal: js.UndefOr[PatientAnimal] = js.undefined
  /**
    * The date of birth for the individual
    */
  var birthDate: js.UndefOr[date] = js.undefined
  /**
    * A list of Languages which may be used to communicate with the patient about their health
    */
  var communication: js.UndefOr[js.Array[PatientCommunication]] = js.undefined
  /**
    * A contact party (e.g. guardian, partner, friend) for the patient
    */
  var contact: js.UndefOr[js.Array[PatientContact]] = js.undefined
  /**
    * Indicates if the individual is deceased or not
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the individual is deceased or not
    */
  var deceasedDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * Patient's nominated primary care provider
    */
  var generalPractitioner: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * An identifier for this patient
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Link to another patient resource that concerns the same actual person
    */
  var link: js.UndefOr[js.Array[PatientLink]] = js.undefined
  /**
    * Organization that is the custodian of the patient record
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Marital (civil) status of a patient
    */
  var maritalStatus: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Whether patient is part of a multiple birth
    */
  var multipleBirthBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether patient is part of a multiple birth
    */
  var multipleBirthInteger: js.UndefOr[integer] = js.undefined
  /**
    * A name associated with the patient
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
    * Image of the patient
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * A contact detail for the individual
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object Patient {
  @scala.inline
  def apply(
    _active: Element = null,
    _birthDate: Element = null,
    _deceasedBoolean: Element = null,
    _deceasedDateTime: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _multipleBirthBoolean: Element = null,
    _multipleBirthInteger: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    animal: PatientAnimal = null,
    birthDate: date = null,
    communication: js.Array[PatientCommunication] = null,
    contact: js.Array[PatientContact] = null,
    contained: js.Array[Resource] = null,
    deceasedBoolean: js.UndefOr[Boolean] = js.undefined,
    deceasedDateTime: dateTime = null,
    extension: js.Array[Extension] = null,
    gender: code = null,
    generalPractitioner: js.Array[Reference] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    link: js.Array[PatientLink] = null,
    managingOrganization: Reference = null,
    maritalStatus: CodeableConcept = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    multipleBirthBoolean: js.UndefOr[Boolean] = js.undefined,
    multipleBirthInteger: Int | Double = null,
    name: js.Array[HumanName] = null,
    photo: js.Array[Attachment] = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Patient = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active.asInstanceOf[js.Any])
    if (_birthDate != null) __obj.updateDynamic("_birthDate")(_birthDate.asInstanceOf[js.Any])
    if (_deceasedBoolean != null) __obj.updateDynamic("_deceasedBoolean")(_deceasedBoolean.asInstanceOf[js.Any])
    if (_deceasedDateTime != null) __obj.updateDynamic("_deceasedDateTime")(_deceasedDateTime.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_multipleBirthBoolean != null) __obj.updateDynamic("_multipleBirthBoolean")(_multipleBirthBoolean.asInstanceOf[js.Any])
    if (_multipleBirthInteger != null) __obj.updateDynamic("_multipleBirthInteger")(_multipleBirthInteger.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (animal != null) __obj.updateDynamic("animal")(animal.asInstanceOf[js.Any])
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate.asInstanceOf[js.Any])
    if (communication != null) __obj.updateDynamic("communication")(communication.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (!js.isUndefined(deceasedBoolean)) __obj.updateDynamic("deceasedBoolean")(deceasedBoolean.asInstanceOf[js.Any])
    if (deceasedDateTime != null) __obj.updateDynamic("deceasedDateTime")(deceasedDateTime.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (generalPractitioner != null) __obj.updateDynamic("generalPractitioner")(generalPractitioner.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (maritalStatus != null) __obj.updateDynamic("maritalStatus")(maritalStatus.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleBirthBoolean)) __obj.updateDynamic("multipleBirthBoolean")(multipleBirthBoolean.asInstanceOf[js.Any])
    if (multipleBirthInteger != null) __obj.updateDynamic("multipleBirthInteger")(multipleBirthInteger.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patient]
  }
}


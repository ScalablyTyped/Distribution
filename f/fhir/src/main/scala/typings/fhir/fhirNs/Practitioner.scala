package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person with a  formal responsibility in the provisioning of healthcare or related services
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Practitioner extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Address(es) of the practitioner that are not role specific (typically home address)
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * The date  on which the practitioner was born
    */
  var birthDate: js.UndefOr[date] = js.undefined
  /**
    * A language the practitioner is able to use in patient communication
    */
  var communication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * A identifier for the person as this agent
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * The name(s) associated with the practitioner
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * Qualifications obtained by training and certification
    */
  var qualification: js.UndefOr[js.Array[PractitionerQualification]] = js.undefined
  /**
    * A contact detail for the practitioner (that apply to all roles)
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object Practitioner {
  @scala.inline
  def apply(
    _active: Element = null,
    _birthDate: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    birthDate: date = null,
    communication: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    gender: code = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: js.Array[HumanName] = null,
    photo: js.Array[Attachment] = null,
    qualification: js.Array[PractitionerQualification] = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Practitioner = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active)
    if (_birthDate != null) __obj.updateDynamic("_birthDate")(_birthDate)
    if (_gender != null) __obj.updateDynamic("_gender")(_gender)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (address != null) __obj.updateDynamic("address")(address)
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate)
    if (communication != null) __obj.updateDynamic("communication")(communication)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (qualification != null) __obj.updateDynamic("qualification")(qualification)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (telecom != null) __obj.updateDynamic("telecom")(telecom)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Practitioner]
  }
}


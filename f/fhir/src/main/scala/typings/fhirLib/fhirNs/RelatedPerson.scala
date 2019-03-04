package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An person that is related to a patient, but who is not a direct target of care
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait RelatedPerson extends DomainResource {
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
    * Whether this related person's record is in active use
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Address where the related person can be contacted or visited
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * The date on which the related person was born
    */
  var birthDate: js.UndefOr[date] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * A human identifier for this person
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
    * The patient this person is related to
    */
  var patient: Reference
  /**
    * Period of time that this relationship is considered valid
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * The nature of the relationship
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object RelatedPerson {
  @scala.inline
  def apply(
    patient: Reference,
    _active: Element = null,
    _birthDate: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    address: js.Array[Address] = null,
    birthDate: date = null,
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
    period: Period = null,
    photo: js.Array[Attachment] = null,
    relationship: CodeableConcept = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient)
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
    if (period != null) __obj.updateDynamic("period")(period)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (relationship != null) __obj.updateDynamic("relationship")(relationship)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (telecom != null) __obj.updateDynamic("telecom")(telecom)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RelatedPerson]
  }
}


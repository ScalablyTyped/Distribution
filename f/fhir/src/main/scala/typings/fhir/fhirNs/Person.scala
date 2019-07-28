package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic person record
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Person extends DomainResource {
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
    * This person's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more addresses for the person
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * The date on which the person was born
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
    * Link to a resource that concerns the same actual person
    */
  var link: js.UndefOr[js.Array[PersonLink]] = js.undefined
  /**
    * The organization that is the custodian of the person record
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  /**
    * Image of the person
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object Person {
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
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    gender: code = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    link: js.Array[PersonLink] = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: js.Array[HumanName] = null,
    photo: Attachment = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null
  ): Person = {
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
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (link != null) __obj.updateDynamic("link")(link)
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (telecom != null) __obj.updateDynamic("telecom")(telecom)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Person]
  }
}


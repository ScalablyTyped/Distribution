package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A grouping of people or organizations with a common purpose
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Organization extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Whether the organization's record is still in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * An address for the organization
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * A list of alternate names that the organization is known as, or was known as in the past
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Contact for the organization for a certain purpose
    */
  var contact: js.UndefOr[js.Array[OrganizationContact]] = js.undefined
  /**
    * Technical endpoints providing access to services operated for the organization
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Identifies this organization  across multiple systems
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Name used for the organization
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The organization of which this organization forms a part
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  /**
    * A contact detail for the organization
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
    * Kind of organization
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    _active: Element = null,
    _alias: js.Array[Element] = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    address: js.Array[Address] = null,
    alias: js.Array[String] = null,
    contact: js.Array[OrganizationContact] = null,
    contained: js.Array[Resource] = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    partOf: Reference = null,
    resourceType: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null,
    `type`: js.Array[CodeableConcept] = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (_active != null) __obj.updateDynamic("_active")(_active)
    if (_alias != null) __obj.updateDynamic("_alias")(_alias)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (address != null) __obj.updateDynamic("address")(address)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (telecom != null) __obj.updateDynamic("telecom")(telecom)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Organization]
  }
}


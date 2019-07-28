package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Group of multiple entities
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Group extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'actual'.
    */
  var _actual: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'quantity'.
    */
  var _quantity: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Whether this group's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Descriptive or actual
    */
  var actual: Boolean
  /**
    * Trait of group members
    */
  var characteristic: js.UndefOr[js.Array[GroupCharacteristic]] = js.undefined
  /**
    * Kind of Group members
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Unique id
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Who or what is in group
    */
  var member: js.UndefOr[js.Array[GroupMember]] = js.undefined
  /**
    * Label for Group
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Number of members
    */
  var quantity: js.UndefOr[unsignedInt] = js.undefined
  /**
    * person | animal | practitioner | device | medication | substance
    */
  var `type`: code
}

object Group {
  @scala.inline
  def apply(
    actual: Boolean,
    `type`: code,
    _active: Element = null,
    _actual: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _quantity: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    active: js.UndefOr[Boolean] = js.undefined,
    characteristic: js.Array[GroupCharacteristic] = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    member: js.Array[GroupMember] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    quantity: js.UndefOr[unsignedInt] = js.undefined,
    resourceType: code = null,
    text: Narrative = null
  ): Group = {
    val __obj = js.Dynamic.literal(actual = actual)
    __obj.updateDynamic("type")(`type`)
    if (_active != null) __obj.updateDynamic("_active")(_active)
    if (_actual != null) __obj.updateDynamic("_actual")(_actual)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_quantity != null) __obj.updateDynamic("_quantity")(_quantity)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (characteristic != null) __obj.updateDynamic("characteristic")(characteristic)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (member != null) __obj.updateDynamic("member")(member)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Group]
  }
}


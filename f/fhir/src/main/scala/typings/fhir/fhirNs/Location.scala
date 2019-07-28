package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details and position information for a physical place
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Location extends DomainResource {
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Physical location
    */
  var address: js.UndefOr[Address] = js.undefined
  /**
    * A list of alternate names that the location is known as, or was known as in the past
    */
  var alias: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Additional details about the location that could be displayed as further information to identify the location beyond its name
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Technical endpoints providing access to services operated for the location
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Unique code or number identifying the location to its users
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Organization responsible for provisioning and upkeep
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * instance | kind
    */
  var mode: js.UndefOr[code] = js.undefined
  /**
    * Name of the location as used by humans
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The Operational status of the location (typically only for a bed/room)
    */
  var operationalStatus: js.UndefOr[Coding] = js.undefined
  /**
    * Another Location this one is physically part of
    */
  var partOf: js.UndefOr[Reference] = js.undefined
  /**
    * Physical form of the location
    */
  var physicalType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The absolute geographic location
    */
  var position: js.UndefOr[LocationPosition] = js.undefined
  /**
    * active | suspended | inactive
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Contact details of the location
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
    * Type of function performed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    _alias: js.Array[Element] = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _mode: Element = null,
    _name: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    address: Address = null,
    alias: js.Array[String] = null,
    contained: js.Array[Resource] = null,
    description: String = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    mode: code = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    operationalStatus: Coding = null,
    partOf: Reference = null,
    physicalType: CodeableConcept = null,
    position: LocationPosition = null,
    resourceType: code = null,
    status: code = null,
    telecom: js.Array[ContactPoint] = null,
    text: Narrative = null,
    `type`: CodeableConcept = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (_alias != null) __obj.updateDynamic("_alias")(_alias)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (address != null) __obj.updateDynamic("address")(address)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (description != null) __obj.updateDynamic("description")(description)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (physicalType != null) __obj.updateDynamic("physicalType")(physicalType)
    if (position != null) __obj.updateDynamic("position")(position)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (telecom != null) __obj.updateDynamic("telecom")(telecom)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Location]
  }
}


package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The technical details of an endpoint that can be used for electronic services
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Endpoint extends DomainResource {
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'payloadMimeType'.
    */
  var _payloadMimeType: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The technical base address for connecting to this endpoint
    */
  var address: uri
  /**
    * Protocol/Profile/Standard to be used with this endpoint connection
    */
  var connectionType: Coding
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Identifies this endpoint across multiple systems
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Organization that manages this endpoint (may not be the organization that exposes the endpoint)
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * A name that this endpoint can be identified by
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Mimetype to send. If not specified, the content could be anything (including no payload, if the connectionType defined this)
    */
  var payloadMimeType: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)
    */
  var payloadType: js.Array[CodeableConcept]
  /**
    * Interval the endpoint is expected to be operational
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * active | suspended | error | off | entered-in-error | test
    */
  var status: code
}

object Endpoint {
  @scala.inline
  def apply(
    address: uri,
    connectionType: Coding,
    payloadType: js.Array[CodeableConcept],
    status: code,
    _address: Element = null,
    _header: js.Array[Element] = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _payloadMimeType: js.Array[Element] = null,
    _resourceType: Element = null,
    _status: Element = null,
    contact: js.Array[ContactPoint] = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    header: js.Array[String] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    managingOrganization: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    payloadMimeType: js.Array[code] = null,
    period: Period = null,
    resourceType: code = null,
    text: Narrative = null
  ): Endpoint = {
    val __obj = js.Dynamic.literal(address = address, connectionType = connectionType, payloadType = payloadType, status = status)
    if (_address != null) __obj.updateDynamic("_address")(_address)
    if (_header != null) __obj.updateDynamic("_header")(_header)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_payloadMimeType != null) __obj.updateDynamic("_payloadMimeType")(_payloadMimeType)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (payloadMimeType != null) __obj.updateDynamic("payloadMimeType")(payloadMimeType)
    if (period != null) __obj.updateDynamic("period")(period)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Endpoint]
  }
}


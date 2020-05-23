package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The technical details of an endpoint that can be used for electronic services
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Endpoint extends DomainResource {
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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_address != null) __obj.updateDynamic("_address")(_address.asInstanceOf[js.Any])
    if (_header != null) __obj.updateDynamic("_header")(_header.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_payloadMimeType != null) __obj.updateDynamic("_payloadMimeType")(_payloadMimeType.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingOrganization != null) __obj.updateDynamic("managingOrganization")(managingOrganization.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payloadMimeType != null) __obj.updateDynamic("payloadMimeType")(payloadMimeType.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}


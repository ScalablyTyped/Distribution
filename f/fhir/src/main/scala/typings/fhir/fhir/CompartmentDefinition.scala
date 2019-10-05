package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compartment Definition for a resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait CompartmentDefinition extends DomainResource {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'search'.
    */
  var _search: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Patient | Encounter | RelatedPerson | Practitioner | Device
    */
  var code: typings.fhir.fhir.code
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the compartment definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * Intended jurisdiction for compartment definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Name for this compartment definition (computer friendly)
    */
  var name: String
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Why this compartment definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * How a resource is related to the compartment
    */
  var resource: js.UndefOr[js.Array[CompartmentDefinitionResource]] = js.undefined
  /**
    * Whether the search syntax is supported
    */
  var search: Boolean
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Name for this compartment definition (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Logical URI to reference this compartment definition (globally unique)
    */
  var url: uri
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
}

object CompartmentDefinition {
  @scala.inline
  def apply(
    code: code,
    name: String,
    search: Boolean,
    status: code,
    url: uri,
    _code: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _search: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    purpose: markdown = null,
    resource: js.Array[CompartmentDefinitionResource] = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    useContext: js.Array[UsageContext] = null
  ): CompartmentDefinition = {
    val __obj = js.Dynamic.literal(code = code, name = name, search = search, status = status, url = url)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_search != null) __obj.updateDynamic("_search")(_search)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    __obj.asInstanceOf[CompartmentDefinition]
  }
}


package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that defines a type of message that can be exchanged between systems
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait MessageDefinition extends DomainResource {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'responseRequired'.
    */
  var _responseRequired: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Responses to this message
    */
  var allowedResponse: js.UndefOr[js.Array[MessageDefinitionAllowedResponse]] = js.undefined
  /**
    * Definition this one is based on
    */
  var base: js.UndefOr[Reference] = js.undefined
  /**
    * Consequence | Currency | Notification
    */
  var category: js.UndefOr[code] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Date this was last changed
    */
  var date: dateTime
  /**
    * Natural language description of the message definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Event type
    */
  var event: Coding
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Resource(s) that are the subject of the event
    */
  var focus: js.UndefOr[js.Array[MessageDefinitionFocus]] = js.undefined
  /**
    * Additional identifier for the message definition
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Intended jurisdiction for message definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Name for this message definition (computer friendly)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Protocol/workflow this is part of
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this message definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * Takes the place of
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Is a response required?
    */
  var responseRequired: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Name for this message definition (human friendly)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logical URI to reference this message definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the message definition
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object MessageDefinition {
  @scala.inline
  def apply(
    date: dateTime,
    event: Coding,
    status: code,
    _category: Element = null,
    _copyright: Element = null,
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
    _responseRequired: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    allowedResponse: js.Array[MessageDefinitionAllowedResponse] = null,
    base: Reference = null,
    category: code = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    description: markdown = null,
    experimental: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    focus: js.Array[MessageDefinitionFocus] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    parent: js.Array[Reference] = null,
    publisher: java.lang.String = null,
    purpose: markdown = null,
    replaces: js.Array[Reference] = null,
    resourceType: code = null,
    responseRequired: js.UndefOr[scala.Boolean] = js.undefined,
    text: Narrative = null,
    title: java.lang.String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: java.lang.String = null
  ): MessageDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("status")(status)
    if (_category != null) __obj.updateDynamic("_category")(_category)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
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
    if (_responseRequired != null) __obj.updateDynamic("_responseRequired")(_responseRequired)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (allowedResponse != null) __obj.updateDynamic("allowedResponse")(allowedResponse)
    if (base != null) __obj.updateDynamic("base")(base)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (replaces != null) __obj.updateDynamic("replaces")(replaces)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (!js.isUndefined(responseRequired)) __obj.updateDynamic("responseRequired")(responseRequired)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[MessageDefinition]
  }
}


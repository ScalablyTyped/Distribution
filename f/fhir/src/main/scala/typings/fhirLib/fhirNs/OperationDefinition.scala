package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of an operation or a named query
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait OperationDefinition extends DomainResource {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'idempotent'.
    */
  var _idempotent: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'instance'.
    */
  var _instance: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Marks this as a profile of the base
    */
  var base: js.UndefOr[Reference] = js.undefined
  /**
    * Name used to invoke the operation
    */
  var code: code
  /**
    * Additional information about use
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the operation definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether content is unchanged by the operation
    */
  var idempotent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Invoke on an instance?
    */
  var instance: scala.Boolean
  /**
    * Intended jurisdiction for operation definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * operation | query
    */
  var kind: code
  /**
    * Name for this operation definition (computer friendly)
    */
  var name: java.lang.String
  /**
    * Define overloaded variants for when  generating code
    */
  var overload: js.UndefOr[js.Array[OperationDefinitionOverload]] = js.undefined
  /**
    * Parameters for the operation/query
    */
  var parameter: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why this operation definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * Types this operation applies to
    */
  var resource: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Invoke at the system level?
    */
  var system: scala.Boolean
  /**
    * Invole at the type level?
    */
  var `type`: scala.Boolean
  /**
    * Logical URI to reference this operation definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the operation definition
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object OperationDefinition {
  @scala.inline
  def apply(
    code: code,
    instance: scala.Boolean,
    kind: code,
    name: java.lang.String,
    status: code,
    system: scala.Boolean,
    `type`: scala.Boolean,
    _code: Element = null,
    _comment: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _idempotent: Element = null,
    _implicitRules: Element = null,
    _instance: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resource: js.Array[Element] = null,
    _resourceType: Element = null,
    _status: Element = null,
    _system: Element = null,
    _type: Element = null,
    _url: Element = null,
    _version: Element = null,
    base: Reference = null,
    comment: java.lang.String = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    idempotent: js.UndefOr[scala.Boolean] = js.undefined,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    overload: js.Array[OperationDefinitionOverload] = null,
    parameter: js.Array[OperationDefinitionParameter] = null,
    publisher: java.lang.String = null,
    purpose: markdown = null,
    resource: js.Array[code] = null,
    resourceType: code = null,
    text: Narrative = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: java.lang.String = null
  ): OperationDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("system")(system)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_idempotent != null) __obj.updateDynamic("_idempotent")(_idempotent)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_instance != null) __obj.updateDynamic("_instance")(_instance)
    if (_kind != null) __obj.updateDynamic("_kind")(_kind)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resource != null) __obj.updateDynamic("_resource")(_resource)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (base != null) __obj.updateDynamic("base")(base)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (overload != null) __obj.updateDynamic("overload")(overload)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (url != null) __obj.updateDynamic("url")(url)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[OperationDefinition]
  }
}


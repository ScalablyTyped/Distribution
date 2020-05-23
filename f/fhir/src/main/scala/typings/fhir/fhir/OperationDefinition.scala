package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of an operation or a named query
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait OperationDefinition extends DomainResource {
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
  var code: typings.fhir.fhir.code
  /**
    * Additional information about use
    */
  var comment: js.UndefOr[String] = js.undefined
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
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether content is unchanged by the operation
    */
  var idempotent: js.UndefOr[Boolean] = js.undefined
  /**
    * Invoke on an instance?
    */
  var instance: Boolean
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
  var name: String
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
  var publisher: js.UndefOr[String] = js.undefined
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
  var system: Boolean
  /**
    * Invole at the type level?
    */
  var `type`: Boolean
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
  var version: js.UndefOr[String] = js.undefined
}

object OperationDefinition {
  @scala.inline
  def apply(
    code: code,
    instance: Boolean,
    kind: code,
    name: String,
    status: code,
    system: Boolean,
    `type`: Boolean,
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
    comment: String = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    idempotent: js.UndefOr[Boolean] = js.undefined,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    overload: js.Array[OperationDefinitionOverload] = null,
    parameter: js.Array[OperationDefinitionParameter] = null,
    publisher: String = null,
    purpose: markdown = null,
    resource: js.Array[code] = null,
    resourceType: code = null,
    text: Narrative = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): OperationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_idempotent != null) __obj.updateDynamic("_idempotent")(_idempotent.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_instance != null) __obj.updateDynamic("_instance")(_instance.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resource != null) __obj.updateDynamic("_resource")(_resource.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_system != null) __obj.updateDynamic("_system")(_system.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent.get.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (overload != null) __obj.updateDynamic("overload")(overload.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinition]
  }
}


package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search Parameter for a resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait SearchParameter extends DomainResource {
  /**
    * Contains extended information for property 'base'.
    */
  var _base: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'chain'.
    */
  var _chain: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'comparator'.
    */
  var _comparator: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'derivedFrom'.
    */
  var _derivedFrom: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'modifier'.
    */
  var _modifier: js.UndefOr[js.Array[Element]] = js.undefined
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
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'target'.
    */
  var _target: js.UndefOr[js.Array[Element]] = js.undefined
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
    * Contains extended information for property 'xpath'.
    */
  var _xpath: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'xpathUsage'.
    */
  var _xpathUsage: js.UndefOr[Element] = js.undefined
  /**
    * The resource type(s) this search parameter applies to
    */
  var base: js.Array[code]
  /**
    * Chained names supported
    */
  var chain: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Code used in URL
    */
  var code: typings.fhir.fhirNs.code
  /**
    * eq | ne | gt | lt | ge | le | sa | eb | ap
    */
  var comparator: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * For Composite resources to define the parts
    */
  var component: js.UndefOr[js.Array[SearchParameterComponent]] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Original Definition for the search parameter
    */
  var derivedFrom: js.UndefOr[uri] = js.undefined
  /**
    * Natural language description of the search parameter
    */
  var description: markdown
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * FHIRPath expression that extracts the values
    */
  var expression: js.UndefOr[String] = js.undefined
  /**
    * Intended jurisdiction for search parameter (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * missing | exact | contains | not | text | in | not-in | below | above | type
    */
  var modifier: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * Name for this search parameter (computer friendly)
    */
  var name: String
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Why this search parameter is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Types of resource (if a resource reference)
    */
  var target: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * number | date | string | token | reference | composite | quantity | uri
    */
  var `type`: code
  /**
    * Logical URI to reference this search parameter (globally unique)
    */
  var url: uri
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the search parameter
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * XPath that extracts the values
    */
  var xpath: js.UndefOr[String] = js.undefined
  /**
    * normal | phonetic | nearby | distance | other
    */
  var xpathUsage: js.UndefOr[code] = js.undefined
}

object SearchParameter {
  @scala.inline
  def apply(
    base: js.Array[code],
    code: code,
    description: markdown,
    name: String,
    status: code,
    `type`: code,
    url: uri,
    _base: js.Array[Element] = null,
    _chain: js.Array[Element] = null,
    _code: Element = null,
    _comparator: js.Array[Element] = null,
    _date: Element = null,
    _derivedFrom: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _expression: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _modifier: js.Array[Element] = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _target: js.Array[Element] = null,
    _type: Element = null,
    _url: Element = null,
    _version: Element = null,
    _xpath: Element = null,
    _xpathUsage: Element = null,
    chain: js.Array[String] = null,
    comparator: js.Array[code] = null,
    component: js.Array[SearchParameterComponent] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    derivedFrom: uri = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    expression: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifier: js.Array[code] = null,
    modifierExtension: js.Array[Extension] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    target: js.Array[code] = null,
    text: Narrative = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null,
    xpath: String = null,
    xpathUsage: code = null
  ): SearchParameter = {
    val __obj = js.Dynamic.literal(base = base, code = code, description = description, name = name, status = status, url = url)
    __obj.updateDynamic("type")(`type`)
    if (_base != null) __obj.updateDynamic("_base")(_base)
    if (_chain != null) __obj.updateDynamic("_chain")(_chain)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_comparator != null) __obj.updateDynamic("_comparator")(_comparator)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_derivedFrom != null) __obj.updateDynamic("_derivedFrom")(_derivedFrom)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_modifier != null) __obj.updateDynamic("_modifier")(_modifier)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_target != null) __obj.updateDynamic("_target")(_target)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (_xpath != null) __obj.updateDynamic("_xpath")(_xpath)
    if (_xpathUsage != null) __obj.updateDynamic("_xpathUsage")(_xpathUsage)
    if (chain != null) __obj.updateDynamic("chain")(chain)
    if (comparator != null) __obj.updateDynamic("comparator")(comparator)
    if (component != null) __obj.updateDynamic("component")(component)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (derivedFrom != null) __obj.updateDynamic("derivedFrom")(derivedFrom)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    if (xpath != null) __obj.updateDynamic("xpath")(xpath)
    if (xpathUsage != null) __obj.updateDynamic("xpathUsage")(xpathUsage)
    __obj.asInstanceOf[SearchParameter]
  }
}


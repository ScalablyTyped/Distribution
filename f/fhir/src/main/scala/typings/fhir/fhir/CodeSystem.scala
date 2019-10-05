package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of codes drawn from one or more code systems
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait CodeSystem extends DomainResource {
  /**
    * Contains extended information for property 'caseSensitive'.
    */
  var _caseSensitive: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'compositional'.
    */
  var _compositional: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'content'.
    */
  var _content: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'hierarchyMeaning'.
    */
  var _hierarchyMeaning: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueSet'.
    */
  var _valueSet: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'versionNeeded'.
    */
  var _versionNeeded: js.UndefOr[Element] = js.undefined
  /**
    * If code comparison is case sensitive
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * If code system defines a post-composition grammar
    */
  var compositional: js.UndefOr[Boolean] = js.undefined
  /**
    * Concepts in the code system
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * not-present | example | fragment | complete
    */
  var content: code
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Total concepts in the code system
    */
  var count: js.UndefOr[unsignedInt] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the code system
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter that can be used in a value set
    */
  var filter: js.UndefOr[js.Array[CodeSystemFilter]] = js.undefined
  /**
    * grouped-by | is-a | part-of | classified-with
    */
  var hierarchyMeaning: js.UndefOr[code] = js.undefined
  /**
    * Additional identifier for the code system
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Intended jurisdiction for code system (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Name for this code system (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Additional information supplied about each concept
    */
  var property: js.UndefOr[js.Array[CodeSystemProperty]] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Why this code system is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Name for this code system (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Logical URI to reference this code system (globally unique) (Coding.system)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Canonical URL for value set with entire code system
    */
  var valueSet: js.UndefOr[uri] = js.undefined
  /**
    * Business version of the code system (Coding.version)
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * If definitions are not stable
    */
  var versionNeeded: js.UndefOr[Boolean] = js.undefined
}

object CodeSystem {
  @scala.inline
  def apply(
    content: code,
    status: code,
    _caseSensitive: Element = null,
    _compositional: Element = null,
    _content: Element = null,
    _copyright: Element = null,
    _count: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _hierarchyMeaning: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _valueSet: Element = null,
    _version: Element = null,
    _versionNeeded: Element = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    compositional: js.UndefOr[Boolean] = js.undefined,
    concept: js.Array[CodeSystemConcept] = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    count: Int | Double = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    filter: js.Array[CodeSystemFilter] = null,
    hierarchyMeaning: code = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    property: js.Array[CodeSystemProperty] = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    valueSet: uri = null,
    version: String = null,
    versionNeeded: js.UndefOr[Boolean] = js.undefined
  ): CodeSystem = {
    val __obj = js.Dynamic.literal(content = content, status = status)
    if (_caseSensitive != null) __obj.updateDynamic("_caseSensitive")(_caseSensitive)
    if (_compositional != null) __obj.updateDynamic("_compositional")(_compositional)
    if (_content != null) __obj.updateDynamic("_content")(_content)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_count != null) __obj.updateDynamic("_count")(_count)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_hierarchyMeaning != null) __obj.updateDynamic("_hierarchyMeaning")(_hierarchyMeaning)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_valueSet != null) __obj.updateDynamic("_valueSet")(_valueSet)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (_versionNeeded != null) __obj.updateDynamic("_versionNeeded")(_versionNeeded)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(compositional)) __obj.updateDynamic("compositional")(compositional)
    if (concept != null) __obj.updateDynamic("concept")(concept)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (hierarchyMeaning != null) __obj.updateDynamic("hierarchyMeaning")(hierarchyMeaning)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (property != null) __obj.updateDynamic("property")(property)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(versionNeeded)) __obj.updateDynamic("versionNeeded")(versionNeeded)
    __obj.asInstanceOf[CodeSystem]
  }
}


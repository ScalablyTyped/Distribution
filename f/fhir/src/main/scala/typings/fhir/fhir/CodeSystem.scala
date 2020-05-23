package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of codes drawn from one or more code systems
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
    count: js.UndefOr[unsignedInt] = js.undefined,
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
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_caseSensitive != null) __obj.updateDynamic("_caseSensitive")(_caseSensitive.asInstanceOf[js.Any])
    if (_compositional != null) __obj.updateDynamic("_compositional")(_compositional.asInstanceOf[js.Any])
    if (_content != null) __obj.updateDynamic("_content")(_content.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_count != null) __obj.updateDynamic("_count")(_count.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_hierarchyMeaning != null) __obj.updateDynamic("_hierarchyMeaning")(_hierarchyMeaning.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_valueSet != null) __obj.updateDynamic("_valueSet")(_valueSet.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (_versionNeeded != null) __obj.updateDynamic("_versionNeeded")(_versionNeeded.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compositional)) __obj.updateDynamic("compositional")(compositional.get.asInstanceOf[js.Any])
    if (concept != null) __obj.updateDynamic("concept")(concept.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (hierarchyMeaning != null) __obj.updateDynamic("hierarchyMeaning")(hierarchyMeaning.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(versionNeeded)) __obj.updateDynamic("versionNeeded")(versionNeeded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystem]
  }
}


package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map from one set of concepts to one or more other concepts
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait ConceptMap extends DomainResource {
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
    * Contains extended information for property 'sourceUri'.
    */
  var _sourceUri: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'targetUri'.
    */
  var _targetUri: js.UndefOr[Element] = js.undefined
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
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the concept map
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * Same source and target systems
    */
  var group: js.UndefOr[js.Array[ConceptMapGroup]] = js.undefined
  /**
    * Additional identifier for the concept map
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Intended jurisdiction for concept map (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Name for this concept map (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Why this concept map is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * Identifies the source of the concepts which are being mapped
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  /**
    * Identifies the source of the concepts which are being mapped
    */
  var sourceUri: js.UndefOr[uri] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Provides context to the mappings
    */
  var targetReference: js.UndefOr[Reference] = js.undefined
  /**
    * Provides context to the mappings
    */
  var targetUri: js.UndefOr[uri] = js.undefined
  /**
    * Name for this concept map (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Logical URI to reference this concept map (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the concept map
    */
  var version: js.UndefOr[String] = js.undefined
}

object ConceptMap {
  @scala.inline
  def apply(
    status: code,
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
    _sourceUri: Element = null,
    _status: Element = null,
    _targetUri: Element = null,
    _title: Element = null,
    _url: Element = null,
    _version: Element = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    group: js.Array[ConceptMapGroup] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    purpose: markdown = null,
    resourceType: code = null,
    sourceReference: Reference = null,
    sourceUri: uri = null,
    targetReference: Reference = null,
    targetUri: uri = null,
    text: Narrative = null,
    title: String = null,
    url: uri = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): ConceptMap = {
    val __obj = js.Dynamic.literal(status = status)
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
    if (_sourceUri != null) __obj.updateDynamic("_sourceUri")(_sourceUri)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_targetUri != null) __obj.updateDynamic("_targetUri")(_targetUri)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (group != null) __obj.updateDynamic("group")(group)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (sourceReference != null) __obj.updateDynamic("sourceReference")(sourceReference)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    if (targetReference != null) __obj.updateDynamic("targetReference")(targetReference)
    if (targetUri != null) __obj.updateDynamic("targetUri")(targetUri)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ConceptMap]
  }
}


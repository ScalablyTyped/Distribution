package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a library of quality improvement components
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait Library extends DomainResource {
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'lastReviewDate'.
    */
  var _lastReviewDate: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * When the library was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Contents of the library, either embedded or referenced
    */
  var content: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * A content contributor
    */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.undefined
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * What data is referenced by this library
    */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the library
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * When the library is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional identifier for the library
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Intended jurisdiction for library (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * When the library was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  /**
    * Name for this library (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Parameters defined by the library
    */
  var parameter: js.UndefOr[js.Array[ParameterDefinition]] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Why this library is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * Additional documentation, citations, etc.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * Name for this library (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * logic-library | model-definition | asset-collection | module-definition
    */
  var `type`: CodeableConcept
  /**
    * Logical URI to reference this library (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Describes the clinical usage of the library
    */
  var usage: js.UndefOr[String] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the library
    */
  var version: js.UndefOr[String] = js.undefined
}

object Library {
  @scala.inline
  def apply(
    status: code,
    `type`: CodeableConcept,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    content: js.Array[Attachment] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    dataRequirement: js.Array[DataRequirement] = null,
    date: dateTime = null,
    description: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    parameter: js.Array[ParameterDefinition] = null,
    publisher: String = null,
    purpose: markdown = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    text: Narrative = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Library = {
    val __obj = js.Dynamic.literal(status = status)
    __obj.updateDynamic("type")(`type`)
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_usage != null) __obj.updateDynamic("_usage")(_usage)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (content != null) __obj.updateDynamic("content")(content)
    if (contributor != null) __obj.updateDynamic("contributor")(contributor)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (dataRequirement != null) __obj.updateDynamic("dataRequirement")(dataRequirement)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (url != null) __obj.updateDynamic("url")(url)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Library]
  }
}


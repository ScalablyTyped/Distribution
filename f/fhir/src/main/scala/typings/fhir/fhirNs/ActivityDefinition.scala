package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of a specific activity to be taken, independent of any particular patient or context
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait ActivityDefinition extends DomainResource {
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
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.undefined
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
    * When the activity definition was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.undefined
  /**
    * What part of body to perform on
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Detail type of activity
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * A content contributor
    */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.undefined
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Natural language description of the activity definition
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Detailed dosage instructions
    */
  var dosage: js.UndefOr[js.Array[Dosage]] = js.undefined
  /**
    * Dynamic aspects of the definition
    */
  var dynamicValue: js.UndefOr[js.Array[ActivityDefinitionDynamicValue]] = js.undefined
  /**
    * When the activity definition is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional identifier for the activity definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Intended jurisdiction for activity definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Kind of resource
    */
  var kind: js.UndefOr[code] = js.undefined
  /**
    * When the activity definition was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  /**
    * Logic used by the asset
    */
  var library: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Where it should happen
    */
  var location: js.UndefOr[Reference] = js.undefined
  /**
    * Name for this activity definition (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Who should participate in the action
    */
  var participant: js.UndefOr[js.Array[ActivityDefinitionParticipant]] = js.undefined
  /**
    * What's administered/supplied
    */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What's administered/supplied
    */
  var productReference: js.UndefOr[Reference] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Why this activity definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * How much is administered/consumed/supplied
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Additional documentation, citations, etc
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * When activity is to occur
    */
  var timingDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When activity is to occur
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  /**
    * When activity is to occur
    */
  var timingRange: js.UndefOr[Range] = js.undefined
  /**
    * When activity is to occur
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Name for this activity definition (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Transform to apply the template
    */
  var transform: js.UndefOr[Reference] = js.undefined
  /**
    * Logical URI to reference this activity definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Describes the clinical usage of the asset
    */
  var usage: js.UndefOr[String] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the activity definition
    */
  var version: js.UndefOr[String] = js.undefined
}

object ActivityDefinition {
  @scala.inline
  def apply(
    status: code,
    _approvalDate: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _description: Element = null,
    _experimental: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _kind: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _timingDateTime: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    bodySite: js.Array[CodeableConcept] = null,
    code: CodeableConcept = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    date: dateTime = null,
    description: markdown = null,
    dosage: js.Array[Dosage] = null,
    dynamicValue: js.Array[ActivityDefinitionDynamicValue] = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    kind: code = null,
    language: code = null,
    lastReviewDate: date = null,
    library: js.Array[Reference] = null,
    location: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    participant: js.Array[ActivityDefinitionParticipant] = null,
    productCodeableConcept: CodeableConcept = null,
    productReference: Reference = null,
    publisher: String = null,
    purpose: markdown = null,
    quantity: Quantity = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    text: Narrative = null,
    timingDateTime: dateTime = null,
    timingPeriod: Period = null,
    timingRange: Range = null,
    timingTiming: Timing = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    transform: Reference = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): ActivityDefinition = {
    val __obj = js.Dynamic.literal(status = status)
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate)
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_kind != null) __obj.updateDynamic("_kind")(_kind)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher)
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_timingDateTime != null) __obj.updateDynamic("_timingDateTime")(_timingDateTime)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_usage != null) __obj.updateDynamic("_usage")(_usage)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate)
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (contributor != null) __obj.updateDynamic("contributor")(contributor)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (date != null) __obj.updateDynamic("date")(date)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dosage != null) __obj.updateDynamic("dosage")(dosage)
    if (dynamicValue != null) __obj.updateDynamic("dynamicValue")(dynamicValue)
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod)
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate)
    if (library != null) __obj.updateDynamic("library")(library)
    if (location != null) __obj.updateDynamic("location")(location)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (participant != null) __obj.updateDynamic("participant")(participant)
    if (productCodeableConcept != null) __obj.updateDynamic("productCodeableConcept")(productCodeableConcept)
    if (productReference != null) __obj.updateDynamic("productReference")(productReference)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timingDateTime != null) __obj.updateDynamic("timingDateTime")(timingDateTime)
    if (timingPeriod != null) __obj.updateDynamic("timingPeriod")(timingPeriod)
    if (timingRange != null) __obj.updateDynamic("timingRange")(timingRange)
    if (timingTiming != null) __obj.updateDynamic("timingTiming")(timingTiming)
    if (title != null) __obj.updateDynamic("title")(title)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (url != null) __obj.updateDynamic("url")(url)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    if (useContext != null) __obj.updateDynamic("useContext")(useContext)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ActivityDefinition]
  }
}


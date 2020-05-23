package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quality measure definition
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Measure extends DomainResource {
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'clinicalRecommendationStatement'.
    */
  var _clinicalRecommendationStatement: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'disclaimer'.
    */
  var _disclaimer: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'guidance'.
    */
  var _guidance: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'improvementNotation'.
    */
  var _improvementNotation: js.UndefOr[Element] = js.undefined
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
    * Contains extended information for property 'rateAggregation'.
    */
  var _rateAggregation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'rationale'.
    */
  var _rationale: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'riskAdjustment'.
    */
  var _riskAdjustment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'set'.
    */
  var _set: js.UndefOr[Element] = js.undefined
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
    * When the measure was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.undefined
  /**
    * Summary of clinical guidelines
    */
  var clinicalRecommendationStatement: js.UndefOr[markdown] = js.undefined
  /**
    * opportunity | all-or-nothing | linear | weighted
    */
  var compositeScoring: js.UndefOr[CodeableConcept] = js.undefined
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
    * Defined terms used in the measure documentation
    */
  var definition: js.UndefOr[js.Array[markdown]] = js.undefined
  /**
    * Natural language description of the measure
    */
  var description: js.UndefOr[markdown] = js.undefined
  /**
    * Disclaimer for use of the measure or its referenced content
    */
  var disclaimer: js.UndefOr[markdown] = js.undefined
  /**
    * When the measure is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  /**
    * Population criteria group
    */
  var group: js.UndefOr[js.Array[MeasureGroup]] = js.undefined
  /**
    * Additional guidance for implementers
    */
  var guidance: js.UndefOr[markdown] = js.undefined
  /**
    * Additional identifier for the measure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Improvement notation for the measure, e.g. higher score indicates better quality
    */
  var improvementNotation: js.UndefOr[String] = js.undefined
  /**
    * Intended jurisdiction for measure (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * When the measure was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.undefined
  /**
    * Logic used by the measure
    */
  var library: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Name for this measure (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Why this measure is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  /**
    * How is rate aggregation performed for this measure
    */
  var rateAggregation: js.UndefOr[String] = js.undefined
  /**
    * Why does this measure exist
    */
  var rationale: js.UndefOr[markdown] = js.undefined
  /**
    * Additional documentation, citations, etc
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  /**
    * How is risk adjustment applied for this measure
    */
  var riskAdjustment: js.UndefOr[String] = js.undefined
  /**
    * proportion | ratio | continuous-variable | cohort
    */
  var scoring: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The measure set, e.g. Preventive Care and Screening
    */
  var set: js.UndefOr[String] = js.undefined
  /**
    * draft | active | retired | unknown
    */
  var status: code
  /**
    * What other data should be reported with the measure
    */
  var supplementalData: js.UndefOr[js.Array[MeasureSupplementalData]] = js.undefined
  /**
    * Name for this measure (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * process | outcome | structure | patient-reported-outcome | composite
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Logical URI to reference this measure (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Describes the clinical usage of the measure
    */
  var usage: js.UndefOr[String] = js.undefined
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  /**
    * Business version of the measure
    */
  var version: js.UndefOr[String] = js.undefined
}

object Measure {
  @scala.inline
  def apply(
    status: code,
    _approvalDate: Element = null,
    _clinicalRecommendationStatement: Element = null,
    _copyright: Element = null,
    _date: Element = null,
    _definition: js.Array[Element] = null,
    _description: Element = null,
    _disclaimer: Element = null,
    _experimental: Element = null,
    _guidance: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _improvementNotation: Element = null,
    _language: Element = null,
    _lastReviewDate: Element = null,
    _name: Element = null,
    _publisher: Element = null,
    _purpose: Element = null,
    _rateAggregation: Element = null,
    _rationale: Element = null,
    _resourceType: Element = null,
    _riskAdjustment: Element = null,
    _set: Element = null,
    _status: Element = null,
    _title: Element = null,
    _url: Element = null,
    _usage: Element = null,
    _version: Element = null,
    approvalDate: date = null,
    clinicalRecommendationStatement: markdown = null,
    compositeScoring: CodeableConcept = null,
    contact: js.Array[ContactDetail] = null,
    contained: js.Array[Resource] = null,
    contributor: js.Array[Contributor] = null,
    copyright: markdown = null,
    date: dateTime = null,
    definition: js.Array[markdown] = null,
    description: markdown = null,
    disclaimer: markdown = null,
    effectivePeriod: Period = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    group: js.Array[MeasureGroup] = null,
    guidance: markdown = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    improvementNotation: String = null,
    jurisdiction: js.Array[CodeableConcept] = null,
    language: code = null,
    lastReviewDate: date = null,
    library: js.Array[Reference] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    publisher: String = null,
    purpose: markdown = null,
    rateAggregation: String = null,
    rationale: markdown = null,
    relatedArtifact: js.Array[RelatedArtifact] = null,
    resourceType: code = null,
    riskAdjustment: String = null,
    scoring: CodeableConcept = null,
    set: String = null,
    supplementalData: js.Array[MeasureSupplementalData] = null,
    text: Narrative = null,
    title: String = null,
    topic: js.Array[CodeableConcept] = null,
    `type`: js.Array[CodeableConcept] = null,
    url: uri = null,
    usage: String = null,
    useContext: js.Array[UsageContext] = null,
    version: String = null
  ): Measure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_approvalDate != null) __obj.updateDynamic("_approvalDate")(_approvalDate.asInstanceOf[js.Any])
    if (_clinicalRecommendationStatement != null) __obj.updateDynamic("_clinicalRecommendationStatement")(_clinicalRecommendationStatement.asInstanceOf[js.Any])
    if (_copyright != null) __obj.updateDynamic("_copyright")(_copyright.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_definition != null) __obj.updateDynamic("_definition")(_definition.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_disclaimer != null) __obj.updateDynamic("_disclaimer")(_disclaimer.asInstanceOf[js.Any])
    if (_experimental != null) __obj.updateDynamic("_experimental")(_experimental.asInstanceOf[js.Any])
    if (_guidance != null) __obj.updateDynamic("_guidance")(_guidance.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_improvementNotation != null) __obj.updateDynamic("_improvementNotation")(_improvementNotation.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastReviewDate != null) __obj.updateDynamic("_lastReviewDate")(_lastReviewDate.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_publisher != null) __obj.updateDynamic("_publisher")(_publisher.asInstanceOf[js.Any])
    if (_purpose != null) __obj.updateDynamic("_purpose")(_purpose.asInstanceOf[js.Any])
    if (_rateAggregation != null) __obj.updateDynamic("_rateAggregation")(_rateAggregation.asInstanceOf[js.Any])
    if (_rationale != null) __obj.updateDynamic("_rationale")(_rationale.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_riskAdjustment != null) __obj.updateDynamic("_riskAdjustment")(_riskAdjustment.asInstanceOf[js.Any])
    if (_set != null) __obj.updateDynamic("_set")(_set.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (_usage != null) __obj.updateDynamic("_usage")(_usage.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (approvalDate != null) __obj.updateDynamic("approvalDate")(approvalDate.asInstanceOf[js.Any])
    if (clinicalRecommendationStatement != null) __obj.updateDynamic("clinicalRecommendationStatement")(clinicalRecommendationStatement.asInstanceOf[js.Any])
    if (compositeScoring != null) __obj.updateDynamic("compositeScoring")(compositeScoring.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contributor != null) __obj.updateDynamic("contributor")(contributor.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disclaimer != null) __obj.updateDynamic("disclaimer")(disclaimer.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (guidance != null) __obj.updateDynamic("guidance")(guidance.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (improvementNotation != null) __obj.updateDynamic("improvementNotation")(improvementNotation.asInstanceOf[js.Any])
    if (jurisdiction != null) __obj.updateDynamic("jurisdiction")(jurisdiction.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastReviewDate != null) __obj.updateDynamic("lastReviewDate")(lastReviewDate.asInstanceOf[js.Any])
    if (library != null) __obj.updateDynamic("library")(library.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (rateAggregation != null) __obj.updateDynamic("rateAggregation")(rateAggregation.asInstanceOf[js.Any])
    if (rationale != null) __obj.updateDynamic("rationale")(rationale.asInstanceOf[js.Any])
    if (relatedArtifact != null) __obj.updateDynamic("relatedArtifact")(relatedArtifact.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (riskAdjustment != null) __obj.updateDynamic("riskAdjustment")(riskAdjustment.asInstanceOf[js.Any])
    if (scoring != null) __obj.updateDynamic("scoring")(scoring.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (supplementalData != null) __obj.updateDynamic("supplementalData")(supplementalData.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (useContext != null) __obj.updateDynamic("useContext")(useContext.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure]
  }
}


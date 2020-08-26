package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quality measure definition
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Measure extends DomainResource {
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'clinicalRecommendationStatement'.
    */
  var _clinicalRecommendationStatement: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'disclaimer'.
    */
  var _disclaimer: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'guidance'.
    */
  var _guidance: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'improvementNotation'.
    */
  var _improvementNotation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lastReviewDate'.
    */
  var _lastReviewDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'rateAggregation'.
    */
  var _rateAggregation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'rationale'.
    */
  var _rationale: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'riskAdjustment'.
    */
  var _riskAdjustment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'set'.
    */
  var _set: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * When the measure was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.native
  /**
    * Summary of clinical guidelines
    */
  var clinicalRecommendationStatement: js.UndefOr[markdown] = js.native
  /**
    * opportunity | all-or-nothing | linear | weighted
    */
  var compositeScoring: js.UndefOr[CodeableConcept] = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * A content contributor
    */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.native
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Defined terms used in the measure documentation
    */
  var definition: js.UndefOr[js.Array[markdown]] = js.native
  /**
    * Natural language description of the measure
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * Disclaimer for use of the measure or its referenced content
    */
  var disclaimer: js.UndefOr[markdown] = js.native
  /**
    * When the measure is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  /**
    * Population criteria group
    */
  var group: js.UndefOr[js.Array[MeasureGroup]] = js.native
  /**
    * Additional guidance for implementers
    */
  var guidance: js.UndefOr[markdown] = js.native
  /**
    * Additional identifier for the measure
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Improvement notation for the measure, e.g. higher score indicates better quality
    */
  var improvementNotation: js.UndefOr[String] = js.native
  /**
    * Intended jurisdiction for measure (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * When the measure was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.native
  /**
    * Logic used by the measure
    */
  var library: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Name for this measure (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Why this measure is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  /**
    * How is rate aggregation performed for this measure
    */
  var rateAggregation: js.UndefOr[String] = js.native
  /**
    * Why does this measure exist
    */
  var rationale: js.UndefOr[markdown] = js.native
  /**
    * Additional documentation, citations, etc
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  /**
    * How is risk adjustment applied for this measure
    */
  var riskAdjustment: js.UndefOr[String] = js.native
  /**
    * proportion | ratio | continuous-variable | cohort
    */
  var scoring: js.UndefOr[CodeableConcept] = js.native
  /**
    * The measure set, e.g. Preventive Care and Screening
    */
  var set: js.UndefOr[String] = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * What other data should be reported with the measure
    */
  var supplementalData: js.UndefOr[js.Array[MeasureSupplementalData]] = js.native
  /**
    * Name for this measure (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * process | outcome | structure | patient-reported-outcome | composite
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Logical URI to reference this measure (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  /**
    * Describes the clinical usage of the measure
    */
  var usage: js.UndefOr[String] = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  /**
    * Business version of the measure
    */
  var version: js.UndefOr[String] = js.native
}

object Measure {
  @scala.inline
  def apply(status: code): Measure = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure]
  }
  @scala.inline
  implicit class MeasureOps[Self <: Measure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_approvalDate(value: Element): Self = this.set("_approvalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_approvalDate: Self = this.set("_approvalDate", js.undefined)
    @scala.inline
    def set_clinicalRecommendationStatement(value: Element): Self = this.set("_clinicalRecommendationStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_clinicalRecommendationStatement: Self = this.set("_clinicalRecommendationStatement", js.undefined)
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_definitionVarargs(value: Element*): Self = this.set("_definition", js.Array(value :_*))
    @scala.inline
    def set_definition(value: js.Array[Element]): Self = this.set("_definition", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_definition: Self = this.set("_definition", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_disclaimer(value: Element): Self = this.set("_disclaimer", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_disclaimer: Self = this.set("_disclaimer", js.undefined)
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    @scala.inline
    def set_guidance(value: Element): Self = this.set("_guidance", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_guidance: Self = this.set("_guidance", js.undefined)
    @scala.inline
    def set_improvementNotation(value: Element): Self = this.set("_improvementNotation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_improvementNotation: Self = this.set("_improvementNotation", js.undefined)
    @scala.inline
    def set_lastReviewDate(value: Element): Self = this.set("_lastReviewDate", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_lastReviewDate: Self = this.set("_lastReviewDate", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    @scala.inline
    def set_purpose(value: Element): Self = this.set("_purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_purpose: Self = this.set("_purpose", js.undefined)
    @scala.inline
    def set_rateAggregation(value: Element): Self = this.set("_rateAggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rateAggregation: Self = this.set("_rateAggregation", js.undefined)
    @scala.inline
    def set_rationale(value: Element): Self = this.set("_rationale", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rationale: Self = this.set("_rationale", js.undefined)
    @scala.inline
    def set_riskAdjustment(value: Element): Self = this.set("_riskAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_riskAdjustment: Self = this.set("_riskAdjustment", js.undefined)
    @scala.inline
    def set_set(value: Element): Self = this.set("_set", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_set: Self = this.set("_set", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def set_usage(value: Element): Self = this.set("_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_usage: Self = this.set("_usage", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    @scala.inline
    def setApprovalDate(value: date): Self = this.set("approvalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovalDate: Self = this.set("approvalDate", js.undefined)
    @scala.inline
    def setClinicalRecommendationStatement(value: markdown): Self = this.set("clinicalRecommendationStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClinicalRecommendationStatement: Self = this.set("clinicalRecommendationStatement", js.undefined)
    @scala.inline
    def setCompositeScoring(value: CodeableConcept): Self = this.set("compositeScoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositeScoring: Self = this.set("compositeScoring", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setContributorVarargs(value: Contributor*): Self = this.set("contributor", js.Array(value :_*))
    @scala.inline
    def setContributor(value: js.Array[Contributor]): Self = this.set("contributor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContributor: Self = this.set("contributor", js.undefined)
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDefinitionVarargs(value: markdown*): Self = this.set("definition", js.Array(value :_*))
    @scala.inline
    def setDefinition(value: js.Array[markdown]): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisclaimer(value: markdown): Self = this.set("disclaimer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisclaimer: Self = this.set("disclaimer", js.undefined)
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    @scala.inline
    def setGroupVarargs(value: MeasureGroup*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: js.Array[MeasureGroup]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGuidance(value: markdown): Self = this.set("guidance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuidance: Self = this.set("guidance", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setImprovementNotation(value: String): Self = this.set("improvementNotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImprovementNotation: Self = this.set("improvementNotation", js.undefined)
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    @scala.inline
    def setLastReviewDate(value: date): Self = this.set("lastReviewDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastReviewDate: Self = this.set("lastReviewDate", js.undefined)
    @scala.inline
    def setLibraryVarargs(value: Reference*): Self = this.set("library", js.Array(value :_*))
    @scala.inline
    def setLibrary(value: js.Array[Reference]): Self = this.set("library", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibrary: Self = this.set("library", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setRateAggregation(value: String): Self = this.set("rateAggregation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateAggregation: Self = this.set("rateAggregation", js.undefined)
    @scala.inline
    def setRationale(value: markdown): Self = this.set("rationale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRationale: Self = this.set("rationale", js.undefined)
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = this.set("relatedArtifact", js.Array(value :_*))
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = this.set("relatedArtifact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedArtifact: Self = this.set("relatedArtifact", js.undefined)
    @scala.inline
    def setRiskAdjustment(value: String): Self = this.set("riskAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiskAdjustment: Self = this.set("riskAdjustment", js.undefined)
    @scala.inline
    def setScoring(value: CodeableConcept): Self = this.set("scoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoring: Self = this.set("scoring", js.undefined)
    @scala.inline
    def setSet(value: String): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSupplementalDataVarargs(value: MeasureSupplementalData*): Self = this.set("supplementalData", js.Array(value :_*))
    @scala.inline
    def setSupplementalData(value: js.Array[MeasureSupplementalData]): Self = this.set("supplementalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupplementalData: Self = this.set("supplementalData", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTopicVarargs(value: CodeableConcept*): Self = this.set("topic", js.Array(value :_*))
    @scala.inline
    def setTopic(value: js.Array[CodeableConcept]): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


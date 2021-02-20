package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class MeasureMutableBuilder[Self <: Measure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalDate(value: date): Self = StObject.set(x, "approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalDateUndefined: Self = StObject.set(x, "approvalDate", js.undefined)
    
    @scala.inline
    def setClinicalRecommendationStatement(value: markdown): Self = StObject.set(x, "clinicalRecommendationStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClinicalRecommendationStatementUndefined: Self = StObject.set(x, "clinicalRecommendationStatement", js.undefined)
    
    @scala.inline
    def setCompositeScoring(value: CodeableConcept): Self = StObject.set(x, "compositeScoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeScoringUndefined: Self = StObject.set(x, "compositeScoring", js.undefined)
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setContributor(value: js.Array[Contributor]): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorUndefined: Self = StObject.set(x, "contributor", js.undefined)
    
    @scala.inline
    def setContributorVarargs(value: Contributor*): Self = StObject.set(x, "contributor", js.Array(value :_*))
    
    @scala.inline
    def setCopyright(value: markdown): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDefinition(value: js.Array[markdown]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: markdown*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisclaimer(value: markdown): Self = StObject.set(x, "disclaimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisclaimerUndefined: Self = StObject.set(x, "disclaimer", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[MeasureGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: MeasureGroup*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setGuidance(value: markdown): Self = StObject.set(x, "guidance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidanceUndefined: Self = StObject.set(x, "guidance", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setImprovementNotation(value: String): Self = StObject.set(x, "improvementNotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImprovementNotationUndefined: Self = StObject.set(x, "improvementNotation", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setLastReviewDate(value: date): Self = StObject.set(x, "lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReviewDateUndefined: Self = StObject.set(x, "lastReviewDate", js.undefined)
    
    @scala.inline
    def setLibrary(value: js.Array[Reference]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    @scala.inline
    def setLibraryVarargs(value: Reference*): Self = StObject.set(x, "library", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setRateAggregation(value: String): Self = StObject.set(x, "rateAggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateAggregationUndefined: Self = StObject.set(x, "rateAggregation", js.undefined)
    
    @scala.inline
    def setRationale(value: markdown): Self = StObject.set(x, "rationale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRationaleUndefined: Self = StObject.set(x, "rationale", js.undefined)
    
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value :_*))
    
    @scala.inline
    def setRiskAdjustment(value: String): Self = StObject.set(x, "riskAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskAdjustmentUndefined: Self = StObject.set(x, "riskAdjustment", js.undefined)
    
    @scala.inline
    def setScoring(value: CodeableConcept): Self = StObject.set(x, "scoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoringUndefined: Self = StObject.set(x, "scoring", js.undefined)
    
    @scala.inline
    def setSet(value: String): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalData(value: js.Array[MeasureSupplementalData]): Self = StObject.set(x, "supplementalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementalDataUndefined: Self = StObject.set(x, "supplementalData", js.undefined)
    
    @scala.inline
    def setSupplementalDataVarargs(value: MeasureSupplementalData*): Self = StObject.set(x, "supplementalData", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: CodeableConcept*): Self = StObject.set(x, "topic", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_approvalDate(value: Element): Self = StObject.set(x, "_approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_approvalDateUndefined: Self = StObject.set(x, "_approvalDate", js.undefined)
    
    @scala.inline
    def set_clinicalRecommendationStatement(value: Element): Self = StObject.set(x, "_clinicalRecommendationStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_clinicalRecommendationStatementUndefined: Self = StObject.set(x, "_clinicalRecommendationStatement", js.undefined)
    
    @scala.inline
    def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_definition(value: js.Array[Element]): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    @scala.inline
    def set_definitionVarargs(value: Element*): Self = StObject.set(x, "_definition", js.Array(value :_*))
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_disclaimer(value: Element): Self = StObject.set(x, "_disclaimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_disclaimerUndefined: Self = StObject.set(x, "_disclaimer", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_guidance(value: Element): Self = StObject.set(x, "_guidance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_guidanceUndefined: Self = StObject.set(x, "_guidance", js.undefined)
    
    @scala.inline
    def set_improvementNotation(value: Element): Self = StObject.set(x, "_improvementNotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_improvementNotationUndefined: Self = StObject.set(x, "_improvementNotation", js.undefined)
    
    @scala.inline
    def set_lastReviewDate(value: Element): Self = StObject.set(x, "_lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastReviewDateUndefined: Self = StObject.set(x, "_lastReviewDate", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    @scala.inline
    def set_rateAggregation(value: Element): Self = StObject.set(x, "_rateAggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rateAggregationUndefined: Self = StObject.set(x, "_rateAggregation", js.undefined)
    
    @scala.inline
    def set_rationale(value: Element): Self = StObject.set(x, "_rationale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rationaleUndefined: Self = StObject.set(x, "_rationale", js.undefined)
    
    @scala.inline
    def set_riskAdjustment(value: Element): Self = StObject.set(x, "_riskAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_riskAdjustmentUndefined: Self = StObject.set(x, "_riskAdjustment", js.undefined)
    
    @scala.inline
    def set_set(value: Element): Self = StObject.set(x, "_set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_setUndefined: Self = StObject.set(x, "_set", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_usage(value: Element): Self = StObject.set(x, "_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_usageUndefined: Self = StObject.set(x, "_usage", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}

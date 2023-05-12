package typings.fhir.r5Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudy
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _descriptionSummary: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * For a Sponsor or a PrincipalInvestigator use the dedicated attributes provided.
    */
  var associatedParty: js.UndefOr[js.Array[ResearchStudyAssociatedParty]] = js.undefined
  
  /**
    * Additional grouping mechanism or categorization of a research study. Example: FDA regulated device, FDA regulated drug, MPG Paragraph 23b (a German legal requirement), IRB-exempt, etc. Implementation Note: do not use the classifier element to support existing semantics that are already supported thru explicit elements in the resource.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * In many clinical trials this is refered to as the ARM of the study, but such a term is not used in other sorts of trials even when there is a comparison between two or more groups.
    */
  var comparisonGroup: js.UndefOr[js.Array[ResearchStudyComparisonGroup]] = js.undefined
  
  /**
    * The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.
    */
  var condition: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The date (and optionally time) when the ResearchStudy Resource was last significantly changed. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the ResearchStudy Resource changes.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A detailed and human-readable narrative of the study. E.g., study abstract.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A brief text for explaining the study.
    */
  var descriptionSummary: js.UndefOr[String] = js.undefined
  
  /**
    * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
    */
  var focus: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Identifiers assigned to this research study by the sponsor or other systems.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Key terms to aid in searching for or filtering the study.
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Additional names for the study.
    */
  var label: js.UndefOr[js.Array[ResearchStudyLabel]] = js.undefined
  
  /**
    * Name for this study (computer friendly).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Comments made about the study by the performer, subject or other participants.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.
    */
  var objective: js.UndefOr[js.Array[ResearchStudyObjective]] = js.undefined
  
  /**
    * A study may have multiple distinct outcome measures that can be used to assess the overall goal for a study. The goal of a study is in the objective whereas the metric by which the goal is assessed is the outcomeMeasure. Examples: Time to Local Recurrence (TLR), Disease-free Survival (DFS), 30 Day Mortality, Systolic BP
    */
  var outcomeMeasure: js.UndefOr[js.Array[ResearchStudyOutcomeMeasure]] = js.undefined
  
  /**
    * A larger research study of which this particular study is a component or step.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifies the start date and the expected (or actual, depending on status) end date for the study.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.
    */
  var phase: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The type of study based upon the intent of the study activities. A classification of the intent of the study.
    */
  var primaryPurposeType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Status of study with time for that status.
    */
  var progressStatus: js.UndefOr[js.Array[ResearchStudyProgressStatus]] = js.undefined
  
  /**
    * The set of steps expected to be performed as part of the execution of the study.
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Target or actual group of participants enrolled in study.
    */
  var recruitment: js.UndefOr[ResearchStudyRecruitment] = js.undefined
  
  /**
    * A country, state or other area where the study is taking place rather than its precise geographic location or address.
    */
  var region: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Citations, references, URLs and other related documents.  When using relatedArtifact to share URLs, the relatedArtifact.type will often be set to one of "documentation" or "supported-with" and the URL value will often be in relatedArtifact.document.url but another possible location is relatedArtifact.resource when it is a canonical URL.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ResearchStudy: typings.fhir.fhirStrings.ResearchStudy
  
  /**
    * Link to one or more sets of results generated by the study.  Could also link to a research registry holding the results such as ClinicalTrials.gov.
    */
  var result: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A facility in which study activities are conducted.
    */
  var site: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The publication state of the resource (not of the study).
    */
  var status: draft | active | retired | unknown
  
  /**
    * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
    */
  var studyDesign: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The human readable name of the research study.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Canonical identifier for this study resource, represented as a globally unique URI.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The business version for the study record.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * A description and/or code explaining the premature termination of the study.
    */
  var whyStopped: js.UndefOr[CodeableConcept] = js.undefined
}
object ResearchStudy {
  
  inline def apply(status: draft | active | retired | unknown): ResearchStudy = {
    val __obj = js.Dynamic.literal(resourceType = "ResearchStudy", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudy] (val x: Self) extends AnyVal {
    
    inline def setAssociatedParty(value: js.Array[ResearchStudyAssociatedParty]): Self = StObject.set(x, "associatedParty", value.asInstanceOf[js.Any])
    
    inline def setAssociatedPartyUndefined: Self = StObject.set(x, "associatedParty", js.undefined)
    
    inline def setAssociatedPartyVarargs(value: ResearchStudyAssociatedParty*): Self = StObject.set(x, "associatedParty", js.Array(value*))
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setComparisonGroup(value: js.Array[ResearchStudyComparisonGroup]): Self = StObject.set(x, "comparisonGroup", value.asInstanceOf[js.Any])
    
    inline def setComparisonGroupUndefined: Self = StObject.set(x, "comparisonGroup", js.undefined)
    
    inline def setComparisonGroupVarargs(value: ResearchStudyComparisonGroup*): Self = StObject.set(x, "comparisonGroup", js.Array(value*))
    
    inline def setCondition(value: js.Array[CodeableConcept]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: CodeableConcept*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionSummary(value: String): Self = StObject.set(x, "descriptionSummary", value.asInstanceOf[js.Any])
    
    inline def setDescriptionSummaryUndefined: Self = StObject.set(x, "descriptionSummary", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFocus(value: js.Array[CodeableReference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: CodeableReference*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setKeyword(value: js.Array[CodeableConcept]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setKeywordVarargs(value: CodeableConcept*): Self = StObject.set(x, "keyword", js.Array(value*))
    
    inline def setLabel(value: js.Array[ResearchStudyLabel]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: ResearchStudyLabel*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setObjective(value: js.Array[ResearchStudyObjective]): Self = StObject.set(x, "objective", value.asInstanceOf[js.Any])
    
    inline def setObjectiveUndefined: Self = StObject.set(x, "objective", js.undefined)
    
    inline def setObjectiveVarargs(value: ResearchStudyObjective*): Self = StObject.set(x, "objective", js.Array(value*))
    
    inline def setOutcomeMeasure(value: js.Array[ResearchStudyOutcomeMeasure]): Self = StObject.set(x, "outcomeMeasure", value.asInstanceOf[js.Any])
    
    inline def setOutcomeMeasureUndefined: Self = StObject.set(x, "outcomeMeasure", js.undefined)
    
    inline def setOutcomeMeasureVarargs(value: ResearchStudyOutcomeMeasure*): Self = StObject.set(x, "outcomeMeasure", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPhase(value: CodeableConcept): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setPrimaryPurposeType(value: CodeableConcept): Self = StObject.set(x, "primaryPurposeType", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPurposeTypeUndefined: Self = StObject.set(x, "primaryPurposeType", js.undefined)
    
    inline def setProgressStatus(value: js.Array[ResearchStudyProgressStatus]): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
    
    inline def setProgressStatusUndefined: Self = StObject.set(x, "progressStatus", js.undefined)
    
    inline def setProgressStatusVarargs(value: ResearchStudyProgressStatus*): Self = StObject.set(x, "progressStatus", js.Array(value*))
    
    inline def setProtocol(value: js.Array[Reference]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVarargs(value: Reference*): Self = StObject.set(x, "protocol", js.Array(value*))
    
    inline def setRecruitment(value: ResearchStudyRecruitment): Self = StObject.set(x, "recruitment", value.asInstanceOf[js.Any])
    
    inline def setRecruitmentUndefined: Self = StObject.set(x, "recruitment", js.undefined)
    
    inline def setRegion(value: js.Array[CodeableConcept]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRegionVarargs(value: CodeableConcept*): Self = StObject.set(x, "region", js.Array(value*))
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ResearchStudy): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[Reference]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setResultVarargs(value: Reference*): Self = StObject.set(x, "result", js.Array(value*))
    
    inline def setSite(value: js.Array[Reference]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setSiteVarargs(value: Reference*): Self = StObject.set(x, "site", js.Array(value*))
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStudyDesign(value: js.Array[CodeableConcept]): Self = StObject.set(x, "studyDesign", value.asInstanceOf[js.Any])
    
    inline def setStudyDesignUndefined: Self = StObject.set(x, "studyDesign", js.undefined)
    
    inline def setStudyDesignVarargs(value: CodeableConcept*): Self = StObject.set(x, "studyDesign", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWhyStopped(value: CodeableConcept): Self = StObject.set(x, "whyStopped", value.asInstanceOf[js.Any])
    
    inline def setWhyStoppedUndefined: Self = StObject.set(x, "whyStopped", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionSummary(value: Element): Self = StObject.set(x, "_descriptionSummary", value.asInstanceOf[js.Any])
    
    inline def set_descriptionSummaryUndefined: Self = StObject.set(x, "_descriptionSummary", js.undefined)
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}

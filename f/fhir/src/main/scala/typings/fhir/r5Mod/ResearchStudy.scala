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
    * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Classification for the study.
    */
  var classification: js.UndefOr[js.Array[ResearchStudyClassification]] = js.undefined
  
  /**
    * In many clinical trials this is refered to as the ARM of the study, but such a term is not used in other sorts of trials even when there is a comparison between two or more groups.
    */
  var comparisonGroup: js.UndefOr[js.Array[ResearchStudyComparisonGroup]] = js.undefined
  
  /**
    * The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion "healthy volunteer", but the target condition code would be a Lupus SNOMED code.
    */
  var condition: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contact details to assist a user in learning more about or engaging with the study.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Current status of the study.
    */
  var currentState: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Date the resource last changed.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A full description of how the study is being conducted.  For a description of what the study objectives are see ResearchStudy.objective.description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A brief summary of the study description.
    */
  var descriptionSummary: js.UndefOr[String] = js.undefined
  
  /**
    * The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
    */
  var focus: js.UndefOr[js.Array[ResearchStudyFocus]] = js.undefined
  
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
    * Indicates a country, state or other region where the study is taking place.
    */
  var location: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
    * An outcome or planned variable to measure during the study.
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
    * A researcher in a study who oversees multiple aspects of the study, such as concept development, protocol writing, protocol submission for IRB approval, participant recruitment, informed consent, data collection, analysis, interpretation and presentation.
    */
  var principalInvestigator: js.UndefOr[Reference] = js.undefined
  
  /**
    * The set of steps expected to be performed as part of the execution of the study.
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Target or actual group of participants enrolled in study.
    */
  var recruitment: js.UndefOr[ResearchStudyRecruitment] = js.undefined
  
  /**
    * Citations, references and other related documents.
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
    * An organization that initiates the investigation and is legally responsible for the study.
    */
  var sponsor: js.UndefOr[Reference] = js.undefined
  
  /**
    * The publication state of the resource (not of the study).
    */
  var status: draft | active | retired | unknown
  
  /**
    * Status of study with time for that status.
    */
  var statusDate: js.UndefOr[js.Array[ResearchStudyStatusDate]] = js.undefined
  
  /**
    * A short, descriptive label for the study particularly for compouter use.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Canonical identifier for this study resource, represented as a globally unique URI.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Business identifier for the study record.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * A general storage or archive location for the study.  This may contain an assortment of content which is not specified in advance.
    */
  var webLocation: js.UndefOr[js.Array[ResearchStudyWebLocation]] = js.undefined
  
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
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setClassification(value: js.Array[ResearchStudyClassification]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: ResearchStudyClassification*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setComparisonGroup(value: js.Array[ResearchStudyComparisonGroup]): Self = StObject.set(x, "comparisonGroup", value.asInstanceOf[js.Any])
    
    inline def setComparisonGroupUndefined: Self = StObject.set(x, "comparisonGroup", js.undefined)
    
    inline def setComparisonGroupVarargs(value: ResearchStudyComparisonGroup*): Self = StObject.set(x, "comparisonGroup", js.Array(value*))
    
    inline def setCondition(value: js.Array[CodeableConcept]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: CodeableConcept*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setCurrentState(value: js.Array[CodeableConcept]): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setCurrentStateVarargs(value: CodeableConcept*): Self = StObject.set(x, "currentState", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionSummary(value: String): Self = StObject.set(x, "descriptionSummary", value.asInstanceOf[js.Any])
    
    inline def setDescriptionSummaryUndefined: Self = StObject.set(x, "descriptionSummary", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFocus(value: js.Array[ResearchStudyFocus]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: ResearchStudyFocus*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setKeyword(value: js.Array[CodeableConcept]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setKeywordVarargs(value: CodeableConcept*): Self = StObject.set(x, "keyword", js.Array(value*))
    
    inline def setLabel(value: js.Array[ResearchStudyLabel]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: ResearchStudyLabel*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLocation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: CodeableConcept*): Self = StObject.set(x, "location", js.Array(value*))
    
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
    
    inline def setPrincipalInvestigator(value: Reference): Self = StObject.set(x, "principalInvestigator", value.asInstanceOf[js.Any])
    
    inline def setPrincipalInvestigatorUndefined: Self = StObject.set(x, "principalInvestigator", js.undefined)
    
    inline def setProtocol(value: js.Array[Reference]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVarargs(value: Reference*): Self = StObject.set(x, "protocol", js.Array(value*))
    
    inline def setRecruitment(value: ResearchStudyRecruitment): Self = StObject.set(x, "recruitment", value.asInstanceOf[js.Any])
    
    inline def setRecruitmentUndefined: Self = StObject.set(x, "recruitment", js.undefined)
    
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
    
    inline def setSponsor(value: Reference): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    inline def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: js.Array[ResearchStudyStatusDate]): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusDateVarargs(value: ResearchStudyStatusDate*): Self = StObject.set(x, "statusDate", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebLocation(value: js.Array[ResearchStudyWebLocation]): Self = StObject.set(x, "webLocation", value.asInstanceOf[js.Any])
    
    inline def setWebLocationUndefined: Self = StObject.set(x, "webLocation", js.undefined)
    
    inline def setWebLocationVarargs(value: ResearchStudyWebLocation*): Self = StObject.set(x, "webLocation", js.Array(value*))
    
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

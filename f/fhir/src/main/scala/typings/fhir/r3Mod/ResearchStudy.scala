package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudy
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.
    */
  var arm: js.UndefOr[js.Array[ResearchStudyArm]] = js.undefined
  
  /**
    * Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contact details to assist a user in learning more about or engaging with the study.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * A full description of how the study is being conducted.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The Group referenced should not generally enumerate specific subjects.  Subjects will be linked to the study using the ResearchSubject resource.
    */
  var enrollment: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The condition(s), medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.
    */
  var focus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Identifiers assigned to this research study by the sponsor or other systems.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Indicates a country, state or other region where the study is taking place.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Key terms to aid in searching for or filtering the study.
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Comments made about the event by the performer, subject or other participants.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A larger research study of which this particular study is a component or step.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Identifies the start date and the expected (or actual, depending on status) end date for the study.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates the individual who has primary oversite of the execution of the study.
    */
  var principalInvestigator: js.UndefOr[Reference] = js.undefined
  
  /**
    * The set of steps expected to be performed as part of the execution of the study.
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A description and/or code explaining the premature termination of the study.
    */
  var reasonStopped: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Citations, references and other related documents.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ResearchStudy: typings.fhir.fhirStrings.ResearchStudy
  
  /**
    * Clinic, hospital or other healthcare location that is participating in the study.
    */
  var site: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The organization responsible for the execution of the study.
    */
  var sponsor: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: draft | `in-progress` | suspended | stopped | completed | `entered-in-error`
  
  /**
    * A short, descriptive user-friendly label for the study.
    */
  var title: js.UndefOr[String] = js.undefined
}
object ResearchStudy {
  
  inline def apply(status: draft | `in-progress` | suspended | stopped | completed | `entered-in-error`): ResearchStudy = {
    val __obj = js.Dynamic.literal(resourceType = "ResearchStudy", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudy]
  }
  
  extension [Self <: ResearchStudy](x: Self) {
    
    inline def setArm(value: js.Array[ResearchStudyArm]): Self = StObject.set(x, "arm", value.asInstanceOf[js.Any])
    
    inline def setArmUndefined: Self = StObject.set(x, "arm", js.undefined)
    
    inline def setArmVarargs(value: ResearchStudyArm*): Self = StObject.set(x, "arm", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnrollment(value: js.Array[Reference]): Self = StObject.set(x, "enrollment", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentUndefined: Self = StObject.set(x, "enrollment", js.undefined)
    
    inline def setEnrollmentVarargs(value: Reference*): Self = StObject.set(x, "enrollment", js.Array(value*))
    
    inline def setFocus(value: js.Array[CodeableConcept]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: CodeableConcept*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setKeyword(value: js.Array[CodeableConcept]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setKeywordVarargs(value: CodeableConcept*): Self = StObject.set(x, "keyword", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPrincipalInvestigator(value: Reference): Self = StObject.set(x, "principalInvestigator", value.asInstanceOf[js.Any])
    
    inline def setPrincipalInvestigatorUndefined: Self = StObject.set(x, "principalInvestigator", js.undefined)
    
    inline def setProtocol(value: js.Array[Reference]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVarargs(value: Reference*): Self = StObject.set(x, "protocol", js.Array(value*))
    
    inline def setReasonStopped(value: CodeableConcept): Self = StObject.set(x, "reasonStopped", value.asInstanceOf[js.Any])
    
    inline def setReasonStoppedUndefined: Self = StObject.set(x, "reasonStopped", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ResearchStudy): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSite(value: js.Array[Reference]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setSiteVarargs(value: Reference*): Self = StObject.set(x, "site", js.Array(value*))
    
    inline def setSponsor(value: Reference): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    inline def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
    
    inline def setStatus(value: draft | `in-progress` | suspended | stopped | completed | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}

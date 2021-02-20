package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ResearchStudy extends DomainResource {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Defined path through the study for a subject
    */
  var arm: js.UndefOr[js.Array[ResearchStudyArm]] = js.native
  
  /**
    * Classifications for the study
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Contact details for the study
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * What this is study doing
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * Inclusion & exclusion criteria
    */
  var enrollment: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Drugs, devices, conditions, etc. under study
    */
  var focus: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Business Identifier for study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Geographic region(s) for study
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Used to search for the study
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Comments made about the event
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Part of larger study
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * When the study began and ended
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * The individual responsible for the study
    */
  var principalInvestigator: js.UndefOr[Reference] = js.native
  
  /**
    * Steps followed in executing study
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Reason for terminating study early
    */
  var reasonStopped: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * References and dependencies
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  
  /**
    * Location involved in study execution
    */
  var site: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Organization responsible for the study
    */
  var sponsor: js.UndefOr[Reference] = js.native
  
  /**
    * draft | in-progress | suspended | stopped | completed | entered-in-error
    */
  var status: code = js.native
  
  /**
    * Name for this study
    */
  var title: js.UndefOr[String] = js.native
}
object ResearchStudy {
  
  @scala.inline
  def apply(status: code): ResearchStudy = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudy]
  }
  
  @scala.inline
  implicit class ResearchStudyMutableBuilder[Self <: ResearchStudy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArm(value: js.Array[ResearchStudyArm]): Self = StObject.set(x, "arm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArmUndefined: Self = StObject.set(x, "arm", js.undefined)
    
    @scala.inline
    def setArmVarargs(value: ResearchStudyArm*): Self = StObject.set(x, "arm", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnrollment(value: js.Array[Reference]): Self = StObject.set(x, "enrollment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentUndefined: Self = StObject.set(x, "enrollment", js.undefined)
    
    @scala.inline
    def setEnrollmentVarargs(value: Reference*): Self = StObject.set(x, "enrollment", js.Array(value :_*))
    
    @scala.inline
    def setFocus(value: js.Array[CodeableConcept]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFocusVarargs(value: CodeableConcept*): Self = StObject.set(x, "focus", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setKeyword(value: js.Array[CodeableConcept]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setKeywordVarargs(value: CodeableConcept*): Self = StObject.set(x, "keyword", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPrincipalInvestigator(value: Reference): Self = StObject.set(x, "principalInvestigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalInvestigatorUndefined: Self = StObject.set(x, "principalInvestigator", js.undefined)
    
    @scala.inline
    def setProtocol(value: js.Array[Reference]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setProtocolVarargs(value: Reference*): Self = StObject.set(x, "protocol", js.Array(value :_*))
    
    @scala.inline
    def setReasonStopped(value: CodeableConcept): Self = StObject.set(x, "reasonStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonStoppedUndefined: Self = StObject.set(x, "reasonStopped", js.undefined)
    
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value :_*))
    
    @scala.inline
    def setSite(value: js.Array[Reference]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    @scala.inline
    def setSiteVarargs(value: Reference*): Self = StObject.set(x, "site", js.Array(value :_*))
    
    @scala.inline
    def setSponsor(value: Reference): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
  }
}

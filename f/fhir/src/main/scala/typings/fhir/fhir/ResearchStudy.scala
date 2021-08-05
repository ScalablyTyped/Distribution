package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ResearchStudy
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Defined path through the study for a subject
    */
  var arm: js.UndefOr[js.Array[ResearchStudyArm]] = js.undefined
  
  /**
    * Classifications for the study
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Contact details for the study
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * What this is study doing
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * Inclusion & exclusion criteria
    */
  var enrollment: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Drugs, devices, conditions, etc. under study
    */
  var focus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Business Identifier for study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Geographic region(s) for study
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Used to search for the study
    */
  var keyword: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Comments made about the event
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Part of larger study
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * When the study began and ended
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The individual responsible for the study
    */
  var principalInvestigator: js.UndefOr[Reference] = js.undefined
  
  /**
    * Steps followed in executing study
    */
  var protocol: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Reason for terminating study early
    */
  var reasonStopped: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * References and dependencies
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Location involved in study execution
    */
  var site: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Organization responsible for the study
    */
  var sponsor: js.UndefOr[Reference] = js.undefined
  
  /**
    * draft | in-progress | suspended | stopped | completed | entered-in-error
    */
  var status: code
  
  /**
    * Name for this study
    */
  var title: js.UndefOr[String] = js.undefined
}
object ResearchStudy {
  
  inline def apply(status: code): ResearchStudy = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudy]
  }
  
  extension [Self <: ResearchStudy](x: Self) {
    
    inline def setArm(value: js.Array[ResearchStudyArm]): Self = StObject.set(x, "arm", value.asInstanceOf[js.Any])
    
    inline def setArmUndefined: Self = StObject.set(x, "arm", js.undefined)
    
    inline def setArmVarargs(value: ResearchStudyArm*): Self = StObject.set(x, "arm", js.Array(value :_*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    inline def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnrollment(value: js.Array[Reference]): Self = StObject.set(x, "enrollment", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentUndefined: Self = StObject.set(x, "enrollment", js.undefined)
    
    inline def setEnrollmentVarargs(value: Reference*): Self = StObject.set(x, "enrollment", js.Array(value :_*))
    
    inline def setFocus(value: js.Array[CodeableConcept]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: CodeableConcept*): Self = StObject.set(x, "focus", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    inline def setKeyword(value: js.Array[CodeableConcept]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setKeywordVarargs(value: CodeableConcept*): Self = StObject.set(x, "keyword", js.Array(value :_*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPrincipalInvestigator(value: Reference): Self = StObject.set(x, "principalInvestigator", value.asInstanceOf[js.Any])
    
    inline def setPrincipalInvestigatorUndefined: Self = StObject.set(x, "principalInvestigator", js.undefined)
    
    inline def setProtocol(value: js.Array[Reference]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVarargs(value: Reference*): Self = StObject.set(x, "protocol", js.Array(value :_*))
    
    inline def setReasonStopped(value: CodeableConcept): Self = StObject.set(x, "reasonStopped", value.asInstanceOf[js.Any])
    
    inline def setReasonStoppedUndefined: Self = StObject.set(x, "reasonStopped", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value :_*))
    
    inline def setSite(value: js.Array[Reference]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setSiteVarargs(value: Reference*): Self = StObject.set(x, "site", js.Array(value :_*))
    
    inline def setSponsor(value: Reference): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    inline def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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

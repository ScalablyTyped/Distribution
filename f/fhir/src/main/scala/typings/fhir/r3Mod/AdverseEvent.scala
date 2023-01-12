package typings.fhir.r3Mod

import typings.fhir.fhirStrings.AE
import typings.fhir.fhirStrings.PAE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEvent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _category: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * The type of event which is important to characterize what occurred and caused harm to the subject, or had the potential to cause harm to the subject.
    */
  var category: js.UndefOr[AE | PAE] = js.undefined
  
  /**
    * The date (and perhaps time) when the adverse event occurred.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the adverse event in text.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Parties that may or should contribute or have contributed information to the Act. Such information includes information leading to the decision to perform the Act and how to perform the Act (e.g. consultant), information that the Act itself seeks to reveal (e.g. informant of clinical history), or information about what Act was performed (e.g. informant witness).
    */
  var eventParticipant: js.UndefOr[Reference] = js.undefined
  
  /**
    * The identifier(s) of this adverse event that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itsefl is not appropriate.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The information about where the adverse event occurred.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Describes the type of outcome from the adverse event.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
    */
  var reaction: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Information on who recorded the adverse event.  May be the patient or a practitioner.
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  
  /**
    * AdverseEvent.referenceDocument.
    */
  var referenceDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AdverseEvent: typings.fhir.fhirStrings.AdverseEvent
  
  /**
    * Describes the seriousness or severity of the adverse event.
    */
  var seriousness: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * AdverseEvent.study.
    */
  var study: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This subject or group impacted by the event.  With a prospective adverse event, there will be no subject as the adverse event was prevented.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * AdverseEvent.subjectMedicalHistory.
    */
  var subjectMedicalHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Describes the entity that is suspected to have caused the adverse event.
    */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.undefined
  
  /**
    * This element defines the specific type of event that occurred or that was prevented from occurring.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object AdverseEvent {
  
  inline def apply(): AdverseEvent = {
    val __obj = js.Dynamic.literal(resourceType = "AdverseEvent")
    __obj.asInstanceOf[AdverseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdverseEvent] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: AE | PAE): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventParticipant(value: Reference): Self = StObject.set(x, "eventParticipant", value.asInstanceOf[js.Any])
    
    inline def setEventParticipantUndefined: Self = StObject.set(x, "eventParticipant", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setReaction(value: js.Array[Reference]): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionVarargs(value: Reference*): Self = StObject.set(x, "reaction", js.Array(value*))
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setReferenceDocument(value: js.Array[Reference]): Self = StObject.set(x, "referenceDocument", value.asInstanceOf[js.Any])
    
    inline def setReferenceDocumentUndefined: Self = StObject.set(x, "referenceDocument", js.undefined)
    
    inline def setReferenceDocumentVarargs(value: Reference*): Self = StObject.set(x, "referenceDocument", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AdverseEvent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeriousness(value: CodeableConcept): Self = StObject.set(x, "seriousness", value.asInstanceOf[js.Any])
    
    inline def setSeriousnessUndefined: Self = StObject.set(x, "seriousness", js.undefined)
    
    inline def setStudy(value: js.Array[Reference]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    inline def setStudyVarargs(value: Reference*): Self = StObject.set(x, "study", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectMedicalHistory(value: js.Array[Reference]): Self = StObject.set(x, "subjectMedicalHistory", value.asInstanceOf[js.Any])
    
    inline def setSubjectMedicalHistoryUndefined: Self = StObject.set(x, "subjectMedicalHistory", js.undefined)
    
    inline def setSubjectMedicalHistoryVarargs(value: Reference*): Self = StObject.set(x, "subjectMedicalHistory", js.Array(value*))
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSuspectEntity(value: js.Array[AdverseEventSuspectEntity]): Self = StObject.set(x, "suspectEntity", value.asInstanceOf[js.Any])
    
    inline def setSuspectEntityUndefined: Self = StObject.set(x, "suspectEntity", js.undefined)
    
    inline def setSuspectEntityVarargs(value: AdverseEventSuspectEntity*): Self = StObject.set(x, "suspectEntity", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    inline def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}

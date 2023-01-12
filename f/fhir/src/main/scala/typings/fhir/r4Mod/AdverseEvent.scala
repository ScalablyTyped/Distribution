package typings.fhir.r4Mod

import typings.fhir.fhirStrings.actual
import typings.fhir.fhirStrings.potential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEvent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _actuality: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _detected: js.UndefOr[Element] = js.undefined
  
  var _recordedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.
    */
  var actuality: actual | potential
  
  /**
    * The overall type of event, intended for search and filtering purposes.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Parties that may or should contribute or have contributed information to the adverse event, which can consist of one or more activities.  Such information includes information leading to the decision to perform the activity and how to perform the activity (e.g. consultant), information that the activity itself seeks to reveal (e.g. informant of clinical history), or information about what activity was performed (e.g. informant witness).
    */
  var contributor: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The date (and perhaps time) when the adverse event occurred.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated or actual date the AdverseEvent began, in the opinion of the reporter.
    */
  var detected: js.UndefOr[String] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter.  For example, if a medication administration was considered an adverse event because it resulted in a rash, then the encounter when the medication administration was given is the context.  If the patient reports the AdverseEvent during a second encounter, that second encounter is not the context.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element defines the specific type of event that occurred or that was prevented from occurring.
    */
  var event: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
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
    * The recordedDate represents the date when this particular AdverseEvent record was created in the system, not the date of the most recent update.  The date of the last record modification can be retrieved from the resource metadata.
    */
  var recordedDate: js.UndefOr[String] = js.undefined
  
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
    * Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).
    */
  var resultingCondition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Assessment whether this event was of real importance.
    */
  var seriousness: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Describes the severity of the adverse event, in relation to the subject. Contrast to AdverseEvent.seriousness - a severe rash might not be serious, but a mild heart problem is.
    */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * AdverseEvent.study.
    */
  var study: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If AdverseEvent.resultingCondition differs among members of the group, then use Patient as the subject.
    */
  var subject: Reference
  
  /**
    * AdverseEvent.subjectMedicalHistory.
    */
  var subjectMedicalHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Describes the entity that is suspected to have caused the adverse event.
    */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.undefined
}
object AdverseEvent {
  
  inline def apply(actuality: actual | potential, subject: Reference): AdverseEvent = {
    val __obj = js.Dynamic.literal(actuality = actuality.asInstanceOf[js.Any], resourceType = "AdverseEvent", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdverseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdverseEvent] (val x: Self) extends AnyVal {
    
    inline def setActuality(value: actual | potential): Self = StObject.set(x, "actuality", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setContributor(value: js.Array[Reference]): Self = StObject.set(x, "contributor", value.asInstanceOf[js.Any])
    
    inline def setContributorUndefined: Self = StObject.set(x, "contributor", js.undefined)
    
    inline def setContributorVarargs(value: Reference*): Self = StObject.set(x, "contributor", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDetected(value: String): Self = StObject.set(x, "detected", value.asInstanceOf[js.Any])
    
    inline def setDetectedUndefined: Self = StObject.set(x, "detected", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvent(value: CodeableConcept): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setRecordedDate(value: String): Self = StObject.set(x, "recordedDate", value.asInstanceOf[js.Any])
    
    inline def setRecordedDateUndefined: Self = StObject.set(x, "recordedDate", js.undefined)
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setReferenceDocument(value: js.Array[Reference]): Self = StObject.set(x, "referenceDocument", value.asInstanceOf[js.Any])
    
    inline def setReferenceDocumentUndefined: Self = StObject.set(x, "referenceDocument", js.undefined)
    
    inline def setReferenceDocumentVarargs(value: Reference*): Self = StObject.set(x, "referenceDocument", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AdverseEvent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResultingCondition(value: js.Array[Reference]): Self = StObject.set(x, "resultingCondition", value.asInstanceOf[js.Any])
    
    inline def setResultingConditionUndefined: Self = StObject.set(x, "resultingCondition", js.undefined)
    
    inline def setResultingConditionVarargs(value: Reference*): Self = StObject.set(x, "resultingCondition", js.Array(value*))
    
    inline def setSeriousness(value: CodeableConcept): Self = StObject.set(x, "seriousness", value.asInstanceOf[js.Any])
    
    inline def setSeriousnessUndefined: Self = StObject.set(x, "seriousness", js.undefined)
    
    inline def setSeverity(value: CodeableConcept): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStudy(value: js.Array[Reference]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    inline def setStudyVarargs(value: Reference*): Self = StObject.set(x, "study", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectMedicalHistory(value: js.Array[Reference]): Self = StObject.set(x, "subjectMedicalHistory", value.asInstanceOf[js.Any])
    
    inline def setSubjectMedicalHistoryUndefined: Self = StObject.set(x, "subjectMedicalHistory", js.undefined)
    
    inline def setSubjectMedicalHistoryVarargs(value: Reference*): Self = StObject.set(x, "subjectMedicalHistory", js.Array(value*))
    
    inline def setSuspectEntity(value: js.Array[AdverseEventSuspectEntity]): Self = StObject.set(x, "suspectEntity", value.asInstanceOf[js.Any])
    
    inline def setSuspectEntityUndefined: Self = StObject.set(x, "suspectEntity", js.undefined)
    
    inline def setSuspectEntityVarargs(value: AdverseEventSuspectEntity*): Self = StObject.set(x, "suspectEntity", js.Array(value*))
    
    inline def set_actuality(value: Element): Self = StObject.set(x, "_actuality", value.asInstanceOf[js.Any])
    
    inline def set_actualityUndefined: Self = StObject.set(x, "_actuality", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_detected(value: Element): Self = StObject.set(x, "_detected", value.asInstanceOf[js.Any])
    
    inline def set_detectedUndefined: Self = StObject.set(x, "_detected", js.undefined)
    
    inline def set_recordedDate(value: Element): Self = StObject.set(x, "_recordedDate", value.asInstanceOf[js.Any])
    
    inline def set_recordedDateUndefined: Self = StObject.set(x, "_recordedDate", js.undefined)
  }
}

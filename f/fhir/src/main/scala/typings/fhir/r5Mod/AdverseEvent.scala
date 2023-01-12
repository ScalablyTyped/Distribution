package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.actual
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.potential
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEvent
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _actuality: js.UndefOr[Element] = js.undefined
  
  var _detected: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _recordedDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the event actually happened, or just had the potential to. Note that this is independent of whether anyone was affected or harmed or how severely.
    */
  var actuality: actual | potential
  
  /**
    * The overall type of event, intended for search and filtering purposes.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Specific event that occurred or that was averted, such as patient fall, wrong organ removed, or wrong blood transfused.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The contributing factors suspected to have increased the probability or severity of the adverse event.
    */
  var contributingFactor: js.UndefOr[js.Array[AdverseEventContributingFactor]] = js.undefined
  
  /**
    * Estimated or actual date the AdverseEvent began, in the opinion of the reporter.
    */
  var detected: js.UndefOr[String] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter. For example, if a medication administration was considered an adverse event because it resulted in a rash, then the encounter when the medication administration was given is the associated encounter. If the patient reports the AdverseEvent during a second encounter, that second encounter is not the associated encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The information about where the adverse event occurred.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * The ameliorating action taken after the adverse event occured in order to reduce the extent of harm.
    */
  var mitigatingAction: js.UndefOr[js.Array[AdverseEventMitigatingAction]] = js.undefined
  
  /**
    * The date (and perhaps time) when the adverse event occurred.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date (and perhaps time) when the adverse event occurred.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The date (and perhaps time) when the adverse event occurred.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Describes the type of outcome from the adverse event, such as resolved, recovering, ongoing, resolved-with-sequelae, or fatal.
    */
  var outcome: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates who or what participated in the adverse event and how they were involved.
    */
  var participant: js.UndefOr[js.Array[AdverseEventParticipant]] = js.undefined
  
  /**
    * Preventive actions that contributed to avoiding the adverse event.
    */
  var preventiveAction: js.UndefOr[js.Array[AdverseEventPreventiveAction]] = js.undefined
  
  /**
    * The recordedDate represents the date when this particular AdverseEvent record was created in the system, not the date of the most recent update.  The date of the last record modification can be retrieved from the resource metadata.
    */
  var recordedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Information on who recorded the adverse event.  May be the patient or a practitioner.
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_AdverseEvent: typings.fhir.fhirStrings.AdverseEvent
  
  /**
    * Information about the condition that occurred as a result of the adverse event, such as hives due to the exposure to a substance (for example, a drug or a chemical) or a broken leg as a result of the fall.
    */
  var resultingCondition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Using an example, a rash can have an AdverseEvent.resultingCondition.severity = severe, yet an AdverseEvent.seriousness = non-serious.  Alternatively, a medication given with the wrong dose (chemotherapy given with too low of a dose) can have an AdverseEvent.resultingCondition.severity = mild, yet a AdverseEvent.seriousness = serious.  Another example would be a beta blocker clinical trial where patients with asthma should be excluded, yet a patient with asthma was included and had an asthmatic episode where  AdverseEvent.resultingCondition.severity = mild, yet a AdverseEvent.seriousness = serious.
    */
  var seriousness: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This is not the reporting of the event to any regulatory or quality organization.  This is not the outcome of the patient's condition.
    */
  var status: `in-progress` | completed | `entered-in-error` | unknown
  
  /**
    * The research study that the subject is enrolled in.
    */
  var study: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If AdverseEvent.resultingCondition differs among members of the group, then use Patient as the subject.
    */
  var subject: Reference
  
  /**
    * Supporting information relevant to the event.
    */
  var supportingInfo: js.UndefOr[js.Array[AdverseEventSupportingInfo]] = js.undefined
  
  /**
    * Describes the entity that is suspected to have caused the adverse event.
    */
  var suspectEntity: js.UndefOr[js.Array[AdverseEventSuspectEntity]] = js.undefined
}
object AdverseEvent {
  
  inline def apply(
    actuality: actual | potential,
    status: `in-progress` | completed | `entered-in-error` | unknown,
    subject: Reference
  ): AdverseEvent = {
    val __obj = js.Dynamic.literal(actuality = actuality.asInstanceOf[js.Any], resourceType = "AdverseEvent", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdverseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdverseEvent] (val x: Self) extends AnyVal {
    
    inline def setActuality(value: actual | potential): Self = StObject.set(x, "actuality", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContributingFactor(value: js.Array[AdverseEventContributingFactor]): Self = StObject.set(x, "contributingFactor", value.asInstanceOf[js.Any])
    
    inline def setContributingFactorUndefined: Self = StObject.set(x, "contributingFactor", js.undefined)
    
    inline def setContributingFactorVarargs(value: AdverseEventContributingFactor*): Self = StObject.set(x, "contributingFactor", js.Array(value*))
    
    inline def setDetected(value: String): Self = StObject.set(x, "detected", value.asInstanceOf[js.Any])
    
    inline def setDetectedUndefined: Self = StObject.set(x, "detected", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMitigatingAction(value: js.Array[AdverseEventMitigatingAction]): Self = StObject.set(x, "mitigatingAction", value.asInstanceOf[js.Any])
    
    inline def setMitigatingActionUndefined: Self = StObject.set(x, "mitigatingAction", js.undefined)
    
    inline def setMitigatingActionVarargs(value: AdverseEventMitigatingAction*): Self = StObject.set(x, "mitigatingAction", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setOutcome(value: js.Array[CodeableConcept]): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setOutcomeVarargs(value: CodeableConcept*): Self = StObject.set(x, "outcome", js.Array(value*))
    
    inline def setParticipant(value: js.Array[AdverseEventParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: AdverseEventParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setPreventiveAction(value: js.Array[AdverseEventPreventiveAction]): Self = StObject.set(x, "preventiveAction", value.asInstanceOf[js.Any])
    
    inline def setPreventiveActionUndefined: Self = StObject.set(x, "preventiveAction", js.undefined)
    
    inline def setPreventiveActionVarargs(value: AdverseEventPreventiveAction*): Self = StObject.set(x, "preventiveAction", js.Array(value*))
    
    inline def setRecordedDate(value: String): Self = StObject.set(x, "recordedDate", value.asInstanceOf[js.Any])
    
    inline def setRecordedDateUndefined: Self = StObject.set(x, "recordedDate", js.undefined)
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.AdverseEvent): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResultingCondition(value: js.Array[Reference]): Self = StObject.set(x, "resultingCondition", value.asInstanceOf[js.Any])
    
    inline def setResultingConditionUndefined: Self = StObject.set(x, "resultingCondition", js.undefined)
    
    inline def setResultingConditionVarargs(value: Reference*): Self = StObject.set(x, "resultingCondition", js.Array(value*))
    
    inline def setSeriousness(value: CodeableConcept): Self = StObject.set(x, "seriousness", value.asInstanceOf[js.Any])
    
    inline def setSeriousnessUndefined: Self = StObject.set(x, "seriousness", js.undefined)
    
    inline def setStatus(value: `in-progress` | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStudy(value: js.Array[Reference]): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    inline def setStudyVarargs(value: Reference*): Self = StObject.set(x, "study", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfo(value: js.Array[AdverseEventSupportingInfo]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: AdverseEventSupportingInfo*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def setSuspectEntity(value: js.Array[AdverseEventSuspectEntity]): Self = StObject.set(x, "suspectEntity", value.asInstanceOf[js.Any])
    
    inline def setSuspectEntityUndefined: Self = StObject.set(x, "suspectEntity", js.undefined)
    
    inline def setSuspectEntityVarargs(value: AdverseEventSuspectEntity*): Self = StObject.set(x, "suspectEntity", js.Array(value*))
    
    inline def set_actuality(value: Element): Self = StObject.set(x, "_actuality", value.asInstanceOf[js.Any])
    
    inline def set_actualityUndefined: Self = StObject.set(x, "_actuality", js.undefined)
    
    inline def set_detected(value: Element): Self = StObject.set(x, "_detected", value.asInstanceOf[js.Any])
    
    inline def set_detectedUndefined: Self = StObject.set(x, "_detected", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_recordedDate(value: Element): Self = StObject.set(x, "_recordedDate", value.asInstanceOf[js.Any])
    
    inline def set_recordedDateUndefined: Self = StObject.set(x, "_recordedDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}

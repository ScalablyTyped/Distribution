package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _abatementDateTime: js.UndefOr[Element] = js.undefined
  
  var _abatementString: js.UndefOr[Element] = js.undefined
  
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  var _recordedDate: js.UndefOr[Element] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    * Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var abatementAge: js.UndefOr[Age] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    * Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var abatementDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    * Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var abatementPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    * Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var abatementRange: js.UndefOr[Range] = js.undefined
  
  /**
    * There is no explicit distinction between resolution and remission because in many cases the distinction is not clear. Age is generally used when the patient reports an age at which the Condition abated.  If there is no abatement element, it is unknown whether the condition has resolved or entered remission; applications and users should generally assume that the condition is still valid.  When abatementString exists, it implies the condition is abated.
    * Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var abatementString: js.UndefOr[String] = js.undefined
  
  /**
    * Only used if not implicit in code found in Condition.code. If the use case requires attributes from the BodyStructure resource (e.g. to identify and track separately) then use the standard extension [http://hl7.org/fhir/StructureDefinition/bodySite](http://hl7.org/fhir/extensions/StructureDefinition-bodySite.html).  May be a summary code, or a reference to a very precise definition of the location, or both.
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The categorization is often highly contextual and may appear poorly differentiated or not very useful in other contexts.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The data type is CodeableConcept because clinicalStatus has some clinical judgment involved, such that there might need to be more specificity than the required FHIR value set allows. For example, a SNOMED coding might allow for additional specificity.  clinicalStatus is required since it is a modifier element.  For conditions that are problems list items, the clinicalStatus should not be unknown.  For conditions that are not problem list items, the clinicalStatus may be unknown.  For example, conditions derived from a claim are point in time, so those conditions may have a clinicalStatus of unknown
    */
  var clinicalStatus: CodeableConcept
  
  /**
    * Identification of the condition, problem or diagnosis.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter. This record indicates the encounter this particular record is associated with.  In the case of a "new" diagnosis reflecting ongoing/revised information about the condition, this might be distinct from the first encounter in which the underlying condition was first "known".
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * If the condition was confirmed, but subsequently refuted, then the evidence can be cumulative including all evidence over time.  The evidence may be a simple list of coded symptoms/manifestations, or references to observations or formal assessments, or both.  For example, if the Condition.code is pneumonia, then there could be an evidence list where Condition.evidence.concept = fever (CodeableConcept), Condition.evidence.concept = cough (CodeableConcept), and Condition.evidence.reference = bronchitis (reference to Condition).
    */
  var evidence: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.  Period is generally used to convey an imprecise onset that occurred within the time period.  For example, Period is not intended to convey the transition period before the chronic bronchitis or COPD condition was diagnosed, but Period can be used to convey an imprecise diagnosis date.  Range is generally used to convey an imprecise age range (e.g. 4 to 6 years old).  Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.  Period is generally used to convey an imprecise onset that occurred within the time period.  For example, Period is not intended to convey the transition period before the chronic bronchitis or COPD condition was diagnosed, but Period can be used to convey an imprecise diagnosis date.  Range is generally used to convey an imprecise age range (e.g. 4 to 6 years old).  Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var onsetDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.  Period is generally used to convey an imprecise onset that occurred within the time period.  For example, Period is not intended to convey the transition period before the chronic bronchitis or COPD condition was diagnosed, but Period can be used to convey an imprecise diagnosis date.  Range is generally used to convey an imprecise age range (e.g. 4 to 6 years old).  Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.  Period is generally used to convey an imprecise onset that occurred within the time period.  For example, Period is not intended to convey the transition period before the chronic bronchitis or COPD condition was diagnosed, but Period can be used to convey an imprecise diagnosis date.  Range is generally used to convey an imprecise age range (e.g. 4 to 6 years old).  Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the Condition began to occur.  Period is generally used to convey an imprecise onset that occurred within the time period.  For example, Period is not intended to convey the transition period before the chronic bronchitis or COPD condition was diagnosed, but Period can be used to convey an imprecise diagnosis date.  Range is generally used to convey an imprecise age range (e.g. 4 to 6 years old).  Because a Condition.code can represent multiple levels of granularity and can be modified over time, the onset and abatement dates can have ambiguity whether those dates apply to the current Condition.code or an earlier representation of that Condition.code.   For example, if the Condition.code was initially documented as severe asthma, then it is ambiguous whether the onset and abatement dates apply to asthma (overall in that subject's lifetime) or when asthma transitioned to become severe.
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates who or what participated in the activities related to the condition and how they were involved.
    */
  var participant: js.UndefOr[js.Array[ConditionParticipant]] = js.undefined
  
  /**
    * When onset date is unknown, recordedDate can be used to establish if the condition was present on or before a given date.  If the recordedDate is known and provided by a sending system, it is preferred that the receiving system preserve that recordedDate value. If the recordedDate is not provided by the sending system, the receipt timestamp is sometimes used as the recordedDate.
    */
  var recordedDate: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Condition: typings.fhir.fhirStrings.Condition
  
  /**
    * Coding of the severity with a terminology is preferred, where possible.
    */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A simple summary of the stage such as "Stage 3" or "Early Onset". The determination of the stage is disease-specific, such as cancer, retinopathy of prematurity, kidney diseases, Alzheimer's, or Parkinson disease.
    */
  var stage: js.UndefOr[js.Array[ConditionStage]] = js.undefined
  
  /**
    * Indicates the patient or group who the condition record is associated with.
    */
  var subject: Reference
  
  /**
    * verificationStatus is not required.  For example, when a patient has abdominal pain in the ED, there is not likely going to be a verification status.
    * The data type is CodeableConcept because verificationStatus has some clinical judgment involved, such that there might need to be more specificity than the required FHIR value set allows. For example, a SNOMED coding might allow for additional specificity.
    */
  var verificationStatus: js.UndefOr[CodeableConcept] = js.undefined
}
object Condition {
  
  inline def apply(clinicalStatus: CodeableConcept, subject: Reference): Condition = {
    val __obj = js.Dynamic.literal(clinicalStatus = clinicalStatus.asInstanceOf[js.Any], resourceType = "Condition", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setAbatementAge(value: Age): Self = StObject.set(x, "abatementAge", value.asInstanceOf[js.Any])
    
    inline def setAbatementAgeUndefined: Self = StObject.set(x, "abatementAge", js.undefined)
    
    inline def setAbatementDateTime(value: String): Self = StObject.set(x, "abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def setAbatementDateTimeUndefined: Self = StObject.set(x, "abatementDateTime", js.undefined)
    
    inline def setAbatementPeriod(value: Period): Self = StObject.set(x, "abatementPeriod", value.asInstanceOf[js.Any])
    
    inline def setAbatementPeriodUndefined: Self = StObject.set(x, "abatementPeriod", js.undefined)
    
    inline def setAbatementRange(value: Range): Self = StObject.set(x, "abatementRange", value.asInstanceOf[js.Any])
    
    inline def setAbatementRangeUndefined: Self = StObject.set(x, "abatementRange", js.undefined)
    
    inline def setAbatementString(value: String): Self = StObject.set(x, "abatementString", value.asInstanceOf[js.Any])
    
    inline def setAbatementStringUndefined: Self = StObject.set(x, "abatementString", js.undefined)
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setClinicalStatus(value: CodeableConcept): Self = StObject.set(x, "clinicalStatus", value.asInstanceOf[js.Any])
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvidence(value: js.Array[CodeableReference]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: CodeableReference*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOnsetAge(value: Age): Self = StObject.set(x, "onsetAge", value.asInstanceOf[js.Any])
    
    inline def setOnsetAgeUndefined: Self = StObject.set(x, "onsetAge", js.undefined)
    
    inline def setOnsetDateTime(value: String): Self = StObject.set(x, "onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def setOnsetDateTimeUndefined: Self = StObject.set(x, "onsetDateTime", js.undefined)
    
    inline def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    inline def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    inline def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    inline def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    inline def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    inline def setParticipant(value: js.Array[ConditionParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setParticipantVarargs(value: ConditionParticipant*): Self = StObject.set(x, "participant", js.Array(value*))
    
    inline def setRecordedDate(value: String): Self = StObject.set(x, "recordedDate", value.asInstanceOf[js.Any])
    
    inline def setRecordedDateUndefined: Self = StObject.set(x, "recordedDate", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Condition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: CodeableConcept): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStage(value: js.Array[ConditionStage]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setStageVarargs(value: ConditionStage*): Self = StObject.set(x, "stage", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatus(value: CodeableConcept): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
    
    inline def set_abatementDateTime(value: Element): Self = StObject.set(x, "_abatementDateTime", value.asInstanceOf[js.Any])
    
    inline def set_abatementDateTimeUndefined: Self = StObject.set(x, "_abatementDateTime", js.undefined)
    
    inline def set_abatementString(value: Element): Self = StObject.set(x, "_abatementString", value.asInstanceOf[js.Any])
    
    inline def set_abatementStringUndefined: Self = StObject.set(x, "_abatementString", js.undefined)
    
    inline def set_onsetDateTime(value: Element): Self = StObject.set(x, "_onsetDateTime", value.asInstanceOf[js.Any])
    
    inline def set_onsetDateTimeUndefined: Self = StObject.set(x, "_onsetDateTime", js.undefined)
    
    inline def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    inline def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
    
    inline def set_recordedDate(value: Element): Self = StObject.set(x, "_recordedDate", value.asInstanceOf[js.Any])
    
    inline def set_recordedDateUndefined: Self = StObject.set(x, "_recordedDate", js.undefined)
  }
}

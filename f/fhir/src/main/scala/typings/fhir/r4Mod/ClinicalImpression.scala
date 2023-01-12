package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.completed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalImpression
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _protocol: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _summary: js.UndefOr[Element] = js.undefined
  
  /**
    * The clinician performing the assessment.
    */
  var assessor: js.UndefOr[Reference] = js.undefined
  
  /**
    * This is present as a place-holder only and may be removed based on feedback/work group opinion.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates when the documentation of the assessment was complete.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A summary of the context and/or cause of the assessment - why / where it was performed, and what patient events/status prompted it.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * This SHOULD be accurate to at least the minute, though some assessments only have a known date.
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * This SHOULD be accurate to at least the minute, though some assessments only have a known date.
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
    */
  var finding: js.UndefOr[js.Array[ClinicalImpressionFinding]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
    */
  var investigation: js.UndefOr[js.Array[ClinicalImpressionInvestigation]] = js.undefined
  
  /**
    * Don't use this element for content that should more properly appear as one of the specific elements of the impression.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * It is always likely that multiple previous assessments exist for a patient. The point of quoting a previous assessment is that this assessment is relative to it (see resolved).
    */
  var previous: js.UndefOr[Reference] = js.undefined
  
  /**
    * e.g. The patient is a pregnant, has congestive heart failure, has an ‎Adenocarcinoma, and is allergic to penicillin.
    */
  var problem: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Estimate of likely outcome.
    */
  var prognosisCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * RiskAssessment expressing likely outcome.
    */
  var prognosisReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
    */
  var protocol: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ClinicalImpression: typings.fhir.fhirStrings.ClinicalImpression
  
  /**
    * This element is labeled as a modifier because the status contains the code entered-in-error that marks the clinical impression as not currently valid.
    */
  var status: `in-progress` | completed | `entered-in-error`
  
  /**
    * This is generally only used for "exception" statuses such as "not-done", "suspended" or "cancelled".
    * [distinct reason codes for different statuses can be enforced using invariants if they are universal bindings].
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The patient or group of individuals assessed as part of this record.
    */
  var subject: Reference
  
  /**
    * A text summary of the investigations and the diagnosis.
    */
  var summary: js.UndefOr[String] = js.undefined
  
  /**
    * Information supporting the clinical impression.
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ClinicalImpression {
  
  inline def apply(status: `in-progress` | completed | `entered-in-error`, subject: Reference): ClinicalImpression = {
    val __obj = js.Dynamic.literal(resourceType = "ClinicalImpression", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalImpression] (val x: Self) extends AnyVal {
    
    inline def setAssessor(value: Reference): Self = StObject.set(x, "assessor", value.asInstanceOf[js.Any])
    
    inline def setAssessorUndefined: Self = StObject.set(x, "assessor", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setFinding(value: js.Array[ClinicalImpressionFinding]): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setFindingVarargs(value: ClinicalImpressionFinding*): Self = StObject.set(x, "finding", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInvestigation(value: js.Array[ClinicalImpressionInvestigation]): Self = StObject.set(x, "investigation", value.asInstanceOf[js.Any])
    
    inline def setInvestigationUndefined: Self = StObject.set(x, "investigation", js.undefined)
    
    inline def setInvestigationVarargs(value: ClinicalImpressionInvestigation*): Self = StObject.set(x, "investigation", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPrevious(value: Reference): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setProblem(value: js.Array[Reference]): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
    
    inline def setProblemUndefined: Self = StObject.set(x, "problem", js.undefined)
    
    inline def setProblemVarargs(value: Reference*): Self = StObject.set(x, "problem", js.Array(value*))
    
    inline def setPrognosisCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "prognosisCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setPrognosisCodeableConceptUndefined: Self = StObject.set(x, "prognosisCodeableConcept", js.undefined)
    
    inline def setPrognosisCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "prognosisCodeableConcept", js.Array(value*))
    
    inline def setPrognosisReference(value: js.Array[Reference]): Self = StObject.set(x, "prognosisReference", value.asInstanceOf[js.Any])
    
    inline def setPrognosisReferenceUndefined: Self = StObject.set(x, "prognosisReference", js.undefined)
    
    inline def setPrognosisReferenceVarargs(value: Reference*): Self = StObject.set(x, "prognosisReference", js.Array(value*))
    
    inline def setProtocol(value: js.Array[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVarargs(value: String*): Self = StObject.set(x, "protocol", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ClinicalImpression): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `in-progress` | completed | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_protocol(value: js.Array[Element]): Self = StObject.set(x, "_protocol", value.asInstanceOf[js.Any])
    
    inline def set_protocolUndefined: Self = StObject.set(x, "_protocol", js.undefined)
    
    inline def set_protocolVarargs(value: Element*): Self = StObject.set(x, "_protocol", js.Array(value*))
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_summary(value: Element): Self = StObject.set(x, "_summary", value.asInstanceOf[js.Any])
    
    inline def set_summaryUndefined: Self = StObject.set(x, "_summary", js.undefined)
  }
}

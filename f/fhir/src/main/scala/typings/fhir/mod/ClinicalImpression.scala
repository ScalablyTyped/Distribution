package typings.fhir.mod

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
  
  var _prognosis: js.UndefOr[Element] = js.undefined
  
  var _protocol: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _summary: js.UndefOr[Element] = js.undefined
  
  /**
    * Actions taken during assessment.
    */
  var action: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The clinician performing the assessment.
    */
  var assessor: js.UndefOr[Reference] = js.undefined
  
  /**
    * The point in time at which the assessment was concluded (not when it was recorded).
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A summary of the context and/or cause of the assessment - why / where was it peformed, and what patient events/sstatus prompted it.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specific findings or diagnoses that was considered likely or relevant to ongoing treatment.
    */
  var finding: js.UndefOr[js.Array[ClinicalImpressionFinding]] = js.undefined
  
  /**
    * One or more sets of investigations (signs, symptions, etc.). The actual grouping of investigations vary greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.
    */
  var investigations: js.UndefOr[js.Array[ClinicalImpressionInvestigations]] = js.undefined
  
  /**
    * The patient being assessed.
    */
  var patient: Reference
  
  /**
    * Plan of action after assessment.
    */
  var plan: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A reference to the last assesment that was conducted bon this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.
    */
  var previous: js.UndefOr[Reference] = js.undefined
  
  /**
    * This a list of the general problems/conditions for a patient.
    */
  var problem: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Estimate of likely outcome.
    */
  var prognosis: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to a specific published clinical protocol that was followed during this assessment, and/or that provides evidence in support of the diagnosis.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * Diagnoses/conditions resolved since the last assessment.
    */
  var resolved: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ClinicalImpression: typings.fhir.fhirStrings.ClinicalImpression
  
  /**
    * Diagnosis considered not possible.
    */
  var ruledOut: js.UndefOr[js.Array[ClinicalImpressionRuledOut]] = js.undefined
  
  /**
    * Identifies the workflow status of the assessment.
    */
  var status: `in-progress` | completed | `entered-in-error`
  
  /**
    * A text summary of the investigations and the diagnosis.
    */
  var summary: js.UndefOr[String] = js.undefined
  
  /**
    * The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.
    */
  var triggerCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The request or event that necessitated this assessment. This may be a diagnosis, a Care Plan, a Request Referral, or some other resource.
    */
  var triggerReference: js.UndefOr[Reference] = js.undefined
}
object ClinicalImpression {
  
  inline def apply(patient: Reference, status: `in-progress` | completed | `entered-in-error`): ClinicalImpression = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "ClinicalImpression", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpression]
  }
  
  extension [Self <: ClinicalImpression](x: Self) {
    
    inline def setAction(value: js.Array[Reference]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: Reference*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setAssessor(value: Reference): Self = StObject.set(x, "assessor", value.asInstanceOf[js.Any])
    
    inline def setAssessorUndefined: Self = StObject.set(x, "assessor", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFinding(value: js.Array[ClinicalImpressionFinding]): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setFindingVarargs(value: ClinicalImpressionFinding*): Self = StObject.set(x, "finding", js.Array(value*))
    
    inline def setInvestigations(value: js.Array[ClinicalImpressionInvestigations]): Self = StObject.set(x, "investigations", value.asInstanceOf[js.Any])
    
    inline def setInvestigationsUndefined: Self = StObject.set(x, "investigations", js.undefined)
    
    inline def setInvestigationsVarargs(value: ClinicalImpressionInvestigations*): Self = StObject.set(x, "investigations", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: js.Array[Reference]): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPlanVarargs(value: Reference*): Self = StObject.set(x, "plan", js.Array(value*))
    
    inline def setPrevious(value: Reference): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setProblem(value: js.Array[Reference]): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
    
    inline def setProblemUndefined: Self = StObject.set(x, "problem", js.undefined)
    
    inline def setProblemVarargs(value: Reference*): Self = StObject.set(x, "problem", js.Array(value*))
    
    inline def setPrognosis(value: String): Self = StObject.set(x, "prognosis", value.asInstanceOf[js.Any])
    
    inline def setPrognosisUndefined: Self = StObject.set(x, "prognosis", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setResolved(value: js.Array[CodeableConcept]): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setResolvedVarargs(value: CodeableConcept*): Self = StObject.set(x, "resolved", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ClinicalImpression): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRuledOut(value: js.Array[ClinicalImpressionRuledOut]): Self = StObject.set(x, "ruledOut", value.asInstanceOf[js.Any])
    
    inline def setRuledOutUndefined: Self = StObject.set(x, "ruledOut", js.undefined)
    
    inline def setRuledOutVarargs(value: ClinicalImpressionRuledOut*): Self = StObject.set(x, "ruledOut", js.Array(value*))
    
    inline def setStatus(value: `in-progress` | completed | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTriggerCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "triggerCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setTriggerCodeableConceptUndefined: Self = StObject.set(x, "triggerCodeableConcept", js.undefined)
    
    inline def setTriggerReference(value: Reference): Self = StObject.set(x, "triggerReference", value.asInstanceOf[js.Any])
    
    inline def setTriggerReferenceUndefined: Self = StObject.set(x, "triggerReference", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_prognosis(value: Element): Self = StObject.set(x, "_prognosis", value.asInstanceOf[js.Any])
    
    inline def set_prognosisUndefined: Self = StObject.set(x, "_prognosis", js.undefined)
    
    inline def set_protocol(value: Element): Self = StObject.set(x, "_protocol", value.asInstanceOf[js.Any])
    
    inline def set_protocolUndefined: Self = StObject.set(x, "_protocol", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_summary(value: Element): Self = StObject.set(x, "_summary", value.asInstanceOf[js.Any])
    
    inline def set_summaryUndefined: Self = StObject.set(x, "_summary", js.undefined)
  }
}

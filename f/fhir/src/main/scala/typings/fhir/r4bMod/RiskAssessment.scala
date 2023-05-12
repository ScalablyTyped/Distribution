package typings.fhir.r4bMod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`final`
import typings.fhir.fhirStrings.amended
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.corrected
import typings.fhir.fhirStrings.preliminary
import typings.fhir.fhirStrings.registered
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskAssessment
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _mitigation: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to the request that is fulfilled by this risk assessment.
    */
  var basedOn: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).
    */
  var basis: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of the risk assessment performed.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
    */
  var condition: js.UndefOr[Reference] = js.undefined
  
  /**
    * The encounter where the assessment was performed.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Business identifier assigned to the risk assessment.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The algorithm, process or mechanism used to evaluate the risk.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A description of the steps that might be taken to reduce the identified risk(s).
    */
  var mitigation: js.UndefOr[String] = js.undefined
  
  /**
    * Additional comments about the risk assessment.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The date (and possibly time) the risk assessment was performed.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date (and possibly time) the risk assessment was performed.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A reference to a resource that this risk assessment is part of, such as a Procedure.
    */
  var parent: js.UndefOr[Reference] = js.undefined
  
  /**
    * The provider or software application that performed the assessment.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Multiple repetitions can be used to identify the same type of outcome in different timeframes as well as different types of outcomes.
    */
  var prediction: js.UndefOr[js.Array[RiskAssessmentPrediction]] = js.undefined
  
  /**
    * The reason the risk assessment was performed.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Resources supporting the reason the risk assessment was performed.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_RiskAssessment: typings.fhir.fhirStrings.RiskAssessment
  
  /**
    * The status of the RiskAssessment, using the same statuses as an Observation.
    */
  var status: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
  
  /**
    * The patient or group the risk assessment applies to.
    */
  var subject: Reference
}
object RiskAssessment {
  
  inline def apply(
    status: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown,
    subject: Reference
  ): RiskAssessment = {
    val __obj = js.Dynamic.literal(resourceType = "RiskAssessment", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskAssessment] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: Reference): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasis(value: js.Array[Reference]): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    inline def setBasisVarargs(value: Reference*): Self = StObject.set(x, "basis", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCondition(value: Reference): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMitigation(value: String): Self = StObject.set(x, "mitigation", value.asInstanceOf[js.Any])
    
    inline def setMitigationUndefined: Self = StObject.set(x, "mitigation", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPrediction(value: js.Array[RiskAssessmentPrediction]): Self = StObject.set(x, "prediction", value.asInstanceOf[js.Any])
    
    inline def setPredictionUndefined: Self = StObject.set(x, "prediction", js.undefined)
    
    inline def setPredictionVarargs(value: RiskAssessmentPrediction*): Self = StObject.set(x, "prediction", js.Array(value*))
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.RiskAssessment): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: registered | preliminary | `final` | amended | corrected | cancelled | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def set_mitigation(value: Element): Self = StObject.set(x, "_mitigation", value.asInstanceOf[js.Any])
    
    inline def set_mitigationUndefined: Self = StObject.set(x, "_mitigation", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}

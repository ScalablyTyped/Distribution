package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskAssessment
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _mitigation: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the source data considered as part of the assessment (FamilyHistory, Observations, Procedures, Conditions, etc.).
    */
  var basis: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * For assessments or prognosis specific to a particular condition, indicates the condition being assessed.
    */
  var condition: js.UndefOr[Reference] = js.undefined
  
  /**
    * The assessment results lose validity the more time elapses from when they are first made.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The encounter where the assessment was performed.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Business identifier assigned to the risk assessment.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The method can influence the results of the assessment.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * One of the main reasons for assessing risks is to identify whether interventional steps are needed to reduce risk.
    */
  var mitigation: js.UndefOr[String] = js.undefined
  
  /**
    * The provider or software application that performed the assessment.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Describes the expected outcome for the subject.
    */
  var prediction: js.UndefOr[js.Array[RiskAssessmentPrediction]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_RiskAssessment: typings.fhir.fhirStrings.RiskAssessment
  
  /**
    * The patient or group the risk assessment applies to.
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object RiskAssessment {
  
  inline def apply(): RiskAssessment = {
    val __obj = js.Dynamic.literal(resourceType = "RiskAssessment")
    __obj.asInstanceOf[RiskAssessment]
  }
  
  extension [Self <: RiskAssessment](x: Self) {
    
    inline def setBasis(value: js.Array[Reference]): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    inline def setBasisVarargs(value: Reference*): Self = StObject.set(x, "basis", js.Array(value*))
    
    inline def setCondition(value: Reference): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMitigation(value: String): Self = StObject.set(x, "mitigation", value.asInstanceOf[js.Any])
    
    inline def setMitigationUndefined: Self = StObject.set(x, "mitigation", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPrediction(value: js.Array[RiskAssessmentPrediction]): Self = StObject.set(x, "prediction", value.asInstanceOf[js.Any])
    
    inline def setPredictionUndefined: Self = StObject.set(x, "prediction", js.undefined)
    
    inline def setPredictionVarargs(value: RiskAssessmentPrediction*): Self = StObject.set(x, "prediction", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.RiskAssessment): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_mitigation(value: Element): Self = StObject.set(x, "_mitigation", value.asInstanceOf[js.Any])
    
    inline def set_mitigationUndefined: Self = StObject.set(x, "_mitigation", js.undefined)
  }
}

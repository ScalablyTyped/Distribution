package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Potential outcomes for a subject with likelihood
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait RiskAssessment
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'mitigation'.
    */
  var _mitigation: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Request fulfilled by this assessment
    */
  var basedOn: js.UndefOr[Reference] = js.undefined
  
  /**
    * Information used in assessment
    */
  var basis: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type of assessment
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Comments on the risk assessment
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Condition assessed
    */
  var condition: js.UndefOr[Reference] = js.undefined
  
  /**
    * Where was assessment performed?
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Unique identifier for the assessment
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Evaluation mechanism
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * How to reduce risk
    */
  var mitigation: js.UndefOr[String] = js.undefined
  
  /**
    * When was assessment made?
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When was assessment made?
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Part of this occurrence
    */
  var parent: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who did assessment?
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * Outcome predicted
    */
  var prediction: js.UndefOr[js.Array[RiskAssessmentPrediction]] = js.undefined
  
  /**
    * Why the assessment was necessary?
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Why the assessment was necessary?
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * registered | preliminary | final | amended +
    */
  var status: code
  
  /**
    * Who/what does assessment apply to?
    */
  var subject: js.UndefOr[Reference] = js.undefined
}
object RiskAssessment {
  
  @scala.inline
  def apply(status: code): RiskAssessment = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessment]
  }
  
  @scala.inline
  implicit class RiskAssessmentMutableBuilder[Self <: RiskAssessment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasedOn(value: Reference): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasis(value: js.Array[Reference]): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    @scala.inline
    def setBasisVarargs(value: Reference*): Self = StObject.set(x, "basis", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCondition(value: Reference): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMitigation(value: String): Self = StObject.set(x, "mitigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMitigationUndefined: Self = StObject.set(x, "mitigation", js.undefined)
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    @scala.inline
    def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPrediction(value: js.Array[RiskAssessmentPrediction]): Self = StObject.set(x, "prediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionUndefined: Self = StObject.set(x, "prediction", js.undefined)
    
    @scala.inline
    def setPredictionVarargs(value: RiskAssessmentPrediction*): Self = StObject.set(x, "prediction", js.Array(value :_*))
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    @scala.inline
    def set_mitigation(value: Element): Self = StObject.set(x, "_mitigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_mitigationUndefined: Self = StObject.set(x, "_mitigation", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}

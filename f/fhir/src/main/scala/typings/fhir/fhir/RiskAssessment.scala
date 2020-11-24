package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Potential outcomes for a subject with likelihood
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait RiskAssessment extends DomainResource {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'mitigation'.
    */
  var _mitigation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Request fulfilled by this assessment
    */
  var basedOn: js.UndefOr[Reference] = js.native
  
  /**
    * Information used in assessment
    */
  var basis: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Type of assessment
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Comments on the risk assessment
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Condition assessed
    */
  var condition: js.UndefOr[Reference] = js.native
  
  /**
    * Where was assessment performed?
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Unique identifier for the assessment
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Evaluation mechanism
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * How to reduce risk
    */
  var mitigation: js.UndefOr[String] = js.native
  
  /**
    * When was assessment made?
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * When was assessment made?
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  
  /**
    * Part of this occurrence
    */
  var parent: js.UndefOr[Reference] = js.native
  
  /**
    * Who did assessment?
    */
  var performer: js.UndefOr[Reference] = js.native
  
  /**
    * Outcome predicted
    */
  var prediction: js.UndefOr[js.Array[RiskAssessmentPrediction]] = js.native
  
  /**
    * Why the assessment was necessary?
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Why the assessment was necessary?
    */
  var reasonReference: js.UndefOr[Reference] = js.native
  
  /**
    * registered | preliminary | final | amended +
    */
  var status: code = js.native
  
  /**
    * Who/what does assessment apply to?
    */
  var subject: js.UndefOr[Reference] = js.native
}
object RiskAssessment {
  
  @scala.inline
  def apply(status: code): RiskAssessment = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessment]
  }
  
  @scala.inline
  implicit class RiskAssessmentOps[Self <: RiskAssessment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    
    @scala.inline
    def set_mitigation(value: Element): Self = this.set("_mitigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_mitigation: Self = this.set("_mitigation", js.undefined)
    
    @scala.inline
    def set_occurrenceDateTime(value: Element): Self = this.set("_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_occurrenceDateTime: Self = this.set("_occurrenceDateTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setBasedOn(value: Reference): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    
    @scala.inline
    def setBasisVarargs(value: Reference*): Self = this.set("basis", js.Array(value :_*))
    
    @scala.inline
    def setBasis(value: js.Array[Reference]): Self = this.set("basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasis: Self = this.set("basis", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCondition(value: Reference): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMitigation(value: String): Self = this.set("mitigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMitigation: Self = this.set("mitigation", js.undefined)
    
    @scala.inline
    def setOccurrenceDateTime(value: dateTime): Self = this.set("occurrenceDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceDateTime: Self = this.set("occurrenceDateTime", js.undefined)
    
    @scala.inline
    def setOccurrencePeriod(value: Period): Self = this.set("occurrencePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrencePeriod: Self = this.set("occurrencePeriod", js.undefined)
    
    @scala.inline
    def setParent(value: Reference): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPerformer(value: Reference): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setPredictionVarargs(value: RiskAssessmentPrediction*): Self = this.set("prediction", js.Array(value :_*))
    
    @scala.inline
    def setPrediction(value: js.Array[RiskAssessmentPrediction]): Self = this.set("prediction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrediction: Self = this.set("prediction", js.undefined)
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = this.set("reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCodeableConcept: Self = this.set("reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}

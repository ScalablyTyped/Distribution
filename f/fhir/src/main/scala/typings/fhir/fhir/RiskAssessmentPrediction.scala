package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Outcome predicted
  */
@js.native
trait RiskAssessmentPrediction extends BackboneElement {
  
  /**
    * Contains extended information for property 'probabilityDecimal'.
    */
  var _probabilityDecimal: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'rationale'.
    */
  var _rationale: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'relativeRisk'.
    */
  var _relativeRisk: js.UndefOr[Element] = js.native
  
  /**
    * Possible outcome for the subject
    */
  var outcome: CodeableConcept = js.native
  
  /**
    * Likelihood of specified outcome
    */
  var probabilityDecimal: js.UndefOr[decimal] = js.native
  
  /**
    * Likelihood of specified outcome
    */
  var probabilityRange: js.UndefOr[Range] = js.native
  
  /**
    * Likelihood of specified outcome as a qualitative value
    */
  var qualitativeRisk: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Explanation of prediction
    */
  var rationale: js.UndefOr[String] = js.native
  
  /**
    * Relative likelihood
    */
  var relativeRisk: js.UndefOr[decimal] = js.native
  
  /**
    * Timeframe or age range
    */
  var whenPeriod: js.UndefOr[Period] = js.native
  
  /**
    * Timeframe or age range
    */
  var whenRange: js.UndefOr[Range] = js.native
}
object RiskAssessmentPrediction {
  
  @scala.inline
  def apply(outcome: CodeableConcept): RiskAssessmentPrediction = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessmentPrediction]
  }
  
  @scala.inline
  implicit class RiskAssessmentPredictionOps[Self <: RiskAssessmentPrediction] (val x: Self) extends AnyVal {
    
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
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_probabilityDecimal(value: Element): Self = this.set("_probabilityDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_probabilityDecimal: Self = this.set("_probabilityDecimal", js.undefined)
    
    @scala.inline
    def set_rationale(value: Element): Self = this.set("_rationale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_rationale: Self = this.set("_rationale", js.undefined)
    
    @scala.inline
    def set_relativeRisk(value: Element): Self = this.set("_relativeRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_relativeRisk: Self = this.set("_relativeRisk", js.undefined)
    
    @scala.inline
    def setProbabilityDecimal(value: decimal): Self = this.set("probabilityDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProbabilityDecimal: Self = this.set("probabilityDecimal", js.undefined)
    
    @scala.inline
    def setProbabilityRange(value: Range): Self = this.set("probabilityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProbabilityRange: Self = this.set("probabilityRange", js.undefined)
    
    @scala.inline
    def setQualitativeRisk(value: CodeableConcept): Self = this.set("qualitativeRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualitativeRisk: Self = this.set("qualitativeRisk", js.undefined)
    
    @scala.inline
    def setRationale(value: String): Self = this.set("rationale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRationale: Self = this.set("rationale", js.undefined)
    
    @scala.inline
    def setRelativeRisk(value: decimal): Self = this.set("relativeRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeRisk: Self = this.set("relativeRisk", js.undefined)
    
    @scala.inline
    def setWhenPeriod(value: Period): Self = this.set("whenPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenPeriod: Self = this.set("whenPeriod", js.undefined)
    
    @scala.inline
    def setWhenRange(value: Range): Self = this.set("whenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenRange: Self = this.set("whenRange", js.undefined)
  }
}

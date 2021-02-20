package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class RiskAssessmentPredictionMutableBuilder[Self <: RiskAssessmentPrediction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbabilityDecimal(value: decimal): Self = StObject.set(x, "probabilityDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbabilityDecimalUndefined: Self = StObject.set(x, "probabilityDecimal", js.undefined)
    
    @scala.inline
    def setProbabilityRange(value: Range): Self = StObject.set(x, "probabilityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbabilityRangeUndefined: Self = StObject.set(x, "probabilityRange", js.undefined)
    
    @scala.inline
    def setQualitativeRisk(value: CodeableConcept): Self = StObject.set(x, "qualitativeRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualitativeRiskUndefined: Self = StObject.set(x, "qualitativeRisk", js.undefined)
    
    @scala.inline
    def setRationale(value: String): Self = StObject.set(x, "rationale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRationaleUndefined: Self = StObject.set(x, "rationale", js.undefined)
    
    @scala.inline
    def setRelativeRisk(value: decimal): Self = StObject.set(x, "relativeRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeRiskUndefined: Self = StObject.set(x, "relativeRisk", js.undefined)
    
    @scala.inline
    def setWhenPeriod(value: Period): Self = StObject.set(x, "whenPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenPeriodUndefined: Self = StObject.set(x, "whenPeriod", js.undefined)
    
    @scala.inline
    def setWhenRange(value: Range): Self = StObject.set(x, "whenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenRangeUndefined: Self = StObject.set(x, "whenRange", js.undefined)
    
    @scala.inline
    def set_probabilityDecimal(value: Element): Self = StObject.set(x, "_probabilityDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_probabilityDecimalUndefined: Self = StObject.set(x, "_probabilityDecimal", js.undefined)
    
    @scala.inline
    def set_rationale(value: Element): Self = StObject.set(x, "_rationale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rationaleUndefined: Self = StObject.set(x, "_rationale", js.undefined)
    
    @scala.inline
    def set_relativeRisk(value: Element): Self = StObject.set(x, "_relativeRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_relativeRiskUndefined: Self = StObject.set(x, "_relativeRisk", js.undefined)
  }
}

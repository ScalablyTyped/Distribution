package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Outcome predicted
  */
trait RiskAssessmentPrediction
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'probabilityDecimal'.
    */
  var _probabilityDecimal: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'rationale'.
    */
  var _rationale: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'relativeRisk'.
    */
  var _relativeRisk: js.UndefOr[Element] = js.undefined
  
  /**
    * Possible outcome for the subject
    */
  var outcome: CodeableConcept
  
  /**
    * Likelihood of specified outcome
    */
  var probabilityDecimal: js.UndefOr[decimal] = js.undefined
  
  /**
    * Likelihood of specified outcome
    */
  var probabilityRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Likelihood of specified outcome as a qualitative value
    */
  var qualitativeRisk: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Explanation of prediction
    */
  var rationale: js.UndefOr[String] = js.undefined
  
  /**
    * Relative likelihood
    */
  var relativeRisk: js.UndefOr[decimal] = js.undefined
  
  /**
    * Timeframe or age range
    */
  var whenPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Timeframe or age range
    */
  var whenRange: js.UndefOr[Range] = js.undefined
}
object RiskAssessmentPrediction {
  
  inline def apply(outcome: CodeableConcept): RiskAssessmentPrediction = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessmentPrediction]
  }
  
  extension [Self <: RiskAssessmentPrediction](x: Self) {
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setProbabilityDecimal(value: decimal): Self = StObject.set(x, "probabilityDecimal", value.asInstanceOf[js.Any])
    
    inline def setProbabilityDecimalUndefined: Self = StObject.set(x, "probabilityDecimal", js.undefined)
    
    inline def setProbabilityRange(value: Range): Self = StObject.set(x, "probabilityRange", value.asInstanceOf[js.Any])
    
    inline def setProbabilityRangeUndefined: Self = StObject.set(x, "probabilityRange", js.undefined)
    
    inline def setQualitativeRisk(value: CodeableConcept): Self = StObject.set(x, "qualitativeRisk", value.asInstanceOf[js.Any])
    
    inline def setQualitativeRiskUndefined: Self = StObject.set(x, "qualitativeRisk", js.undefined)
    
    inline def setRationale(value: String): Self = StObject.set(x, "rationale", value.asInstanceOf[js.Any])
    
    inline def setRationaleUndefined: Self = StObject.set(x, "rationale", js.undefined)
    
    inline def setRelativeRisk(value: decimal): Self = StObject.set(x, "relativeRisk", value.asInstanceOf[js.Any])
    
    inline def setRelativeRiskUndefined: Self = StObject.set(x, "relativeRisk", js.undefined)
    
    inline def setWhenPeriod(value: Period): Self = StObject.set(x, "whenPeriod", value.asInstanceOf[js.Any])
    
    inline def setWhenPeriodUndefined: Self = StObject.set(x, "whenPeriod", js.undefined)
    
    inline def setWhenRange(value: Range): Self = StObject.set(x, "whenRange", value.asInstanceOf[js.Any])
    
    inline def setWhenRangeUndefined: Self = StObject.set(x, "whenRange", js.undefined)
    
    inline def set_probabilityDecimal(value: Element): Self = StObject.set(x, "_probabilityDecimal", value.asInstanceOf[js.Any])
    
    inline def set_probabilityDecimalUndefined: Self = StObject.set(x, "_probabilityDecimal", js.undefined)
    
    inline def set_rationale(value: Element): Self = StObject.set(x, "_rationale", value.asInstanceOf[js.Any])
    
    inline def set_rationaleUndefined: Self = StObject.set(x, "_rationale", js.undefined)
    
    inline def set_relativeRisk(value: Element): Self = StObject.set(x, "_relativeRisk", value.asInstanceOf[js.Any])
    
    inline def set_relativeRiskUndefined: Self = StObject.set(x, "_relativeRisk", js.undefined)
  }
}

package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskAssessmentPrediction
  extends StObject
     with BackboneElement {
  
  var _rationale: js.UndefOr[Element] = js.undefined
  
  /**
    * One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If range is used, it represents the lower and upper bounds of certainty; e.g. 40-60%  Decimal values are expressed as percentages as well (max = 100).
    */
  var probabilityDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * If range is used, it represents the lower and upper bounds of certainty; e.g. 40-60%  Decimal values are expressed as percentages as well (max = 100).
    */
  var probabilityRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Indicates how likely the outcome is (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, or high).
    */
  var qualitativeRisk: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional information explaining the basis for the prediction.
    */
  var rationale: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the risk for this particular subject (with their specific characteristics) divided by the risk of the population in general.  (Numbers greater than 1 = higher risk than the population, numbers less than 1 = lower risk.).
    */
  var relativeRisk: js.UndefOr[Double] = js.undefined
  
  /**
    * If not specified, the risk applies "over the subject's lifespan".
    */
  var whenPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * If not specified, the risk applies "over the subject's lifespan".
    */
  var whenRange: js.UndefOr[Range] = js.undefined
}
object RiskAssessmentPrediction {
  
  inline def apply(): RiskAssessmentPrediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskAssessmentPrediction]
  }
  
  extension [Self <: RiskAssessmentPrediction](x: Self) {
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setProbabilityDecimal(value: Double): Self = StObject.set(x, "probabilityDecimal", value.asInstanceOf[js.Any])
    
    inline def setProbabilityDecimalUndefined: Self = StObject.set(x, "probabilityDecimal", js.undefined)
    
    inline def setProbabilityRange(value: Range): Self = StObject.set(x, "probabilityRange", value.asInstanceOf[js.Any])
    
    inline def setProbabilityRangeUndefined: Self = StObject.set(x, "probabilityRange", js.undefined)
    
    inline def setQualitativeRisk(value: CodeableConcept): Self = StObject.set(x, "qualitativeRisk", value.asInstanceOf[js.Any])
    
    inline def setQualitativeRiskUndefined: Self = StObject.set(x, "qualitativeRisk", js.undefined)
    
    inline def setRationale(value: String): Self = StObject.set(x, "rationale", value.asInstanceOf[js.Any])
    
    inline def setRationaleUndefined: Self = StObject.set(x, "rationale", js.undefined)
    
    inline def setRelativeRisk(value: Double): Self = StObject.set(x, "relativeRisk", value.asInstanceOf[js.Any])
    
    inline def setRelativeRiskUndefined: Self = StObject.set(x, "relativeRisk", js.undefined)
    
    inline def setWhenPeriod(value: Period): Self = StObject.set(x, "whenPeriod", value.asInstanceOf[js.Any])
    
    inline def setWhenPeriodUndefined: Self = StObject.set(x, "whenPeriod", js.undefined)
    
    inline def setWhenRange(value: Range): Self = StObject.set(x, "whenRange", value.asInstanceOf[js.Any])
    
    inline def setWhenRangeUndefined: Self = StObject.set(x, "whenRange", js.undefined)
    
    inline def set_rationale(value: Element): Self = StObject.set(x, "_rationale", value.asInstanceOf[js.Any])
    
    inline def set_rationaleUndefined: Self = StObject.set(x, "_rationale", js.undefined)
  }
}

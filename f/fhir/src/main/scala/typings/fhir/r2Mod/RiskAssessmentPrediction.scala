package typings.fhir.r2Mod

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
  var outcome: CodeableConcept
  
  /**
    * How likely is the outcome (in the specified timeframe).
    */
  var probabilityCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * How likely is the outcome (in the specified timeframe).
    */
  var probabilityDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * How likely is the outcome (in the specified timeframe).
    */
  var probabilityRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Additional information explaining the basis for the prediction.
    */
  var rationale: js.UndefOr[String] = js.undefined
  
  /**
    * Absolute risk is less meaningful than relative risk.
    */
  var relativeRisk: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the period of time or age range of the subject to which the specified probability applies.
    */
  var whenPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates the period of time or age range of the subject to which the specified probability applies.
    */
  var whenRange: js.UndefOr[Range] = js.undefined
}
object RiskAssessmentPrediction {
  
  inline def apply(outcome: CodeableConcept): RiskAssessmentPrediction = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessmentPrediction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskAssessmentPrediction] (val x: Self) extends AnyVal {
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setProbabilityCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "probabilityCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setProbabilityCodeableConceptUndefined: Self = StObject.set(x, "probabilityCodeableConcept", js.undefined)
    
    inline def setProbabilityDecimal(value: Double): Self = StObject.set(x, "probabilityDecimal", value.asInstanceOf[js.Any])
    
    inline def setProbabilityDecimalUndefined: Self = StObject.set(x, "probabilityDecimal", js.undefined)
    
    inline def setProbabilityRange(value: Range): Self = StObject.set(x, "probabilityRange", value.asInstanceOf[js.Any])
    
    inline def setProbabilityRangeUndefined: Self = StObject.set(x, "probabilityRange", js.undefined)
    
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

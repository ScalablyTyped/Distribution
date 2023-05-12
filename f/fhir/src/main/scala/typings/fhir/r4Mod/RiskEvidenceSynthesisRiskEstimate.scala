package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskEvidenceSynthesisRiskEstimate
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * The sample size for the group that was measured for this risk estimate.
    */
  var denominatorCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Human-readable summary of risk estimate.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The number of group members with the outcome of interest.
    */
  var numeratorCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A description of the precision of the estimate for the effect.
    */
  var precisionEstimate: js.UndefOr[js.Array[RiskEvidenceSynthesisRiskEstimatePrecisionEstimate]] = js.undefined
  
  /**
    * Examples include proportion and mean.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specifies the UCUM unit for the outcome.
    */
  var unitOfMeasure: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The point estimate of the risk estimate.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object RiskEvidenceSynthesisRiskEstimate {
  
  inline def apply(): RiskEvidenceSynthesisRiskEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskEvidenceSynthesisRiskEstimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskEvidenceSynthesisRiskEstimate] (val x: Self) extends AnyVal {
    
    inline def setDenominatorCount(value: Double): Self = StObject.set(x, "denominatorCount", value.asInstanceOf[js.Any])
    
    inline def setDenominatorCountUndefined: Self = StObject.set(x, "denominatorCount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNumeratorCount(value: Double): Self = StObject.set(x, "numeratorCount", value.asInstanceOf[js.Any])
    
    inline def setNumeratorCountUndefined: Self = StObject.set(x, "numeratorCount", js.undefined)
    
    inline def setPrecisionEstimate(value: js.Array[RiskEvidenceSynthesisRiskEstimatePrecisionEstimate]): Self = StObject.set(x, "precisionEstimate", value.asInstanceOf[js.Any])
    
    inline def setPrecisionEstimateUndefined: Self = StObject.set(x, "precisionEstimate", js.undefined)
    
    inline def setPrecisionEstimateVarargs(value: RiskEvidenceSynthesisRiskEstimatePrecisionEstimate*): Self = StObject.set(x, "precisionEstimate", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnitOfMeasure(value: CodeableConcept): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasureUndefined: Self = StObject.set(x, "unitOfMeasure", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}

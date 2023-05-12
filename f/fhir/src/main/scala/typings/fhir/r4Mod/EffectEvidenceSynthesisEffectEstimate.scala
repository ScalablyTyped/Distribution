package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectEvidenceSynthesisEffectEstimate
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Human-readable summary of effect estimate.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the precision of the estimate for the effect.
    */
  var precisionEstimate: js.UndefOr[js.Array[EffectEvidenceSynthesisEffectEstimatePrecisionEstimate]] = js.undefined
  
  /**
    * Examples include relative risk and mean difference.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specifies the UCUM unit for the outcome.
    */
  var unitOfMeasure: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The point estimate of the effect estimate.
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to define variant exposure states such as low-risk state.
    */
  var variantState: js.UndefOr[CodeableConcept] = js.undefined
}
object EffectEvidenceSynthesisEffectEstimate {
  
  inline def apply(): EffectEvidenceSynthesisEffectEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectEvidenceSynthesisEffectEstimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectEvidenceSynthesisEffectEstimate] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPrecisionEstimate(value: js.Array[EffectEvidenceSynthesisEffectEstimatePrecisionEstimate]): Self = StObject.set(x, "precisionEstimate", value.asInstanceOf[js.Any])
    
    inline def setPrecisionEstimateUndefined: Self = StObject.set(x, "precisionEstimate", js.undefined)
    
    inline def setPrecisionEstimateVarargs(value: EffectEvidenceSynthesisEffectEstimatePrecisionEstimate*): Self = StObject.set(x, "precisionEstimate", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnitOfMeasure(value: CodeableConcept): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasureUndefined: Self = StObject.set(x, "unitOfMeasure", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariantState(value: CodeableConcept): Self = StObject.set(x, "variantState", value.asInstanceOf[js.Any])
    
    inline def setVariantStateUndefined: Self = StObject.set(x, "variantState", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}

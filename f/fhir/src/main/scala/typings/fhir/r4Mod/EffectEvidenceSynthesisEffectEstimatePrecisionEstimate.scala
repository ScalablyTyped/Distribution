package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectEvidenceSynthesisEffectEstimatePrecisionEstimate
  extends StObject
     with BackboneElement {
  
  /**
    * Lower bound of confidence interval.
    */
  var from: js.UndefOr[Double] = js.undefined
  
  /**
    * Use 95 for a 95% confidence interval.
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * Upper bound of confidence interval.
    */
  var to: js.UndefOr[Double] = js.undefined
  
  /**
    * Examples include confidence interval and interquartile range.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object EffectEvidenceSynthesisEffectEstimatePrecisionEstimate {
  
  inline def apply(): EffectEvidenceSynthesisEffectEstimatePrecisionEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectEvidenceSynthesisEffectEstimatePrecisionEstimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EffectEvidenceSynthesisEffectEstimatePrecisionEstimate] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

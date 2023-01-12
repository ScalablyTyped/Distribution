package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alpha extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var confidence: js.UndefOr[Double] = js.undefined
  
  var powerParameter: js.UndefOr[Double] = js.undefined
}
object Alpha {
  
  inline def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setPowerParameter(value: Double): Self = StObject.set(x, "powerParameter", value.asInstanceOf[js.Any])
    
    inline def setPowerParameterUndefined: Self = StObject.set(x, "powerParameter", js.undefined)
  }
}

package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdPosition extends StObject {
  
  var adPosition: js.UndefOr[String] = js.undefined
  
  var frequency: js.UndefOr[Double] = js.undefined
  
  var minimumWordCount: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AdPosition {
  
  inline def apply(): AdPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdPosition]
  }
  
  extension [Self <: AdPosition](x: Self) {
    
    inline def setAdPosition(value: String): Self = StObject.set(x, "adPosition", value.asInstanceOf[js.Any])
    
    inline def setAdPositionUndefined: Self = StObject.set(x, "adPosition", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setMinimumWordCount(value: Double): Self = StObject.set(x, "minimumWordCount", value.asInstanceOf[js.Any])
    
    inline def setMinimumWordCountUndefined: Self = StObject.set(x, "minimumWordCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

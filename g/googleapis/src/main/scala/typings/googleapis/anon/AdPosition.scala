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
  
  @scala.inline
  def apply(): AdPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdPosition]
  }
  
  @scala.inline
  implicit class AdPositionMutableBuilder[Self <: AdPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdPosition(value: String): Self = StObject.set(x, "adPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdPositionUndefined: Self = StObject.set(x, "adPosition", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setMinimumWordCount(value: Double): Self = StObject.set(x, "minimumWordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumWordCountUndefined: Self = StObject.set(x, "minimumWordCount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var imageURL: String
  
  var numberOfFrame: js.UndefOr[Double] = js.undefined
  
  var offsetx: js.UndefOr[Double] = js.undefined
  
  var offsety: js.UndefOr[Double] = js.undefined
  
  var rate: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
}
object AnimationOptions {
  
  inline def apply(imageURL: String): AnimationOptions = {
    val __obj = js.Dynamic.literal(imageURL = imageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
  
  extension [Self <: AnimationOptions](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFrame(value: Double): Self = StObject.set(x, "numberOfFrame", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFrameUndefined: Self = StObject.set(x, "numberOfFrame", js.undefined)
    
    inline def setOffsetx(value: Double): Self = StObject.set(x, "offsetx", value.asInstanceOf[js.Any])
    
    inline def setOffsetxUndefined: Self = StObject.set(x, "offsetx", js.undefined)
    
    inline def setOffsety(value: Double): Self = StObject.set(x, "offsety", value.asInstanceOf[js.Any])
    
    inline def setOffsetyUndefined: Self = StObject.set(x, "offsety", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends StObject {
  
  var delta: js.UndefOr[Double] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var imageURL: String = js.native
  
  var numberOfFrame: js.UndefOr[Double] = js.native
  
  var offsetx: js.UndefOr[Double] = js.native
  
  var offsety: js.UndefOr[Double] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[Double] = js.native
}
object AnimationOptions {
  
  @scala.inline
  def apply(imageURL: String): AnimationOptions = {
    val __obj = js.Dynamic.literal(imageURL = imageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
  
  @scala.inline
  implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfFrame(value: Double): Self = StObject.set(x, "numberOfFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfFrameUndefined: Self = StObject.set(x, "numberOfFrame", js.undefined)
    
    @scala.inline
    def setOffsetx(value: Double): Self = StObject.set(x, "offsetx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetxUndefined: Self = StObject.set(x, "offsetx", js.undefined)
    
    @scala.inline
    def setOffsety(value: Double): Self = StObject.set(x, "offsety", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetyUndefined: Self = StObject.set(x, "offsety", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

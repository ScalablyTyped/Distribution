package typings.flipsnap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlipsnapOptions extends StObject {
  
  /**
    * When support 3D transform browser and this option set true, it is not used 3D transform and use 2D transform. You should set true, when it is a device which has a bug in 3D transform(old Android or BlackBerry etc). default is false.
    */
  var disable3d: js.UndefOr[Boolean] = js.native
  
  /**
    * When set true, touch event is disabled. Only handling button or etc interface. default is false.
    */
  var disableTouch: js.UndefOr[Boolean] = js.native
  
  /**
    * Move distance. default is auto calculate from element width and maxPont.
    */
  var distance: js.UndefOr[Double] = js.native
  
  /**
    * Stop point count. default is auto calculate from element item count.
    */
  var maxPoint: js.UndefOr[Double] = js.native
  
  /**
    * Transition duration (millisecond). default is 350.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}
object FlipsnapOptions {
  
  @scala.inline
  def apply(): FlipsnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipsnapOptions]
  }
  
  @scala.inline
  implicit class FlipsnapOptionsMutableBuilder[Self <: FlipsnapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable3d(value: Boolean): Self = StObject.set(x, "disable3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable3dUndefined: Self = StObject.set(x, "disable3d", js.undefined)
    
    @scala.inline
    def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setMaxPoint(value: Double): Self = StObject.set(x, "maxPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointUndefined: Self = StObject.set(x, "maxPoint", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
  }
}

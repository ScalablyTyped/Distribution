package typings.flipsnap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlipsnapOptions extends StObject {
  
  /**
    * When support 3D transform browser and this option set true, it is not used 3D transform and use 2D transform. You should set true, when it is a device which has a bug in 3D transform(old Android or BlackBerry etc). default is false.
    */
  var disable3d: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set true, touch event is disabled. Only handling button or etc interface. default is false.
    */
  var disableTouch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Move distance. default is auto calculate from element width and maxPont.
    */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
    * Stop point count. default is auto calculate from element item count.
    */
  var maxPoint: js.UndefOr[Double] = js.undefined
  
  /**
    * Transition duration (millisecond). default is 350.
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
}
object FlipsnapOptions {
  
  inline def apply(): FlipsnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipsnapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlipsnapOptions] (val x: Self) extends AnyVal {
    
    inline def setDisable3d(value: Boolean): Self = StObject.set(x, "disable3d", value.asInstanceOf[js.Any])
    
    inline def setDisable3dUndefined: Self = StObject.set(x, "disable3d", js.undefined)
    
    inline def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setMaxPoint(value: Double): Self = StObject.set(x, "maxPoint", value.asInstanceOf[js.Any])
    
    inline def setMaxPointUndefined: Self = StObject.set(x, "maxPoint", js.undefined)
    
    inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
  }
}

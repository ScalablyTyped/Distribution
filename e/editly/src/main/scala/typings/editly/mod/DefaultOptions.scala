package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOptions extends StObject {
  
  /**
  		 * Set default clip duration for clips that don't have an own duration (in seconds).
  		 *
  		 * @default 4
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An object describing the default layer options.
  		 */
  var layer: js.UndefOr[DefaultLayerOptions] = js.undefined
  
  /**
  		 * Defaults for each individual layer types.
  		 */
  var layerType: js.UndefOr[DefaultLayerTypeOptions] = js.undefined
  
  /**
  		 * An object describing the default transition.
  		 * Set to `null` to disable transitions.
  		 */
  var transition: js.UndefOr[DefaultTransitionOptions | Null] = js.undefined
}
object DefaultOptions {
  
  inline def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  
  extension [Self <: DefaultOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLayer(value: DefaultLayerOptions): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerType(value: DefaultLayerTypeOptions): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    
    inline def setLayerTypeUndefined: Self = StObject.set(x, "layerType", js.undefined)
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setTransition(value: DefaultTransitionOptions): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionNull: Self = StObject.set(x, "transition", null)
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}

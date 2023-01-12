package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clip extends StObject {
  
  /**
  		 * Clip duration.
  		 * If unset, the clip duration will be that of the first video layer.
  		 * Defaults to `defaults.duration`.
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
  		 * List of layers within the current clip that will be overlaid in their natural order (final layer on top).
  		 */
  var layers: js.Array[Layer] | Layer
  
  /**
  		 * Specify transition at the end of this clip.
  		 * Defaults to `defaults.transition`.
  		 * Set to `null` to disable transitions.
  		 */
  var transition: js.UndefOr[Transition | Null] = js.undefined
}
object Clip {
  
  inline def apply(layers: js.Array[Layer] | Layer): Clip = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clip] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLayers(value: js.Array[Layer] | Layer): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionNull: Self = StObject.set(x, "transition", null)
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}

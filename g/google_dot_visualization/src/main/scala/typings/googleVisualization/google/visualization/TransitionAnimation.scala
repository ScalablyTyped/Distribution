package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionAnimation extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  // linear, in, out, inAndOut
  var startup: js.UndefOr[Boolean] = js.undefined
}
object TransitionAnimation {
  
  inline def apply(): TransitionAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionAnimation] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setStartup(value: Boolean): Self = StObject.set(x, "startup", value.asInstanceOf[js.Any])
    
    inline def setStartupUndefined: Self = StObject.set(x, "startup", js.undefined)
  }
}

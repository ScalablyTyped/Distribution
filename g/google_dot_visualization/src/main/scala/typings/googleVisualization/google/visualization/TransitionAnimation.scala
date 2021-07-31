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
  
  @scala.inline
  def apply(): TransitionAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionAnimation]
  }
  
  @scala.inline
  implicit class TransitionAnimationMutableBuilder[Self <: TransitionAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setStartup(value: Boolean): Self = StObject.set(x, "startup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartupUndefined: Self = StObject.set(x, "startup", js.undefined)
  }
}

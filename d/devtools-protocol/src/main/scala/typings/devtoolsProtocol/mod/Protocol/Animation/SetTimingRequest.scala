package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTimingRequest extends StObject {
  
  /**
    * Animation id.
    */
  var animationId: String
  
  /**
    * Delay of the animation.
    */
  var delay: Double
  
  /**
    * Duration of the animation.
    */
  var duration: Double
}
object SetTimingRequest {
  
  inline def apply(animationId: String, delay: Double, duration: Double): SetTimingRequest = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTimingRequest] (val x: Self) extends AnyVal {
    
    inline def setAnimationId(value: String): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}

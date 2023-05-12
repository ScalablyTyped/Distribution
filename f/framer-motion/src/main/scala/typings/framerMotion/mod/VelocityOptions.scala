package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VelocityOptions extends StObject {
  
  var restDelta: js.UndefOr[Double] = js.undefined
  
  var restSpeed: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[Double] = js.undefined
}
object VelocityOptions {
  
  inline def apply(): VelocityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VelocityOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VelocityOptions] (val x: Self) extends AnyVal {
    
    inline def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
    
    inline def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
    
    inline def setRestSpeed(value: Double): Self = StObject.set(x, "restSpeed", value.asInstanceOf[js.Any])
    
    inline def setRestSpeedUndefined: Self = StObject.set(x, "restSpeed", js.undefined)
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}

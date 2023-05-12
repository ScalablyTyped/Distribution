package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecayOptions
  extends StObject
     with VelocityOptions {
  
  var keyframes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var modifyTarget: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
  
  var power: js.UndefOr[Double] = js.undefined
  
  var timeConstant: js.UndefOr[Double] = js.undefined
}
object DecayOptions {
  
  inline def apply(): DecayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecayOptions] (val x: Self) extends AnyVal {
    
    inline def setKeyframes(value: js.Array[Double]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
    
    inline def setKeyframesVarargs(value: Double*): Self = StObject.set(x, "keyframes", js.Array(value*))
    
    inline def setModifyTarget(value: /* v */ Double => Double): Self = StObject.set(x, "modifyTarget", js.Any.fromFunction1(value))
    
    inline def setModifyTargetUndefined: Self = StObject.set(x, "modifyTarget", js.undefined)
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setTimeConstant(value: Double): Self = StObject.set(x, "timeConstant", value.asInstanceOf[js.Any])
    
    inline def setTimeConstantUndefined: Self = StObject.set(x, "timeConstant", js.undefined)
  }
}

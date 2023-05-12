package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
/* Inlined std.Partial<std.Omit<framer-motion.framer-motion/dist/three-entry.Inertia, 'velocity' | 'type'>> */
trait InertiaOptions extends StObject {
  
  var bounceDamping: js.UndefOr[Double] = js.undefined
  
  var bounceStiffness: js.UndefOr[Double] = js.undefined
  
  var from: js.UndefOr[Double | String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var modifyTarget: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
  
  var power: js.UndefOr[Double] = js.undefined
  
  var restDelta: js.UndefOr[Double] = js.undefined
  
  var timeConstant: js.UndefOr[Double] = js.undefined
}
object InertiaOptions {
  
  inline def apply(): InertiaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InertiaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InertiaOptions] (val x: Self) extends AnyVal {
    
    inline def setBounceDamping(value: Double): Self = StObject.set(x, "bounceDamping", value.asInstanceOf[js.Any])
    
    inline def setBounceDampingUndefined: Self = StObject.set(x, "bounceDamping", js.undefined)
    
    inline def setBounceStiffness(value: Double): Self = StObject.set(x, "bounceStiffness", value.asInstanceOf[js.Any])
    
    inline def setBounceStiffnessUndefined: Self = StObject.set(x, "bounceStiffness", js.undefined)
    
    inline def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setModifyTarget(value: /* v */ Double => Double): Self = StObject.set(x, "modifyTarget", js.Any.fromFunction1(value))
    
    inline def setModifyTargetUndefined: Self = StObject.set(x, "modifyTarget", js.undefined)
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setRestDelta(value: Double): Self = StObject.set(x, "restDelta", value.asInstanceOf[js.Any])
    
    inline def setRestDeltaUndefined: Self = StObject.set(x, "restDelta", js.undefined)
    
    inline def setTimeConstant(value: Double): Self = StObject.set(x, "timeConstant", value.asInstanceOf[js.Any])
    
    inline def setTimeConstantUndefined: Self = StObject.set(x, "timeConstant", js.undefined)
  }
}

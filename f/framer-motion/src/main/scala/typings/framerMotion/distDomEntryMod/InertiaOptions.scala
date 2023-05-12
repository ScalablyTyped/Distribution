package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InertiaOptions
  extends StObject
     with DecayOptions {
  
  var bounceDamping: js.UndefOr[Double] = js.undefined
  
  var bounceStiffness: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
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
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}

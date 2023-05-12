package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseAcceleration extends StObject {
  
  var minutesExpiration: js.UndefOr[Double] = js.undefined
  
  var useAcceleration: js.UndefOr[Boolean] = js.undefined
}
object UseAcceleration {
  
  inline def apply(): UseAcceleration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseAcceleration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseAcceleration] (val x: Self) extends AnyVal {
    
    inline def setMinutesExpiration(value: Double): Self = StObject.set(x, "minutesExpiration", value.asInstanceOf[js.Any])
    
    inline def setMinutesExpirationUndefined: Self = StObject.set(x, "minutesExpiration", js.undefined)
    
    inline def setUseAcceleration(value: Boolean): Self = StObject.set(x, "useAcceleration", value.asInstanceOf[js.Any])
    
    inline def setUseAccelerationUndefined: Self = StObject.set(x, "useAcceleration", js.undefined)
  }
}

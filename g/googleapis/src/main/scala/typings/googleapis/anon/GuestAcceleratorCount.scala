package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuestAcceleratorCount extends StObject {
  
  var guestAcceleratorCount: js.UndefOr[Double] = js.undefined
  
  var guestAcceleratorType: js.UndefOr[String] = js.undefined
}
object GuestAcceleratorCount {
  
  inline def apply(): GuestAcceleratorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestAcceleratorCount]
  }
  
  extension [Self <: GuestAcceleratorCount](x: Self) {
    
    inline def setGuestAcceleratorCount(value: Double): Self = StObject.set(x, "guestAcceleratorCount", value.asInstanceOf[js.Any])
    
    inline def setGuestAcceleratorCountUndefined: Self = StObject.set(x, "guestAcceleratorCount", js.undefined)
    
    inline def setGuestAcceleratorType(value: String): Self = StObject.set(x, "guestAcceleratorType", value.asInstanceOf[js.Any])
    
    inline def setGuestAcceleratorTypeUndefined: Self = StObject.set(x, "guestAcceleratorType", js.undefined)
  }
}

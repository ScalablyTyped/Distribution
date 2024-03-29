package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockedTime extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var lockedTime: js.UndefOr[String] = js.undefined
}
object LockedTime {
  
  inline def apply(): LockedTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockedTime]
  }
  
  extension [Self <: LockedTime](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLockedTime(value: String): Self = StObject.set(x, "lockedTime", value.asInstanceOf[js.Any])
    
    inline def setLockedTimeUndefined: Self = StObject.set(x, "lockedTime", js.undefined)
  }
}

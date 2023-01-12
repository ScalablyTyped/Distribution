package typings.domScreenWakeLock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val wakeLock: WakeLock
}
object Navigator {
  
  inline def apply(wakeLock: WakeLock): Navigator = {
    val __obj = js.Dynamic.literal(wakeLock = wakeLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setWakeLock(value: WakeLock): Self = StObject.set(x, "wakeLock", value.asInstanceOf[js.Any])
  }
}

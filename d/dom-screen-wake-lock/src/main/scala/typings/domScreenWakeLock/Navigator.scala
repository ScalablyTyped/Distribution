package typings.domScreenWakeLock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  val wakeLock: WakeLock = js.native
}
object Navigator {
  
  @scala.inline
  def apply(wakeLock: WakeLock): Navigator = {
    val __obj = js.Dynamic.literal(wakeLock = wakeLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWakeLock(value: WakeLock): Self = StObject.set(x, "wakeLock", value.asInstanceOf[js.Any])
  }
}

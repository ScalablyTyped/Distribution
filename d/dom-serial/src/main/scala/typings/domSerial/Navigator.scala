package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  val serial: Serial = js.native
}
object Navigator {
  
  @scala.inline
  def apply(serial: Serial): Navigator = {
    val __obj = js.Dynamic.literal(serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerial(value: Serial): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}

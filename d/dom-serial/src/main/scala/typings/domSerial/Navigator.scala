package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val serial: Serial
}
object Navigator {
  
  inline def apply(serial: Serial): Navigator = {
    val __obj = js.Dynamic.literal(serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setSerial(value: Serial): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}

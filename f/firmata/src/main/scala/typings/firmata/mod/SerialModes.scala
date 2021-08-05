package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialModes extends StObject {
  
  var CONTINUOUS_READ: SERIAL_MODE
  
  var STOP_READING: SERIAL_MODE
}
object SerialModes {
  
  inline def apply(CONTINUOUS_READ: SERIAL_MODE, STOP_READING: SERIAL_MODE): SerialModes = {
    val __obj = js.Dynamic.literal(CONTINUOUS_READ = CONTINUOUS_READ.asInstanceOf[js.Any], STOP_READING = STOP_READING.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialModes]
  }
  
  extension [Self <: SerialModes](x: Self) {
    
    inline def setCONTINUOUS_READ(value: SERIAL_MODE): Self = StObject.set(x, "CONTINUOUS_READ", value.asInstanceOf[js.Any])
    
    inline def setSTOP_READING(value: SERIAL_MODE): Self = StObject.set(x, "STOP_READING", value.asInstanceOf[js.Any])
  }
}

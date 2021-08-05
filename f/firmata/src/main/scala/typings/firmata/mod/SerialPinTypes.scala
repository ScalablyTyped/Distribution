package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPinTypes extends StObject {
  
  var RES_RX0: SERIAL_PIN_TYPE
  
  var RES_RX1: SERIAL_PIN_TYPE
  
  var RES_RX2: SERIAL_PIN_TYPE
  
  var RES_RX3: SERIAL_PIN_TYPE
  
  var RES_TX0: SERIAL_PIN_TYPE
  
  var RES_TX1: SERIAL_PIN_TYPE
  
  var RES_TX2: SERIAL_PIN_TYPE
  
  var RES_TX3: SERIAL_PIN_TYPE
}
object SerialPinTypes {
  
  inline def apply(
    RES_RX0: SERIAL_PIN_TYPE,
    RES_RX1: SERIAL_PIN_TYPE,
    RES_RX2: SERIAL_PIN_TYPE,
    RES_RX3: SERIAL_PIN_TYPE,
    RES_TX0: SERIAL_PIN_TYPE,
    RES_TX1: SERIAL_PIN_TYPE,
    RES_TX2: SERIAL_PIN_TYPE,
    RES_TX3: SERIAL_PIN_TYPE
  ): SerialPinTypes = {
    val __obj = js.Dynamic.literal(RES_RX0 = RES_RX0.asInstanceOf[js.Any], RES_RX1 = RES_RX1.asInstanceOf[js.Any], RES_RX2 = RES_RX2.asInstanceOf[js.Any], RES_RX3 = RES_RX3.asInstanceOf[js.Any], RES_TX0 = RES_TX0.asInstanceOf[js.Any], RES_TX1 = RES_TX1.asInstanceOf[js.Any], RES_TX2 = RES_TX2.asInstanceOf[js.Any], RES_TX3 = RES_TX3.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPinTypes]
  }
  
  extension [Self <: SerialPinTypes](x: Self) {
    
    inline def setRES_RX0(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_RX0", value.asInstanceOf[js.Any])
    
    inline def setRES_RX1(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_RX1", value.asInstanceOf[js.Any])
    
    inline def setRES_RX2(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_RX2", value.asInstanceOf[js.Any])
    
    inline def setRES_RX3(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_RX3", value.asInstanceOf[js.Any])
    
    inline def setRES_TX0(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_TX0", value.asInstanceOf[js.Any])
    
    inline def setRES_TX1(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_TX1", value.asInstanceOf[js.Any])
    
    inline def setRES_TX2(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_TX2", value.asInstanceOf[js.Any])
    
    inline def setRES_TX3(value: SERIAL_PIN_TYPE): Self = StObject.set(x, "RES_TX3", value.asInstanceOf[js.Any])
  }
}

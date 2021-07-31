package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPortIds extends StObject {
  
  var DEFAULT: SERIAL_PORT_ID
  
  var HW_SERIAL0: SERIAL_PORT_ID
  
  var HW_SERIAL1: SERIAL_PORT_ID
  
  var HW_SERIAL2: SERIAL_PORT_ID
  
  var HW_SERIAL3: SERIAL_PORT_ID
  
  var SW_SERIAL0: SERIAL_PORT_ID
  
  var SW_SERIAL1: SERIAL_PORT_ID
  
  var SW_SERIAL2: SERIAL_PORT_ID
  
  var SW_SERIAL3: SERIAL_PORT_ID
}
object SerialPortIds {
  
  @scala.inline
  def apply(
    DEFAULT: SERIAL_PORT_ID,
    HW_SERIAL0: SERIAL_PORT_ID,
    HW_SERIAL1: SERIAL_PORT_ID,
    HW_SERIAL2: SERIAL_PORT_ID,
    HW_SERIAL3: SERIAL_PORT_ID,
    SW_SERIAL0: SERIAL_PORT_ID,
    SW_SERIAL1: SERIAL_PORT_ID,
    SW_SERIAL2: SERIAL_PORT_ID,
    SW_SERIAL3: SERIAL_PORT_ID
  ): SerialPortIds = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], HW_SERIAL0 = HW_SERIAL0.asInstanceOf[js.Any], HW_SERIAL1 = HW_SERIAL1.asInstanceOf[js.Any], HW_SERIAL2 = HW_SERIAL2.asInstanceOf[js.Any], HW_SERIAL3 = HW_SERIAL3.asInstanceOf[js.Any], SW_SERIAL0 = SW_SERIAL0.asInstanceOf[js.Any], SW_SERIAL1 = SW_SERIAL1.asInstanceOf[js.Any], SW_SERIAL2 = SW_SERIAL2.asInstanceOf[js.Any], SW_SERIAL3 = SW_SERIAL3.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortIds]
  }
  
  @scala.inline
  implicit class SerialPortIdsMutableBuilder[Self <: SerialPortIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEFAULT(value: SERIAL_PORT_ID): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHW_SERIAL0(value: SERIAL_PORT_ID): Self = StObject.set(x, "HW_SERIAL0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHW_SERIAL1(value: SERIAL_PORT_ID): Self = StObject.set(x, "HW_SERIAL1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHW_SERIAL2(value: SERIAL_PORT_ID): Self = StObject.set(x, "HW_SERIAL2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHW_SERIAL3(value: SERIAL_PORT_ID): Self = StObject.set(x, "HW_SERIAL3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSW_SERIAL0(value: SERIAL_PORT_ID): Self = StObject.set(x, "SW_SERIAL0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSW_SERIAL1(value: SERIAL_PORT_ID): Self = StObject.set(x, "SW_SERIAL1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSW_SERIAL2(value: SERIAL_PORT_ID): Self = StObject.set(x, "SW_SERIAL2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSW_SERIAL3(value: SERIAL_PORT_ID): Self = StObject.set(x, "SW_SERIAL3", value.asInstanceOf[js.Any])
  }
}

package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinModes extends StObject {
  
  var ANALOG: PIN_MODE
  
  var I2C: PIN_MODE
  
  var IGNORE: PIN_MODE
  
  var INPUT: PIN_MODE
  
  var ONEWIRE: PIN_MODE
  
  var OUTPUT: PIN_MODE
  
  var PING_READ: PIN_MODE
  
  var PULLUP: PIN_MODE
  
  var PWM: PIN_MODE
  
  var SERIAL: PIN_MODE
  
  var SERVO: PIN_MODE
  
  var SHIFT: PIN_MODE
  
  var STEPPER: PIN_MODE
  
  var UNKOWN: PIN_MODE
}
object PinModes {
  
  inline def apply(
    ANALOG: PIN_MODE,
    I2C: PIN_MODE,
    IGNORE: PIN_MODE,
    INPUT: PIN_MODE,
    ONEWIRE: PIN_MODE,
    OUTPUT: PIN_MODE,
    PING_READ: PIN_MODE,
    PULLUP: PIN_MODE,
    PWM: PIN_MODE,
    SERIAL: PIN_MODE,
    SERVO: PIN_MODE,
    SHIFT: PIN_MODE,
    STEPPER: PIN_MODE,
    UNKOWN: PIN_MODE
  ): PinModes = {
    val __obj = js.Dynamic.literal(ANALOG = ANALOG.asInstanceOf[js.Any], I2C = I2C.asInstanceOf[js.Any], IGNORE = IGNORE.asInstanceOf[js.Any], INPUT = INPUT.asInstanceOf[js.Any], ONEWIRE = ONEWIRE.asInstanceOf[js.Any], OUTPUT = OUTPUT.asInstanceOf[js.Any], PING_READ = PING_READ.asInstanceOf[js.Any], PULLUP = PULLUP.asInstanceOf[js.Any], PWM = PWM.asInstanceOf[js.Any], SERIAL = SERIAL.asInstanceOf[js.Any], SERVO = SERVO.asInstanceOf[js.Any], SHIFT = SHIFT.asInstanceOf[js.Any], STEPPER = STEPPER.asInstanceOf[js.Any], UNKOWN = UNKOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinModes]
  }
  
  extension [Self <: PinModes](x: Self) {
    
    inline def setANALOG(value: PIN_MODE): Self = StObject.set(x, "ANALOG", value.asInstanceOf[js.Any])
    
    inline def setI2C(value: PIN_MODE): Self = StObject.set(x, "I2C", value.asInstanceOf[js.Any])
    
    inline def setIGNORE(value: PIN_MODE): Self = StObject.set(x, "IGNORE", value.asInstanceOf[js.Any])
    
    inline def setINPUT(value: PIN_MODE): Self = StObject.set(x, "INPUT", value.asInstanceOf[js.Any])
    
    inline def setONEWIRE(value: PIN_MODE): Self = StObject.set(x, "ONEWIRE", value.asInstanceOf[js.Any])
    
    inline def setOUTPUT(value: PIN_MODE): Self = StObject.set(x, "OUTPUT", value.asInstanceOf[js.Any])
    
    inline def setPING_READ(value: PIN_MODE): Self = StObject.set(x, "PING_READ", value.asInstanceOf[js.Any])
    
    inline def setPULLUP(value: PIN_MODE): Self = StObject.set(x, "PULLUP", value.asInstanceOf[js.Any])
    
    inline def setPWM(value: PIN_MODE): Self = StObject.set(x, "PWM", value.asInstanceOf[js.Any])
    
    inline def setSERIAL(value: PIN_MODE): Self = StObject.set(x, "SERIAL", value.asInstanceOf[js.Any])
    
    inline def setSERVO(value: PIN_MODE): Self = StObject.set(x, "SERVO", value.asInstanceOf[js.Any])
    
    inline def setSHIFT(value: PIN_MODE): Self = StObject.set(x, "SHIFT", value.asInstanceOf[js.Any])
    
    inline def setSTEPPER(value: PIN_MODE): Self = StObject.set(x, "STEPPER", value.asInstanceOf[js.Any])
    
    inline def setUNKOWN(value: PIN_MODE): Self = StObject.set(x, "UNKOWN", value.asInstanceOf[js.Any])
  }
}

package typings.firmata

import typings.firmata.mod.SERIAL_PORT_ID
import typings.firmata.mod.STEPPER_DIRECTION
import typings.firmata.mod.STEPPER_RUN_STATE
import typings.firmata.mod.STEPPER_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ACCEL extends StObject {
    
    var ACCEL: STEPPER_RUN_STATE
    
    var DECEL: STEPPER_RUN_STATE
    
    var RUN: STEPPER_RUN_STATE
    
    var STOP: STEPPER_RUN_STATE
  }
  object ACCEL {
    
    inline def apply(
      ACCEL: STEPPER_RUN_STATE,
      DECEL: STEPPER_RUN_STATE,
      RUN: STEPPER_RUN_STATE,
      STOP: STEPPER_RUN_STATE
    ): ACCEL = {
      val __obj = js.Dynamic.literal(ACCEL = ACCEL.asInstanceOf[js.Any], DECEL = DECEL.asInstanceOf[js.Any], RUN = RUN.asInstanceOf[js.Any], STOP = STOP.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACCEL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ACCEL] (val x: Self) extends AnyVal {
      
      inline def setACCEL(value: STEPPER_RUN_STATE): Self = StObject.set(x, "ACCEL", value.asInstanceOf[js.Any])
      
      inline def setDECEL(value: STEPPER_RUN_STATE): Self = StObject.set(x, "DECEL", value.asInstanceOf[js.Any])
      
      inline def setRUN(value: STEPPER_RUN_STATE): Self = StObject.set(x, "RUN", value.asInstanceOf[js.Any])
      
      inline def setSTOP(value: STEPPER_RUN_STATE): Self = StObject.set(x, "STOP", value.asInstanceOf[js.Any])
    }
  }
  
  trait Address extends StObject {
    
    var address: Double
    
    var bus: Double
  }
  object Address {
    
    inline def apply(address: Double, bus: Double): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bus = bus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBus(value: Double): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
    }
  }
  
  trait Baud extends StObject {
    
    var baud: Double
    
    var portId: SERIAL_PORT_ID
    
    var rxPin: js.UndefOr[Double] = js.undefined
    
    var txPin: js.UndefOr[Double] = js.undefined
  }
  object Baud {
    
    inline def apply(baud: Double, portId: SERIAL_PORT_ID): Baud = {
      val __obj = js.Dynamic.literal(baud = baud.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Baud]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Baud] (val x: Self) extends AnyVal {
      
      inline def setBaud(value: Double): Self = StObject.set(x, "baud", value.asInstanceOf[js.Any])
      
      inline def setPortId(value: SERIAL_PORT_ID): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
      
      inline def setRxPin(value: Double): Self = StObject.set(x, "rxPin", value.asInstanceOf[js.Any])
      
      inline def setRxPinUndefined: Self = StObject.set(x, "rxPin", js.undefined)
      
      inline def setTxPin(value: Double): Self = StObject.set(x, "txPin", value.asInstanceOf[js.Any])
      
      inline def setTxPinUndefined: Self = StObject.set(x, "txPin", js.undefined)
    }
  }
  
  trait BaudRate extends StObject {
    
    var baudRate: Double
    
    var bufferSize: Double
  }
  object BaudRate {
    
    inline def apply(baudRate: Double, bufferSize: Double): BaudRate = {
      val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaudRate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaudRate] (val x: Self) extends AnyVal {
      
      inline def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait CCW extends StObject {
    
    var CCW: STEPPER_DIRECTION
    
    var CW: STEPPER_DIRECTION
  }
  object CCW {
    
    inline def apply(CCW: STEPPER_DIRECTION, CW: STEPPER_DIRECTION): CCW = {
      val __obj = js.Dynamic.literal(CCW = CCW.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any])
      __obj.asInstanceOf[CCW]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CCW] (val x: Self) extends AnyVal {
      
      inline def setCCW(value: STEPPER_DIRECTION): Self = StObject.set(x, "CCW", value.asInstanceOf[js.Any])
      
      inline def setCW(value: STEPPER_DIRECTION): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
    }
  }
  
  trait DRIVER extends StObject {
    
    var DRIVER: STEPPER_TYPE
    
    var FOUR_WIRE: STEPPER_TYPE
    
    var TWO_WIRE: STEPPER_TYPE
  }
  object DRIVER {
    
    inline def apply(DRIVER: STEPPER_TYPE, FOUR_WIRE: STEPPER_TYPE, TWO_WIRE: STEPPER_TYPE): DRIVER = {
      val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], FOUR_WIRE = FOUR_WIRE.asInstanceOf[js.Any], TWO_WIRE = TWO_WIRE.asInstanceOf[js.Any])
      __obj.asInstanceOf[DRIVER]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DRIVER] (val x: Self) extends AnyVal {
      
      inline def setDRIVER(value: STEPPER_TYPE): Self = StObject.set(x, "DRIVER", value.asInstanceOf[js.Any])
      
      inline def setFOUR_WIRE(value: STEPPER_TYPE): Self = StObject.set(x, "FOUR_WIRE", value.asInstanceOf[js.Any])
      
      inline def setTWO_WIRE(value: STEPPER_TYPE): Self = StObject.set(x, "TWO_WIRE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay extends StObject {
    
    var delay: Double
  }
  object Delay {
    
    inline def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
}

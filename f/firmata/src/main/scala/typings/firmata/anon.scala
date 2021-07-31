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
    
    @scala.inline
    def apply(
      ACCEL: STEPPER_RUN_STATE,
      DECEL: STEPPER_RUN_STATE,
      RUN: STEPPER_RUN_STATE,
      STOP: STEPPER_RUN_STATE
    ): ACCEL = {
      val __obj = js.Dynamic.literal(ACCEL = ACCEL.asInstanceOf[js.Any], DECEL = DECEL.asInstanceOf[js.Any], RUN = RUN.asInstanceOf[js.Any], STOP = STOP.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACCEL]
    }
    
    @scala.inline
    implicit class ACCELMutableBuilder[Self <: ACCEL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACCEL(value: STEPPER_RUN_STATE): Self = StObject.set(x, "ACCEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDECEL(value: STEPPER_RUN_STATE): Self = StObject.set(x, "DECEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUN(value: STEPPER_RUN_STATE): Self = StObject.set(x, "RUN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTOP(value: STEPPER_RUN_STATE): Self = StObject.set(x, "STOP", value.asInstanceOf[js.Any])
    }
  }
  
  trait Address extends StObject {
    
    var address: Double
    
    var bus: Double
  }
  object Address {
    
    @scala.inline
    def apply(address: Double, bus: Double): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bus = bus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBus(value: Double): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
    }
  }
  
  trait Baud extends StObject {
    
    var baud: Double
    
    var portId: SERIAL_PORT_ID
    
    var rxPin: js.UndefOr[Double] = js.undefined
    
    var txPin: js.UndefOr[Double] = js.undefined
  }
  object Baud {
    
    @scala.inline
    def apply(baud: Double, portId: SERIAL_PORT_ID): Baud = {
      val __obj = js.Dynamic.literal(baud = baud.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Baud]
    }
    
    @scala.inline
    implicit class BaudMutableBuilder[Self <: Baud] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaud(value: Double): Self = StObject.set(x, "baud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortId(value: SERIAL_PORT_ID): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxPin(value: Double): Self = StObject.set(x, "rxPin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxPinUndefined: Self = StObject.set(x, "rxPin", js.undefined)
      
      @scala.inline
      def setTxPin(value: Double): Self = StObject.set(x, "txPin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxPinUndefined: Self = StObject.set(x, "txPin", js.undefined)
    }
  }
  
  trait BaudRate extends StObject {
    
    var baudRate: Double
    
    var bufferSize: Double
  }
  object BaudRate {
    
    @scala.inline
    def apply(baudRate: Double, bufferSize: Double): BaudRate = {
      val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaudRate]
    }
    
    @scala.inline
    implicit class BaudRateMutableBuilder[Self <: BaudRate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait CCW extends StObject {
    
    var CCW: STEPPER_DIRECTION
    
    var CW: STEPPER_DIRECTION
  }
  object CCW {
    
    @scala.inline
    def apply(CCW: STEPPER_DIRECTION, CW: STEPPER_DIRECTION): CCW = {
      val __obj = js.Dynamic.literal(CCW = CCW.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any])
      __obj.asInstanceOf[CCW]
    }
    
    @scala.inline
    implicit class CCWMutableBuilder[Self <: CCW] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCCW(value: STEPPER_DIRECTION): Self = StObject.set(x, "CCW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCW(value: STEPPER_DIRECTION): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
    }
  }
  
  trait DRIVER extends StObject {
    
    var DRIVER: STEPPER_TYPE
    
    var FOUR_WIRE: STEPPER_TYPE
    
    var TWO_WIRE: STEPPER_TYPE
  }
  object DRIVER {
    
    @scala.inline
    def apply(DRIVER: STEPPER_TYPE, FOUR_WIRE: STEPPER_TYPE, TWO_WIRE: STEPPER_TYPE): DRIVER = {
      val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], FOUR_WIRE = FOUR_WIRE.asInstanceOf[js.Any], TWO_WIRE = TWO_WIRE.asInstanceOf[js.Any])
      __obj.asInstanceOf[DRIVER]
    }
    
    @scala.inline
    implicit class DRIVERMutableBuilder[Self <: DRIVER] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDRIVER(value: STEPPER_TYPE): Self = StObject.set(x, "DRIVER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFOUR_WIRE(value: STEPPER_TYPE): Self = StObject.set(x, "FOUR_WIRE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTWO_WIRE(value: STEPPER_TYPE): Self = StObject.set(x, "TWO_WIRE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delay extends StObject {
    
    var delay: Double
  }
  object Delay {
    
    @scala.inline
    def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
}

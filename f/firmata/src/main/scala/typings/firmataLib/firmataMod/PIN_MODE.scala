package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PIN_MODE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L449-L464
@JSImport("firmata", "PIN_MODE")
@js.native
object PIN_MODE extends js.Object {
  @js.native
  sealed trait ANALOG
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait I2C
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait IGNORE
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait INPUT
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait ONEWIRE
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait OUTPUT
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait PING_READ
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait PULLUP
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait PWM
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait SERIAL
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait SERVO
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait SHIFT
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait STEPPER
    extends firmataLib.firmataMod.PIN_MODE
  
  @js.native
  sealed trait UNKNOWN
    extends firmataLib.firmataMod.PIN_MODE
  
  /* 0x02 */ val ANALOG: ANALOG with scala.Double = js.native
  /* 0x06 */ val I2C: I2C with scala.Double = js.native
  /* 0x7F */ val IGNORE: IGNORE with scala.Double = js.native
  /* 0x00 */ val INPUT: INPUT with scala.Double = js.native
  /* 0x07 */ val ONEWIRE: ONEWIRE with scala.Double = js.native
  /* 0x01 */ val OUTPUT: OUTPUT with scala.Double = js.native
  /* 0x75 */ val PING_READ: PING_READ with scala.Double = js.native
  /* 0x0B */ val PULLUP: PULLUP with scala.Double = js.native
  /* 0x03 */ val PWM: PWM with scala.Double = js.native
  /* 0x0A */ val SERIAL: SERIAL with scala.Double = js.native
  /* 0x04 */ val SERVO: SERVO with scala.Double = js.native
  /* 0x05 */ val SHIFT: SHIFT with scala.Double = js.native
  /* 0x08 */ val STEPPER: STEPPER with scala.Double = js.native
  /* 0x10 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.PIN_MODE with scala.Double] = js.native
}


package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L449-L464
@JSImport("firmata", "PIN_MODE")
@js.native
object PIN_MODE extends js.Object {
  /* 0x02 */ val ANALOG: firmataLib.firmataMod.BoardNs.PIN_MODE.ANALOG with scala.Double = js.native
  /* 0x06 */ val I2C: firmataLib.firmataMod.BoardNs.PIN_MODE.I2C with scala.Double = js.native
  /* 0x7F */ val IGNORE: firmataLib.firmataMod.BoardNs.PIN_MODE.IGNORE with scala.Double = js.native
  /* 0x00 */ val INPUT: firmataLib.firmataMod.BoardNs.PIN_MODE.INPUT with scala.Double = js.native
  /* 0x07 */ val ONEWIRE: firmataLib.firmataMod.BoardNs.PIN_MODE.ONEWIRE with scala.Double = js.native
  /* 0x01 */ val OUTPUT: firmataLib.firmataMod.BoardNs.PIN_MODE.OUTPUT with scala.Double = js.native
  /* 0x75 */ val PING_READ: firmataLib.firmataMod.BoardNs.PIN_MODE.PING_READ with scala.Double = js.native
  /* 0x0B */ val PULLUP: firmataLib.firmataMod.BoardNs.PIN_MODE.PULLUP with scala.Double = js.native
  /* 0x03 */ val PWM: firmataLib.firmataMod.BoardNs.PIN_MODE.PWM with scala.Double = js.native
  /* 0x0A */ val SERIAL: firmataLib.firmataMod.BoardNs.PIN_MODE.SERIAL with scala.Double = js.native
  /* 0x04 */ val SERVO: firmataLib.firmataMod.BoardNs.PIN_MODE.SERVO with scala.Double = js.native
  /* 0x05 */ val SHIFT: firmataLib.firmataMod.BoardNs.PIN_MODE.SHIFT with scala.Double = js.native
  /* 0x08 */ val STEPPER: firmataLib.firmataMod.BoardNs.PIN_MODE.STEPPER with scala.Double = js.native
  /* 0x10 */ val UNKNOWN: firmataLib.firmataMod.BoardNs.PIN_MODE.UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.BoardNs.PIN_MODE with scala.Double] = js.native
}


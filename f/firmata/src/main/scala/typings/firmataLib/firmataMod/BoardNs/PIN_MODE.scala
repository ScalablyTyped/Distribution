package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PIN_MODE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L449-L464
@JSImport("firmata/Board", "PIN_MODE")
@js.native
object PIN_MODE extends js.Object {
  @js.native
  sealed trait ANALOG
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait I2C
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait IGNORE
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait INPUT
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait ONEWIRE
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait OUTPUT
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait PING_READ
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait PULLUP
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait PWM
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait SERIAL
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait SERVO
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait SHIFT
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait STEPPER
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
  @js.native
  sealed trait UNKNOWN
    extends firmataLib.firmataMod.BoardNs.PIN_MODE
  
}


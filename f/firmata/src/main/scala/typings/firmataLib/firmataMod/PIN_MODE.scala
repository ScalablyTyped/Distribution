package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L449-L464
/* Rewritten from type alias, can be one of: 
  - firmataLib.firmataLibNumbers.`0x00`
  - firmataLib.firmataLibNumbers.`0x01`
  - firmataLib.firmataLibNumbers.`0x02`
  - firmataLib.firmataLibNumbers.`0x03`
  - firmataLib.firmataLibNumbers.`0x04`
  - firmataLib.firmataLibNumbers.`0x05`
  - firmataLib.firmataLibNumbers.`0x06`
  - firmataLib.firmataLibNumbers.`0x07`
  - firmataLib.firmataLibNumbers.`0x08`
  - firmataLib.firmataLibNumbers.`0x0A`
  - firmataLib.firmataLibNumbers.`0x0B`
  - firmataLib.firmataLibNumbers.`0x7F`
  - firmataLib.firmataLibNumbers.`0x75`
  - firmataLib.firmataLibNumbers.`0x10`
*/
trait PIN_MODE extends js.Object

object PIN_MODE {
  @scala.inline
  def ANALOG: firmataLib.firmataLibNumbers.`0x02` = this.cast(0x02)
  @scala.inline
  def I2C: firmataLib.firmataLibNumbers.`0x06` = this.cast(0x06)
  @scala.inline
  def IGNORE: firmataLib.firmataLibNumbers.`0x7F` = this.cast(0x7F)
  @scala.inline
  def INPUT: firmataLib.firmataLibNumbers.`0x00` = this.cast(0x00)
  @scala.inline
  def ONEWIRE: firmataLib.firmataLibNumbers.`0x07` = this.cast(0x07)
  @scala.inline
  def OUTPUT: firmataLib.firmataLibNumbers.`0x01` = this.cast(0x01)
  @scala.inline
  def PING_READ: firmataLib.firmataLibNumbers.`0x75` = this.cast(0x75)
  @scala.inline
  def PULLUP: firmataLib.firmataLibNumbers.`0x0B` = this.cast(0x0B)
  @scala.inline
  def PWM: firmataLib.firmataLibNumbers.`0x03` = this.cast(0x03)
  @scala.inline
  def SERIAL: firmataLib.firmataLibNumbers.`0x0A` = this.cast(0x0A)
  @scala.inline
  def SERVO: firmataLib.firmataLibNumbers.`0x04` = this.cast(0x04)
  @scala.inline
  def SHIFT: firmataLib.firmataLibNumbers.`0x05` = this.cast(0x05)
  @scala.inline
  def STEPPER: firmataLib.firmataLibNumbers.`0x08` = this.cast(0x08)
  @scala.inline
  def UNKNOWN: firmataLib.firmataLibNumbers.`0x10` = this.cast(0x10)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


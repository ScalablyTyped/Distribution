package typings.firmata.firmataMod

import typings.firmata.firmataNumbers.`0x00`
import typings.firmata.firmataNumbers.`0x01`
import typings.firmata.firmataNumbers.`0x02`
import typings.firmata.firmataNumbers.`0x03`
import typings.firmata.firmataNumbers.`0x04`
import typings.firmata.firmataNumbers.`0x05`
import typings.firmata.firmataNumbers.`0x06`
import typings.firmata.firmataNumbers.`0x07`
import typings.firmata.firmataNumbers.`0x08`
import typings.firmata.firmataNumbers.`0x0A`
import typings.firmata.firmataNumbers.`0x0B`
import typings.firmata.firmataNumbers.`0x10`
import typings.firmata.firmataNumbers.`0x75`
import typings.firmata.firmataNumbers.`0x7F`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L449-L464
/* Rewritten from type alias, can be one of: 
  - typings.firmata.firmataNumbers.`0x00`
  - typings.firmata.firmataNumbers.`0x01`
  - typings.firmata.firmataNumbers.`0x02`
  - typings.firmata.firmataNumbers.`0x03`
  - typings.firmata.firmataNumbers.`0x04`
  - typings.firmata.firmataNumbers.`0x05`
  - typings.firmata.firmataNumbers.`0x06`
  - typings.firmata.firmataNumbers.`0x07`
  - typings.firmata.firmataNumbers.`0x08`
  - typings.firmata.firmataNumbers.`0x0A`
  - typings.firmata.firmataNumbers.`0x0B`
  - typings.firmata.firmataNumbers.`0x7F`
  - typings.firmata.firmataNumbers.`0x75`
  - typings.firmata.firmataNumbers.`0x10`
*/
trait PIN_MODE extends js.Object

object PIN_MODE {
  @scala.inline
  def ANALOG: `0x02` = this.cast(0x02)
  @scala.inline
  def I2C: `0x06` = this.cast(0x06)
  @scala.inline
  def IGNORE: `0x7F` = this.cast(0x7F)
  @scala.inline
  def INPUT: `0x00` = this.cast(0x00)
  @scala.inline
  def ONEWIRE: `0x07` = this.cast(0x07)
  @scala.inline
  def OUTPUT: `0x01` = this.cast(0x01)
  @scala.inline
  def PING_READ: `0x75` = this.cast(0x75)
  @scala.inline
  def PULLUP: `0x0B` = this.cast(0x0B)
  @scala.inline
  def PWM: `0x03` = this.cast(0x03)
  @scala.inline
  def SERIAL: `0x0A` = this.cast(0x0A)
  @scala.inline
  def SERVO: `0x04` = this.cast(0x04)
  @scala.inline
  def SHIFT: `0x05` = this.cast(0x05)
  @scala.inline
  def STEPPER: `0x08` = this.cast(0x08)
  @scala.inline
  def UNKNOWN: `0x10` = this.cast(0x10)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


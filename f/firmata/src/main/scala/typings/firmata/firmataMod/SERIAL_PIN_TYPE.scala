package typings.firmata.firmataMod

import typings.firmata.firmataNumbers.`0x00`
import typings.firmata.firmataNumbers.`0x01`
import typings.firmata.firmataNumbers.`0x02`
import typings.firmata.firmataNumbers.`0x03`
import typings.firmata.firmataNumbers.`0x04`
import typings.firmata.firmataNumbers.`0x05`
import typings.firmata.firmataNumbers.`0x06`
import typings.firmata.firmataNumbers.`0x07`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L515-L524
/* Rewritten from type alias, can be one of: 
  - typings.firmata.firmataNumbers.`0x00`
  - typings.firmata.firmataNumbers.`0x01`
  - typings.firmata.firmataNumbers.`0x02`
  - typings.firmata.firmataNumbers.`0x03`
  - typings.firmata.firmataNumbers.`0x04`
  - typings.firmata.firmataNumbers.`0x05`
  - typings.firmata.firmataNumbers.`0x06`
  - typings.firmata.firmataNumbers.`0x07`
*/
trait SERIAL_PIN_TYPE extends js.Object

object SERIAL_PIN_TYPE {
  @scala.inline
  def RES_RX0: `0x00` = this.cast(0x00)
  @scala.inline
  def RES_RX1: `0x02` = this.cast(0x02)
  @scala.inline
  def RES_RX2: `0x04` = this.cast(0x04)
  @scala.inline
  def RES_RX3: `0x06` = this.cast(0x06)
  @scala.inline
  def RES_TX0: `0x01` = this.cast(0x01)
  @scala.inline
  def RES_TX1: `0x03` = this.cast(0x03)
  @scala.inline
  def RES_TX2: `0x05` = this.cast(0x05)
  @scala.inline
  def RES_TX3: `0x07` = this.cast(0x07)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


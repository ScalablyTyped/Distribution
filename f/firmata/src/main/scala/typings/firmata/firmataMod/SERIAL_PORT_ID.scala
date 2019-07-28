package typings.firmata.firmataMod

import typings.firmata.firmataNumbers.`0x00`
import typings.firmata.firmataNumbers.`0x01`
import typings.firmata.firmataNumbers.`0x02`
import typings.firmata.firmataNumbers.`0x03`
import typings.firmata.firmataNumbers.`0x08`
import typings.firmata.firmataNumbers.`0x09`
import typings.firmata.firmataNumbers.`0x10`
import typings.firmata.firmataNumbers.`0x11`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L497-L512
/* Rewritten from type alias, can be one of: 
  - typings.firmata.firmataNumbers.`0x00`
  - typings.firmata.firmataNumbers.`0x01`
  - typings.firmata.firmataNumbers.`0x02`
  - typings.firmata.firmataNumbers.`0x03`
  - typings.firmata.firmataNumbers.`0x08`
  - typings.firmata.firmataNumbers.`0x09`
  - typings.firmata.firmataNumbers.`0x10`
  - typings.firmata.firmataNumbers.`0x11`
*/
trait SERIAL_PORT_ID extends js.Object

object SERIAL_PORT_ID {
  @scala.inline
  def DEFAULT: `0x08` = this.cast(0x08)
  @scala.inline
  def HW_SERIAL0: `0x00` = this.cast(0x00)
  @scala.inline
  def HW_SERIAL1: `0x01` = this.cast(0x01)
  @scala.inline
  def HW_SERIAL2: `0x02` = this.cast(0x02)
  @scala.inline
  def HW_SERIAL3: `0x03` = this.cast(0x03)
  @scala.inline
  def SW_SERIAL0: `0x08` = this.cast(0x08)
  @scala.inline
  def SW_SERIAL1: `0x09` = this.cast(0x09)
  @scala.inline
  def SW_SERIAL2: `0x10` = this.cast(0x10)
  @scala.inline
  def SW_SERIAL3: `0x11` = this.cast(0x11)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


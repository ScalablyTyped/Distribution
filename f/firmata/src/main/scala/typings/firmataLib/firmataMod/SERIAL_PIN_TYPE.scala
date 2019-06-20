package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L515-L524
/* Rewritten from type alias, can be one of: 
  - firmataLib.firmataLibNumbers.`0x00`
  - firmataLib.firmataLibNumbers.`0x01`
  - firmataLib.firmataLibNumbers.`0x02`
  - firmataLib.firmataLibNumbers.`0x03`
  - firmataLib.firmataLibNumbers.`0x04`
  - firmataLib.firmataLibNumbers.`0x05`
  - firmataLib.firmataLibNumbers.`0x06`
  - firmataLib.firmataLibNumbers.`0x07`
*/
trait SERIAL_PIN_TYPE extends js.Object

object SERIAL_PIN_TYPE {
  @scala.inline
  def RES_RX0: firmataLib.firmataLibNumbers.`0x00` = this.cast(0x00)
  @scala.inline
  def RES_RX1: firmataLib.firmataLibNumbers.`0x02` = this.cast(0x02)
  @scala.inline
  def RES_RX2: firmataLib.firmataLibNumbers.`0x04` = this.cast(0x04)
  @scala.inline
  def RES_RX3: firmataLib.firmataLibNumbers.`0x06` = this.cast(0x06)
  @scala.inline
  def RES_TX0: firmataLib.firmataLibNumbers.`0x01` = this.cast(0x01)
  @scala.inline
  def RES_TX1: firmataLib.firmataLibNumbers.`0x03` = this.cast(0x03)
  @scala.inline
  def RES_TX2: firmataLib.firmataLibNumbers.`0x05` = this.cast(0x05)
  @scala.inline
  def RES_TX3: firmataLib.firmataLibNumbers.`0x07` = this.cast(0x07)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


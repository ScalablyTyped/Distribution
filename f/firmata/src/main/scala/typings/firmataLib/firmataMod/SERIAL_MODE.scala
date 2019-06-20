package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L491-L494
/* Rewritten from type alias, can be one of: 
  - firmataLib.firmataLibNumbers.`0x00`
  - firmataLib.firmataLibNumbers.`0x01`
*/
trait SERIAL_MODE extends js.Object

object SERIAL_MODE {
  @scala.inline
  def CONTINUOUS_READ: firmataLib.firmataLibNumbers.`0x00` = this.cast(0x00)
  @scala.inline
  def STOP_READING: firmataLib.firmataLibNumbers.`0x01` = this.cast(0x01)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


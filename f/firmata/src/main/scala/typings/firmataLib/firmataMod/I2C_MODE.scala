package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L466-L471
/* Rewritten from type alias, can be one of: 
  - firmataLib.firmataLibNumbers.`0`
  - firmataLib.firmataLibNumbers.`1`
  - firmataLib.firmataLibNumbers.`2`
  - firmataLib.firmataLibNumbers.`3`
*/
trait I2C_MODE extends js.Object

object I2C_MODE {
  @scala.inline
  def CONTINUOUS_READ: firmataLib.firmataLibNumbers.`2` = this.cast(2)
  @scala.inline
  def READ: firmataLib.firmataLibNumbers.`1` = this.cast(1)
  @scala.inline
  def STOP_READING: firmataLib.firmataLibNumbers.`3` = this.cast(3)
  @scala.inline
  def WRITE: firmataLib.firmataLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


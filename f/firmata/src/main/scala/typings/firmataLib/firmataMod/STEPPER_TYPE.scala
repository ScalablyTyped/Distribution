package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L474-L478
/* Rewritten from type alias, can be one of: 
  - firmataLib.firmataLibNumbers.`1`
  - firmataLib.firmataLibNumbers.`2`
  - firmataLib.firmataLibNumbers.`4`
*/
trait STEPPER_TYPE extends js.Object

object STEPPER_TYPE {
  @scala.inline
  def DRIVER: firmataLib.firmataLibNumbers.`1` = this.cast(1)
  @scala.inline
  def FOUR_WIRE: firmataLib.firmataLibNumbers.`4` = this.cast(4)
  @scala.inline
  def TWO_WIRE: firmataLib.firmataLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


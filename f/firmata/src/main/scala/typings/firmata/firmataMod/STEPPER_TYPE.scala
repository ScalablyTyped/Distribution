package typings.firmata.firmataMod

import typings.firmata.firmataNumbers.`1`
import typings.firmata.firmataNumbers.`2`
import typings.firmata.firmataNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L474-L478
/* Rewritten from type alias, can be one of: 
  - typings.firmata.firmataNumbers.`1`
  - typings.firmata.firmataNumbers.`2`
  - typings.firmata.firmataNumbers.`4`
*/
trait STEPPER_TYPE extends js.Object

object STEPPER_TYPE {
  @scala.inline
  def DRIVER: `1` = this.cast(1)
  @scala.inline
  def FOUR_WIRE: `4` = this.cast(4)
  @scala.inline
  def TWO_WIRE: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


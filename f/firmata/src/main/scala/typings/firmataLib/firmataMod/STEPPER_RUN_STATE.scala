package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L479-L484
/* Rewritten from type alias, can be one of: 
  - firmataLib.firmataLibNumbers.`0`
  - firmataLib.firmataLibNumbers.`1`
  - firmataLib.firmataLibNumbers.`2`
  - firmataLib.firmataLibNumbers.`3`
*/
trait STEPPER_RUN_STATE extends js.Object

object STEPPER_RUN_STATE {
  @scala.inline
  def ACCEL: firmataLib.firmataLibNumbers.`1` = this.cast(1)
  @scala.inline
  def DECEL: firmataLib.firmataLibNumbers.`2` = this.cast(2)
  @scala.inline
  def RUN: firmataLib.firmataLibNumbers.`3` = this.cast(3)
  @scala.inline
  def STOP: firmataLib.firmataLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


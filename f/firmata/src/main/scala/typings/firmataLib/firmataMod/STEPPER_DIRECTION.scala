package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STEPPER_DIRECTION extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L485-L488
@JSImport("firmata", "STEPPER_DIRECTION")
@js.native
object STEPPER_DIRECTION extends js.Object {
  @js.native
  sealed trait CCW
    extends firmataLib.firmataMod.STEPPER_DIRECTION
  
  @js.native
  sealed trait CW
    extends firmataLib.firmataMod.STEPPER_DIRECTION
  
  /* 0 */ val CCW: CCW with scala.Double = js.native
  /* 1 */ val CW: CW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.STEPPER_DIRECTION with scala.Double] = js.native
}


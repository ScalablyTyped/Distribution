package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STEPPER_TYPE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L474-L478
@JSImport("firmata", "STEPPER_TYPE")
@js.native
object STEPPER_TYPE extends js.Object {
  @js.native
  sealed trait DRIVER
    extends firmataLib.firmataMod.STEPPER_TYPE
  
  @js.native
  sealed trait FOUR_WIRE
    extends firmataLib.firmataMod.STEPPER_TYPE
  
  @js.native
  sealed trait TWO_WIRE
    extends firmataLib.firmataMod.STEPPER_TYPE
  
  /* 1 */ val DRIVER: DRIVER with scala.Double = js.native
  /* 4 */ val FOUR_WIRE: FOUR_WIRE with scala.Double = js.native
  /* 2 */ val TWO_WIRE: TWO_WIRE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.STEPPER_TYPE with scala.Double] = js.native
}


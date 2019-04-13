package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STEPPER_RUN_STATE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L479-L484
@JSImport("firmata", "STEPPER_RUN_STATE")
@js.native
object STEPPER_RUN_STATE extends js.Object {
  @js.native
  sealed trait ACCEL
    extends firmataLib.firmataMod.STEPPER_RUN_STATE
  
  @js.native
  sealed trait DECEL
    extends firmataLib.firmataMod.STEPPER_RUN_STATE
  
  @js.native
  sealed trait RUN
    extends firmataLib.firmataMod.STEPPER_RUN_STATE
  
  @js.native
  sealed trait STOP
    extends firmataLib.firmataMod.STEPPER_RUN_STATE
  
  /* 1 */ val ACCEL: ACCEL with scala.Double = js.native
  /* 2 */ val DECEL: DECEL with scala.Double = js.native
  /* 3 */ val RUN: RUN with scala.Double = js.native
  /* 0 */ val STOP: STOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.STEPPER_RUN_STATE with scala.Double] = js.native
}


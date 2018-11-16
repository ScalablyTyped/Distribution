package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L479-L484
@JSImport("firmata", "STEPPER_RUN_STATE")
@js.native
object STEPPER_RUN_STATE extends js.Object {
  /* 1 */ val ACCEL: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE.ACCEL with scala.Double = js.native
  /* 2 */ val DECEL: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE.DECEL with scala.Double = js.native
  /* 3 */ val RUN: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE.RUN with scala.Double = js.native
  /* 0 */ val STOP: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE.STOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE with scala.Double] = js.native
}


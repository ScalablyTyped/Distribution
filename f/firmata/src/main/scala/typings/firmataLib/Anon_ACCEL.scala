package typings
package firmataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ACCEL extends js.Object {
  var ACCEL: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  var DECEL: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  var RUN: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  var STOP: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
}

object Anon_ACCEL {
  @scala.inline
  def apply(
    ACCEL: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE,
    DECEL: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE,
    RUN: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE,
    STOP: firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  ): Anon_ACCEL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACCEL")(ACCEL)
    __obj.updateDynamic("DECEL")(DECEL)
    __obj.updateDynamic("RUN")(RUN)
    __obj.updateDynamic("STOP")(STOP)
    __obj.asInstanceOf[Anon_ACCEL]
  }
}


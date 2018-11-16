package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STEPPER_RUN_STATE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L479-L484
@JSImport("firmata/Board", "STEPPER_RUN_STATE")
@js.native
object STEPPER_RUN_STATE extends js.Object {
  @js.native
  sealed trait ACCEL
    extends firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  
  @js.native
  sealed trait DECEL
    extends firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  
  @js.native
  sealed trait RUN
    extends firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  
  @js.native
  sealed trait STOP
    extends firmataLib.firmataMod.BoardNs.STEPPER_RUN_STATE
  
}


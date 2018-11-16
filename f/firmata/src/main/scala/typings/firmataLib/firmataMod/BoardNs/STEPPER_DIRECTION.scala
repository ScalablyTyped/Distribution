package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STEPPER_DIRECTION extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L485-L488
@JSImport("firmata/Board", "STEPPER_DIRECTION")
@js.native
object STEPPER_DIRECTION extends js.Object {
  @js.native
  sealed trait CCW
    extends firmataLib.firmataMod.BoardNs.STEPPER_DIRECTION
  
  @js.native
  sealed trait CW
    extends firmataLib.firmataMod.BoardNs.STEPPER_DIRECTION
  
}


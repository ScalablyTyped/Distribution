package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STEPPER_TYPE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L474-L478
@JSImport("firmata/Board", "STEPPER_TYPE")
@js.native
object STEPPER_TYPE extends js.Object {
  @js.native
  sealed trait DRIVER
    extends firmataLib.firmataMod.BoardNs.STEPPER_TYPE
  
  @js.native
  sealed trait FOUR_WIRE
    extends firmataLib.firmataMod.BoardNs.STEPPER_TYPE
  
  @js.native
  sealed trait TWO_WIRE
    extends firmataLib.firmataMod.BoardNs.STEPPER_TYPE
  
}


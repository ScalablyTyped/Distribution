package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L474-L478
@JSImport("firmata", "STEPPER_TYPE")
@js.native
object STEPPER_TYPE extends js.Object {
  /* 1 */ val DRIVER: firmataLib.firmataMod.BoardNs.STEPPER_TYPE.DRIVER with scala.Double = js.native
  /* 4 */ val FOUR_WIRE: firmataLib.firmataMod.BoardNs.STEPPER_TYPE.FOUR_WIRE with scala.Double = js.native
  /* 2 */ val TWO_WIRE: firmataLib.firmataMod.BoardNs.STEPPER_TYPE.TWO_WIRE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.BoardNs.STEPPER_TYPE with scala.Double] = js.native
}


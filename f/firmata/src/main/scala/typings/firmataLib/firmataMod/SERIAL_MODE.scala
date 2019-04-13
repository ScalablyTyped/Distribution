package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SERIAL_MODE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L491-L494
@JSImport("firmata", "SERIAL_MODE")
@js.native
object SERIAL_MODE extends js.Object {
  @js.native
  sealed trait CONTINUOUS_READ
    extends firmataLib.firmataMod.SERIAL_MODE
  
  @js.native
  sealed trait STOP_READING
    extends firmataLib.firmataMod.SERIAL_MODE
  
  /* 0x00 */ val CONTINUOUS_READ: CONTINUOUS_READ with scala.Double = js.native
  /* 0x01 */ val STOP_READING: STOP_READING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.SERIAL_MODE with scala.Double] = js.native
}


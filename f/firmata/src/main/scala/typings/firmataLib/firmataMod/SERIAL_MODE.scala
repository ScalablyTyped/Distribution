package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L491-L494
@JSImport("firmata", "SERIAL_MODE")
@js.native
object SERIAL_MODE extends js.Object {
  /* 0x00 */ val CONTINUOUS_READ: firmataLib.firmataMod.BoardNs.SERIAL_MODE.CONTINUOUS_READ with scala.Double = js.native
  /* 0x01 */ val STOP_READING: firmataLib.firmataMod.BoardNs.SERIAL_MODE.STOP_READING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.BoardNs.SERIAL_MODE with scala.Double] = js.native
}


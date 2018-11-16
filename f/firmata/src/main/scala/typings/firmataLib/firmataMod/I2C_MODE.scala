package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L466-L471
@JSImport("firmata", "I2C_MODE")
@js.native
object I2C_MODE extends js.Object {
  /* 2 */ val CONTINUOUS_READ: firmataLib.firmataMod.BoardNs.I2C_MODE.CONTINUOUS_READ with scala.Double = js.native
  /* 1 */ val READ: firmataLib.firmataMod.BoardNs.I2C_MODE.READ with scala.Double = js.native
  /* 3 */ val STOP_READING: firmataLib.firmataMod.BoardNs.I2C_MODE.STOP_READING with scala.Double = js.native
  /* 0 */ val WRITE: firmataLib.firmataMod.BoardNs.I2C_MODE.WRITE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.BoardNs.I2C_MODE with scala.Double] = js.native
}


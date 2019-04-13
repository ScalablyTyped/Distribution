package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I2C_MODE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L466-L471
@JSImport("firmata", "I2C_MODE")
@js.native
object I2C_MODE extends js.Object {
  @js.native
  sealed trait CONTINUOUS_READ
    extends firmataLib.firmataMod.I2C_MODE
  
  @js.native
  sealed trait READ
    extends firmataLib.firmataMod.I2C_MODE
  
  @js.native
  sealed trait STOP_READING
    extends firmataLib.firmataMod.I2C_MODE
  
  @js.native
  sealed trait WRITE
    extends firmataLib.firmataMod.I2C_MODE
  
  /* 2 */ val CONTINUOUS_READ: CONTINUOUS_READ with scala.Double = js.native
  /* 1 */ val READ: READ with scala.Double = js.native
  /* 3 */ val STOP_READING: STOP_READING with scala.Double = js.native
  /* 0 */ val WRITE: WRITE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.I2C_MODE with scala.Double] = js.native
}


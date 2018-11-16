package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I2C_MODE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L466-L471
@JSImport("firmata/Board", "I2C_MODE")
@js.native
object I2C_MODE extends js.Object {
  @js.native
  sealed trait CONTINUOUS_READ
    extends firmataLib.firmataMod.BoardNs.I2C_MODE
  
  @js.native
  sealed trait READ
    extends firmataLib.firmataMod.BoardNs.I2C_MODE
  
  @js.native
  sealed trait STOP_READING
    extends firmataLib.firmataMod.BoardNs.I2C_MODE
  
  @js.native
  sealed trait WRITE
    extends firmataLib.firmataMod.BoardNs.I2C_MODE
  
}


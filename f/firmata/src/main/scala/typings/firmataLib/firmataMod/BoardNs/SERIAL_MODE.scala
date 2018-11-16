package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SERIAL_MODE extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L491-L494
@JSImport("firmata/Board", "SERIAL_MODE")
@js.native
object SERIAL_MODE extends js.Object {
  @js.native
  sealed trait CONTINUOUS_READ
    extends firmataLib.firmataMod.BoardNs.SERIAL_MODE
  
  @js.native
  sealed trait STOP_READING
    extends firmataLib.firmataMod.BoardNs.SERIAL_MODE
  
}


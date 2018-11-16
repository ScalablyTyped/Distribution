package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SERIAL_PORT_ID extends js.Object

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L497-L512
@JSImport("firmata/Board", "SERIAL_PORT_ID")
@js.native
object SERIAL_PORT_ID extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL0
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL1
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL2
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait HW_SERIAL3
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL0
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL1
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL2
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
  @js.native
  sealed trait SW_SERIAL3
    extends firmataLib.firmataMod.BoardNs.SERIAL_PORT_ID
  
}


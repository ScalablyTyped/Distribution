package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PULLUP_STATE extends js.Object

@JSImport("firmata/Board", "PULLUP_STATE")
@js.native
object PULLUP_STATE extends js.Object {
  @js.native
  sealed trait DISABLED
    extends firmataLib.firmataMod.BoardNs.PULLUP_STATE
  
  @js.native
  sealed trait ENABLED
    extends firmataLib.firmataMod.BoardNs.PULLUP_STATE
  
}


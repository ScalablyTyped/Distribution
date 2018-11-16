package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PIN_STATE extends js.Object

@JSImport("firmata/Board", "PIN_STATE")
@js.native
object PIN_STATE extends js.Object {
  @js.native
  sealed trait HIGH
    extends firmataLib.firmataMod.BoardNs.PIN_STATE
  
  @js.native
  sealed trait LOW
    extends firmataLib.firmataMod.BoardNs.PIN_STATE
  
}


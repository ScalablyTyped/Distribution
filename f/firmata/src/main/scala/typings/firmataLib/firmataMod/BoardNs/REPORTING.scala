package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait REPORTING extends js.Object

@JSImport("firmata/Board", "REPORTING")
@js.native
object REPORTING extends js.Object {
  @js.native
  sealed trait OFF
    extends firmataLib.firmataMod.BoardNs.REPORTING
  
  @js.native
  sealed trait ON
    extends firmataLib.firmataMod.BoardNs.REPORTING
  
}


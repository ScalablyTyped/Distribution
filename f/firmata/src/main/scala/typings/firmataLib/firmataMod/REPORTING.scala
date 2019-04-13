package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait REPORTING extends js.Object

@JSImport("firmata", "REPORTING")
@js.native
object REPORTING extends js.Object {
  @js.native
  sealed trait OFF
    extends firmataLib.firmataMod.REPORTING
  
  @js.native
  sealed trait ON
    extends firmataLib.firmataMod.REPORTING
  
  /* 0 */ val OFF: OFF with scala.Double = js.native
  /* 1 */ val ON: ON with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.REPORTING with scala.Double] = js.native
}


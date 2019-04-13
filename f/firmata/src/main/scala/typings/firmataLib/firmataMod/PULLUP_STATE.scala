package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PULLUP_STATE extends js.Object

@JSImport("firmata", "PULLUP_STATE")
@js.native
object PULLUP_STATE extends js.Object {
  @js.native
  sealed trait DISABLED
    extends firmataLib.firmataMod.PULLUP_STATE
  
  @js.native
  sealed trait ENABLED
    extends firmataLib.firmataMod.PULLUP_STATE
  
  /* 0 */ val DISABLED: DISABLED with scala.Double = js.native
  /* 1 */ val ENABLED: ENABLED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.PULLUP_STATE with scala.Double] = js.native
}


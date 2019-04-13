package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PIN_STATE extends js.Object

@JSImport("firmata", "PIN_STATE")
@js.native
object PIN_STATE extends js.Object {
  @js.native
  sealed trait HIGH
    extends firmataLib.firmataMod.PIN_STATE
  
  @js.native
  sealed trait LOW
    extends firmataLib.firmataMod.PIN_STATE
  
  /* 1 */ val HIGH: HIGH with scala.Double = js.native
  /* 0 */ val LOW: LOW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[firmataLib.firmataMod.PIN_STATE with scala.Double] = js.native
}


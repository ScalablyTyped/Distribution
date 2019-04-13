package typings
package eventsourceLib.eventsourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("eventsource", "ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait CLOSED
    extends eventsourceLib.eventsourceMod.ReadyState
  
  @js.native
  sealed trait CONNECTING
    extends eventsourceLib.eventsourceMod.ReadyState
  
  @js.native
  sealed trait OPEN
    extends eventsourceLib.eventsourceMod.ReadyState
  
  /* 2 */ val CLOSED: CLOSED with scala.Double = js.native
  /* 0 */ val CONNECTING: CONNECTING with scala.Double = js.native
  /* 1 */ val OPEN: OPEN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[eventsourceLib.eventsourceMod.ReadyState with scala.Double] = js.native
}


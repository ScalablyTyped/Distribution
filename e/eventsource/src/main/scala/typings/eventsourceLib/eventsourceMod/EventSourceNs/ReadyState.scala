package typings
package eventsourceLib.eventsourceMod.EventSourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("eventsource/EventSource", "ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait CLOSED
    extends eventsourceLib.eventsourceMod.EventSourceNs.ReadyState
  
  @js.native
  sealed trait CONNECTING
    extends eventsourceLib.eventsourceMod.EventSourceNs.ReadyState
  
  @js.native
  sealed trait OPEN
    extends eventsourceLib.eventsourceMod.EventSourceNs.ReadyState
  
}


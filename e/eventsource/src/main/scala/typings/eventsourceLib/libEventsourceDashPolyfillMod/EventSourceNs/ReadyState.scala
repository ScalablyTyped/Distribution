package typings
package eventsourceLib.libEventsourceDashPolyfillMod.EventSourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

@JSImport("eventsource/lib/eventsource-polyfill/EventSource", "ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait CLOSED
    extends eventsourceLib.libEventsourceDashPolyfillMod.EventSourceNs.ReadyState
  
  @js.native
  sealed trait CONNECTING
    extends eventsourceLib.libEventsourceDashPolyfillMod.EventSourceNs.ReadyState
  
  @js.native
  sealed trait OPEN
    extends eventsourceLib.libEventsourceDashPolyfillMod.EventSourceNs.ReadyState
  
}


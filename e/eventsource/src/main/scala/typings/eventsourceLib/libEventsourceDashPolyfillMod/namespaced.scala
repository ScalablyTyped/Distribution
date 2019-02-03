package typings
package eventsourceLib.libEventsourceDashPolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
@js.native
class namespaced protected () extends EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: eventsourceLib.libEventsourceDashPolyfillMod.EventSourceNs.EventSourceInitDict) = this()
}

/* static members */
@JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
}


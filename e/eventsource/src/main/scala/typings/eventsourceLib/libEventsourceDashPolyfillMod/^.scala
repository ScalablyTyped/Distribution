package typings
package eventsourceLib.libEventsourceDashPolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
@js.native
class ^ protected () extends EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInitDict) = this()
}

@JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
}


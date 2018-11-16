package typings
package eventsourceLib.eventsourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eventsource", JSImport.Namespace)
@js.native
class namespaced protected () extends EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: eventsourceLib.eventsourceMod.EventSourceNs.EventSourceInitDict) = this()
}

@JSImport("eventsource", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
}


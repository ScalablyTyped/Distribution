package typings.eventsource.eventsourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eventsource", JSImport.Namespace)
@js.native
class ^ protected () extends EventSource {
  def this(url: String) = this()
  def this(url: String, eventSourceInitDict: EventSourceInitDict) = this()
}

@JSImport("eventsource", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CLOSED: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
}


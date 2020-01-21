package typings.eventsource.eventsourcePolyfillMod

import typings.eventsource.mod.EventSourceInitDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
@js.native
class ^ protected ()
  extends typings.eventsource.mod.^ {
  def this(url: String) = this()
  def this(url: String, eventSourceInitDict: EventSourceInitDict) = this()
}

@JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CLOSED: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
}


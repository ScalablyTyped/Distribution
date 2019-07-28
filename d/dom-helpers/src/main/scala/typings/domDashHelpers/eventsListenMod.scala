package typings.domDashHelpers

import typings.std.Element
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/events/listen", JSImport.Namespace)
@js.native
object eventsListenMod extends js.Object {
  def apply(element: Element, `type`: String, listener: EventListener): js.Function0[Unit] = js.native
  def apply(element: Element, `type`: String, listener: EventListener, capture: Boolean): js.Function0[Unit] = js.native
}


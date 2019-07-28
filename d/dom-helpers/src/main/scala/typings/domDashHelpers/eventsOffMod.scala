package typings.domDashHelpers

import typings.std.Element
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/events/off", JSImport.Namespace)
@js.native
object eventsOffMod extends js.Object {
  def apply(element: Element, `type`: String, listener: EventListener): Unit = js.native
  def apply(element: Element, `type`: String, listener: EventListener, capture: Boolean): Unit = js.native
}


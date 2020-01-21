package typings.fullcalendar.externalDroppingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ExternalDropping", "Default")
@js.native
class Default_ ()
  extends typings.fullcalendar.interactionMod.default {
  var dragListener: js.Any = js.native
  var isDragging: Boolean = js.native
  @JSName("listenTo")
  var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  @JSName("stopListeningTo")
  var stopListeningTo_Original: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  def bindToDocument(): Unit = js.native
  def computeExternalDrop(componentFootprint: js.Any, meta: js.Any): js.Any = js.native
  def handleDragStart(ev: js.Any, ui: js.Any): Unit = js.native
  def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
  def listenToExternalDrag(el: js.Any, ev: js.Any, ui: js.Any): Unit = js.native
  def stopListeningTo(other: js.Any): js.Any = js.native
  def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  def unbindFromDocument(): Unit = js.native
}


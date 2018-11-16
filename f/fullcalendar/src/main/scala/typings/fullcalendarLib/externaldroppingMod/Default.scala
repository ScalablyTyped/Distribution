package typings
package fullcalendarLib.externaldroppingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ExternalDropping", "Default")
@js.native
class Default ()
  extends fullcalendarLib.interactionMod.default {
  var dragListener: js.Any = js.native
  var isDragging: scala.Boolean = js.native
  var listenTo: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var stopListeningTo: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  def bindToDocument(): scala.Unit = js.native
  def computeExternalDrop(componentFootprint: js.Any, meta: js.Any): js.Any = js.native
  def handleDragStart(ev: js.Any, ui: js.Any): scala.Unit = js.native
  def listenToExternalDrag(el: js.Any, ev: js.Any, ui: js.Any): scala.Unit = js.native
  def unbindFromDocument(): scala.Unit = js.native
}

@JSImport("fullcalendar/ExternalDropping", JSImport.Default)
@js.native
class default () extends Default


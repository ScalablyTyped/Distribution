package typings
package fullcalendarLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Popover", "Default")
@js.native
class Default protected () extends js.Object {
  def this(options: js.Any) = this()
  var el: js.Any = js.native
  var isHidden: scala.Boolean = js.native
  var listenTo: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var margin: scala.Double = js.native
  var options: js.Any = js.native
  var stopListeningTo: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  def documentMousedown(ev: js.Any): scala.Unit = js.native
  def hide(): scala.Unit = js.native
  def position(): scala.Unit = js.native
  def removeElement(): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def trigger(name: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/Popover", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(options: js.Any) = this()
}


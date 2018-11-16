package typings
package fullcalendarLib.agendaviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/AgendaView", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.viewMod.default {
  def this(calendar: js.Any, viewSpec: js.Any) = this()
  var axisWidth: js.Any = js.native
  var dayGrid: js.Any = js.native
  var dayGridClass: js.Any = js.native
  var scroller: js.Any = js.native
  var timeGrid: js.Any = js.native
  var timeGridClass: js.Any = js.native
  def axisStyleAttr(): java.lang.String = js.native
  def computeScrollerHeight(totalHeight: js.Any): scala.Double = js.native
  def instantiateDayGrid(): js.Any = js.native
  def instantiateTimeGrid(): js.Any = js.native
  def renderSkeletonHtml(): java.lang.String = js.native
}

@JSImport("fullcalendar/AgendaView", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(calendar: js.Any, viewSpec: js.Any) = this()
}


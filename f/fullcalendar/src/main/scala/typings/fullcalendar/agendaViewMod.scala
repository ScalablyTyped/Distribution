package typings.fullcalendar

import typings.fullcalendar.agendaViewMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/AgendaView", JSImport.Namespace)
@js.native
object agendaViewMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.viewMod.default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
    var axisWidth: js.Any = js.native
    var dayGrid: js.Any = js.native
    var dayGridClass: js.Any = js.native
    var scroller: js.Any = js.native
    var timeGrid: js.Any = js.native
    var timeGridClass: js.Any = js.native
    def axisStyleAttr(): String = js.native
    def computeScrollerHeight(totalHeight: js.Any): Double = js.native
    def instantiateDayGrid(): js.Any = js.native
    def instantiateTimeGrid(): js.Any = js.native
    def renderSkeletonHtml(): String = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
  }
  
}


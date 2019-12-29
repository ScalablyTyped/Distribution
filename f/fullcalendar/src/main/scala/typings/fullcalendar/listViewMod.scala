package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ListView", JSImport.Namespace)
@js.native
object listViewMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.viewMod.default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
    var contentEl: js.Any = js.native
    var dayDates: js.Any = js.native
    var dayRanges: js.Any = js.native
    var scroller: js.Any = js.native
    def computeScrollerHeight(totalHeight: js.Any): Double = js.native
    def dayHeaderHtml(dayDate: js.Any): String = js.native
    def groupSegsByDay(segs: js.Any): js.Array[_] = js.native
    def renderEmptyMessage(): Unit = js.native
    def renderSegList(allSegs: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(calendar: js.Any, viewSpec: js.Any) = this()
  }
  
}


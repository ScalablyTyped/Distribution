package typings.fullcalendar

import typings.fullcalendar.dayGridEventRendererMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DayGridEventRenderer", JSImport.Namespace)
@js.native
object dayGridEventRendererMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.eventRendererMod.default {
    def this(dayGrid: js.Any, fillRenderer: js.Any) = this()
    var dayGrid: js.Any = js.native
    var rowStructs: js.Any = js.native
    def buildSegLevels(segs: js.Any): js.Array[_] = js.native
    def groupSegRows(segs: js.Any): js.Array[_] = js.native
    def renderSegRow(row: js.Any, rowSegs: js.Any): Anon_CellMatrix = js.native
    def renderSegRows(segs: js.Any): js.Array[_] = js.native
    def unrenderFgSegs(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(dayGrid: js.Any, fillRenderer: js.Any) = this()
  }
  
}


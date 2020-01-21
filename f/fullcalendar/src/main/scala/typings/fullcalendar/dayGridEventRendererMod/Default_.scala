package typings.fullcalendar.dayGridEventRendererMod

import typings.fullcalendar.AnonCellMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DayGridEventRenderer", "Default")
@js.native
class Default_ protected ()
  extends typings.fullcalendar.eventRendererMod.default {
  def this(dayGrid: js.Any, fillRenderer: js.Any) = this()
  var dayGrid: js.Any = js.native
  var rowStructs: js.Any = js.native
  def buildSegLevels(segs: js.Any): js.Array[_] = js.native
  def groupSegRows(segs: js.Any): js.Array[_] = js.native
  def renderSegRow(row: js.Any, rowSegs: js.Any): AnonCellMatrix = js.native
  def renderSegRows(segs: js.Any): js.Array[_] = js.native
  def unrenderFgSegs(): Unit = js.native
}


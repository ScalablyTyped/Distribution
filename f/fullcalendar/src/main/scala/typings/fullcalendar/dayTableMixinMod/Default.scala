package typings.fullcalendar.dayTableMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/DayTableMixin", "Default")
@js.native
class Default ()
  extends typings.fullcalendar.mixinMod.default
     with DayTableInterface {
  var breakOnWeeks: Boolean = js.native
  /* CompleteClass */
  override var colCnt: js.Any = js.native
  var colHeadFormat: js.Any = js.native
  /* CompleteClass */
  override var dayDates: js.Any = js.native
  var dayIndices: js.Any = js.native
  /* CompleteClass */
  override var daysPerRow: js.Any = js.native
  /* CompleteClass */
  override var rowCnt: js.Any = js.native
  /* CompleteClass */
  override def bookendCells(trEl: js.Any): js.Any = js.native
  def computeColCnt(): js.Any = js.native
  def computeColHeadFormat(): js.Any = js.native
  /* CompleteClass */
  override def getCellDate(row: js.Any, col: js.Any): js.Any = js.native
  def getCellDayIndex(row: js.Any, col: js.Any): js.Any = js.native
  /* CompleteClass */
  override def getCellRange(row: js.Any, col: js.Any): js.Any = js.native
  def getColDayIndex(col: js.Any): js.Any = js.native
  def getDateDayIndex(date: js.Any): js.Any = js.native
  def renderBgCellHtml(date: js.Any, otherAttrs: js.Any): String = js.native
  def renderBgCellsHtml(row: js.Any): String = js.native
  def renderBgIntroHtml(row: js.Any): Unit = js.native
  /* CompleteClass */
  override def renderBgTrHtml(row: js.Any): js.Any = js.native
  def renderHeadDateCellHtml(date: js.Any, colspan: js.Any, otherAttrs: js.Any): String = js.native
  def renderHeadDateCellsHtml(): String = js.native
  /* CompleteClass */
  override def renderHeadHtml(): js.Any = js.native
  def renderHeadIntroHtml(): Unit = js.native
  def renderHeadTrHtml(): String = js.native
  /* CompleteClass */
  override def renderIntroHtml(): js.Any = js.native
  /* CompleteClass */
  override def sliceRangeByDay(unzonedRange: js.Any): js.Any = js.native
  /* CompleteClass */
  override def sliceRangeByRow(unzonedRange: js.Any): js.Any = js.native
  /* CompleteClass */
  override def updateDayTable(): js.Any = js.native
  def updateDayTableCols(): Unit = js.native
}

@JSImport("fullcalendar/DayTableMixin", JSImport.Default)
@js.native
class default () extends Default


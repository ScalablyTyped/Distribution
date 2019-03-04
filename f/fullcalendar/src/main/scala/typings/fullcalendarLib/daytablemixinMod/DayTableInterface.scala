package typings
package fullcalendarLib.daytablemixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayTableInterface extends js.Object {
  var colCnt: js.Any
  var dayDates: js.Any
  var daysPerRow: js.Any
  var rowCnt: js.Any
  def bookendCells(trEl: js.Any): js.Any
  def getCellDate(row: js.Any, col: js.Any): js.Any
  def getCellRange(row: js.Any, col: js.Any): js.Any
  def renderBgTrHtml(row: js.Any): js.Any
  def renderHeadHtml(): js.Any
  def renderIntroHtml(): js.Any
  def sliceRangeByDay(unzonedRange: js.Any): js.Any
  def sliceRangeByRow(unzonedRange: js.Any): js.Any
  def updateDayTable(): js.Any
}

object DayTableInterface {
  @scala.inline
  def apply(
    bookendCells: js.Function1[js.Any, js.Any],
    colCnt: js.Any,
    dayDates: js.Any,
    daysPerRow: js.Any,
    getCellDate: js.Function2[js.Any, js.Any, js.Any],
    getCellRange: js.Function2[js.Any, js.Any, js.Any],
    renderBgTrHtml: js.Function1[js.Any, js.Any],
    renderHeadHtml: js.Function0[js.Any],
    renderIntroHtml: js.Function0[js.Any],
    rowCnt: js.Any,
    sliceRangeByDay: js.Function1[js.Any, js.Any],
    sliceRangeByRow: js.Function1[js.Any, js.Any],
    updateDayTable: js.Function0[js.Any]
  ): DayTableInterface = {
    val __obj = js.Dynamic.literal(bookendCells = bookendCells, colCnt = colCnt, dayDates = dayDates, daysPerRow = daysPerRow, getCellDate = getCellDate, getCellRange = getCellRange, renderBgTrHtml = renderBgTrHtml, renderHeadHtml = renderHeadHtml, renderIntroHtml = renderIntroHtml, rowCnt = rowCnt, sliceRangeByDay = sliceRangeByDay, sliceRangeByRow = sliceRangeByRow, updateDayTable = updateDayTable)
  
    __obj.asInstanceOf[DayTableInterface]
  }
}


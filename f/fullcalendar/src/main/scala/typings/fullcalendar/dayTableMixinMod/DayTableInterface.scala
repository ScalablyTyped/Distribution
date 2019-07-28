package typings.fullcalendar.dayTableMixinMod

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
    bookendCells: js.Any => js.Any,
    colCnt: js.Any,
    dayDates: js.Any,
    daysPerRow: js.Any,
    getCellDate: (js.Any, js.Any) => js.Any,
    getCellRange: (js.Any, js.Any) => js.Any,
    renderBgTrHtml: js.Any => js.Any,
    renderHeadHtml: () => js.Any,
    renderIntroHtml: () => js.Any,
    rowCnt: js.Any,
    sliceRangeByDay: js.Any => js.Any,
    sliceRangeByRow: js.Any => js.Any,
    updateDayTable: () => js.Any
  ): DayTableInterface = {
    val __obj = js.Dynamic.literal(bookendCells = js.Any.fromFunction1(bookendCells), colCnt = colCnt, dayDates = dayDates, daysPerRow = daysPerRow, getCellDate = js.Any.fromFunction2(getCellDate), getCellRange = js.Any.fromFunction2(getCellRange), renderBgTrHtml = js.Any.fromFunction1(renderBgTrHtml), renderHeadHtml = js.Any.fromFunction0(renderHeadHtml), renderIntroHtml = js.Any.fromFunction0(renderIntroHtml), rowCnt = rowCnt, sliceRangeByDay = js.Any.fromFunction1(sliceRangeByDay), sliceRangeByRow = js.Any.fromFunction1(sliceRangeByRow), updateDayTable = js.Any.fromFunction0(updateDayTable))
  
    __obj.asInstanceOf[DayTableInterface]
  }
}


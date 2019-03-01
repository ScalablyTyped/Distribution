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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bookendCells")(bookendCells)
    __obj.updateDynamic("colCnt")(colCnt)
    __obj.updateDynamic("dayDates")(dayDates)
    __obj.updateDynamic("daysPerRow")(daysPerRow)
    __obj.updateDynamic("getCellDate")(getCellDate)
    __obj.updateDynamic("getCellRange")(getCellRange)
    __obj.updateDynamic("renderBgTrHtml")(renderBgTrHtml)
    __obj.updateDynamic("renderHeadHtml")(renderHeadHtml)
    __obj.updateDynamic("renderIntroHtml")(renderIntroHtml)
    __obj.updateDynamic("rowCnt")(rowCnt)
    __obj.updateDynamic("sliceRangeByDay")(sliceRangeByDay)
    __obj.updateDynamic("sliceRangeByRow")(sliceRangeByRow)
    __obj.updateDynamic("updateDayTable")(updateDayTable)
    __obj.asInstanceOf[DayTableInterface]
  }
}


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


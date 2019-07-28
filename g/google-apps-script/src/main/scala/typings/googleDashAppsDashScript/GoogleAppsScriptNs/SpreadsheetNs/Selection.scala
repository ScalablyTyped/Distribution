package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  def getActiveRange(): Range
  def getActiveRangeList(): RangeList
  def getActiveSheet(): Sheet
  def getCurrentCell(): Range
  def getNextDataRange(direction: Direction): Range
}

object Selection {
  @scala.inline
  def apply(
    getActiveRange: () => Range,
    getActiveRangeList: () => RangeList,
    getActiveSheet: () => Sheet,
    getCurrentCell: () => Range,
    getNextDataRange: Direction => Range
  ): Selection = {
    val __obj = js.Dynamic.literal(getActiveRange = js.Any.fromFunction0(getActiveRange), getActiveRangeList = js.Any.fromFunction0(getActiveRangeList), getActiveSheet = js.Any.fromFunction0(getActiveSheet), getCurrentCell = js.Any.fromFunction0(getCurrentCell), getNextDataRange = js.Any.fromFunction1(getNextDataRange))
  
    __obj.asInstanceOf[Selection]
  }
}


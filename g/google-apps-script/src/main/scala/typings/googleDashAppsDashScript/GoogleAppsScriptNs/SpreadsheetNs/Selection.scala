package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  def getActiveRange(): Range | Null
  def getActiveRangeList(): RangeList | Null
  def getActiveSheet(): Sheet
  def getCurrentCell(): Range | Null
  def getNextDataRange(direction: Direction): Range | Null
}

object Selection {
  @scala.inline
  def apply(
    getActiveRange: () => Range | Null,
    getActiveRangeList: () => RangeList | Null,
    getActiveSheet: () => Sheet,
    getCurrentCell: () => Range | Null,
    getNextDataRange: Direction => Range | Null
  ): Selection = {
    val __obj = js.Dynamic.literal(getActiveRange = js.Any.fromFunction0(getActiveRange), getActiveRangeList = js.Any.fromFunction0(getActiveRangeList), getActiveSheet = js.Any.fromFunction0(getActiveSheet), getCurrentCell = js.Any.fromFunction0(getCurrentCell), getNextDataRange = js.Any.fromFunction1(getNextDataRange))
  
    __obj.asInstanceOf[Selection]
  }
}


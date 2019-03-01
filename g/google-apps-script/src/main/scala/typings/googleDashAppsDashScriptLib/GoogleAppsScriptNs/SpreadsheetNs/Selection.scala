package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

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
    getActiveRange: js.Function0[Range],
    getActiveRangeList: js.Function0[RangeList],
    getActiveSheet: js.Function0[Sheet],
    getCurrentCell: js.Function0[Range],
    getNextDataRange: js.Function1[Direction, Range]
  ): Selection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActiveRange")(getActiveRange)
    __obj.updateDynamic("getActiveRangeList")(getActiveRangeList)
    __obj.updateDynamic("getActiveSheet")(getActiveSheet)
    __obj.updateDynamic("getCurrentCell")(getCurrentCell)
    __obj.updateDynamic("getNextDataRange")(getNextDataRange)
    __obj.asInstanceOf[Selection]
  }
}


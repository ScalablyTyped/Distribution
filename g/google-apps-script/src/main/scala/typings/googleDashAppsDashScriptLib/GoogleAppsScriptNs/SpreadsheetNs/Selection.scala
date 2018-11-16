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


package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Reports
trait AdWordsReport extends js.Object {
  def exportToSheet(sheet: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Sheet): scala.Unit
  def getColumnHeader(awqlColumnName: java.lang.String): AdWordsReportColumnHeader
  def rows(): AdWordsReportRowIterator
}


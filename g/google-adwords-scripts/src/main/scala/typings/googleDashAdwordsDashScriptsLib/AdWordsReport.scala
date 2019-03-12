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

object AdWordsReport {
  @scala.inline
  def apply(
    exportToSheet: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Sheet => scala.Unit,
    getColumnHeader: java.lang.String => AdWordsReportColumnHeader,
    rows: () => AdWordsReportRowIterator
  ): AdWordsReport = {
    val __obj = js.Dynamic.literal(exportToSheet = js.Any.fromFunction1(exportToSheet), getColumnHeader = js.Any.fromFunction1(getColumnHeader), rows = js.Any.fromFunction0(rows))
  
    __obj.asInstanceOf[AdWordsReport]
  }
}


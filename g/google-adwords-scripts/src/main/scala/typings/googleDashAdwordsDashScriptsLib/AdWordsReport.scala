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
    exportToSheet: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Sheet, scala.Unit],
    getColumnHeader: js.Function1[java.lang.String, AdWordsReportColumnHeader],
    rows: js.Function0[AdWordsReportRowIterator]
  ): AdWordsReport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exportToSheet")(exportToSheet)
    __obj.updateDynamic("getColumnHeader")(getColumnHeader)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[AdWordsReport]
  }
}


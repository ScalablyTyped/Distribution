package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Reports
trait AdWordsReport extends js.Object {
  def exportToSheet(sheet: Sheet): Unit
  def getColumnHeader(awqlColumnName: String): AdWordsReportColumnHeader
  def rows(): AdWordsReportRowIterator
}

object AdWordsReport {
  @scala.inline
  def apply(
    exportToSheet: Sheet => Unit,
    getColumnHeader: String => AdWordsReportColumnHeader,
    rows: () => AdWordsReportRowIterator
  ): AdWordsReport = {
    val __obj = js.Dynamic.literal(exportToSheet = js.Any.fromFunction1(exportToSheet), getColumnHeader = js.Any.fromFunction1(getColumnHeader), rows = js.Any.fromFunction0(rows))
  
    __obj.asInstanceOf[AdWordsReport]
  }
}


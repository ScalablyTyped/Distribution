package typings.googleAdwordsScripts

import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Reports
@js.native
trait AdWordsReport extends js.Object {
  def exportToSheet(sheet: Sheet): Unit = js.native
  def getColumnHeader(awqlColumnName: String): AdWordsReportColumnHeader = js.native
  def rows(): AdWordsReportRowIterator = js.native
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
  @scala.inline
  implicit class AdWordsReportOps[Self <: AdWordsReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExportToSheet(value: Sheet => Unit): Self = this.set("exportToSheet", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnHeader(value: String => AdWordsReportColumnHeader): Self = this.set("getColumnHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setRows(value: () => AdWordsReportRowIterator): Self = this.set("rows", js.Any.fromFunction0(value))
  }
  
}


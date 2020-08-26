package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLExport extends js.Object {
  /** This method is used to save the sheet data as Excel ,CSV or PDF document (.xls, .xlsx .csv, .pdf) in Spreadsheet.
    * @param {string} Pass the export type that you want.
    * @param {ej.Spreadsheet.ExportType} Pass the export filename that you want.
    * @returns {void}
    */
  def export(`type`: String, fileName: ExportType): Unit = js.native
  /** This method is used to get the export properties in the Spreadsheet.
    * @returns {any}
    */
  def getExportProps(): js.Any = js.native
}

object XLExport {
  @scala.inline
  def apply(export: (String, ExportType) => Unit, getExportProps: () => js.Any): XLExport = {
    val __obj = js.Dynamic.literal(export = js.Any.fromFunction2(export), getExportProps = js.Any.fromFunction0(getExportProps))
    __obj.asInstanceOf[XLExport]
  }
  @scala.inline
  implicit class XLExportOps[Self <: XLExport] (val x: Self) extends AnyVal {
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
    def setExport(value: (String, ExportType) => Unit): Self = this.set("export", js.Any.fromFunction2(value))
    @scala.inline
    def setGetExportProps(value: () => js.Any): Self = this.set("getExportProps", js.Any.fromFunction0(value))
  }
  
}


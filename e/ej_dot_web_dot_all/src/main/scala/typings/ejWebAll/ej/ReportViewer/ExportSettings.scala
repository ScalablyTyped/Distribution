package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettings extends js.Object {
  /** Add the custom icon item to the export options.
    * @Default {empty}
    */
  var customItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the excel export format.
    * @Default {ej.ReportViewer.ExcelFormats.Excel97to2003}
    */
  var excelFormat: js.UndefOr[ExcelFormats | String] = js.native
  /** Specifies the export formats.
    * @Default {ej.ReportViewer.ExportOptions.All}
    */
  var exportOptions: js.UndefOr[ExportOptions | String] = js.native
  /** Specifies the ppt export format.
    * @Default {ej.ReportViewer.PPTFormats.PowerPoint97to2003}
    */
  var pptFormat: js.UndefOr[PPTFormats | String] = js.native
  /** Specifies the word export format.
    * @Default {ej.ReportViewer.WordFormats.Doc}
    */
  var wordFormat: js.UndefOr[WordFormats | String] = js.native
}

object ExportSettings {
  @scala.inline
  def apply(): ExportSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSettings]
  }
  @scala.inline
  implicit class ExportSettingsOps[Self <: ExportSettings] (val x: Self) extends AnyVal {
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
    def setCustomItemsVarargs(value: js.Any*): Self = this.set("customItems", js.Array(value :_*))
    @scala.inline
    def setCustomItems(value: js.Array[_]): Self = this.set("customItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomItems: Self = this.set("customItems", js.undefined)
    @scala.inline
    def setExcelFormat(value: ExcelFormats | String): Self = this.set("excelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcelFormat: Self = this.set("excelFormat", js.undefined)
    @scala.inline
    def setExportOptions(value: ExportOptions | String): Self = this.set("exportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportOptions: Self = this.set("exportOptions", js.undefined)
    @scala.inline
    def setPptFormat(value: PPTFormats | String): Self = this.set("pptFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePptFormat: Self = this.set("pptFormat", js.undefined)
    @scala.inline
    def setWordFormat(value: WordFormats | String): Self = this.set("wordFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordFormat: Self = this.set("wordFormat", js.undefined)
  }
  
}


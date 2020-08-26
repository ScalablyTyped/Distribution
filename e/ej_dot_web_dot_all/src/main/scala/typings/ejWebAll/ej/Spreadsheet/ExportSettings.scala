package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable save feature in Spreadsheet. By enabling this feature, you can save existing Spreadsheet.
    * @Default {true}
    */
  var allowExporting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define csvUrl for export to CSV format.
    * @Default {null}
    */
  var csvUrl: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to enable or disable formula calculation in Spreadsheet. By enabling this feature, formula calculated while export the Spreadsheet in
    * protected mode.
    * @Default {false}
    */
  var enableFormulaCalculation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define excelUrl for export to excel format.
    * @Default {null}
    */
  var excelUrl: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define password while export to excel format.
    * @Default {null}
    */
  var password: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define pdfUrl for export to PDF format.
    * @Default {null}
    */
  var pdfUrl: js.UndefOr[String] = js.native
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
    def setAllowExporting(value: Boolean): Self = this.set("allowExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExporting: Self = this.set("allowExporting", js.undefined)
    @scala.inline
    def setCsvUrl(value: String): Self = this.set("csvUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvUrl: Self = this.set("csvUrl", js.undefined)
    @scala.inline
    def setEnableFormulaCalculation(value: Boolean): Self = this.set("enableFormulaCalculation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFormulaCalculation: Self = this.set("enableFormulaCalculation", js.undefined)
    @scala.inline
    def setExcelUrl(value: String): Self = this.set("excelUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcelUrl: Self = this.set("excelUrl", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPdfUrl(value: String): Self = this.set("pdfUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdfUrl: Self = this.set("pdfUrl", js.undefined)
  }
  
}


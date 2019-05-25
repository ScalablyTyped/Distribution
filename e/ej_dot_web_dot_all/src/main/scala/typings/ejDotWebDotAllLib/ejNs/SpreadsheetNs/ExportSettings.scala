package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable save feature in Spreadsheet. By enabling this feature, you can save existing Spreadsheet.
    * @Default {true}
    */
  var allowExporting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to define csvUrl for export to CSV format.
    * @Default {null}
    */
  var csvUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable formula calculation in Spreadsheet. By enabling this feature, formula calculated while export the Spreadsheet in
    * protected mode.
    * @Default {false}
    */
  var enableFormulaCalculation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to define excelUrl for export to excel format.
    * @Default {null}
    */
  var excelUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to define password while export to excel format.
    * @Default {null}
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to define pdfUrl for export to PDF format.
    * @Default {null}
    */
  var pdfUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ExportSettings {
  @scala.inline
  def apply(
    allowExporting: js.UndefOr[scala.Boolean] = js.undefined,
    csvUrl: java.lang.String = null,
    enableFormulaCalculation: js.UndefOr[scala.Boolean] = js.undefined,
    excelUrl: java.lang.String = null,
    password: java.lang.String = null,
    pdfUrl: java.lang.String = null
  ): ExportSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExporting)) __obj.updateDynamic("allowExporting")(allowExporting)
    if (csvUrl != null) __obj.updateDynamic("csvUrl")(csvUrl)
    if (!js.isUndefined(enableFormulaCalculation)) __obj.updateDynamic("enableFormulaCalculation")(enableFormulaCalculation)
    if (excelUrl != null) __obj.updateDynamic("excelUrl")(excelUrl)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pdfUrl != null) __obj.updateDynamic("pdfUrl")(pdfUrl)
    __obj.asInstanceOf[ExportSettings]
  }
}


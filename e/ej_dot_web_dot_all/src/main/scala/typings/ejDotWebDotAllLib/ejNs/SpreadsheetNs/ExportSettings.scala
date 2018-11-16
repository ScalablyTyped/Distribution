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


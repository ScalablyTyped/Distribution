package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SheetsRangeSetting extends js.Object {
  /** Gets or sets the data to render the Spreadsheet.
               * @Default {null}
               */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Specifies the header styles for the headers in datasource range.
               * @Default {null}
               */
  var headerStyles: js.UndefOr[js.Any] = js.undefined
  /** Specifies the primary key for the datasource in Spreadsheet.
               */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the query for the datasource in Spreadsheet.
               * @Default {null}
               */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
               * @Default {true}
               */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the start cell for the datasource range in Spreadsheet.
               * @Default {A1}
               */
  var startCell: js.UndefOr[java.lang.String] = js.undefined
}


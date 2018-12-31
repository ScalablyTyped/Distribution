package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLocation extends js.Object {
  /**
    * Represents the row or column when metadata is associated with
    * a dimension. The specified DimensionRange must represent a single row
    * or column; it cannot be unbounded or span multiple rows or columns.
    */
  var dimensionRange: js.UndefOr[DimensionRange] = js.undefined
  /** The type of location this object represents.  This field is read-only. */
  var locationType: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the sheet when metadata is associated with an entire sheet. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
  /** True when metadata is associated with an entire spreadsheet. */
  var spreadsheet: js.UndefOr[scala.Boolean] = js.undefined
}


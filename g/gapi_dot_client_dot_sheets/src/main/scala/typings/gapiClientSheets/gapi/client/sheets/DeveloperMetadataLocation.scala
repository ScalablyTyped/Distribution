package typings.gapiClientSheets.gapi.client.sheets

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
  var locationType: js.UndefOr[String] = js.undefined
  /** The ID of the sheet when metadata is associated with an entire sheet. */
  var sheetId: js.UndefOr[Double] = js.undefined
  /** True when metadata is associated with an entire spreadsheet. */
  var spreadsheet: js.UndefOr[Boolean] = js.undefined
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(
    dimensionRange: DimensionRange = null,
    locationType: String = null,
    sheetId: js.UndefOr[Double] = js.undefined,
    spreadsheet: js.UndefOr[Boolean] = js.undefined
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    if (dimensionRange != null) __obj.updateDynamic("dimensionRange")(dimensionRange.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spreadsheet)) __obj.updateDynamic("spreadsheet")(spreadsheet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
}


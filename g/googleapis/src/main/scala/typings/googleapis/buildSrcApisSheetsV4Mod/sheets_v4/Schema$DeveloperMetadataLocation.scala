package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location where metadata may be associated in a spreadsheet.
  */
@js.native
trait Schema$DeveloperMetadataLocation extends js.Object {
  /**
    * Represents the row or column when metadata is associated with a
    * dimension. The specified DimensionRange must represent a single row or
    * column; it cannot be unbounded or span multiple rows or columns.
    */
  var dimensionRange: js.UndefOr[Schema$DimensionRange] = js.native
  /**
    * The type of location this object represents.  This field is read-only.
    */
  var locationType: js.UndefOr[String] = js.native
  /**
    * The ID of the sheet when metadata is associated with an entire sheet.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * True when metadata is associated with an entire spreadsheet.
    */
  var spreadsheet: js.UndefOr[Boolean] = js.native
}

object Schema$DeveloperMetadataLocation {
  @scala.inline
  def apply(
    dimensionRange: Schema$DimensionRange = null,
    locationType: String = null,
    sheetId: Int | Double = null,
    spreadsheet: js.UndefOr[Boolean] = js.undefined
  ): Schema$DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    if (dimensionRange != null) __obj.updateDynamic("dimensionRange")(dimensionRange.asInstanceOf[js.Any])
    if (locationType != null) __obj.updateDynamic("locationType")(locationType.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    if (!js.isUndefined(spreadsheet)) __obj.updateDynamic("spreadsheet")(spreadsheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeveloperMetadataLocation]
  }
}


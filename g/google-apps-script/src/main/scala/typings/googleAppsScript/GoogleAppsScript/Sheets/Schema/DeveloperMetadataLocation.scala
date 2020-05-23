package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLocation extends js.Object {
  var dimensionRange: js.UndefOr[DimensionRange] = js.undefined
  var locationType: js.UndefOr[String] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
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


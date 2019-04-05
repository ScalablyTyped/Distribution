package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLocation extends js.Object {
  var dimensionRange: js.UndefOr[DimensionRange] = js.undefined
  var locationType: js.UndefOr[java.lang.String] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
  var spreadsheet: js.UndefOr[scala.Boolean] = js.undefined
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(
    dimensionRange: DimensionRange = null,
    locationType: java.lang.String = null,
    sheetId: scala.Int | scala.Double = null,
    spreadsheet: js.UndefOr[scala.Boolean] = js.undefined
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    if (dimensionRange != null) __obj.updateDynamic("dimensionRange")(dimensionRange)
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    if (!js.isUndefined(spreadsheet)) __obj.updateDynamic("spreadsheet")(spreadsheet)
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
}


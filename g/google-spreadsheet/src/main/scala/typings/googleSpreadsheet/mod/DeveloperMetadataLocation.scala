package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLocation extends js.Object {
  var dimensionRange: DimensionRange
  var locationType: DeveloperMetadataLocationType
  var sheetId: Double
  var spreadsheet: Boolean
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(
    dimensionRange: DimensionRange,
    locationType: DeveloperMetadataLocationType,
    sheetId: Double,
    spreadsheet: Boolean
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(dimensionRange = dimensionRange.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], spreadsheet = spreadsheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
}


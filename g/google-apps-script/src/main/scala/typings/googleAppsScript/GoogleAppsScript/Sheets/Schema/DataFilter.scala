package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilter extends js.Object {
  var a1Range: js.UndefOr[String] = js.undefined
  var developerMetadataLookup: js.UndefOr[DeveloperMetadataLookup] = js.undefined
  var gridRange: js.UndefOr[GridRange] = js.undefined
}

object DataFilter {
  @scala.inline
  def apply(
    a1Range: String = null,
    developerMetadataLookup: DeveloperMetadataLookup = null,
    gridRange: GridRange = null
  ): DataFilter = {
    val __obj = js.Dynamic.literal()
    if (a1Range != null) __obj.updateDynamic("a1Range")(a1Range.asInstanceOf[js.Any])
    if (developerMetadataLookup != null) __obj.updateDynamic("developerMetadataLookup")(developerMetadataLookup.asInstanceOf[js.Any])
    if (gridRange != null) __obj.updateDynamic("gridRange")(gridRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFilter]
  }
}


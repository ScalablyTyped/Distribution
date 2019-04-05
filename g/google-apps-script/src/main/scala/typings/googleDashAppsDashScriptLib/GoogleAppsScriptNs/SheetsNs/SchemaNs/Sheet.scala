package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.undefined
  var basicFilter: js.UndefOr[BasicFilter] = js.undefined
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.undefined
  var columnGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.undefined
  var data: js.UndefOr[js.Array[GridData]] = js.undefined
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.undefined
  var merges: js.UndefOr[js.Array[GridRange]] = js.undefined
  var properties: js.UndefOr[SheetProperties] = js.undefined
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.undefined
  var rowGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
}

object Sheet {
  @scala.inline
  def apply(
    bandedRanges: js.Array[BandedRange] = null,
    basicFilter: BasicFilter = null,
    charts: js.Array[EmbeddedChart] = null,
    columnGroups: js.Array[DimensionGroup] = null,
    conditionalFormats: js.Array[ConditionalFormatRule] = null,
    data: js.Array[GridData] = null,
    developerMetadata: js.Array[DeveloperMetadata] = null,
    filterViews: js.Array[FilterView] = null,
    merges: js.Array[GridRange] = null,
    properties: SheetProperties = null,
    protectedRanges: js.Array[ProtectedRange] = null,
    rowGroups: js.Array[DimensionGroup] = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (bandedRanges != null) __obj.updateDynamic("bandedRanges")(bandedRanges)
    if (basicFilter != null) __obj.updateDynamic("basicFilter")(basicFilter)
    if (charts != null) __obj.updateDynamic("charts")(charts)
    if (columnGroups != null) __obj.updateDynamic("columnGroups")(columnGroups)
    if (conditionalFormats != null) __obj.updateDynamic("conditionalFormats")(conditionalFormats)
    if (data != null) __obj.updateDynamic("data")(data)
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata)
    if (filterViews != null) __obj.updateDynamic("filterViews")(filterViews)
    if (merges != null) __obj.updateDynamic("merges")(merges)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protectedRanges != null) __obj.updateDynamic("protectedRanges")(protectedRanges)
    if (rowGroups != null) __obj.updateDynamic("rowGroups")(rowGroups)
    __obj.asInstanceOf[Sheet]
  }
}


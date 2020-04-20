package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  /** The banded (alternating colors) ranges on this sheet. */
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.undefined
  /** The filter on this sheet, if any. */
  var basicFilter: js.UndefOr[BasicFilter] = js.undefined
  /** The specifications of every chart on this sheet. */
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.undefined
  /**
    * All column groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var columnGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
  /** The conditional format rules in this sheet. */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.undefined
  /**
    * Data in the grid, if this is a grid sheet.
    *
    * The number of GridData objects returned is dependent on the number of
    * ranges requested on this sheet. For example, if this is representing
    * `Sheet1`, and the spreadsheet was requested with ranges
    * `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the first GridData will have a
    * startRow/startColumn of `0`,
    * while the second one will have `startRow 14` (zero-based row 15),
    * and `startColumn 3` (zero-based column D).
    */
  var data: js.UndefOr[js.Array[GridData]] = js.undefined
  /** The developer metadata associated with a sheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  /** The filter views in this sheet. */
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.undefined
  /** The ranges that are merged together. */
  var merges: js.UndefOr[js.Array[GridRange]] = js.undefined
  /** The properties of the sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
  /** The protected ranges in this sheet. */
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.undefined
  /**
    * All row groups on this sheet, ordered by increasing range start index, then
    * by group depth.
    */
  var rowGroups: js.UndefOr[js.Array[DimensionGroup]] = js.undefined
  /** The slicers on this sheet. */
  var slicers: js.UndefOr[js.Array[Slicer]] = js.undefined
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
    rowGroups: js.Array[DimensionGroup] = null,
    slicers: js.Array[Slicer] = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (bandedRanges != null) __obj.updateDynamic("bandedRanges")(bandedRanges.asInstanceOf[js.Any])
    if (basicFilter != null) __obj.updateDynamic("basicFilter")(basicFilter.asInstanceOf[js.Any])
    if (charts != null) __obj.updateDynamic("charts")(charts.asInstanceOf[js.Any])
    if (columnGroups != null) __obj.updateDynamic("columnGroups")(columnGroups.asInstanceOf[js.Any])
    if (conditionalFormats != null) __obj.updateDynamic("conditionalFormats")(conditionalFormats.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (filterViews != null) __obj.updateDynamic("filterViews")(filterViews.asInstanceOf[js.Any])
    if (merges != null) __obj.updateDynamic("merges")(merges.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protectedRanges != null) __obj.updateDynamic("protectedRanges")(protectedRanges.asInstanceOf[js.Any])
    if (rowGroups != null) __obj.updateDynamic("rowGroups")(rowGroups.asInstanceOf[js.Any])
    if (slicers != null) __obj.updateDynamic("slicers")(slicers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheet]
  }
}


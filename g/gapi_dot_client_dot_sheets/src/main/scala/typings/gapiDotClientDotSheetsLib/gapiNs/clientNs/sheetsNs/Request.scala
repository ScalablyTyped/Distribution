package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  /** Adds a new banded range */
  var addBanding: js.UndefOr[AddBandingRequest] = js.undefined
  /** Adds a chart. */
  var addChart: js.UndefOr[AddChartRequest] = js.undefined
  /** Adds a new conditional format rule. */
  var addConditionalFormatRule: js.UndefOr[AddConditionalFormatRuleRequest] = js.undefined
  /** Adds a filter view. */
  var addFilterView: js.UndefOr[AddFilterViewRequest] = js.undefined
  /** Adds a named range. */
  var addNamedRange: js.UndefOr[AddNamedRangeRequest] = js.undefined
  /** Adds a protected range. */
  var addProtectedRange: js.UndefOr[AddProtectedRangeRequest] = js.undefined
  /** Adds a sheet. */
  var addSheet: js.UndefOr[AddSheetRequest] = js.undefined
  /** Appends cells after the last row with data in a sheet. */
  var appendCells: js.UndefOr[AppendCellsRequest] = js.undefined
  /** Appends dimensions to the end of a sheet. */
  var appendDimension: js.UndefOr[AppendDimensionRequest] = js.undefined
  /** Automatically fills in more data based on existing data. */
  var autoFill: js.UndefOr[AutoFillRequest] = js.undefined
  /**
               * Automatically resizes one or more dimensions based on the contents
               * of the cells in that dimension.
               */
  var autoResizeDimensions: js.UndefOr[AutoResizeDimensionsRequest] = js.undefined
  /** Clears the basic filter on a sheet. */
  var clearBasicFilter: js.UndefOr[ClearBasicFilterRequest] = js.undefined
  /** Copies data from one area and pastes it to another. */
  var copyPaste: js.UndefOr[CopyPasteRequest] = js.undefined
  /** Creates new developer metadata */
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataRequest] = js.undefined
  /** Cuts data from one area and pastes it to another. */
  var cutPaste: js.UndefOr[CutPasteRequest] = js.undefined
  /** Removes a banded range */
  var deleteBanding: js.UndefOr[DeleteBandingRequest] = js.undefined
  /** Deletes an existing conditional format rule. */
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleRequest] = js.undefined
  /** Deletes developer metadata */
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataRequest] = js.undefined
  /** Deletes rows or columns in a sheet. */
  var deleteDimension: js.UndefOr[DeleteDimensionRequest] = js.undefined
  /** Deletes an embedded object (e.g, chart, image) in a sheet. */
  var deleteEmbeddedObject: js.UndefOr[DeleteEmbeddedObjectRequest] = js.undefined
  /** Deletes a filter view from a sheet. */
  var deleteFilterView: js.UndefOr[DeleteFilterViewRequest] = js.undefined
  /** Deletes a named range. */
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.undefined
  /** Deletes a protected range. */
  var deleteProtectedRange: js.UndefOr[DeleteProtectedRangeRequest] = js.undefined
  /** Deletes a range of cells from a sheet, shifting the remaining cells. */
  var deleteRange: js.UndefOr[DeleteRangeRequest] = js.undefined
  /** Deletes a sheet. */
  var deleteSheet: js.UndefOr[DeleteSheetRequest] = js.undefined
  /** Duplicates a filter view. */
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewRequest] = js.undefined
  /** Duplicates a sheet. */
  var duplicateSheet: js.UndefOr[DuplicateSheetRequest] = js.undefined
  /** Finds and replaces occurrences of some text with other text. */
  var findReplace: js.UndefOr[FindReplaceRequest] = js.undefined
  /** Inserts new rows or columns in a sheet. */
  var insertDimension: js.UndefOr[InsertDimensionRequest] = js.undefined
  /** Inserts new cells in a sheet, shifting the existing cells. */
  var insertRange: js.UndefOr[InsertRangeRequest] = js.undefined
  /** Merges cells together. */
  var mergeCells: js.UndefOr[MergeCellsRequest] = js.undefined
  /** Moves rows or columns to another location in a sheet. */
  var moveDimension: js.UndefOr[MoveDimensionRequest] = js.undefined
  /** Pastes data (HTML or delimited) into a sheet. */
  var pasteData: js.UndefOr[PasteDataRequest] = js.undefined
  /** Randomizes the order of the rows in a range. */
  var randomizeRange: js.UndefOr[RandomizeRangeRequest] = js.undefined
  /** Repeats a single cell across a range. */
  var repeatCell: js.UndefOr[RepeatCellRequest] = js.undefined
  /** Sets the basic filter on a sheet. */
  var setBasicFilter: js.UndefOr[SetBasicFilterRequest] = js.undefined
  /** Sets data validation for one or more cells. */
  var setDataValidation: js.UndefOr[SetDataValidationRequest] = js.undefined
  /** Sorts data in a range. */
  var sortRange: js.UndefOr[SortRangeRequest] = js.undefined
  /** Converts a column of text into many columns of text. */
  var textToColumns: js.UndefOr[TextToColumnsRequest] = js.undefined
  /** Unmerges merged cells. */
  var unmergeCells: js.UndefOr[UnmergeCellsRequest] = js.undefined
  /** Updates a banded range */
  var updateBanding: js.UndefOr[UpdateBandingRequest] = js.undefined
  /** Updates the borders in a range of cells. */
  var updateBorders: js.UndefOr[UpdateBordersRequest] = js.undefined
  /** Updates many cells at once. */
  var updateCells: js.UndefOr[UpdateCellsRequest] = js.undefined
  /** Updates a chart's specifications. */
  var updateChartSpec: js.UndefOr[UpdateChartSpecRequest] = js.undefined
  /** Updates an existing conditional format rule. */
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleRequest] = js.undefined
  /** Updates an existing developer metadata entry */
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataRequest] = js.undefined
  /** Updates dimensions' properties. */
  var updateDimensionProperties: js.UndefOr[UpdateDimensionPropertiesRequest] = js.undefined
  /** Updates an embedded object's (e.g. chart, image) position. */
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionRequest] = js.undefined
  /** Updates the properties of a filter view. */
  var updateFilterView: js.UndefOr[UpdateFilterViewRequest] = js.undefined
  /** Updates a named range. */
  var updateNamedRange: js.UndefOr[UpdateNamedRangeRequest] = js.undefined
  /** Updates a protected range. */
  var updateProtectedRange: js.UndefOr[UpdateProtectedRangeRequest] = js.undefined
  /** Updates a sheet's properties. */
  var updateSheetProperties: js.UndefOr[UpdateSheetPropertiesRequest] = js.undefined
  /** Updates the spreadsheet's properties. */
  var updateSpreadsheetProperties: js.UndefOr[UpdateSpreadsheetPropertiesRequest] = js.undefined
}


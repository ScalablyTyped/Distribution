package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single kind of update to apply to a spreadsheet.
  */
@js.native
trait Schema$Request extends js.Object {
  /**
    * Adds a new banded range
    */
  var addBanding: js.UndefOr[Schema$AddBandingRequest] = js.native
  /**
    * Adds a chart.
    */
  var addChart: js.UndefOr[Schema$AddChartRequest] = js.native
  /**
    * Adds a new conditional format rule.
    */
  var addConditionalFormatRule: js.UndefOr[Schema$AddConditionalFormatRuleRequest] = js.native
  /**
    * Creates a group over the specified range.
    */
  var addDimensionGroup: js.UndefOr[Schema$AddDimensionGroupRequest] = js.native
  /**
    * Adds a filter view.
    */
  var addFilterView: js.UndefOr[Schema$AddFilterViewRequest] = js.native
  /**
    * Adds a named range.
    */
  var addNamedRange: js.UndefOr[Schema$AddNamedRangeRequest] = js.native
  /**
    * Adds a protected range.
    */
  var addProtectedRange: js.UndefOr[Schema$AddProtectedRangeRequest] = js.native
  /**
    * Adds a sheet.
    */
  var addSheet: js.UndefOr[Schema$AddSheetRequest] = js.native
  /**
    * Appends cells after the last row with data in a sheet.
    */
  var appendCells: js.UndefOr[Schema$AppendCellsRequest] = js.native
  /**
    * Appends dimensions to the end of a sheet.
    */
  var appendDimension: js.UndefOr[Schema$AppendDimensionRequest] = js.native
  /**
    * Automatically fills in more data based on existing data.
    */
  var autoFill: js.UndefOr[Schema$AutoFillRequest] = js.native
  /**
    * Automatically resizes one or more dimensions based on the contents of the
    * cells in that dimension.
    */
  var autoResizeDimensions: js.UndefOr[Schema$AutoResizeDimensionsRequest] = js.native
  /**
    * Clears the basic filter on a sheet.
    */
  var clearBasicFilter: js.UndefOr[Schema$ClearBasicFilterRequest] = js.native
  /**
    * Copies data from one area and pastes it to another.
    */
  var copyPaste: js.UndefOr[Schema$CopyPasteRequest] = js.native
  /**
    * Creates new developer metadata
    */
  var createDeveloperMetadata: js.UndefOr[Schema$CreateDeveloperMetadataRequest] = js.native
  /**
    * Cuts data from one area and pastes it to another.
    */
  var cutPaste: js.UndefOr[Schema$CutPasteRequest] = js.native
  /**
    * Removes a banded range
    */
  var deleteBanding: js.UndefOr[Schema$DeleteBandingRequest] = js.native
  /**
    * Deletes an existing conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[Schema$DeleteConditionalFormatRuleRequest] = js.native
  /**
    * Deletes developer metadata
    */
  var deleteDeveloperMetadata: js.UndefOr[Schema$DeleteDeveloperMetadataRequest] = js.native
  /**
    * Deletes rows or columns in a sheet.
    */
  var deleteDimension: js.UndefOr[Schema$DeleteDimensionRequest] = js.native
  /**
    * Deletes a group over the specified range.
    */
  var deleteDimensionGroup: js.UndefOr[Schema$DeleteDimensionGroupRequest] = js.native
  /**
    * Deletes an embedded object (e.g, chart, image) in a sheet.
    */
  var deleteEmbeddedObject: js.UndefOr[Schema$DeleteEmbeddedObjectRequest] = js.native
  /**
    * Deletes a filter view from a sheet.
    */
  var deleteFilterView: js.UndefOr[Schema$DeleteFilterViewRequest] = js.native
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[Schema$DeleteNamedRangeRequest] = js.native
  /**
    * Deletes a protected range.
    */
  var deleteProtectedRange: js.UndefOr[Schema$DeleteProtectedRangeRequest] = js.native
  /**
    * Deletes a range of cells from a sheet, shifting the remaining cells.
    */
  var deleteRange: js.UndefOr[Schema$DeleteRangeRequest] = js.native
  /**
    * Deletes a sheet.
    */
  var deleteSheet: js.UndefOr[Schema$DeleteSheetRequest] = js.native
  /**
    * Duplicates a filter view.
    */
  var duplicateFilterView: js.UndefOr[Schema$DuplicateFilterViewRequest] = js.native
  /**
    * Duplicates a sheet.
    */
  var duplicateSheet: js.UndefOr[Schema$DuplicateSheetRequest] = js.native
  /**
    * Finds and replaces occurrences of some text with other text.
    */
  var findReplace: js.UndefOr[Schema$FindReplaceRequest] = js.native
  /**
    * Inserts new rows or columns in a sheet.
    */
  var insertDimension: js.UndefOr[Schema$InsertDimensionRequest] = js.native
  /**
    * Inserts new cells in a sheet, shifting the existing cells.
    */
  var insertRange: js.UndefOr[Schema$InsertRangeRequest] = js.native
  /**
    * Merges cells together.
    */
  var mergeCells: js.UndefOr[Schema$MergeCellsRequest] = js.native
  /**
    * Moves rows or columns to another location in a sheet.
    */
  var moveDimension: js.UndefOr[Schema$MoveDimensionRequest] = js.native
  /**
    * Pastes data (HTML or delimited) into a sheet.
    */
  var pasteData: js.UndefOr[Schema$PasteDataRequest] = js.native
  /**
    * Randomizes the order of the rows in a range.
    */
  var randomizeRange: js.UndefOr[Schema$RandomizeRangeRequest] = js.native
  /**
    * Repeats a single cell across a range.
    */
  var repeatCell: js.UndefOr[Schema$RepeatCellRequest] = js.native
  /**
    * Sets the basic filter on a sheet.
    */
  var setBasicFilter: js.UndefOr[Schema$SetBasicFilterRequest] = js.native
  /**
    * Sets data validation for one or more cells.
    */
  var setDataValidation: js.UndefOr[Schema$SetDataValidationRequest] = js.native
  /**
    * Sorts data in a range.
    */
  var sortRange: js.UndefOr[Schema$SortRangeRequest] = js.native
  /**
    * Converts a column of text into many columns of text.
    */
  var textToColumns: js.UndefOr[Schema$TextToColumnsRequest] = js.native
  /**
    * Unmerges merged cells.
    */
  var unmergeCells: js.UndefOr[Schema$UnmergeCellsRequest] = js.native
  /**
    * Updates a banded range
    */
  var updateBanding: js.UndefOr[Schema$UpdateBandingRequest] = js.native
  /**
    * Updates the borders in a range of cells.
    */
  var updateBorders: js.UndefOr[Schema$UpdateBordersRequest] = js.native
  /**
    * Updates many cells at once.
    */
  var updateCells: js.UndefOr[Schema$UpdateCellsRequest] = js.native
  /**
    * Updates a chart&#39;s specifications.
    */
  var updateChartSpec: js.UndefOr[Schema$UpdateChartSpecRequest] = js.native
  /**
    * Updates an existing conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[Schema$UpdateConditionalFormatRuleRequest] = js.native
  /**
    * Updates an existing developer metadata entry
    */
  var updateDeveloperMetadata: js.UndefOr[Schema$UpdateDeveloperMetadataRequest] = js.native
  /**
    * Updates the state of the specified group.
    */
  var updateDimensionGroup: js.UndefOr[Schema$UpdateDimensionGroupRequest] = js.native
  /**
    * Updates dimensions&#39; properties.
    */
  var updateDimensionProperties: js.UndefOr[Schema$UpdateDimensionPropertiesRequest] = js.native
  /**
    * Updates an embedded object&#39;s (e.g. chart, image) position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[Schema$UpdateEmbeddedObjectPositionRequest] = js.native
  /**
    * Updates the properties of a filter view.
    */
  var updateFilterView: js.UndefOr[Schema$UpdateFilterViewRequest] = js.native
  /**
    * Updates a named range.
    */
  var updateNamedRange: js.UndefOr[Schema$UpdateNamedRangeRequest] = js.native
  /**
    * Updates a protected range.
    */
  var updateProtectedRange: js.UndefOr[Schema$UpdateProtectedRangeRequest] = js.native
  /**
    * Updates a sheet&#39;s properties.
    */
  var updateSheetProperties: js.UndefOr[Schema$UpdateSheetPropertiesRequest] = js.native
  /**
    * Updates the spreadsheet&#39;s properties.
    */
  var updateSpreadsheetProperties: js.UndefOr[Schema$UpdateSpreadsheetPropertiesRequest] = js.native
}

object Schema$Request {
  @scala.inline
  def apply(
    addBanding: Schema$AddBandingRequest = null,
    addChart: Schema$AddChartRequest = null,
    addConditionalFormatRule: Schema$AddConditionalFormatRuleRequest = null,
    addDimensionGroup: Schema$AddDimensionGroupRequest = null,
    addFilterView: Schema$AddFilterViewRequest = null,
    addNamedRange: Schema$AddNamedRangeRequest = null,
    addProtectedRange: Schema$AddProtectedRangeRequest = null,
    addSheet: Schema$AddSheetRequest = null,
    appendCells: Schema$AppendCellsRequest = null,
    appendDimension: Schema$AppendDimensionRequest = null,
    autoFill: Schema$AutoFillRequest = null,
    autoResizeDimensions: Schema$AutoResizeDimensionsRequest = null,
    clearBasicFilter: Schema$ClearBasicFilterRequest = null,
    copyPaste: Schema$CopyPasteRequest = null,
    createDeveloperMetadata: Schema$CreateDeveloperMetadataRequest = null,
    cutPaste: Schema$CutPasteRequest = null,
    deleteBanding: Schema$DeleteBandingRequest = null,
    deleteConditionalFormatRule: Schema$DeleteConditionalFormatRuleRequest = null,
    deleteDeveloperMetadata: Schema$DeleteDeveloperMetadataRequest = null,
    deleteDimension: Schema$DeleteDimensionRequest = null,
    deleteDimensionGroup: Schema$DeleteDimensionGroupRequest = null,
    deleteEmbeddedObject: Schema$DeleteEmbeddedObjectRequest = null,
    deleteFilterView: Schema$DeleteFilterViewRequest = null,
    deleteNamedRange: Schema$DeleteNamedRangeRequest = null,
    deleteProtectedRange: Schema$DeleteProtectedRangeRequest = null,
    deleteRange: Schema$DeleteRangeRequest = null,
    deleteSheet: Schema$DeleteSheetRequest = null,
    duplicateFilterView: Schema$DuplicateFilterViewRequest = null,
    duplicateSheet: Schema$DuplicateSheetRequest = null,
    findReplace: Schema$FindReplaceRequest = null,
    insertDimension: Schema$InsertDimensionRequest = null,
    insertRange: Schema$InsertRangeRequest = null,
    mergeCells: Schema$MergeCellsRequest = null,
    moveDimension: Schema$MoveDimensionRequest = null,
    pasteData: Schema$PasteDataRequest = null,
    randomizeRange: Schema$RandomizeRangeRequest = null,
    repeatCell: Schema$RepeatCellRequest = null,
    setBasicFilter: Schema$SetBasicFilterRequest = null,
    setDataValidation: Schema$SetDataValidationRequest = null,
    sortRange: Schema$SortRangeRequest = null,
    textToColumns: Schema$TextToColumnsRequest = null,
    unmergeCells: Schema$UnmergeCellsRequest = null,
    updateBanding: Schema$UpdateBandingRequest = null,
    updateBorders: Schema$UpdateBordersRequest = null,
    updateCells: Schema$UpdateCellsRequest = null,
    updateChartSpec: Schema$UpdateChartSpecRequest = null,
    updateConditionalFormatRule: Schema$UpdateConditionalFormatRuleRequest = null,
    updateDeveloperMetadata: Schema$UpdateDeveloperMetadataRequest = null,
    updateDimensionGroup: Schema$UpdateDimensionGroupRequest = null,
    updateDimensionProperties: Schema$UpdateDimensionPropertiesRequest = null,
    updateEmbeddedObjectPosition: Schema$UpdateEmbeddedObjectPositionRequest = null,
    updateFilterView: Schema$UpdateFilterViewRequest = null,
    updateNamedRange: Schema$UpdateNamedRangeRequest = null,
    updateProtectedRange: Schema$UpdateProtectedRangeRequest = null,
    updateSheetProperties: Schema$UpdateSheetPropertiesRequest = null,
    updateSpreadsheetProperties: Schema$UpdateSpreadsheetPropertiesRequest = null
  ): Schema$Request = {
    val __obj = js.Dynamic.literal()
    if (addBanding != null) __obj.updateDynamic("addBanding")(addBanding.asInstanceOf[js.Any])
    if (addChart != null) __obj.updateDynamic("addChart")(addChart.asInstanceOf[js.Any])
    if (addConditionalFormatRule != null) __obj.updateDynamic("addConditionalFormatRule")(addConditionalFormatRule.asInstanceOf[js.Any])
    if (addDimensionGroup != null) __obj.updateDynamic("addDimensionGroup")(addDimensionGroup.asInstanceOf[js.Any])
    if (addFilterView != null) __obj.updateDynamic("addFilterView")(addFilterView.asInstanceOf[js.Any])
    if (addNamedRange != null) __obj.updateDynamic("addNamedRange")(addNamedRange.asInstanceOf[js.Any])
    if (addProtectedRange != null) __obj.updateDynamic("addProtectedRange")(addProtectedRange.asInstanceOf[js.Any])
    if (addSheet != null) __obj.updateDynamic("addSheet")(addSheet.asInstanceOf[js.Any])
    if (appendCells != null) __obj.updateDynamic("appendCells")(appendCells.asInstanceOf[js.Any])
    if (appendDimension != null) __obj.updateDynamic("appendDimension")(appendDimension.asInstanceOf[js.Any])
    if (autoFill != null) __obj.updateDynamic("autoFill")(autoFill.asInstanceOf[js.Any])
    if (autoResizeDimensions != null) __obj.updateDynamic("autoResizeDimensions")(autoResizeDimensions.asInstanceOf[js.Any])
    if (clearBasicFilter != null) __obj.updateDynamic("clearBasicFilter")(clearBasicFilter.asInstanceOf[js.Any])
    if (copyPaste != null) __obj.updateDynamic("copyPaste")(copyPaste.asInstanceOf[js.Any])
    if (createDeveloperMetadata != null) __obj.updateDynamic("createDeveloperMetadata")(createDeveloperMetadata.asInstanceOf[js.Any])
    if (cutPaste != null) __obj.updateDynamic("cutPaste")(cutPaste.asInstanceOf[js.Any])
    if (deleteBanding != null) __obj.updateDynamic("deleteBanding")(deleteBanding.asInstanceOf[js.Any])
    if (deleteConditionalFormatRule != null) __obj.updateDynamic("deleteConditionalFormatRule")(deleteConditionalFormatRule.asInstanceOf[js.Any])
    if (deleteDeveloperMetadata != null) __obj.updateDynamic("deleteDeveloperMetadata")(deleteDeveloperMetadata.asInstanceOf[js.Any])
    if (deleteDimension != null) __obj.updateDynamic("deleteDimension")(deleteDimension.asInstanceOf[js.Any])
    if (deleteDimensionGroup != null) __obj.updateDynamic("deleteDimensionGroup")(deleteDimensionGroup.asInstanceOf[js.Any])
    if (deleteEmbeddedObject != null) __obj.updateDynamic("deleteEmbeddedObject")(deleteEmbeddedObject.asInstanceOf[js.Any])
    if (deleteFilterView != null) __obj.updateDynamic("deleteFilterView")(deleteFilterView.asInstanceOf[js.Any])
    if (deleteNamedRange != null) __obj.updateDynamic("deleteNamedRange")(deleteNamedRange.asInstanceOf[js.Any])
    if (deleteProtectedRange != null) __obj.updateDynamic("deleteProtectedRange")(deleteProtectedRange.asInstanceOf[js.Any])
    if (deleteRange != null) __obj.updateDynamic("deleteRange")(deleteRange.asInstanceOf[js.Any])
    if (deleteSheet != null) __obj.updateDynamic("deleteSheet")(deleteSheet.asInstanceOf[js.Any])
    if (duplicateFilterView != null) __obj.updateDynamic("duplicateFilterView")(duplicateFilterView.asInstanceOf[js.Any])
    if (duplicateSheet != null) __obj.updateDynamic("duplicateSheet")(duplicateSheet.asInstanceOf[js.Any])
    if (findReplace != null) __obj.updateDynamic("findReplace")(findReplace.asInstanceOf[js.Any])
    if (insertDimension != null) __obj.updateDynamic("insertDimension")(insertDimension.asInstanceOf[js.Any])
    if (insertRange != null) __obj.updateDynamic("insertRange")(insertRange.asInstanceOf[js.Any])
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells.asInstanceOf[js.Any])
    if (moveDimension != null) __obj.updateDynamic("moveDimension")(moveDimension.asInstanceOf[js.Any])
    if (pasteData != null) __obj.updateDynamic("pasteData")(pasteData.asInstanceOf[js.Any])
    if (randomizeRange != null) __obj.updateDynamic("randomizeRange")(randomizeRange.asInstanceOf[js.Any])
    if (repeatCell != null) __obj.updateDynamic("repeatCell")(repeatCell.asInstanceOf[js.Any])
    if (setBasicFilter != null) __obj.updateDynamic("setBasicFilter")(setBasicFilter.asInstanceOf[js.Any])
    if (setDataValidation != null) __obj.updateDynamic("setDataValidation")(setDataValidation.asInstanceOf[js.Any])
    if (sortRange != null) __obj.updateDynamic("sortRange")(sortRange.asInstanceOf[js.Any])
    if (textToColumns != null) __obj.updateDynamic("textToColumns")(textToColumns.asInstanceOf[js.Any])
    if (unmergeCells != null) __obj.updateDynamic("unmergeCells")(unmergeCells.asInstanceOf[js.Any])
    if (updateBanding != null) __obj.updateDynamic("updateBanding")(updateBanding.asInstanceOf[js.Any])
    if (updateBorders != null) __obj.updateDynamic("updateBorders")(updateBorders.asInstanceOf[js.Any])
    if (updateCells != null) __obj.updateDynamic("updateCells")(updateCells.asInstanceOf[js.Any])
    if (updateChartSpec != null) __obj.updateDynamic("updateChartSpec")(updateChartSpec.asInstanceOf[js.Any])
    if (updateConditionalFormatRule != null) __obj.updateDynamic("updateConditionalFormatRule")(updateConditionalFormatRule.asInstanceOf[js.Any])
    if (updateDeveloperMetadata != null) __obj.updateDynamic("updateDeveloperMetadata")(updateDeveloperMetadata.asInstanceOf[js.Any])
    if (updateDimensionGroup != null) __obj.updateDynamic("updateDimensionGroup")(updateDimensionGroup.asInstanceOf[js.Any])
    if (updateDimensionProperties != null) __obj.updateDynamic("updateDimensionProperties")(updateDimensionProperties.asInstanceOf[js.Any])
    if (updateEmbeddedObjectPosition != null) __obj.updateDynamic("updateEmbeddedObjectPosition")(updateEmbeddedObjectPosition.asInstanceOf[js.Any])
    if (updateFilterView != null) __obj.updateDynamic("updateFilterView")(updateFilterView.asInstanceOf[js.Any])
    if (updateNamedRange != null) __obj.updateDynamic("updateNamedRange")(updateNamedRange.asInstanceOf[js.Any])
    if (updateProtectedRange != null) __obj.updateDynamic("updateProtectedRange")(updateProtectedRange.asInstanceOf[js.Any])
    if (updateSheetProperties != null) __obj.updateDynamic("updateSheetProperties")(updateSheetProperties.asInstanceOf[js.Any])
    if (updateSpreadsheetProperties != null) __obj.updateDynamic("updateSpreadsheetProperties")(updateSpreadsheetProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Request]
  }
}


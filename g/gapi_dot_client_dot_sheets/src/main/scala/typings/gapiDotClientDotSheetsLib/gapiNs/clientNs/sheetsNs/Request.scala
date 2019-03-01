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

object Request {
  @scala.inline
  def apply(
    addBanding: AddBandingRequest = null,
    addChart: AddChartRequest = null,
    addConditionalFormatRule: AddConditionalFormatRuleRequest = null,
    addFilterView: AddFilterViewRequest = null,
    addNamedRange: AddNamedRangeRequest = null,
    addProtectedRange: AddProtectedRangeRequest = null,
    addSheet: AddSheetRequest = null,
    appendCells: AppendCellsRequest = null,
    appendDimension: AppendDimensionRequest = null,
    autoFill: AutoFillRequest = null,
    autoResizeDimensions: AutoResizeDimensionsRequest = null,
    clearBasicFilter: ClearBasicFilterRequest = null,
    copyPaste: CopyPasteRequest = null,
    createDeveloperMetadata: CreateDeveloperMetadataRequest = null,
    cutPaste: CutPasteRequest = null,
    deleteBanding: DeleteBandingRequest = null,
    deleteConditionalFormatRule: DeleteConditionalFormatRuleRequest = null,
    deleteDeveloperMetadata: DeleteDeveloperMetadataRequest = null,
    deleteDimension: DeleteDimensionRequest = null,
    deleteEmbeddedObject: DeleteEmbeddedObjectRequest = null,
    deleteFilterView: DeleteFilterViewRequest = null,
    deleteNamedRange: DeleteNamedRangeRequest = null,
    deleteProtectedRange: DeleteProtectedRangeRequest = null,
    deleteRange: DeleteRangeRequest = null,
    deleteSheet: DeleteSheetRequest = null,
    duplicateFilterView: DuplicateFilterViewRequest = null,
    duplicateSheet: DuplicateSheetRequest = null,
    findReplace: FindReplaceRequest = null,
    insertDimension: InsertDimensionRequest = null,
    insertRange: InsertRangeRequest = null,
    mergeCells: MergeCellsRequest = null,
    moveDimension: MoveDimensionRequest = null,
    pasteData: PasteDataRequest = null,
    randomizeRange: RandomizeRangeRequest = null,
    repeatCell: RepeatCellRequest = null,
    setBasicFilter: SetBasicFilterRequest = null,
    setDataValidation: SetDataValidationRequest = null,
    sortRange: SortRangeRequest = null,
    textToColumns: TextToColumnsRequest = null,
    unmergeCells: UnmergeCellsRequest = null,
    updateBanding: UpdateBandingRequest = null,
    updateBorders: UpdateBordersRequest = null,
    updateCells: UpdateCellsRequest = null,
    updateChartSpec: UpdateChartSpecRequest = null,
    updateConditionalFormatRule: UpdateConditionalFormatRuleRequest = null,
    updateDeveloperMetadata: UpdateDeveloperMetadataRequest = null,
    updateDimensionProperties: UpdateDimensionPropertiesRequest = null,
    updateEmbeddedObjectPosition: UpdateEmbeddedObjectPositionRequest = null,
    updateFilterView: UpdateFilterViewRequest = null,
    updateNamedRange: UpdateNamedRangeRequest = null,
    updateProtectedRange: UpdateProtectedRangeRequest = null,
    updateSheetProperties: UpdateSheetPropertiesRequest = null,
    updateSpreadsheetProperties: UpdateSpreadsheetPropertiesRequest = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (addBanding != null) __obj.updateDynamic("addBanding")(addBanding)
    if (addChart != null) __obj.updateDynamic("addChart")(addChart)
    if (addConditionalFormatRule != null) __obj.updateDynamic("addConditionalFormatRule")(addConditionalFormatRule)
    if (addFilterView != null) __obj.updateDynamic("addFilterView")(addFilterView)
    if (addNamedRange != null) __obj.updateDynamic("addNamedRange")(addNamedRange)
    if (addProtectedRange != null) __obj.updateDynamic("addProtectedRange")(addProtectedRange)
    if (addSheet != null) __obj.updateDynamic("addSheet")(addSheet)
    if (appendCells != null) __obj.updateDynamic("appendCells")(appendCells)
    if (appendDimension != null) __obj.updateDynamic("appendDimension")(appendDimension)
    if (autoFill != null) __obj.updateDynamic("autoFill")(autoFill)
    if (autoResizeDimensions != null) __obj.updateDynamic("autoResizeDimensions")(autoResizeDimensions)
    if (clearBasicFilter != null) __obj.updateDynamic("clearBasicFilter")(clearBasicFilter)
    if (copyPaste != null) __obj.updateDynamic("copyPaste")(copyPaste)
    if (createDeveloperMetadata != null) __obj.updateDynamic("createDeveloperMetadata")(createDeveloperMetadata)
    if (cutPaste != null) __obj.updateDynamic("cutPaste")(cutPaste)
    if (deleteBanding != null) __obj.updateDynamic("deleteBanding")(deleteBanding)
    if (deleteConditionalFormatRule != null) __obj.updateDynamic("deleteConditionalFormatRule")(deleteConditionalFormatRule)
    if (deleteDeveloperMetadata != null) __obj.updateDynamic("deleteDeveloperMetadata")(deleteDeveloperMetadata)
    if (deleteDimension != null) __obj.updateDynamic("deleteDimension")(deleteDimension)
    if (deleteEmbeddedObject != null) __obj.updateDynamic("deleteEmbeddedObject")(deleteEmbeddedObject)
    if (deleteFilterView != null) __obj.updateDynamic("deleteFilterView")(deleteFilterView)
    if (deleteNamedRange != null) __obj.updateDynamic("deleteNamedRange")(deleteNamedRange)
    if (deleteProtectedRange != null) __obj.updateDynamic("deleteProtectedRange")(deleteProtectedRange)
    if (deleteRange != null) __obj.updateDynamic("deleteRange")(deleteRange)
    if (deleteSheet != null) __obj.updateDynamic("deleteSheet")(deleteSheet)
    if (duplicateFilterView != null) __obj.updateDynamic("duplicateFilterView")(duplicateFilterView)
    if (duplicateSheet != null) __obj.updateDynamic("duplicateSheet")(duplicateSheet)
    if (findReplace != null) __obj.updateDynamic("findReplace")(findReplace)
    if (insertDimension != null) __obj.updateDynamic("insertDimension")(insertDimension)
    if (insertRange != null) __obj.updateDynamic("insertRange")(insertRange)
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells)
    if (moveDimension != null) __obj.updateDynamic("moveDimension")(moveDimension)
    if (pasteData != null) __obj.updateDynamic("pasteData")(pasteData)
    if (randomizeRange != null) __obj.updateDynamic("randomizeRange")(randomizeRange)
    if (repeatCell != null) __obj.updateDynamic("repeatCell")(repeatCell)
    if (setBasicFilter != null) __obj.updateDynamic("setBasicFilter")(setBasicFilter)
    if (setDataValidation != null) __obj.updateDynamic("setDataValidation")(setDataValidation)
    if (sortRange != null) __obj.updateDynamic("sortRange")(sortRange)
    if (textToColumns != null) __obj.updateDynamic("textToColumns")(textToColumns)
    if (unmergeCells != null) __obj.updateDynamic("unmergeCells")(unmergeCells)
    if (updateBanding != null) __obj.updateDynamic("updateBanding")(updateBanding)
    if (updateBorders != null) __obj.updateDynamic("updateBorders")(updateBorders)
    if (updateCells != null) __obj.updateDynamic("updateCells")(updateCells)
    if (updateChartSpec != null) __obj.updateDynamic("updateChartSpec")(updateChartSpec)
    if (updateConditionalFormatRule != null) __obj.updateDynamic("updateConditionalFormatRule")(updateConditionalFormatRule)
    if (updateDeveloperMetadata != null) __obj.updateDynamic("updateDeveloperMetadata")(updateDeveloperMetadata)
    if (updateDimensionProperties != null) __obj.updateDynamic("updateDimensionProperties")(updateDimensionProperties)
    if (updateEmbeddedObjectPosition != null) __obj.updateDynamic("updateEmbeddedObjectPosition")(updateEmbeddedObjectPosition)
    if (updateFilterView != null) __obj.updateDynamic("updateFilterView")(updateFilterView)
    if (updateNamedRange != null) __obj.updateDynamic("updateNamedRange")(updateNamedRange)
    if (updateProtectedRange != null) __obj.updateDynamic("updateProtectedRange")(updateProtectedRange)
    if (updateSheetProperties != null) __obj.updateDynamic("updateSheetProperties")(updateSheetProperties)
    if (updateSpreadsheetProperties != null) __obj.updateDynamic("updateSpreadsheetProperties")(updateSpreadsheetProperties)
    __obj.asInstanceOf[Request]
  }
}


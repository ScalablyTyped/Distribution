package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /** Adds a new banded range */
  var addBanding: js.UndefOr[AddBandingRequest] = js.native
  /** Adds a chart. */
  var addChart: js.UndefOr[AddChartRequest] = js.native
  /** Adds a new conditional format rule. */
  var addConditionalFormatRule: js.UndefOr[AddConditionalFormatRuleRequest] = js.native
  /** Creates a group over the specified range. */
  var addDimensionGroup: js.UndefOr[AddDimensionGroupRequest] = js.native
  /** Adds a filter view. */
  var addFilterView: js.UndefOr[AddFilterViewRequest] = js.native
  /** Adds a named range. */
  var addNamedRange: js.UndefOr[AddNamedRangeRequest] = js.native
  /** Adds a protected range. */
  var addProtectedRange: js.UndefOr[AddProtectedRangeRequest] = js.native
  /** Adds a sheet. */
  var addSheet: js.UndefOr[AddSheetRequest] = js.native
  /** Adds a slicer. */
  var addSlicer: js.UndefOr[AddSlicerRequest] = js.native
  /** Appends cells after the last row with data in a sheet. */
  var appendCells: js.UndefOr[AppendCellsRequest] = js.native
  /** Appends dimensions to the end of a sheet. */
  var appendDimension: js.UndefOr[AppendDimensionRequest] = js.native
  /** Automatically fills in more data based on existing data. */
  var autoFill: js.UndefOr[AutoFillRequest] = js.native
  /**
    * Automatically resizes one or more dimensions based on the contents
    * of the cells in that dimension.
    */
  var autoResizeDimensions: js.UndefOr[AutoResizeDimensionsRequest] = js.native
  /** Clears the basic filter on a sheet. */
  var clearBasicFilter: js.UndefOr[ClearBasicFilterRequest] = js.native
  /** Copies data from one area and pastes it to another. */
  var copyPaste: js.UndefOr[CopyPasteRequest] = js.native
  /** Creates new developer metadata */
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataRequest] = js.native
  /** Cuts data from one area and pastes it to another. */
  var cutPaste: js.UndefOr[CutPasteRequest] = js.native
  /** Removes a banded range */
  var deleteBanding: js.UndefOr[DeleteBandingRequest] = js.native
  /** Deletes an existing conditional format rule. */
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleRequest] = js.native
  /** Deletes developer metadata */
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataRequest] = js.native
  /** Deletes rows or columns in a sheet. */
  var deleteDimension: js.UndefOr[DeleteDimensionRequest] = js.native
  /** Deletes a group over the specified range. */
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupRequest] = js.native
  /**
    * Removes rows containing duplicate values in specified columns of a cell
    * range.
    */
  var deleteDuplicates: js.UndefOr[DeleteDuplicatesRequest] = js.native
  /** Deletes an embedded object (e.g, chart, image) in a sheet. */
  var deleteEmbeddedObject: js.UndefOr[DeleteEmbeddedObjectRequest] = js.native
  /** Deletes a filter view from a sheet. */
  var deleteFilterView: js.UndefOr[DeleteFilterViewRequest] = js.native
  /** Deletes a named range. */
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.native
  /** Deletes a protected range. */
  var deleteProtectedRange: js.UndefOr[DeleteProtectedRangeRequest] = js.native
  /** Deletes a range of cells from a sheet, shifting the remaining cells. */
  var deleteRange: js.UndefOr[DeleteRangeRequest] = js.native
  /** Deletes a sheet. */
  var deleteSheet: js.UndefOr[DeleteSheetRequest] = js.native
  /** Duplicates a filter view. */
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewRequest] = js.native
  /** Duplicates a sheet. */
  var duplicateSheet: js.UndefOr[DuplicateSheetRequest] = js.native
  /** Finds and replaces occurrences of some text with other text. */
  var findReplace: js.UndefOr[FindReplaceRequest] = js.native
  /** Inserts new rows or columns in a sheet. */
  var insertDimension: js.UndefOr[InsertDimensionRequest] = js.native
  /** Inserts new cells in a sheet, shifting the existing cells. */
  var insertRange: js.UndefOr[InsertRangeRequest] = js.native
  /** Merges cells together. */
  var mergeCells: js.UndefOr[MergeCellsRequest] = js.native
  /** Moves rows or columns to another location in a sheet. */
  var moveDimension: js.UndefOr[MoveDimensionRequest] = js.native
  /** Pastes data (HTML or delimited) into a sheet. */
  var pasteData: js.UndefOr[PasteDataRequest] = js.native
  /** Randomizes the order of the rows in a range. */
  var randomizeRange: js.UndefOr[RandomizeRangeRequest] = js.native
  /** Repeats a single cell across a range. */
  var repeatCell: js.UndefOr[RepeatCellRequest] = js.native
  /** Sets the basic filter on a sheet. */
  var setBasicFilter: js.UndefOr[SetBasicFilterRequest] = js.native
  /** Sets data validation for one or more cells. */
  var setDataValidation: js.UndefOr[SetDataValidationRequest] = js.native
  /** Sorts data in a range. */
  var sortRange: js.UndefOr[SortRangeRequest] = js.native
  /** Converts a column of text into many columns of text. */
  var textToColumns: js.UndefOr[TextToColumnsRequest] = js.native
  /** Trims cells of whitespace (such as spaces, tabs, or new lines). */
  var trimWhitespace: js.UndefOr[TrimWhitespaceRequest] = js.native
  /** Unmerges merged cells. */
  var unmergeCells: js.UndefOr[UnmergeCellsRequest] = js.native
  /** Updates a banded range */
  var updateBanding: js.UndefOr[UpdateBandingRequest] = js.native
  /** Updates the borders in a range of cells. */
  var updateBorders: js.UndefOr[UpdateBordersRequest] = js.native
  /** Updates many cells at once. */
  var updateCells: js.UndefOr[UpdateCellsRequest] = js.native
  /** Updates a chart's specifications. */
  var updateChartSpec: js.UndefOr[UpdateChartSpecRequest] = js.native
  /** Updates an existing conditional format rule. */
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleRequest] = js.native
  /** Updates an existing developer metadata entry */
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataRequest] = js.native
  /** Updates the state of the specified group. */
  var updateDimensionGroup: js.UndefOr[UpdateDimensionGroupRequest] = js.native
  /** Updates dimensions' properties. */
  var updateDimensionProperties: js.UndefOr[UpdateDimensionPropertiesRequest] = js.native
  /** Updates an embedded object's (e.g. chart, image) position. */
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionRequest] = js.native
  /** Updates the properties of a filter view. */
  var updateFilterView: js.UndefOr[UpdateFilterViewRequest] = js.native
  /** Updates a named range. */
  var updateNamedRange: js.UndefOr[UpdateNamedRangeRequest] = js.native
  /** Updates a protected range. */
  var updateProtectedRange: js.UndefOr[UpdateProtectedRangeRequest] = js.native
  /** Updates a sheet's properties. */
  var updateSheetProperties: js.UndefOr[UpdateSheetPropertiesRequest] = js.native
  /** Updates a slicer's specifications. */
  var updateSlicerSpec: js.UndefOr[UpdateSlicerSpecRequest] = js.native
  /** Updates the spreadsheet's properties. */
  var updateSpreadsheetProperties: js.UndefOr[UpdateSpreadsheetPropertiesRequest] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddBanding(value: AddBandingRequest): Self = this.set("addBanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBanding: Self = this.set("addBanding", js.undefined)
    @scala.inline
    def setAddChart(value: AddChartRequest): Self = this.set("addChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChart: Self = this.set("addChart", js.undefined)
    @scala.inline
    def setAddConditionalFormatRule(value: AddConditionalFormatRuleRequest): Self = this.set("addConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddConditionalFormatRule: Self = this.set("addConditionalFormatRule", js.undefined)
    @scala.inline
    def setAddDimensionGroup(value: AddDimensionGroupRequest): Self = this.set("addDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddDimensionGroup: Self = this.set("addDimensionGroup", js.undefined)
    @scala.inline
    def setAddFilterView(value: AddFilterViewRequest): Self = this.set("addFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddFilterView: Self = this.set("addFilterView", js.undefined)
    @scala.inline
    def setAddNamedRange(value: AddNamedRangeRequest): Self = this.set("addNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddNamedRange: Self = this.set("addNamedRange", js.undefined)
    @scala.inline
    def setAddProtectedRange(value: AddProtectedRangeRequest): Self = this.set("addProtectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddProtectedRange: Self = this.set("addProtectedRange", js.undefined)
    @scala.inline
    def setAddSheet(value: AddSheetRequest): Self = this.set("addSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSheet: Self = this.set("addSheet", js.undefined)
    @scala.inline
    def setAddSlicer(value: AddSlicerRequest): Self = this.set("addSlicer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSlicer: Self = this.set("addSlicer", js.undefined)
    @scala.inline
    def setAppendCells(value: AppendCellsRequest): Self = this.set("appendCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendCells: Self = this.set("appendCells", js.undefined)
    @scala.inline
    def setAppendDimension(value: AppendDimensionRequest): Self = this.set("appendDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendDimension: Self = this.set("appendDimension", js.undefined)
    @scala.inline
    def setAutoFill(value: AutoFillRequest): Self = this.set("autoFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFill: Self = this.set("autoFill", js.undefined)
    @scala.inline
    def setAutoResizeDimensions(value: AutoResizeDimensionsRequest): Self = this.set("autoResizeDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResizeDimensions: Self = this.set("autoResizeDimensions", js.undefined)
    @scala.inline
    def setClearBasicFilter(value: ClearBasicFilterRequest): Self = this.set("clearBasicFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearBasicFilter: Self = this.set("clearBasicFilter", js.undefined)
    @scala.inline
    def setCopyPaste(value: CopyPasteRequest): Self = this.set("copyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyPaste: Self = this.set("copyPaste", js.undefined)
    @scala.inline
    def setCreateDeveloperMetadata(value: CreateDeveloperMetadataRequest): Self = this.set("createDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDeveloperMetadata: Self = this.set("createDeveloperMetadata", js.undefined)
    @scala.inline
    def setCutPaste(value: CutPasteRequest): Self = this.set("cutPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutPaste: Self = this.set("cutPaste", js.undefined)
    @scala.inline
    def setDeleteBanding(value: DeleteBandingRequest): Self = this.set("deleteBanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteBanding: Self = this.set("deleteBanding", js.undefined)
    @scala.inline
    def setDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleRequest): Self = this.set("deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteConditionalFormatRule: Self = this.set("deleteConditionalFormatRule", js.undefined)
    @scala.inline
    def setDeleteDeveloperMetadata(value: DeleteDeveloperMetadataRequest): Self = this.set("deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDeveloperMetadata: Self = this.set("deleteDeveloperMetadata", js.undefined)
    @scala.inline
    def setDeleteDimension(value: DeleteDimensionRequest): Self = this.set("deleteDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDimension: Self = this.set("deleteDimension", js.undefined)
    @scala.inline
    def setDeleteDimensionGroup(value: DeleteDimensionGroupRequest): Self = this.set("deleteDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDimensionGroup: Self = this.set("deleteDimensionGroup", js.undefined)
    @scala.inline
    def setDeleteDuplicates(value: DeleteDuplicatesRequest): Self = this.set("deleteDuplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteDuplicates: Self = this.set("deleteDuplicates", js.undefined)
    @scala.inline
    def setDeleteEmbeddedObject(value: DeleteEmbeddedObjectRequest): Self = this.set("deleteEmbeddedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteEmbeddedObject: Self = this.set("deleteEmbeddedObject", js.undefined)
    @scala.inline
    def setDeleteFilterView(value: DeleteFilterViewRequest): Self = this.set("deleteFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteFilterView: Self = this.set("deleteFilterView", js.undefined)
    @scala.inline
    def setDeleteNamedRange(value: DeleteNamedRangeRequest): Self = this.set("deleteNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteNamedRange: Self = this.set("deleteNamedRange", js.undefined)
    @scala.inline
    def setDeleteProtectedRange(value: DeleteProtectedRangeRequest): Self = this.set("deleteProtectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteProtectedRange: Self = this.set("deleteProtectedRange", js.undefined)
    @scala.inline
    def setDeleteRange(value: DeleteRangeRequest): Self = this.set("deleteRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRange: Self = this.set("deleteRange", js.undefined)
    @scala.inline
    def setDeleteSheet(value: DeleteSheetRequest): Self = this.set("deleteSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteSheet: Self = this.set("deleteSheet", js.undefined)
    @scala.inline
    def setDuplicateFilterView(value: DuplicateFilterViewRequest): Self = this.set("duplicateFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateFilterView: Self = this.set("duplicateFilterView", js.undefined)
    @scala.inline
    def setDuplicateSheet(value: DuplicateSheetRequest): Self = this.set("duplicateSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuplicateSheet: Self = this.set("duplicateSheet", js.undefined)
    @scala.inline
    def setFindReplace(value: FindReplaceRequest): Self = this.set("findReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindReplace: Self = this.set("findReplace", js.undefined)
    @scala.inline
    def setInsertDimension(value: InsertDimensionRequest): Self = this.set("insertDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertDimension: Self = this.set("insertDimension", js.undefined)
    @scala.inline
    def setInsertRange(value: InsertRangeRequest): Self = this.set("insertRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertRange: Self = this.set("insertRange", js.undefined)
    @scala.inline
    def setMergeCells(value: MergeCellsRequest): Self = this.set("mergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeCells: Self = this.set("mergeCells", js.undefined)
    @scala.inline
    def setMoveDimension(value: MoveDimensionRequest): Self = this.set("moveDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveDimension: Self = this.set("moveDimension", js.undefined)
    @scala.inline
    def setPasteData(value: PasteDataRequest): Self = this.set("pasteData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteData: Self = this.set("pasteData", js.undefined)
    @scala.inline
    def setRandomizeRange(value: RandomizeRangeRequest): Self = this.set("randomizeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomizeRange: Self = this.set("randomizeRange", js.undefined)
    @scala.inline
    def setRepeatCell(value: RepeatCellRequest): Self = this.set("repeatCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatCell: Self = this.set("repeatCell", js.undefined)
    @scala.inline
    def setSetBasicFilter(value: SetBasicFilterRequest): Self = this.set("setBasicFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetBasicFilter: Self = this.set("setBasicFilter", js.undefined)
    @scala.inline
    def setSetDataValidation(value: SetDataValidationRequest): Self = this.set("setDataValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetDataValidation: Self = this.set("setDataValidation", js.undefined)
    @scala.inline
    def setSortRange(value: SortRangeRequest): Self = this.set("sortRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRange: Self = this.set("sortRange", js.undefined)
    @scala.inline
    def setTextToColumns(value: TextToColumnsRequest): Self = this.set("textToColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextToColumns: Self = this.set("textToColumns", js.undefined)
    @scala.inline
    def setTrimWhitespace(value: TrimWhitespaceRequest): Self = this.set("trimWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimWhitespace: Self = this.set("trimWhitespace", js.undefined)
    @scala.inline
    def setUnmergeCells(value: UnmergeCellsRequest): Self = this.set("unmergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmergeCells: Self = this.set("unmergeCells", js.undefined)
    @scala.inline
    def setUpdateBanding(value: UpdateBandingRequest): Self = this.set("updateBanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateBanding: Self = this.set("updateBanding", js.undefined)
    @scala.inline
    def setUpdateBorders(value: UpdateBordersRequest): Self = this.set("updateBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateBorders: Self = this.set("updateBorders", js.undefined)
    @scala.inline
    def setUpdateCells(value: UpdateCellsRequest): Self = this.set("updateCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCells: Self = this.set("updateCells", js.undefined)
    @scala.inline
    def setUpdateChartSpec(value: UpdateChartSpecRequest): Self = this.set("updateChartSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateChartSpec: Self = this.set("updateChartSpec", js.undefined)
    @scala.inline
    def setUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleRequest): Self = this.set("updateConditionalFormatRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateConditionalFormatRule: Self = this.set("updateConditionalFormatRule", js.undefined)
    @scala.inline
    def setUpdateDeveloperMetadata(value: UpdateDeveloperMetadataRequest): Self = this.set("updateDeveloperMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDeveloperMetadata: Self = this.set("updateDeveloperMetadata", js.undefined)
    @scala.inline
    def setUpdateDimensionGroup(value: UpdateDimensionGroupRequest): Self = this.set("updateDimensionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDimensionGroup: Self = this.set("updateDimensionGroup", js.undefined)
    @scala.inline
    def setUpdateDimensionProperties(value: UpdateDimensionPropertiesRequest): Self = this.set("updateDimensionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDimensionProperties: Self = this.set("updateDimensionProperties", js.undefined)
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionRequest): Self = this.set("updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateEmbeddedObjectPosition: Self = this.set("updateEmbeddedObjectPosition", js.undefined)
    @scala.inline
    def setUpdateFilterView(value: UpdateFilterViewRequest): Self = this.set("updateFilterView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateFilterView: Self = this.set("updateFilterView", js.undefined)
    @scala.inline
    def setUpdateNamedRange(value: UpdateNamedRangeRequest): Self = this.set("updateNamedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateNamedRange: Self = this.set("updateNamedRange", js.undefined)
    @scala.inline
    def setUpdateProtectedRange(value: UpdateProtectedRangeRequest): Self = this.set("updateProtectedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateProtectedRange: Self = this.set("updateProtectedRange", js.undefined)
    @scala.inline
    def setUpdateSheetProperties(value: UpdateSheetPropertiesRequest): Self = this.set("updateSheetProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSheetProperties: Self = this.set("updateSheetProperties", js.undefined)
    @scala.inline
    def setUpdateSlicerSpec(value: UpdateSlicerSpecRequest): Self = this.set("updateSlicerSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSlicerSpec: Self = this.set("updateSlicerSpec", js.undefined)
    @scala.inline
    def setUpdateSpreadsheetProperties(value: UpdateSpreadsheetPropertiesRequest): Self = this.set("updateSpreadsheetProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSpreadsheetProperties: Self = this.set("updateSpreadsheetProperties", js.undefined)
  }
  
}


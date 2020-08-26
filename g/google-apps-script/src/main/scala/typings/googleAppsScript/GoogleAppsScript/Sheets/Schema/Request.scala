package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var addBanding: js.UndefOr[AddBandingRequest] = js.native
  var addChart: js.UndefOr[AddChartRequest] = js.native
  var addConditionalFormatRule: js.UndefOr[AddConditionalFormatRuleRequest] = js.native
  var addDimensionGroup: js.UndefOr[AddDimensionGroupRequest] = js.native
  var addFilterView: js.UndefOr[AddFilterViewRequest] = js.native
  var addNamedRange: js.UndefOr[AddNamedRangeRequest] = js.native
  var addProtectedRange: js.UndefOr[AddProtectedRangeRequest] = js.native
  var addSheet: js.UndefOr[AddSheetRequest] = js.native
  var appendCells: js.UndefOr[AppendCellsRequest] = js.native
  var appendDimension: js.UndefOr[AppendDimensionRequest] = js.native
  var autoFill: js.UndefOr[AutoFillRequest] = js.native
  var autoResizeDimensions: js.UndefOr[AutoResizeDimensionsRequest] = js.native
  var clearBasicFilter: js.UndefOr[ClearBasicFilterRequest] = js.native
  var copyPaste: js.UndefOr[CopyPasteRequest] = js.native
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataRequest] = js.native
  var cutPaste: js.UndefOr[CutPasteRequest] = js.native
  var deleteBanding: js.UndefOr[DeleteBandingRequest] = js.native
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleRequest] = js.native
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataRequest] = js.native
  var deleteDimension: js.UndefOr[DeleteDimensionRequest] = js.native
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupRequest] = js.native
  var deleteEmbeddedObject: js.UndefOr[DeleteEmbeddedObjectRequest] = js.native
  var deleteFilterView: js.UndefOr[DeleteFilterViewRequest] = js.native
  var deleteNamedRange: js.UndefOr[DeleteNamedRangeRequest] = js.native
  var deleteProtectedRange: js.UndefOr[DeleteProtectedRangeRequest] = js.native
  var deleteRange: js.UndefOr[DeleteRangeRequest] = js.native
  var deleteSheet: js.UndefOr[DeleteSheetRequest] = js.native
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewRequest] = js.native
  var duplicateSheet: js.UndefOr[DuplicateSheetRequest] = js.native
  var findReplace: js.UndefOr[FindReplaceRequest] = js.native
  var insertDimension: js.UndefOr[InsertDimensionRequest] = js.native
  var insertRange: js.UndefOr[InsertRangeRequest] = js.native
  var mergeCells: js.UndefOr[MergeCellsRequest] = js.native
  var moveDimension: js.UndefOr[MoveDimensionRequest] = js.native
  var pasteData: js.UndefOr[PasteDataRequest] = js.native
  var randomizeRange: js.UndefOr[RandomizeRangeRequest] = js.native
  var repeatCell: js.UndefOr[RepeatCellRequest] = js.native
  var setBasicFilter: js.UndefOr[SetBasicFilterRequest] = js.native
  var setDataValidation: js.UndefOr[SetDataValidationRequest] = js.native
  var sortRange: js.UndefOr[SortRangeRequest] = js.native
  var textToColumns: js.UndefOr[TextToColumnsRequest] = js.native
  var unmergeCells: js.UndefOr[UnmergeCellsRequest] = js.native
  var updateBanding: js.UndefOr[UpdateBandingRequest] = js.native
  var updateBorders: js.UndefOr[UpdateBordersRequest] = js.native
  var updateCells: js.UndefOr[UpdateCellsRequest] = js.native
  var updateChartSpec: js.UndefOr[UpdateChartSpecRequest] = js.native
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleRequest] = js.native
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataRequest] = js.native
  var updateDimensionGroup: js.UndefOr[UpdateDimensionGroupRequest] = js.native
  var updateDimensionProperties: js.UndefOr[UpdateDimensionPropertiesRequest] = js.native
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionRequest] = js.native
  var updateFilterView: js.UndefOr[UpdateFilterViewRequest] = js.native
  var updateNamedRange: js.UndefOr[UpdateNamedRangeRequest] = js.native
  var updateProtectedRange: js.UndefOr[UpdateProtectedRangeRequest] = js.native
  var updateSheetProperties: js.UndefOr[UpdateSheetPropertiesRequest] = js.native
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
    def setUpdateSpreadsheetProperties(value: UpdateSpreadsheetPropertiesRequest): Self = this.set("updateSpreadsheetProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateSpreadsheetProperties: Self = this.set("updateSpreadsheetProperties", js.undefined)
  }
  
}


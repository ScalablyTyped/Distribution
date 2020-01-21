package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var addBanding: js.UndefOr[AddBandingResponse] = js.undefined
  var addChart: js.UndefOr[AddChartResponse] = js.undefined
  var addDimensionGroup: js.UndefOr[AddDimensionGroupResponse] = js.undefined
  var addFilterView: js.UndefOr[AddFilterViewResponse] = js.undefined
  var addNamedRange: js.UndefOr[AddNamedRangeResponse] = js.undefined
  var addProtectedRange: js.UndefOr[AddProtectedRangeResponse] = js.undefined
  var addSheet: js.UndefOr[AddSheetResponse] = js.undefined
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataResponse] = js.undefined
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleResponse] = js.undefined
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataResponse] = js.undefined
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupResponse] = js.undefined
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewResponse] = js.undefined
  var duplicateSheet: js.UndefOr[DuplicateSheetResponse] = js.undefined
  var findReplace: js.UndefOr[FindReplaceResponse] = js.undefined
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleResponse] = js.undefined
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataResponse] = js.undefined
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionResponse] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    addBanding: AddBandingResponse = null,
    addChart: AddChartResponse = null,
    addDimensionGroup: AddDimensionGroupResponse = null,
    addFilterView: AddFilterViewResponse = null,
    addNamedRange: AddNamedRangeResponse = null,
    addProtectedRange: AddProtectedRangeResponse = null,
    addSheet: AddSheetResponse = null,
    createDeveloperMetadata: CreateDeveloperMetadataResponse = null,
    deleteConditionalFormatRule: DeleteConditionalFormatRuleResponse = null,
    deleteDeveloperMetadata: DeleteDeveloperMetadataResponse = null,
    deleteDimensionGroup: DeleteDimensionGroupResponse = null,
    duplicateFilterView: DuplicateFilterViewResponse = null,
    duplicateSheet: DuplicateSheetResponse = null,
    findReplace: FindReplaceResponse = null,
    updateConditionalFormatRule: UpdateConditionalFormatRuleResponse = null,
    updateDeveloperMetadata: UpdateDeveloperMetadataResponse = null,
    updateEmbeddedObjectPosition: UpdateEmbeddedObjectPositionResponse = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (addBanding != null) __obj.updateDynamic("addBanding")(addBanding.asInstanceOf[js.Any])
    if (addChart != null) __obj.updateDynamic("addChart")(addChart.asInstanceOf[js.Any])
    if (addDimensionGroup != null) __obj.updateDynamic("addDimensionGroup")(addDimensionGroup.asInstanceOf[js.Any])
    if (addFilterView != null) __obj.updateDynamic("addFilterView")(addFilterView.asInstanceOf[js.Any])
    if (addNamedRange != null) __obj.updateDynamic("addNamedRange")(addNamedRange.asInstanceOf[js.Any])
    if (addProtectedRange != null) __obj.updateDynamic("addProtectedRange")(addProtectedRange.asInstanceOf[js.Any])
    if (addSheet != null) __obj.updateDynamic("addSheet")(addSheet.asInstanceOf[js.Any])
    if (createDeveloperMetadata != null) __obj.updateDynamic("createDeveloperMetadata")(createDeveloperMetadata.asInstanceOf[js.Any])
    if (deleteConditionalFormatRule != null) __obj.updateDynamic("deleteConditionalFormatRule")(deleteConditionalFormatRule.asInstanceOf[js.Any])
    if (deleteDeveloperMetadata != null) __obj.updateDynamic("deleteDeveloperMetadata")(deleteDeveloperMetadata.asInstanceOf[js.Any])
    if (deleteDimensionGroup != null) __obj.updateDynamic("deleteDimensionGroup")(deleteDimensionGroup.asInstanceOf[js.Any])
    if (duplicateFilterView != null) __obj.updateDynamic("duplicateFilterView")(duplicateFilterView.asInstanceOf[js.Any])
    if (duplicateSheet != null) __obj.updateDynamic("duplicateSheet")(duplicateSheet.asInstanceOf[js.Any])
    if (findReplace != null) __obj.updateDynamic("findReplace")(findReplace.asInstanceOf[js.Any])
    if (updateConditionalFormatRule != null) __obj.updateDynamic("updateConditionalFormatRule")(updateConditionalFormatRule.asInstanceOf[js.Any])
    if (updateDeveloperMetadata != null) __obj.updateDynamic("updateDeveloperMetadata")(updateDeveloperMetadata.asInstanceOf[js.Any])
    if (updateEmbeddedObjectPosition != null) __obj.updateDynamic("updateEmbeddedObjectPosition")(updateEmbeddedObjectPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


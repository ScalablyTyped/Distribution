package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait Schema$Response extends js.Object {
  /**
    * A reply from adding a banded range.
    */
  var addBanding: js.UndefOr[Schema$AddBandingResponse] = js.native
  /**
    * A reply from adding a chart.
    */
  var addChart: js.UndefOr[Schema$AddChartResponse] = js.native
  /**
    * A reply from adding a dimension group.
    */
  var addDimensionGroup: js.UndefOr[Schema$AddDimensionGroupResponse] = js.native
  /**
    * A reply from adding a filter view.
    */
  var addFilterView: js.UndefOr[Schema$AddFilterViewResponse] = js.native
  /**
    * A reply from adding a named range.
    */
  var addNamedRange: js.UndefOr[Schema$AddNamedRangeResponse] = js.native
  /**
    * A reply from adding a protected range.
    */
  var addProtectedRange: js.UndefOr[Schema$AddProtectedRangeResponse] = js.native
  /**
    * A reply from adding a sheet.
    */
  var addSheet: js.UndefOr[Schema$AddSheetResponse] = js.native
  /**
    * A reply from creating a developer metadata entry.
    */
  var createDeveloperMetadata: js.UndefOr[Schema$CreateDeveloperMetadataResponse] = js.native
  /**
    * A reply from deleting a conditional format rule.
    */
  var deleteConditionalFormatRule: js.UndefOr[Schema$DeleteConditionalFormatRuleResponse] = js.native
  /**
    * A reply from deleting a developer metadata entry.
    */
  var deleteDeveloperMetadata: js.UndefOr[Schema$DeleteDeveloperMetadataResponse] = js.native
  /**
    * A reply from deleting a dimension group.
    */
  var deleteDimensionGroup: js.UndefOr[Schema$DeleteDimensionGroupResponse] = js.native
  /**
    * A reply from duplicating a filter view.
    */
  var duplicateFilterView: js.UndefOr[Schema$DuplicateFilterViewResponse] = js.native
  /**
    * A reply from duplicating a sheet.
    */
  var duplicateSheet: js.UndefOr[Schema$DuplicateSheetResponse] = js.native
  /**
    * A reply from doing a find/replace.
    */
  var findReplace: js.UndefOr[Schema$FindReplaceResponse] = js.native
  /**
    * A reply from updating a conditional format rule.
    */
  var updateConditionalFormatRule: js.UndefOr[Schema$UpdateConditionalFormatRuleResponse] = js.native
  /**
    * A reply from updating a developer metadata entry.
    */
  var updateDeveloperMetadata: js.UndefOr[Schema$UpdateDeveloperMetadataResponse] = js.native
  /**
    * A reply from updating an embedded object&#39;s position.
    */
  var updateEmbeddedObjectPosition: js.UndefOr[Schema$UpdateEmbeddedObjectPositionResponse] = js.native
}

object Schema$Response {
  @scala.inline
  def apply(
    addBanding: Schema$AddBandingResponse = null,
    addChart: Schema$AddChartResponse = null,
    addDimensionGroup: Schema$AddDimensionGroupResponse = null,
    addFilterView: Schema$AddFilterViewResponse = null,
    addNamedRange: Schema$AddNamedRangeResponse = null,
    addProtectedRange: Schema$AddProtectedRangeResponse = null,
    addSheet: Schema$AddSheetResponse = null,
    createDeveloperMetadata: Schema$CreateDeveloperMetadataResponse = null,
    deleteConditionalFormatRule: Schema$DeleteConditionalFormatRuleResponse = null,
    deleteDeveloperMetadata: Schema$DeleteDeveloperMetadataResponse = null,
    deleteDimensionGroup: Schema$DeleteDimensionGroupResponse = null,
    duplicateFilterView: Schema$DuplicateFilterViewResponse = null,
    duplicateSheet: Schema$DuplicateSheetResponse = null,
    findReplace: Schema$FindReplaceResponse = null,
    updateConditionalFormatRule: Schema$UpdateConditionalFormatRuleResponse = null,
    updateDeveloperMetadata: Schema$UpdateDeveloperMetadataResponse = null,
    updateEmbeddedObjectPosition: Schema$UpdateEmbeddedObjectPositionResponse = null
  ): Schema$Response = {
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
    __obj.asInstanceOf[Schema$Response]
  }
}


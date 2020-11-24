package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  var addBanding: js.UndefOr[AddBandingResponse] = js.native
  
  var addChart: js.UndefOr[AddChartResponse] = js.native
  
  var addDimensionGroup: js.UndefOr[AddDimensionGroupResponse] = js.native
  
  var addFilterView: js.UndefOr[AddFilterViewResponse] = js.native
  
  var addNamedRange: js.UndefOr[AddNamedRangeResponse] = js.native
  
  var addProtectedRange: js.UndefOr[AddProtectedRangeResponse] = js.native
  
  var addSheet: js.UndefOr[AddSheetResponse] = js.native
  
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataResponse] = js.native
  
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleResponse] = js.native
  
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataResponse] = js.native
  
  var deleteDimensionGroup: js.UndefOr[DeleteDimensionGroupResponse] = js.native
  
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewResponse] = js.native
  
  var duplicateSheet: js.UndefOr[DuplicateSheetResponse] = js.native
  
  var findReplace: js.UndefOr[FindReplaceResponse] = js.native
  
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleResponse] = js.native
  
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataResponse] = js.native
  
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionResponse] = js.native
}
object Response {
  
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    
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
    def setAddBanding(value: AddBandingResponse): Self = this.set("addBanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddBanding: Self = this.set("addBanding", js.undefined)
    
    @scala.inline
    def setAddChart(value: AddChartResponse): Self = this.set("addChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddChart: Self = this.set("addChart", js.undefined)
    
    @scala.inline
    def setAddDimensionGroup(value: AddDimensionGroupResponse): Self = this.set("addDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddDimensionGroup: Self = this.set("addDimensionGroup", js.undefined)
    
    @scala.inline
    def setAddFilterView(value: AddFilterViewResponse): Self = this.set("addFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddFilterView: Self = this.set("addFilterView", js.undefined)
    
    @scala.inline
    def setAddNamedRange(value: AddNamedRangeResponse): Self = this.set("addNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddNamedRange: Self = this.set("addNamedRange", js.undefined)
    
    @scala.inline
    def setAddProtectedRange(value: AddProtectedRangeResponse): Self = this.set("addProtectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddProtectedRange: Self = this.set("addProtectedRange", js.undefined)
    
    @scala.inline
    def setAddSheet(value: AddSheetResponse): Self = this.set("addSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddSheet: Self = this.set("addSheet", js.undefined)
    
    @scala.inline
    def setCreateDeveloperMetadata(value: CreateDeveloperMetadataResponse): Self = this.set("createDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDeveloperMetadata: Self = this.set("createDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteConditionalFormatRule(value: DeleteConditionalFormatRuleResponse): Self = this.set("deleteConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteConditionalFormatRule: Self = this.set("deleteConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setDeleteDeveloperMetadata(value: DeleteDeveloperMetadataResponse): Self = this.set("deleteDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteDeveloperMetadata: Self = this.set("deleteDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setDeleteDimensionGroup(value: DeleteDimensionGroupResponse): Self = this.set("deleteDimensionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteDimensionGroup: Self = this.set("deleteDimensionGroup", js.undefined)
    
    @scala.inline
    def setDuplicateFilterView(value: DuplicateFilterViewResponse): Self = this.set("duplicateFilterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateFilterView: Self = this.set("duplicateFilterView", js.undefined)
    
    @scala.inline
    def setDuplicateSheet(value: DuplicateSheetResponse): Self = this.set("duplicateSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateSheet: Self = this.set("duplicateSheet", js.undefined)
    
    @scala.inline
    def setFindReplace(value: FindReplaceResponse): Self = this.set("findReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindReplace: Self = this.set("findReplace", js.undefined)
    
    @scala.inline
    def setUpdateConditionalFormatRule(value: UpdateConditionalFormatRuleResponse): Self = this.set("updateConditionalFormatRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateConditionalFormatRule: Self = this.set("updateConditionalFormatRule", js.undefined)
    
    @scala.inline
    def setUpdateDeveloperMetadata(value: UpdateDeveloperMetadataResponse): Self = this.set("updateDeveloperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDeveloperMetadata: Self = this.set("updateDeveloperMetadata", js.undefined)
    
    @scala.inline
    def setUpdateEmbeddedObjectPosition(value: UpdateEmbeddedObjectPositionResponse): Self = this.set("updateEmbeddedObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEmbeddedObjectPosition: Self = this.set("updateEmbeddedObjectPosition", js.undefined)
  }
}

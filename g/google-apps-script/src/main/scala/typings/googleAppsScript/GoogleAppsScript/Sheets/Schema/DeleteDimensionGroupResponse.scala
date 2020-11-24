package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDimensionGroupResponse extends js.Object {
  
  var dimensionGroups: js.UndefOr[js.Array[DimensionGroup]] = js.native
}
object DeleteDimensionGroupResponse {
  
  @scala.inline
  def apply(): DeleteDimensionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDimensionGroupResponse]
  }
  
  @scala.inline
  implicit class DeleteDimensionGroupResponseOps[Self <: DeleteDimensionGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setDimensionGroupsVarargs(value: DimensionGroup*): Self = this.set("dimensionGroups", js.Array(value :_*))
    
    @scala.inline
    def setDimensionGroups(value: js.Array[DimensionGroup]): Self = this.set("dimensionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionGroups: Self = this.set("dimensionGroups", js.undefined)
  }
}

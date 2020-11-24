package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupByThisColumn extends js.Object {
  
  var groupByThisColumn: js.UndefOr[String] = js.native
  
  var groupContinuedMessage: js.UndefOr[String] = js.native
  
  var groupContinuesMessage: js.UndefOr[String] = js.native
  
  var ungroup: js.UndefOr[String] = js.native
  
  var ungroupAll: js.UndefOr[String] = js.native
}
object GroupByThisColumn {
  
  @scala.inline
  def apply(): GroupByThisColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupByThisColumn]
  }
  
  @scala.inline
  implicit class GroupByThisColumnOps[Self <: GroupByThisColumn] (val x: Self) extends AnyVal {
    
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
    def setGroupByThisColumn(value: String): Self = this.set("groupByThisColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByThisColumn: Self = this.set("groupByThisColumn", js.undefined)
    
    @scala.inline
    def setGroupContinuedMessage(value: String): Self = this.set("groupContinuedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupContinuedMessage: Self = this.set("groupContinuedMessage", js.undefined)
    
    @scala.inline
    def setGroupContinuesMessage(value: String): Self = this.set("groupContinuesMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupContinuesMessage: Self = this.set("groupContinuesMessage", js.undefined)
    
    @scala.inline
    def setUngroup(value: String): Self = this.set("ungroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUngroup: Self = this.set("ungroup", js.undefined)
    
    @scala.inline
    def setUngroupAll(value: String): Self = this.set("ungroupAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUngroupAll: Self = this.set("ungroupAll", js.undefined)
  }
}

package typings.devextreme.anon

import typings.devextreme.devextremeStrings.asc
import typings.devextreme.devextremeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupColumn extends js.Object {
  
  var groupColumn: js.UndefOr[String] = js.native
  
  var sortOrder: js.UndefOr[asc | desc] = js.native
  
  var summaryItem: js.UndefOr[String | Double] = js.native
}
object GroupColumn {
  
  @scala.inline
  def apply(): GroupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupColumn]
  }
  
  @scala.inline
  implicit class GroupColumnOps[Self <: GroupColumn] (val x: Self) extends AnyVal {
    
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
    def setGroupColumn(value: String): Self = this.set("groupColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupColumn: Self = this.set("groupColumn", js.undefined)
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setSummaryItem(value: String | Double): Self = this.set("summaryItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryItem: Self = this.set("summaryItem", js.undefined)
  }
}

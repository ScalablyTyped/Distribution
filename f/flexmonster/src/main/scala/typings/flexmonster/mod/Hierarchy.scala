package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hierarchy extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var dimensionName: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[Filter] = js.native
  
  var levels: js.UndefOr[js.Array[Level]] = js.native
  
  var sortName: js.UndefOr[String] = js.native
  
  var sortOrder: js.UndefOr[js.Array[String]] = js.native
  
  var uniqueName: js.UndefOr[String] = js.native
}
object Hierarchy {
  
  @scala.inline
  def apply(): Hierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hierarchy]
  }
  
  @scala.inline
  implicit class HierarchyOps[Self <: Hierarchy] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setSortName(value: String): Self = this.set("sortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortName: Self = this.set("sortName", js.undefined)
    
    @scala.inline
    def setSortOrderVarargs(value: String*): Self = this.set("sortOrder", js.Array(value :_*))
    
    @scala.inline
    def setSortOrder(value: js.Array[String]): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueName: Self = this.set("uniqueName", js.undefined)
  }
}

package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.collapsed
import typings.devextreme.devextremeStrings.containers
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.disabled
import typings.devextreme.devextremeStrings.flowchart
import typings.devextreme.devextremeStrings.general
import typings.devextreme.devextremeStrings.orgChart
import typings.devextreme.devextremeStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeIconsPerRow extends js.Object {
  
  var groups: js.UndefOr[js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]] = js.native
  
  var shapeIconsPerRow: js.UndefOr[Double] = js.native
  
  var showSearch: js.UndefOr[Boolean] = js.native
  
  var visibility: js.UndefOr[auto | visible | collapsed | disabled] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ShapeIconsPerRow {
  
  @scala.inline
  def apply(): ShapeIconsPerRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeIconsPerRow]
  }
  
  @scala.inline
  implicit class ShapeIconsPerRowOps[Self <: ShapeIconsPerRow] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: (general | flowchart | orgChart | containers | custom | DisplayMode)*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setShapeIconsPerRow(value: Double): Self = this.set("shapeIconsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeIconsPerRow: Self = this.set("shapeIconsPerRow", js.undefined)
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    
    @scala.inline
    def setVisibility(value: auto | visible | collapsed | disabled): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

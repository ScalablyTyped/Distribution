package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.addTask
import typings.devextreme.devextremeStrings.collapseAll
import typings.devextreme.devextremeStrings.deleteTask
import typings.devextreme.devextremeStrings.expandAll
import typings.devextreme.devextremeStrings.redo
import typings.devextreme.devextremeStrings.separator
import typings.devextreme.devextremeStrings.undo
import typings.devextreme.devextremeStrings.zoomIn
import typings.devextreme.devextremeStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGanttToolbarItem extends dxToolbarItem {
  
  /**
    * [descr:dxGanttToolbarItem.name]
    */
  var name: js.UndefOr[
    separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | String
  ] = js.native
}
object dxGanttToolbarItem {
  
  @scala.inline
  def apply(): dxGanttToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttToolbarItem]
  }
  
  @scala.inline
  implicit class dxGanttToolbarItemOps[Self <: dxGanttToolbarItem] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: separator | undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | String
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

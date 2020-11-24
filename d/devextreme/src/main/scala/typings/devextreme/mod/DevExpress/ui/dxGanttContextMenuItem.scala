package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.addTask
import typings.devextreme.devextremeStrings.collapseAll
import typings.devextreme.devextremeStrings.deleteDependency
import typings.devextreme.devextremeStrings.deleteTask
import typings.devextreme.devextremeStrings.expandAll
import typings.devextreme.devextremeStrings.redo
import typings.devextreme.devextremeStrings.taskDetails
import typings.devextreme.devextremeStrings.undo
import typings.devextreme.devextremeStrings.zoomIn
import typings.devextreme.devextremeStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGanttContextMenuItem extends dxContextMenuItem {
  
  /**
    * [descr:dxGanttContextMenuItem.name]
    */
  var name: js.UndefOr[
    undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails | String
  ] = js.native
}
object dxGanttContextMenuItem {
  
  @scala.inline
  def apply(): dxGanttContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttContextMenuItem]
  }
  
  @scala.inline
  implicit class dxGanttContextMenuItemOps[Self <: dxGanttContextMenuItem] (val x: Self) extends AnyVal {
    
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
      value: undo | redo | expandAll | collapseAll | addTask | deleteTask | zoomIn | zoomOut | deleteDependency | taskDetails | String
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

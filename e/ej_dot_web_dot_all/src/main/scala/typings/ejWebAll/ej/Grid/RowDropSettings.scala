package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowDropSettings extends js.Object {
  
  /** Gets or sets a value that indicates whether move or copy a record from one grid to another or within the grid
    * @Default {ej.Grid.DragBehavior.Move}
    */
  var dragBehavior: js.UndefOr[DragBehavior | String] = js.native
  
  /** This helps in mapping server-side action when rows are dragged from Grid.
    * @Default {null}
    */
  var dragMapper: js.UndefOr[String] = js.native
  
  /** This helps in mapping server-side action when rows are dropped in Grid.
    * @Default {null}
    */
  var dropMapper: js.UndefOr[String] = js.native
  
  /** This specifies the grid to drop the grid rows only at particular target element.
    * @Default {null}
    */
  var dropTargetID: js.UndefOr[js.Any] = js.native
}
object RowDropSettings {
  
  @scala.inline
  def apply(): RowDropSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowDropSettings]
  }
  
  @scala.inline
  implicit class RowDropSettingsOps[Self <: RowDropSettings] (val x: Self) extends AnyVal {
    
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
    def setDragBehavior(value: DragBehavior | String): Self = this.set("dragBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragBehavior: Self = this.set("dragBehavior", js.undefined)
    
    @scala.inline
    def setDragMapper(value: String): Self = this.set("dragMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragMapper: Self = this.set("dragMapper", js.undefined)
    
    @scala.inline
    def setDropMapper(value: String): Self = this.set("dropMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropMapper: Self = this.set("dropMapper", js.undefined)
    
    @scala.inline
    def setDropTargetID(value: js.Any): Self = this.set("dropTargetID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropTargetID: Self = this.set("dropTargetID", js.undefined)
  }
}

package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarClickEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns the current item.
    */
  var currentTarget: js.UndefOr[js.Any] = js.native
  
  /** Returns the grid model.
    */
  var gridModel: js.UndefOr[js.Any] = js.native
  
  /** Returns the Id of the current toolbar element.
    */
  var itemId: js.UndefOr[String] = js.native
  
  /** Returns the index of the current toolbar element.
    */
  var itemIndex: js.UndefOr[Double] = js.native
  
  /** Returns the name of the current toolbar element.
    */
  var itemName: js.UndefOr[String] = js.native
  
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Returns the status of toolbar item which denotes its enabled state
    */
  var status: js.UndefOr[Boolean] = js.native
  
  /** Returns the target item.
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** Returns the toolbar object of the selected toolbar element.
    */
  var toolbarData: js.UndefOr[js.Any] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ToolbarClickEventArgs {
  
  @scala.inline
  def apply(): ToolbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarClickEventArgs]
  }
  
  @scala.inline
  implicit class ToolbarClickEventArgsOps[Self <: ToolbarClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCurrentTarget(value: js.Any): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTarget: Self = this.set("currentTarget", js.undefined)
    
    @scala.inline
    def setGridModel(value: js.Any): Self = this.set("gridModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridModel: Self = this.set("gridModel", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemIndex: Self = this.set("itemIndex", js.undefined)
    
    @scala.inline
    def setItemName(value: String): Self = this.set("itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemName: Self = this.set("itemName", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setToolbarData(value: js.Any): Self = this.set("toolbarData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarData: Self = this.set("toolbarData", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

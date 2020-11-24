package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemElementModel extends js.Object {
  
  var component: js.UndefOr[dxSortable] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.native
  
  var fromData: js.UndefOr[js.Any] = js.native
  
  var fromIndex: js.UndefOr[Double] = js.native
  
  var itemData: js.UndefOr[js.Any] = js.native
  
  var itemElement: js.UndefOr[dxElement] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.native
  
  var toData: js.UndefOr[js.Any] = js.native
  
  var toIndex: js.UndefOr[Double] = js.native
}
object ItemElementModel {
  
  @scala.inline
  def apply(): ItemElementModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemElementModel]
  }
  
  @scala.inline
  implicit class ItemElementModelOps[Self <: ItemElementModel] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: dxSortable): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setFromComponent(value: dxSortable | dxDraggable): Self = this.set("fromComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromComponent: Self = this.set("fromComponent", js.undefined)
    
    @scala.inline
    def setFromData(value: js.Any): Self = this.set("fromData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromData: Self = this.set("fromData", js.undefined)
    
    @scala.inline
    def setFromIndex(value: Double): Self = this.set("fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromIndex: Self = this.set("fromIndex", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = this.set("itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemData: Self = this.set("itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = this.set("itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemElement: Self = this.set("itemElement", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setToComponent(value: dxSortable | dxDraggable): Self = this.set("toComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToComponent: Self = this.set("toComponent", js.undefined)
    
    @scala.inline
    def setToData(value: js.Any): Self = this.set("toData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToData: Self = this.set("toData", js.undefined)
    
    @scala.inline
    def setToIndex(value: Double): Self = this.set("toIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToIndex: Self = this.set("toIndex", js.undefined)
  }
}

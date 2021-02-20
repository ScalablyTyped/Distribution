package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropInsideItem extends StObject {
  
  var dropInsideItem: js.UndefOr[Boolean] = js.native
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.native
  
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.native
  
  var fromData: js.UndefOr[js.Any] = js.native
  
  var fromIndex: js.UndefOr[Double] = js.native
  
  var itemData: js.UndefOr[js.Any] = js.native
  
  var itemElement: js.UndefOr[dxElement] = js.native
  
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.native
  
  var toData: js.UndefOr[js.Any] = js.native
  
  var toIndex: js.UndefOr[Double] = js.native
}
object DropInsideItem {
  
  @scala.inline
  def apply(): DropInsideItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropInsideItem]
  }
  
  @scala.inline
  implicit class DropInsideItemMutableBuilder[Self <: DropInsideItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropInsideItemUndefined: Self = StObject.set(x, "dropInsideItem", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
    
    @scala.inline
    def setFromData(value: js.Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
    
    @scala.inline
    def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromIndexUndefined: Self = StObject.set(x, "fromIndex", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    @scala.inline
    def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
    
    @scala.inline
    def setToData(value: js.Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    
    @scala.inline
    def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToIndexUndefined: Self = StObject.set(x, "toIndex", js.undefined)
  }
}

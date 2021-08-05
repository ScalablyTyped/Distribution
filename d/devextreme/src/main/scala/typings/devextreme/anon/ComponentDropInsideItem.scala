package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDropInsideItem extends StObject {
  
  var component: js.UndefOr[dxSortable] = js.undefined
  
  var dropInsideItem: js.UndefOr[Boolean] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  
  var fromData: js.UndefOr[js.Any] = js.undefined
  
  var fromIndex: js.UndefOr[Double] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  
  var toData: js.UndefOr[js.Any] = js.undefined
  
  var toIndex: js.UndefOr[Double] = js.undefined
}
object ComponentDropInsideItem {
  
  inline def apply(): ComponentDropInsideItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDropInsideItem]
  }
  
  extension [Self <: ComponentDropInsideItem](x: Self) {
    
    inline def setComponent(value: dxSortable): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
    
    inline def setDropInsideItemUndefined: Self = StObject.set(x, "dropInsideItem", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
    
    inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
    
    inline def setFromData(value: js.Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
    
    inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
    
    inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setFromIndexUndefined: Self = StObject.set(x, "fromIndex", js.undefined)
    
    inline def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
    
    inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
    
    inline def setToData(value: js.Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
    
    inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    
    inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    
    inline def setToIndexUndefined: Self = StObject.set(x, "toIndex", js.undefined)
  }
}

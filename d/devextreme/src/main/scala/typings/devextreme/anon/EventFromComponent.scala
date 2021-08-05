package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFromComponent extends StObject {
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  
  var fromData: js.UndefOr[js.Any] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  
  var toData: js.UndefOr[js.Any] = js.undefined
}
object EventFromComponent {
  
  inline def apply(): EventFromComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFromComponent]
  }
  
  extension [Self <: EventFromComponent](x: Self) {
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
    
    inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
    
    inline def setFromData(value: js.Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
    
    inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
    
    inline def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
    
    inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
    
    inline def setToData(value: js.Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
    
    inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
  }
}

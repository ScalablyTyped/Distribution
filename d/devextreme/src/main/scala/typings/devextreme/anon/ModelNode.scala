package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxTreeView
import typings.devextreme.mod.DevExpress.ui.dxTreeViewNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelNode extends StObject {
  
  var component: js.UndefOr[dxTreeView] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var itemIndex: js.UndefOr[Double | js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var node: js.UndefOr[dxTreeViewNode] = js.undefined
}
object ModelNode {
  
  inline def apply(): ModelNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelNode]
  }
  
  extension [Self <: ModelNode](x: Self) {
    
    inline def setComponent(value: dxTreeView): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    inline def setItemIndex(value: Double | js.Any): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNode(value: dxTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}

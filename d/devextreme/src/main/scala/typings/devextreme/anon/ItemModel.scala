package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.viz.dxFunnel
import typings.devextreme.mod.DevExpress.viz.dxFunnelItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemModel extends StObject {
  
  var component: js.UndefOr[dxFunnel] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var item: js.UndefOr[dxFunnelItem] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ItemModel {
  
  inline def apply(): ItemModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemModel]
  }
  
  extension [Self <: ItemModel](x: Self) {
    
    inline def setComponent(value: dxFunnel): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItem(value: dxFunnelItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}

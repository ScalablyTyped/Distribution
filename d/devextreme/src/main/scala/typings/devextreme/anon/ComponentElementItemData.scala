package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import typings.devextreme.mod.global.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElementItemData extends StObject {
  
  var cancel: js.UndefOr[Boolean | typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]] = js.undefined
  
  var component: js.UndefOr[dxList] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var itemIndex: js.UndefOr[Double | js.Any] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ComponentElementItemData {
  
  inline def apply(): ComponentElementItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentElementItemData]
  }
  
  extension [Self <: ComponentElementItemData](x: Self) {
    
    inline def setCancel(value: Boolean | typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComponent(value: dxList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    inline def setItemIndex(value: Double | js.Any): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    inline def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}

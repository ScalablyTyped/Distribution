package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTagBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddedItemsComponent extends StObject {
  
  var addedItems: js.UndefOr[js.Array[String | Double | js.Any]] = js.undefined
  
  var component: js.UndefOr[dxTagBox] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var removedItems: js.UndefOr[js.Array[String | Double | js.Any]] = js.undefined
}
object AddedItemsComponent {
  
  inline def apply(): AddedItemsComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddedItemsComponent]
  }
  
  extension [Self <: AddedItemsComponent](x: Self) {
    
    inline def setAddedItems(value: js.Array[String | Double | js.Any]): Self = StObject.set(x, "addedItems", value.asInstanceOf[js.Any])
    
    inline def setAddedItemsUndefined: Self = StObject.set(x, "addedItems", js.undefined)
    
    inline def setAddedItemsVarargs(value: (String | Double | js.Any)*): Self = StObject.set(x, "addedItems", js.Array(value :_*))
    
    inline def setComponent(value: dxTagBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRemovedItems(value: js.Array[String | Double | js.Any]): Self = StObject.set(x, "removedItems", value.asInstanceOf[js.Any])
    
    inline def setRemovedItemsUndefined: Self = StObject.set(x, "removedItems", js.undefined)
    
    inline def setRemovedItemsVarargs(value: (String | Double | js.Any)*): Self = StObject.set(x, "removedItems", js.Array(value :_*))
  }
}

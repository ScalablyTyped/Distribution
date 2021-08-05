package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTagBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiTagElement extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[dxTagBox] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var multiTagElement: js.UndefOr[dxElement] = js.undefined
  
  var selectedItems: js.UndefOr[js.Array[String | Double | js.Any]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object MultiTagElement {
  
  inline def apply(): MultiTagElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiTagElement]
  }
  
  extension [Self <: MultiTagElement](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComponent(value: dxTagBox): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setMultiTagElement(value: dxElement): Self = StObject.set(x, "multiTagElement", value.asInstanceOf[js.Any])
    
    inline def setMultiTagElementUndefined: Self = StObject.set(x, "multiTagElement", js.undefined)
    
    inline def setSelectedItems(value: js.Array[String | Double | js.Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: (String | Double | js.Any)*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

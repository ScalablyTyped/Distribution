package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemElement extends StObject {
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
}
object ItemElement {
  
  inline def apply(): ItemElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemElement]
  }
  
  extension [Self <: ItemElement](x: Self) {
    
    inline def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
  }
}

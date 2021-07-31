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
  
  @scala.inline
  def apply(): ItemElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemElement]
  }
  
  @scala.inline
  implicit class ItemElementMutableBuilder[Self <: ItemElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
  }
}

package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemData[T] extends StObject {
  
  var component: js.UndefOr[T] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var itemIndex: js.UndefOr[Double] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ItemData {
  
  @scala.inline
  def apply[T](): ItemData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemData[T]]
  }
  
  @scala.inline
  implicit class ItemDataMutableBuilder[Self <: ItemData[?], T] (val x: Self & ItemData[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setItemData(value: js.Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    @scala.inline
    def setItemElement(value: dxElement): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}

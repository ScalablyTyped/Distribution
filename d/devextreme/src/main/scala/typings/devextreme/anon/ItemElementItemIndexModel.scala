package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeView
import typings.devextreme.mod.DevExpress.ui.dxTreeViewNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemElementItemIndexModel extends StObject {
  
  var component: js.UndefOr[dxTreeView] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var itemData: js.UndefOr[js.Any] = js.undefined
  
  var itemElement: js.UndefOr[dxElement] = js.undefined
  
  var itemIndex: js.UndefOr[Double] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var node: js.UndefOr[dxTreeViewNode] = js.undefined
}
object ItemElementItemIndexModel {
  
  @scala.inline
  def apply(): ItemElementItemIndexModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemElementItemIndexModel]
  }
  
  @scala.inline
  implicit class ItemElementItemIndexModelMutableBuilder[Self <: ItemElementItemIndexModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxTreeView): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setNode(value: dxTreeViewNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}

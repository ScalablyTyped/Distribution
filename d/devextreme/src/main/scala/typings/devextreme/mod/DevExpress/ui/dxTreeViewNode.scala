package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxTreeView.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTreeViewNode[TKey] extends StObject {
  
  /**
    * Contains all the child nodes of the current node.
    */
  var children: js.UndefOr[js.Array[dxTreeViewNode[TKey]]] = js.undefined
  
  /**
    * Equals to true if the node is disabled; otherwise false.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Equals true if the node is expanded; false if collapsed.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains the data source object corresponding to the node.
    */
  var itemData: js.UndefOr[Item] = js.undefined
  
  /**
    * Contains the key value of the node.
    */
  var key: js.UndefOr[TKey] = js.undefined
  
  /**
    * Refers to the parent node of the current node.
    */
  var parent: js.UndefOr[dxTreeViewNode[TKey]] = js.undefined
  
  /**
    * Equals to true if the node is selected; false if not.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains the text displayed by the node.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxTreeViewNode {
  
  inline def apply[TKey](): dxTreeViewNode[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeViewNode[TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTreeViewNode[?], TKey] (val x: Self & dxTreeViewNode[TKey]) extends AnyVal {
    
    inline def setChildren(value: js.Array[dxTreeViewNode[TKey]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: dxTreeViewNode[TKey]*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setItemData(value: Item): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
    
    inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setParent(value: dxTreeViewNode[TKey]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

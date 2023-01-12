package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTreeViewItem
  extends StObject
     with CollectionWidgetItem
     with /* key */ StringDictionary[Any] {
  
  /**
    * Specifies whether or not the tree view item is displayed expanded.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the tree view item has children.
    */
  var hasItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the tree view item&apos;s icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Holds the unique key of an item.
    */
  var id: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Specifies nested tree view items.
    */
  var items: js.UndefOr[js.Array[dxTreeViewItem]] = js.undefined
  
  /**
    * Holds the key of the parent item.
    */
  var parentId: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Specifies whether the TreeView item should be displayed as selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
}
object dxTreeViewItem {
  
  inline def apply(): dxTreeViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeViewItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTreeViewItem] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setHasItems(value: Boolean): Self = StObject.set(x, "hasItems", value.asInstanceOf[js.Any])
    
    inline def setHasItemsUndefined: Self = StObject.set(x, "hasItems", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: js.Array[dxTreeViewItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: dxTreeViewItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setParentId(value: Double | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}

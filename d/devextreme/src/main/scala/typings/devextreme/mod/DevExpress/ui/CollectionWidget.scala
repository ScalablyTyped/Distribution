package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.ui.CollectionWidget.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionWidget[TProperties /* <: CollectionWidgetOptions[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey]
  extends StObject
     with Widget[TProperties] {
  
  def getDataSource(): DataSource[TItem, TKey] = js.native
}
object CollectionWidget {
  
  type ItemLike = String | CollectionWidgetItem | Any
  
  trait SelectionChangedInfo[TItem /* <: ItemLike */] extends StObject {
    
    val addedItems: js.Array[TItem]
    
    val removedItems: js.Array[TItem]
  }
  object SelectionChangedInfo {
    
    inline def apply[TItem /* <: ItemLike */](addedItems: js.Array[TItem], removedItems: js.Array[TItem]): SelectionChangedInfo[TItem] = {
      val __obj = js.Dynamic.literal(addedItems = addedItems.asInstanceOf[js.Any], removedItems = removedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedInfo[TItem]]
    }
    
    extension [Self <: SelectionChangedInfo[?], TItem /* <: ItemLike */](x: Self & SelectionChangedInfo[TItem]) {
      
      inline def setAddedItems(value: js.Array[TItem]): Self = StObject.set(x, "addedItems", value.asInstanceOf[js.Any])
      
      inline def setAddedItemsVarargs(value: TItem*): Self = StObject.set(x, "addedItems", js.Array(value*))
      
      inline def setRemovedItems(value: js.Array[TItem]): Self = StObject.set(x, "removedItems", value.asInstanceOf[js.Any])
      
      inline def setRemovedItemsVarargs(value: TItem*): Self = StObject.set(x, "removedItems", js.Array(value*))
    }
  }
}

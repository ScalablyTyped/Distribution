package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.CollectionWidget.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalCollectionWidgetOptions[TComponent /* <: HierarchicalCollectionWidget[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[TComponent, TItem, TKey] {
  
  /**
    * Specifies the name of the data source item field whose value defines whether or not the corresponding UI component item is disabled.
    */
  var disabledExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the data field whose values should be displayed.
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ TItem, String])] = js.undefined
  
  /**
    * Specifies which data field contains nested items.
    */
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the name of the data source item field whose value defines whether or not the corresponding UI component items is selected.
    */
  var selectedExpr: js.UndefOr[String | js.Function] = js.undefined
}
object HierarchicalCollectionWidgetOptions {
  
  inline def apply[TComponent /* <: HierarchicalCollectionWidget[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey](): HierarchicalCollectionWidgetOptions[TComponent, TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalCollectionWidgetOptions[TComponent, TItem, TKey]]
  }
  
  extension [Self <: HierarchicalCollectionWidgetOptions[?, ?, ?], TComponent /* <: HierarchicalCollectionWidget[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey](x: Self & (HierarchicalCollectionWidgetOptions[TComponent, TItem, TKey])) {
    
    inline def setDisabledExpr(value: String | js.Function): Self = StObject.set(x, "disabledExpr", value.asInstanceOf[js.Any])
    
    inline def setDisabledExprUndefined: Self = StObject.set(x, "disabledExpr", js.undefined)
    
    inline def setDisplayExpr(value: String | (js.Function1[/* item */ TItem, String])): Self = StObject.set(x, "displayExpr", value.asInstanceOf[js.Any])
    
    inline def setDisplayExprFunction1(value: /* item */ TItem => String): Self = StObject.set(x, "displayExpr", js.Any.fromFunction1(value))
    
    inline def setDisplayExprUndefined: Self = StObject.set(x, "displayExpr", js.undefined)
    
    inline def setItemsExpr(value: String | js.Function): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
    
    inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
    
    inline def setSelectedExpr(value: String | js.Function): Self = StObject.set(x, "selectedExpr", value.asInstanceOf[js.Any])
    
    inline def setSelectedExprUndefined: Self = StObject.set(x, "selectedExpr", js.undefined)
  }
}

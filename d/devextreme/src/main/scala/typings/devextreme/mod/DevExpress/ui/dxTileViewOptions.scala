package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.Orientation
import typings.devextreme.mod.DevExpress.common.ScrollbarMode
import typings.devextreme.mod.DevExpress.ui.dxTileView.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTileViewOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxTileView[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies the height of the base tile view item.
    */
  var baseItemHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width of the base tile view item.
    */
  var baseItemWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the UI component is oriented horizontally or vertically.
    */
  var direction: js.UndefOr[Orientation] = js.undefined
  
  /**
    * Specifies the distance in pixels between adjacent tiles.
    */
  var itemMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to display a scrollbar.
    */
  var showScrollbar: js.UndefOr[ScrollbarMode] = js.undefined
}
object dxTileViewOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxTileViewOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTileViewOptions[TItem, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTileViewOptions[?, ?], TItem /* <: ItemLike */, TKey] (val x: Self & (dxTileViewOptions[TItem, TKey])) extends AnyVal {
    
    inline def setBaseItemHeight(value: Double): Self = StObject.set(x, "baseItemHeight", value.asInstanceOf[js.Any])
    
    inline def setBaseItemHeightUndefined: Self = StObject.set(x, "baseItemHeight", js.undefined)
    
    inline def setBaseItemWidth(value: Double): Self = StObject.set(x, "baseItemWidth", value.asInstanceOf[js.Any])
    
    inline def setBaseItemWidthUndefined: Self = StObject.set(x, "baseItemWidth", js.undefined)
    
    inline def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setItemMargin(value: Double): Self = StObject.set(x, "itemMargin", value.asInstanceOf[js.Any])
    
    inline def setItemMarginUndefined: Self = StObject.set(x, "itemMargin", js.undefined)
    
    inline def setShowScrollbar(value: ScrollbarMode): Self = StObject.set(x, "showScrollbar", value.asInstanceOf[js.Any])
    
    inline def setShowScrollbarUndefined: Self = StObject.set(x, "showScrollbar", js.undefined)
  }
}

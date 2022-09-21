package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxBox.BoxDirection
import typings.devextreme.mod.DevExpress.ui.dxBox.CrosswiseDistribution
import typings.devextreme.mod.DevExpress.ui.dxBox.Distribution
import typings.devextreme.mod.DevExpress.ui.dxBox.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxBoxOptions[TItem /* <: ItemLike[TKey] */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxBox[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies how UI component items are aligned along the main direction.
    */
  var align: js.UndefOr[Distribution] = js.undefined
  
  /**
    * Specifies how UI component items are aligned cross-wise.
    */
  var crossAlign: js.UndefOr[CrosswiseDistribution] = js.undefined
  
  /**
    * Specifies the direction of item positioning in the UI component.
    */
  var direction: js.UndefOr[BoxDirection] = js.undefined
}
object dxBoxOptions {
  
  inline def apply[TItem /* <: ItemLike[TKey] */, TKey](): dxBoxOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBoxOptions[TItem, TKey]]
  }
  
  extension [Self <: dxBoxOptions[?, ?], TItem /* <: ItemLike[TKey] */, TKey](x: Self & (dxBoxOptions[TItem, TKey])) {
    
    inline def setAlign(value: Distribution): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCrossAlign(value: CrosswiseDistribution): Self = StObject.set(x, "crossAlign", value.asInstanceOf[js.Any])
    
    inline def setCrossAlignUndefined: Self = StObject.set(x, "crossAlign", js.undefined)
    
    inline def setDirection(value: BoxDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}

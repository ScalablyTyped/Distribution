package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.dxFunnel.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunnelLegendItem
  extends StObject
     with BaseLegendItem {
  
  /**
    * The funnel item that the legend item represents.
    */
  var item: js.UndefOr[Item] = js.undefined
}
object FunnelLegendItem {
  
  inline def apply(): FunnelLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunnelLegendItem]
  }
  
  extension [Self <: FunnelLegendItem](x: Self) {
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}

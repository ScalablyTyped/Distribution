package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.BaseLegendItem
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunnelLegendItem] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}

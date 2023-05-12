package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.BaseLegendItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarGaugeLegendItem
  extends StObject
     with BaseLegendItem {
  
  /**
    * The bar that the legend item represents.
    */
  var item: js.UndefOr[BarGaugeBarInfo] = js.undefined
}
object BarGaugeLegendItem {
  
  inline def apply(): BarGaugeLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGaugeLegendItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarGaugeLegendItem] (val x: Self) extends AnyVal {
    
    inline def setItem(value: BarGaugeBarInfo): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}

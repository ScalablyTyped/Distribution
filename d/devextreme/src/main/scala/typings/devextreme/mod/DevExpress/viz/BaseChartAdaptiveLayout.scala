package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChartAdaptiveLayout extends StObject {
  
  /**
    * Specifies the minimum container height at which the layout begins to adapt.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether point labels should be kept when the UI component adapts the layout.
    */
  var keepLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the minimum container width at which the layout begins to adapt.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object BaseChartAdaptiveLayout {
  
  inline def apply(): BaseChartAdaptiveLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartAdaptiveLayout]
  }
  
  extension [Self <: BaseChartAdaptiveLayout](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKeepLabels(value: Boolean): Self = StObject.set(x, "keepLabels", value.asInstanceOf[js.Any])
    
    inline def setKeepLabelsUndefined: Self = StObject.set(x, "keepLabels", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

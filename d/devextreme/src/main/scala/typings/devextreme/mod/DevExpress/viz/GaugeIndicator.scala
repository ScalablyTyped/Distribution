package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.viz.BaseGauge.GaugeIndicatorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeIndicator
  extends StObject
     with CommonIndicator {
  
  /**
    * Specifies the type of gauge indicators.
    */
  var `type`: js.UndefOr[GaugeIndicatorType] = js.undefined
}
object GaugeIndicator {
  
  inline def apply(): GaugeIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeIndicator]
  }
  
  extension [Self <: GaugeIndicator](x: Self) {
    
    inline def setType(value: GaugeIndicatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

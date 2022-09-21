package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Percent extends StObject {
  
  var item: js.UndefOr[typings.devextreme.mod.DevExpress.viz.dxFunnel.Item] = js.undefined
  
  var percent: js.UndefOr[Double] = js.undefined
  
  var percentText: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object Percent {
  
  inline def apply(): Percent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percent]
  }
  
  extension [Self <: Percent](x: Self) {
    
    inline def setItem(value: typings.devextreme.mod.DevExpress.viz.dxFunnel.Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentText(value: String): Self = StObject.set(x, "percentText", value.asInstanceOf[js.Any])
    
    inline def setPercentTextUndefined: Self = StObject.set(x, "percentText", js.undefined)
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

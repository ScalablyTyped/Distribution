package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.dxChart.FinancialChartReductionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  /**
    * Specifies a color for the points whose price has decreased in comparison to the price of the previous point.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether high, low, open or close prices of points should be compared.
    */
  var level: js.UndefOr[FinancialChartReductionLevel] = js.undefined
}
object Level {
  
  inline def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLevel(value: FinancialChartReductionLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}

package typings.echarts.echarts

import typings.echarts.anon.AspectRatio
import typings.echarts.echarts.EChartOption.Series
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EChartsMediaOption extends StObject {
  
  var option: EChartOption[Series]
  
  var query: AspectRatio
}
object EChartsMediaOption {
  
  inline def apply(option: EChartOption[Series], query: AspectRatio): EChartsMediaOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsMediaOption]
  }
  
  extension [Self <: EChartsMediaOption](x: Self) {
    
    inline def setOption(value: EChartOption[Series]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AspectRatio): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}

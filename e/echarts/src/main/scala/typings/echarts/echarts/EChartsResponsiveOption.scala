package typings.echarts.echarts

import typings.echarts.echarts.EChartOption.Series
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EChartsResponsiveOption extends StObject {
  
  var baseOption: js.UndefOr[EChartOption[Series]] = js.undefined
  
  var media: js.UndefOr[js.Array[EChartsMediaOption]] = js.undefined
}
object EChartsResponsiveOption {
  
  inline def apply(): EChartsResponsiveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsResponsiveOption]
  }
  
  extension [Self <: EChartsResponsiveOption](x: Self) {
    
    inline def setBaseOption(value: EChartOption[Series]): Self = StObject.set(x, "baseOption", value.asInstanceOf[js.Any])
    
    inline def setBaseOptionUndefined: Self = StObject.set(x, "baseOption", js.undefined)
    
    inline def setMedia(value: js.Array[EChartsMediaOption]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMediaVarargs(value: EChartsMediaOption*): Self = StObject.set(x, "media", js.Array(value :_*))
  }
}

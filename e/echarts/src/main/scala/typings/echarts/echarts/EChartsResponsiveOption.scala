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
  
  @scala.inline
  def apply(): EChartsResponsiveOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsResponsiveOption]
  }
  
  @scala.inline
  implicit class EChartsResponsiveOptionMutableBuilder[Self <: EChartsResponsiveOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseOption(value: EChartOption[Series]): Self = StObject.set(x, "baseOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseOptionUndefined: Self = StObject.set(x, "baseOption", js.undefined)
    
    @scala.inline
    def setMedia(value: js.Array[EChartsMediaOption]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMediaVarargs(value: EChartsMediaOption*): Self = StObject.set(x, "media", js.Array(value :_*))
  }
}

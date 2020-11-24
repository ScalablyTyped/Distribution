package typings.echarts.echarts

import typings.echarts.anon.AspectRatio
import typings.echarts.echarts.EChartOption.Series
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EChartsMediaOption extends js.Object {
  
  var option: EChartOption[Series] = js.native
  
  var query: AspectRatio = js.native
}
object EChartsMediaOption {
  
  @scala.inline
  def apply(option: EChartOption[Series], query: AspectRatio): EChartsMediaOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EChartsMediaOption]
  }
  
  @scala.inline
  implicit class EChartsMediaOptionOps[Self <: EChartsMediaOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOption(value: EChartOption[Series]): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: AspectRatio): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}

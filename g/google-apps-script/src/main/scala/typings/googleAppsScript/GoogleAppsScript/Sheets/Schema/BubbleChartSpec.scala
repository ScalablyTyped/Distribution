package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BubbleChartSpec extends js.Object {
  
  var bubbleBorderColor: js.UndefOr[Color] = js.native
  
  var bubbleLabels: js.UndefOr[ChartData] = js.native
  
  var bubbleMaxRadiusSize: js.UndefOr[Double] = js.native
  
  var bubbleMinRadiusSize: js.UndefOr[Double] = js.native
  
  var bubbleOpacity: js.UndefOr[Double] = js.native
  
  var bubbleSizes: js.UndefOr[ChartData] = js.native
  
  var bubbleTextStyle: js.UndefOr[TextFormat] = js.native
  
  var domain: js.UndefOr[ChartData] = js.native
  
  var groupIds: js.UndefOr[ChartData] = js.native
  
  var legendPosition: js.UndefOr[String] = js.native
  
  var series: js.UndefOr[ChartData] = js.native
}
object BubbleChartSpec {
  
  @scala.inline
  def apply(): BubbleChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleChartSpec]
  }
  
  @scala.inline
  implicit class BubbleChartSpecOps[Self <: BubbleChartSpec] (val x: Self) extends AnyVal {
    
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
    def setBubbleBorderColor(value: Color): Self = this.set("bubbleBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleBorderColor: Self = this.set("bubbleBorderColor", js.undefined)
    
    @scala.inline
    def setBubbleLabels(value: ChartData): Self = this.set("bubbleLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleLabels: Self = this.set("bubbleLabels", js.undefined)
    
    @scala.inline
    def setBubbleMaxRadiusSize(value: Double): Self = this.set("bubbleMaxRadiusSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleMaxRadiusSize: Self = this.set("bubbleMaxRadiusSize", js.undefined)
    
    @scala.inline
    def setBubbleMinRadiusSize(value: Double): Self = this.set("bubbleMinRadiusSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleMinRadiusSize: Self = this.set("bubbleMinRadiusSize", js.undefined)
    
    @scala.inline
    def setBubbleOpacity(value: Double): Self = this.set("bubbleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleOpacity: Self = this.set("bubbleOpacity", js.undefined)
    
    @scala.inline
    def setBubbleSizes(value: ChartData): Self = this.set("bubbleSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleSizes: Self = this.set("bubbleSizes", js.undefined)
    
    @scala.inline
    def setBubbleTextStyle(value: TextFormat): Self = this.set("bubbleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleTextStyle: Self = this.set("bubbleTextStyle", js.undefined)
    
    @scala.inline
    def setDomain(value: ChartData): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setGroupIds(value: ChartData): Self = this.set("groupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIds: Self = this.set("groupIds", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setSeries(value: ChartData): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
}

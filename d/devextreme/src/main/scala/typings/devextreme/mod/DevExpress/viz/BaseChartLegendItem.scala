package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseChartLegendItem extends BaseLegendItem {
  
  /**
    * [descr:BaseChartLegendItem.series]
    */
  var series: js.UndefOr[baseSeriesObject] = js.native
}
object BaseChartLegendItem {
  
  @scala.inline
  def apply(): BaseChartLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartLegendItem]
  }
  
  @scala.inline
  implicit class BaseChartLegendItemOps[Self <: BaseChartLegendItem] (val x: Self) extends AnyVal {
    
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
    def setSeries(value: baseSeriesObject): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
  }
}

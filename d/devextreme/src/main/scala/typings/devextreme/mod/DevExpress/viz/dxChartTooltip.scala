package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.edge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartTooltip extends BaseChartTooltip {
  
  /**
    * [descr:dxChart.Options.tooltip.location]
    */
  var location: js.UndefOr[center | edge] = js.native
}
object dxChartTooltip {
  
  @scala.inline
  def apply(): dxChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartTooltip]
  }
  
  @scala.inline
  implicit class dxChartTooltipOps[Self <: dxChartTooltip] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: center | edge): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}

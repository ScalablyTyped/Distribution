package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartPanes extends dxChartCommonPaneSettings {
  
  /**
    * [descr:dxChart.Options.panes.height]
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * [descr:dxChart.Options.panes.name]
    */
  var name: js.UndefOr[String] = js.native
}
object dxChartPanes {
  
  @scala.inline
  def apply(): dxChartPanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartPanes]
  }
  
  @scala.inline
  implicit class dxChartPanesOps[Self <: dxChartPanes] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonSeriesOptions extends js.Object {
  
  /** Allows you to set the specific chart type for the pivot chart widget.
    * @Default {ej.PivotChart.ChartTypes.Column}
    */
  var `type`: js.UndefOr[ChartTypes | String] = js.native
}
object CommonSeriesOptions {
  
  @scala.inline
  def apply(): CommonSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSeriesOptions]
  }
  
  @scala.inline
  implicit class CommonSeriesOptionsOps[Self <: CommonSeriesOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: ChartTypes | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

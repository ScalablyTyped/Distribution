package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartCommonAxisSettingsStripStyle extends js.Object {
  
  /**
    * [descr:dxPolarChart.Options.commonAxisSettings.stripStyle.label]
    */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyleLabel] = js.native
}
object dxPolarChartCommonAxisSettingsStripStyle {
  
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsStripStyle]
  }
  
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsStripStyleOps[Self <: dxPolarChartCommonAxisSettingsStripStyle] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: dxPolarChartCommonAxisSettingsStripStyleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}

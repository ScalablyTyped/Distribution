package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartCommonAxisSettingsStripStyle extends js.Object {
  
  /**
    * [descr:dxChart.Options.commonAxisSettings.stripStyle.label]
    */
  var label: js.UndefOr[dxChartCommonAxisSettingsStripStyleLabel] = js.native
  
  /**
    * [descr:dxChart.Options.commonAxisSettings.stripStyle.paddingLeftRight]
    */
  var paddingLeftRight: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.commonAxisSettings.stripStyle.paddingTopBottom]
    */
  var paddingTopBottom: js.UndefOr[Double] = js.native
}
object dxChartCommonAxisSettingsStripStyle {
  
  @scala.inline
  def apply(): dxChartCommonAxisSettingsStripStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsStripStyle]
  }
  
  @scala.inline
  implicit class dxChartCommonAxisSettingsStripStyleOps[Self <: dxChartCommonAxisSettingsStripStyle] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: dxChartCommonAxisSettingsStripStyleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setPaddingLeftRight(value: Double): Self = this.set("paddingLeftRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeftRight: Self = this.set("paddingLeftRight", js.undefined)
    
    @scala.inline
    def setPaddingTopBottom(value: Double): Self = this.set("paddingTopBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTopBottom: Self = this.set("paddingTopBottom", js.undefined)
  }
}

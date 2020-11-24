package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartCommonAxisSettingsConstantLineStyleLabel extends js.Object {
  
  /**
    * [descr:dxPolarChart.Options.commonAxisSettings.constantLineStyle.label.font]
    */
  var font: js.UndefOr[Font] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonAxisSettings.constantLineStyle.label.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettingsConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsConstantLineStyleLabel]
  }
  
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsConstantLineStyleLabelOps[Self <: dxPolarChartCommonAxisSettingsConstantLineStyleLabel] (val x: Self) extends AnyVal {
    
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

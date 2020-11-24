package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bar
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.scatter
import typings.devextreme.devextremeStrings.stackedbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartCommonSeriesSettings extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  
  /**
    * [descr:dxPolarChart.Options.commonSeriesSettings.area]
    */
  var area: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonSeriesSettings.bar]
    */
  var bar: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonSeriesSettings.line]
    */
  var line: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonSeriesSettings.scatter]
    */
  var scatter: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonSeriesSettings.stackedbar]
    */
  var stackedbar: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonSeriesSettings.type]
    */
  var `type`: js.UndefOr[area | bar | line | scatter | stackedbar] = js.native
}
object dxPolarChartCommonSeriesSettings {
  
  @scala.inline
  def apply(): dxPolarChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonSeriesSettings]
  }
  
  @scala.inline
  implicit class dxPolarChartCommonSeriesSettingsOps[Self <: dxPolarChartCommonSeriesSettings] (val x: Self) extends AnyVal {
    
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
    def setArea(value: js.Any): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setBar(value: js.Any): Self = this.set("bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    
    @scala.inline
    def setLine(value: js.Any): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setScatter(value: js.Any): Self = this.set("scatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatter: Self = this.set("scatter", js.undefined)
    
    @scala.inline
    def setStackedbar(value: js.Any): Self = this.set("stackedbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedbar: Self = this.set("stackedbar", js.undefined)
    
    @scala.inline
    def setType(value: area | bar | line | scatter | stackedbar): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

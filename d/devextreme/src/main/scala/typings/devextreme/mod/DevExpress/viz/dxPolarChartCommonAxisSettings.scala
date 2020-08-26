package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorOpacity
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.crossLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartCommonAxisSettings extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.allowDecimals */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.color */
  var color: js.UndefOr[String] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle */
  var constantLineStyle: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyle] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.discreteAxisDivisionMode */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.endOnTick */
  var endOnTick: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.grid */
  var grid: js.UndefOr[ColorOpacity] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.inverted */
  var inverted: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.label */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsLabel] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.minorGrid */
  var minorGrid: js.UndefOr[ColorOpacity] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.minorTick */
  var minorTick: js.UndefOr[dxPolarChartCommonAxisSettingsMinorTick] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.opacity */
  var opacity: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.stripStyle */
  var stripStyle: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyle] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.tick */
  var tick: js.UndefOr[dxPolarChartCommonAxisSettingsTick] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChart.Options.commonAxisSettings.width */
  var width: js.UndefOr[Double] = js.native
}

object dxPolarChartCommonAxisSettings {
  @scala.inline
  def apply(): dxPolarChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAxisSettings]
  }
  @scala.inline
  implicit class dxPolarChartCommonAxisSettingsOps[Self <: dxPolarChartCommonAxisSettings] (val x: Self) extends AnyVal {
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
    def setAllowDecimals(value: Boolean): Self = this.set("allowDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDecimals: Self = this.set("allowDecimals", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setConstantLineStyle(value: dxPolarChartCommonAxisSettingsConstantLineStyle): Self = this.set("constantLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstantLineStyle: Self = this.set("constantLineStyle", js.undefined)
    @scala.inline
    def setDiscreteAxisDivisionMode(value: betweenLabels | crossLabels): Self = this.set("discreteAxisDivisionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscreteAxisDivisionMode: Self = this.set("discreteAxisDivisionMode", js.undefined)
    @scala.inline
    def setEndOnTick(value: Boolean): Self = this.set("endOnTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOnTick: Self = this.set("endOnTick", js.undefined)
    @scala.inline
    def setGrid(value: ColorOpacity): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setLabel(value: dxPolarChartCommonAxisSettingsLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMinorGrid(value: ColorOpacity): Self = this.set("minorGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorGrid: Self = this.set("minorGrid", js.undefined)
    @scala.inline
    def setMinorTick(value: dxPolarChartCommonAxisSettingsMinorTick): Self = this.set("minorTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTick: Self = this.set("minorTick", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setStripStyle(value: dxPolarChartCommonAxisSettingsStripStyle): Self = this.set("stripStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripStyle: Self = this.set("stripStyle", js.undefined)
    @scala.inline
    def setTick(value: dxPolarChartCommonAxisSettingsTick): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


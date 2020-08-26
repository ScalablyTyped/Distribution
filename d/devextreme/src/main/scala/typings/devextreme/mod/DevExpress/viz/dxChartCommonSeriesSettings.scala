package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bar
import typings.devextreme.devextremeStrings.bubble
import typings.devextreme.devextremeStrings.candlestick
import typings.devextreme.devextremeStrings.fullstackedarea
import typings.devextreme.devextremeStrings.fullstackedbar
import typings.devextreme.devextremeStrings.fullstackedline
import typings.devextreme.devextremeStrings.fullstackedspline
import typings.devextreme.devextremeStrings.fullstackedsplinearea
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.rangearea
import typings.devextreme.devextremeStrings.rangebar_
import typings.devextreme.devextremeStrings.scatter
import typings.devextreme.devextremeStrings.spline
import typings.devextreme.devextremeStrings.splinearea
import typings.devextreme.devextremeStrings.stackedarea
import typings.devextreme.devextremeStrings.stackedbar
import typings.devextreme.devextremeStrings.stackedline
import typings.devextreme.devextremeStrings.stackedspline
import typings.devextreme.devextremeStrings.stackedsplinearea
import typings.devextreme.devextremeStrings.steparea
import typings.devextreme.devextremeStrings.stepline
import typings.devextreme.devextremeStrings.stock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonSeriesSettings extends dxChartSeriesTypesCommonSeries {
  /** @name dxChart.Options.commonSeriesSettings.area */
  var area: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.bar */
  var bar: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.bubble */
  var bubble: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.candlestick */
  var candlestick: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.fullstackedarea */
  var fullstackedarea: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.fullstackedbar */
  var fullstackedbar: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.fullstackedline */
  var fullstackedline: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.fullstackedspline */
  var fullstackedspline: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.fullstackedsplinearea */
  var fullstackedsplinearea: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.line */
  var line: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.rangearea */
  var rangearea: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.rangebar */
  var rangebar: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.scatter */
  var scatter: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.spline */
  var spline: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.splinearea */
  var splinearea: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.stackedarea */
  var stackedarea: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.stackedbar */
  var stackedbar: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.stackedline */
  var stackedline: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.stackedspline */
  var stackedspline: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.stackedsplinearea */
  var stackedsplinearea: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.steparea */
  var steparea: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.stepline */
  var stepline: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.stock */
  var stock: js.UndefOr[js.Any] = js.native
  /** @name dxChart.Options.commonSeriesSettings.type */
  var `type`: js.UndefOr[
    area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
  ] = js.native
}

object dxChartCommonSeriesSettings {
  @scala.inline
  def apply(): dxChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonSeriesSettings]
  }
  @scala.inline
  implicit class dxChartCommonSeriesSettingsOps[Self <: dxChartCommonSeriesSettings] (val x: Self) extends AnyVal {
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
    def setBubble(value: js.Any): Self = this.set("bubble", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    @scala.inline
    def setCandlestick(value: js.Any): Self = this.set("candlestick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandlestick: Self = this.set("candlestick", js.undefined)
    @scala.inline
    def setFullstackedarea(value: js.Any): Self = this.set("fullstackedarea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullstackedarea: Self = this.set("fullstackedarea", js.undefined)
    @scala.inline
    def setFullstackedbar(value: js.Any): Self = this.set("fullstackedbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullstackedbar: Self = this.set("fullstackedbar", js.undefined)
    @scala.inline
    def setFullstackedline(value: js.Any): Self = this.set("fullstackedline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullstackedline: Self = this.set("fullstackedline", js.undefined)
    @scala.inline
    def setFullstackedspline(value: js.Any): Self = this.set("fullstackedspline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullstackedspline: Self = this.set("fullstackedspline", js.undefined)
    @scala.inline
    def setFullstackedsplinearea(value: js.Any): Self = this.set("fullstackedsplinearea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullstackedsplinearea: Self = this.set("fullstackedsplinearea", js.undefined)
    @scala.inline
    def setLine(value: js.Any): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setRangearea(value: js.Any): Self = this.set("rangearea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangearea: Self = this.set("rangearea", js.undefined)
    @scala.inline
    def setRangebar(value: js.Any): Self = this.set("rangebar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangebar: Self = this.set("rangebar", js.undefined)
    @scala.inline
    def setScatter(value: js.Any): Self = this.set("scatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScatter: Self = this.set("scatter", js.undefined)
    @scala.inline
    def setSpline(value: js.Any): Self = this.set("spline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpline: Self = this.set("spline", js.undefined)
    @scala.inline
    def setSplinearea(value: js.Any): Self = this.set("splinearea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplinearea: Self = this.set("splinearea", js.undefined)
    @scala.inline
    def setStackedarea(value: js.Any): Self = this.set("stackedarea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedarea: Self = this.set("stackedarea", js.undefined)
    @scala.inline
    def setStackedbar(value: js.Any): Self = this.set("stackedbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedbar: Self = this.set("stackedbar", js.undefined)
    @scala.inline
    def setStackedline(value: js.Any): Self = this.set("stackedline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedline: Self = this.set("stackedline", js.undefined)
    @scala.inline
    def setStackedspline(value: js.Any): Self = this.set("stackedspline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedspline: Self = this.set("stackedspline", js.undefined)
    @scala.inline
    def setStackedsplinearea(value: js.Any): Self = this.set("stackedsplinearea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedsplinearea: Self = this.set("stackedsplinearea", js.undefined)
    @scala.inline
    def setSteparea(value: js.Any): Self = this.set("steparea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteparea: Self = this.set("steparea", js.undefined)
    @scala.inline
    def setStepline(value: js.Any): Self = this.set("stepline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepline: Self = this.set("stepline", js.undefined)
    @scala.inline
    def setStock(value: js.Any): Self = this.set("stock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStock: Self = this.set("stock", js.undefined)
    @scala.inline
    def setType(
      value: area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


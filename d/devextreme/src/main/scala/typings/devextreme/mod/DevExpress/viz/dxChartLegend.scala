package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.SeriesColor
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartLegend extends BaseChartLegend {
  /** @name dxChart.Options.legend.customizeHint */
  var customizeHint: js.UndefOr[js.Function1[/* seriesInfo */ SeriesColor, String]] = js.native
  /** @name dxChart.Options.legend.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* seriesInfo */ SeriesColor, String]] = js.native
  /** @name dxChart.Options.legend.hoverMode */
  var hoverMode: js.UndefOr[excludePoints | includePoints | none] = js.native
  /** @name dxChart.Options.legend.position */
  var position: js.UndefOr[inside | outside] = js.native
}

object dxChartLegend {
  @scala.inline
  def apply(): dxChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartLegend]
  }
  @scala.inline
  implicit class dxChartLegendOps[Self <: dxChartLegend] (val x: Self) extends AnyVal {
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
    def setCustomizeHint(value: /* seriesInfo */ SeriesColor => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    @scala.inline
    def setCustomizeText(value: /* seriesInfo */ SeriesColor => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setHoverMode(value: excludePoints | includePoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setPosition(value: inside | outside): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}


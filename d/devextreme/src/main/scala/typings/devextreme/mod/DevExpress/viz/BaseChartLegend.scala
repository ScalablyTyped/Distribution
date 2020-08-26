package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name BaseChart.Options.legend */
@js.native
trait BaseChartLegend extends BaseLegend {
  /** @name BaseChart.Options.legend.customizeItems */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[BaseChartLegendItem], js.Array[BaseChartLegendItem]]
  ] = js.native
  /** @name BaseChart.Options.legend.markerTemplate */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ BaseChartLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
}

object BaseChartLegend {
  @scala.inline
  def apply(): BaseChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartLegend]
  }
  @scala.inline
  implicit class BaseChartLegendOps[Self <: BaseChartLegend] (val x: Self) extends AnyVal {
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
    def setCustomizeItems(value: /* items */ js.Array[BaseChartLegendItem] => js.Array[BaseChartLegendItem]): Self = this.set("customizeItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeItems: Self = this.set("customizeItems", js.undefined)
    @scala.inline
    def setMarkerTemplateFunction2(
      value: (/* legendItem */ BaseChartLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("markerTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ BaseChartLegendItem, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
  }
  
}


package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.PointColor
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPieChartLegend extends BaseChartLegend {
  
  /**
    * [descr:dxPieChart.Options.legend.customizeHint]
    */
  var customizeHint: js.UndefOr[js.Function1[/* pointInfo */ PointColor, String]] = js.native
  
  /**
    * [descr:dxPieChart.Options.legend.customizeItems]
    */
  @JSName("customizeItems")
  var customizeItems_dxPieChartLegend: js.UndefOr[
    js.Function1[/* items */ js.Array[PieChartLegendItem], js.Array[PieChartLegendItem]]
  ] = js.native
  
  /**
    * [descr:dxPieChart.Options.legend.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ PointColor, String]] = js.native
  
  /**
    * [descr:dxPieChart.Options.legend.hoverMode]
    */
  var hoverMode: js.UndefOr[none | allArgumentPoints] = js.native
  
  /**
    * [descr:dxPieChart.Options.legend.markerTemplate]
    */
  @JSName("markerTemplate")
  var markerTemplate_dxPieChartLegend: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ PieChartLegendItem, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
}
object dxPieChartLegend {
  
  @scala.inline
  def apply(): dxPieChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartLegend]
  }
  
  @scala.inline
  implicit class dxPieChartLegendOps[Self <: dxPieChartLegend] (val x: Self) extends AnyVal {
    
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
    def setCustomizeHint(value: /* pointInfo */ PointColor => String): Self = this.set("customizeHint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeHint: Self = this.set("customizeHint", js.undefined)
    
    @scala.inline
    def setCustomizeItems(value: /* items */ js.Array[PieChartLegendItem] => js.Array[PieChartLegendItem]): Self = this.set("customizeItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeItems: Self = this.set("customizeItems", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* pointInfo */ PointColor => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setHoverMode(value: none | allArgumentPoints): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setMarkerTemplateFunction2(
      value: (/* legendItem */ PieChartLegendItem, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("markerTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ PieChartLegendItem, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("markerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerTemplate: Self = this.set("markerTemplate", js.undefined)
  }
}

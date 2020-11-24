package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.edge
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.Date
import typings.std.Element
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPieChartCommonAnnotationConfig extends BaseWidgetAnnotationConfig {
  
  /**
    * [descr:dxPieChartCommonAnnotationConfig.argument]
    */
  var argument: js.UndefOr[Double | Date | String] = js.native
  
  /**
    * [descr:dxPieChartCommonAnnotationConfig.customizeTooltip]
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxPieChartAnnotationConfig | js.Any, _]] = js.native
  
  /**
    * [descr:dxPieChartCommonAnnotationConfig.location]
    */
  var location: js.UndefOr[center | edge] = js.native
  
  /**
    * [descr:dxPieChartCommonAnnotationConfig.series]
    */
  var series: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxPieChartCommonAnnotationConfig.template]
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ this.type | js.Any, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxPieChartCommonAnnotationConfig.tooltipTemplate]
    */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxPieChartAnnotationConfig | js.Any, 
      /* element */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
}
object dxPieChartCommonAnnotationConfig {
  
  @scala.inline
  def apply(): dxPieChartCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartCommonAnnotationConfig]
  }
  
  @scala.inline
  implicit class dxPieChartCommonAnnotationConfigOps[Self <: dxPieChartCommonAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: Double | Date | String): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    
    @scala.inline
    def setCustomizeTooltip(value: /* annotation */ dxPieChartAnnotationConfig | js.Any => _): Self = this.set("customizeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeTooltip: Self = this.set("customizeTooltip", js.undefined)
    
    @scala.inline
    def setLocation(value: center | edge): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(
      value: (/* annotation */ dxPieChartCommonAnnotationConfig | js.Any, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPieChartCommonAnnotationConfig | js.Any, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTooltipTemplateFunction2(
      value: (/* annotation */ dxPieChartAnnotationConfig | js.Any, /* element */ dxElement) => String | Element | JQuery
    ): Self = this.set("tooltipTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPieChartAnnotationConfig | js.Any, 
          /* element */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
  }
}

package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartCommonAnnotationConfig extends BaseChartAnnotationConfig {
  
  /**
    * [descr:dxPolarChartCommonAnnotationConfig.angle]
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChartCommonAnnotationConfig.customizeTooltip]
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxPolarChartAnnotationConfig | js.Any, _]] = js.native
  
  /**
    * [descr:dxPolarChartCommonAnnotationConfig.radius]
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChartCommonAnnotationConfig.template]
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ this.type | js.Any, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxPolarChartCommonAnnotationConfig.tooltipTemplate]
    */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxPolarChartAnnotationConfig | js.Any, 
      /* element */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
}
object dxPolarChartCommonAnnotationConfig {
  
  @scala.inline
  def apply(): dxPolarChartCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAnnotationConfig]
  }
  
  @scala.inline
  implicit class dxPolarChartCommonAnnotationConfigOps[Self <: dxPolarChartCommonAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setCustomizeTooltip(value: /* annotation */ dxPolarChartAnnotationConfig | js.Any => _): Self = this.set("customizeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeTooltip: Self = this.set("customizeTooltip", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(
      value: (/* annotation */ dxPolarChartCommonAnnotationConfig | js.Any, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPolarChartCommonAnnotationConfig | js.Any, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTooltipTemplateFunction2(
      value: (/* annotation */ dxPolarChartAnnotationConfig | js.Any, /* element */ dxElement) => String | Element | JQuery
    ): Self = this.set("tooltipTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPolarChartAnnotationConfig | js.Any, 
          /* element */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
  }
}

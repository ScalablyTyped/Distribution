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
trait dxVectorMapCommonAnnotationConfig extends BaseWidgetAnnotationConfig {
  
  /**
    * [descr:dxVectorMapCommonAnnotationConfig.coordinates]
    */
  var coordinates: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * [descr:dxVectorMapCommonAnnotationConfig.customizeTooltip]
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxVectorMapAnnotationConfig | js.Any, _]] = js.native
  
  /**
    * [descr:dxVectorMapCommonAnnotationConfig.template]
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ dxVectorMapAnnotationConfig | js.Any, 
      /* element */ SVGGElement, 
      String | SVGElement | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:dxVectorMapCommonAnnotationConfig.tooltipTemplate]
    */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxVectorMapAnnotationConfig | js.Any, 
      /* element */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
}
object dxVectorMapCommonAnnotationConfig {
  
  @scala.inline
  def apply(): dxVectorMapCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapCommonAnnotationConfig]
  }
  
  @scala.inline
  implicit class dxVectorMapCommonAnnotationConfigOps[Self <: dxVectorMapCommonAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setCoordinatesVarargs(value: Double*): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[Double]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setCustomizeTooltip(value: /* annotation */ dxVectorMapAnnotationConfig | js.Any => _): Self = this.set("customizeTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeTooltip: Self = this.set("customizeTooltip", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(
      value: (/* annotation */ dxVectorMapAnnotationConfig | js.Any, /* element */ SVGGElement) => String | SVGElement | JQuery
    ): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplate(
      value: template | (js.Function2[
          /* annotation */ dxVectorMapAnnotationConfig | js.Any, 
          /* element */ SVGGElement, 
          String | SVGElement | JQuery
        ])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTooltipTemplateFunction2(
      value: (/* annotation */ dxVectorMapAnnotationConfig | js.Any, /* element */ dxElement) => String | Element | JQuery
    ): Self = this.set("tooltipTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipTemplate(
      value: template | (js.Function2[
          /* annotation */ dxVectorMapAnnotationConfig | js.Any, 
          /* element */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
  }
}

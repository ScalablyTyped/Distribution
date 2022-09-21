package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartCommonAnnotationConfig
  extends StObject
     with BaseChartAnnotationConfig {
  
  /**
    * Specifies the angle between the startAngle and the radius.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Customizes the text and appearance of the annotation&apos;s tooltip.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxPolarChartAnnotationConfig | Any, Any]] = js.undefined
  
  /**
    * Places an annotation at the specified distance from the center of the UI component.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for the annotation. Applies only if the type is &apos;custom&apos;.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ dxPolarChartAnnotationConfig | Any, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for an annotation&apos;s tooltip.
    */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxPolarChartAnnotationConfig | Any, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
}
object dxPolarChartCommonAnnotationConfig {
  
  inline def apply(): dxPolarChartCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartCommonAnnotationConfig]
  }
  
  extension [Self <: dxPolarChartCommonAnnotationConfig](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setCustomizeTooltip(value: /* annotation */ dxPolarChartAnnotationConfig | Any => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPolarChartAnnotationConfig | Any, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* annotation */ dxPolarChartAnnotationConfig | Any, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTooltipTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPolarChartAnnotationConfig | Any, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateFunction2(
      value: (/* annotation */ dxPolarChartAnnotationConfig | Any, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "tooltipTemplate", js.Any.fromFunction2(value))
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
  }
}

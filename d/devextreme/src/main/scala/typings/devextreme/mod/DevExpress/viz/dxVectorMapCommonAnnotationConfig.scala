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

trait dxVectorMapCommonAnnotationConfig
  extends StObject
     with BaseWidgetAnnotationConfig {
  
  /**
    * Positions the annotation&apos;s center at specified geographic coordinates: [longitude, latitude].
    */
  var coordinates: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Customizes the text and appearance of the annotation&apos;s tooltip.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxVectorMapAnnotationConfig | Any, Any]] = js.undefined
  
  /**
    * Specifies a custom template for the annotation. Applies only if the type is &apos;custom&apos;.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ dxVectorMapAnnotationConfig | Any, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for an annotation&apos;s tooltip.
    */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxVectorMapAnnotationConfig | Any, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
}
object dxVectorMapCommonAnnotationConfig {
  
  inline def apply(): dxVectorMapCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapCommonAnnotationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxVectorMapCommonAnnotationConfig] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setCustomizeTooltip(value: /* annotation */ dxVectorMapAnnotationConfig | Any => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* annotation */ dxVectorMapAnnotationConfig | Any, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* annotation */ dxVectorMapAnnotationConfig | Any, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTooltipTemplate(
      value: template | (js.Function2[
          /* annotation */ dxVectorMapAnnotationConfig | Any, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateFunction2(
      value: (/* annotation */ dxVectorMapAnnotationConfig | Any, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "tooltipTemplate", js.Any.fromFunction2(value))
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
  }
}

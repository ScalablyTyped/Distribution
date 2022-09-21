package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Text
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.viz.dxFunnel.LegendItem
import typings.std.SVGElement
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFunnelLegend
  extends StObject
     with BaseLegend {
  
  /**
    * Specifies the hint that appears when a user hovers the mouse pointer over a legend item.
    */
  var customizeHint: js.UndefOr[js.Function1[/* itemInfo */ Text, String]] = js.undefined
  
  /**
    * Allows you to change the order, text, and visibility of legend items.
    */
  var customizeItems: js.UndefOr[js.Function1[/* items */ js.Array[LegendItem], js.Array[LegendItem]]] = js.undefined
  
  /**
    * Customizes the text displayed by legend items.
    */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Text, String]] = js.undefined
  
  /**
    * Specifies an SVG element that serves as a custom legend item marker.
    */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ LegendItem, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
}
object dxFunnelLegend {
  
  inline def apply(): dxFunnelLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelLegend]
  }
  
  extension [Self <: dxFunnelLegend](x: Self) {
    
    inline def setCustomizeHint(value: /* itemInfo */ Text => String): Self = StObject.set(x, "customizeHint", js.Any.fromFunction1(value))
    
    inline def setCustomizeHintUndefined: Self = StObject.set(x, "customizeHint", js.undefined)
    
    inline def setCustomizeItems(value: /* items */ js.Array[LegendItem] => js.Array[LegendItem]): Self = StObject.set(x, "customizeItems", js.Any.fromFunction1(value))
    
    inline def setCustomizeItemsUndefined: Self = StObject.set(x, "customizeItems", js.undefined)
    
    inline def setCustomizeText(value: /* itemInfo */ Text => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ LegendItem, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
    
    inline def setMarkerTemplateFunction2(
      value: (/* legendItem */ LegendItem, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "markerTemplate", js.Any.fromFunction2(value))
    
    inline def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
  }
}

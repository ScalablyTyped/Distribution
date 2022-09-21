package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxVectorMapTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Specifies a custom template for a tooltip.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* info */ MapLayerElement, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies text and appearance of a set of tooltips.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* info */ MapLayerElement, Any]] = js.undefined
}
object dxVectorMapTooltip {
  
  inline def apply(): dxVectorMapTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxVectorMapTooltip]
  }
  
  extension [Self <: dxVectorMapTooltip](x: Self) {
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* info */ MapLayerElement, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* info */ MapLayerElement, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCustomizeTooltip(value: /* info */ MapLayerElement => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
  }
}

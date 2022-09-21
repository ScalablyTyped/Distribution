package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ValueText
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGaugeTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Specifies a custom template for a tooltip.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* scaleValue */ ValueText, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Allows you to change the appearance of specified tooltips.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* scaleValue */ ValueText, Any]] = js.undefined
  
  /**
    * Allows users to interact with the tooltip content.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
}
object BaseGaugeTooltip {
  
  inline def apply(): BaseGaugeTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeTooltip]
  }
  
  extension [Self <: BaseGaugeTooltip](x: Self) {
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* scaleValue */ ValueText, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* scaleValue */ ValueText, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCustomizeTooltip(value: /* scaleValue */ ValueText => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
  }
}

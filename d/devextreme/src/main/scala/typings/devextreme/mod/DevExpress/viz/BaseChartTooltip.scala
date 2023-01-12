package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.Format
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChartTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Formats the point argument before it is displayed in the tooltip. To format the point value, use the format property.
    */
  var argumentFormat: js.UndefOr[Format] = js.undefined
  
  /**
    * Specifies a custom template for a tooltip.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* pointInfo */ Any, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Allows you to change tooltip appearance.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* pointInfo */ Any, Any]] = js.undefined
  
  /**
    * Allows users to interact with the tooltip content.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the tooltip is shared across all series points with the same argument.
    */
  var shared: js.UndefOr[Boolean] = js.undefined
}
object BaseChartTooltip {
  
  inline def apply(): BaseChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseChartTooltip] (val x: Self) extends AnyVal {
    
    inline def setArgumentFormat(value: Format): Self = StObject.set(x, "argumentFormat", value.asInstanceOf[js.Any])
    
    inline def setArgumentFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "argumentFormat", js.Any.fromFunction1(value))
    
    inline def setArgumentFormatUndefined: Self = StObject.set(x, "argumentFormat", js.undefined)
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* pointInfo */ Any, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* pointInfo */ Any, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCustomizeTooltip(value: /* pointInfo */ Any => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
  }
}

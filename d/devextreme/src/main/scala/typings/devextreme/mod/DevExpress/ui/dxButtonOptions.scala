package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.ButtonStyle
import typings.devextreme.mod.DevExpress.common.ButtonType
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxButton.ClickEvent
import typings.devextreme.mod.DevExpress.ui.dxButton.TemplateData
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxButtonOptions
  extends StObject
     with WidgetOptions[dxButton] {
  
  /**
    * Specifies the icon to be displayed on the button.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when the Button is clicked or tapped.
    */
  var onClick: js.UndefOr[js.Function1[/* e */ ClickEvent, Unit]] = js.undefined
  
  /**
    * Specifies how the button is styled.
    */
  var stylingMode: js.UndefOr[ButtonStyle] = js.undefined
  
  /**
    * Specifies a custom template for the Button UI component.
    */
  var template: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ TemplateData, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * The text displayed on the button.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the button type.
    */
  var `type`: js.UndefOr[ButtonType] = js.undefined
  
  /**
    * Specifies whether the button submits an HTML form.
    */
  var useSubmitBehavior: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the validation group to be accessed in the click event handler.
    */
  var validationGroup: js.UndefOr[String] = js.undefined
}
object dxButtonOptions {
  
  inline def apply(): dxButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonOptions]
  }
  
  extension [Self <: dxButtonOptions](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: /* e */ ClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStylingMode(value: ButtonStyle): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* data */ TemplateData, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* data */ TemplateData, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseSubmitBehavior(value: Boolean): Self = StObject.set(x, "useSubmitBehavior", value.asInstanceOf[js.Any])
    
    inline def setUseSubmitBehaviorUndefined: Self = StObject.set(x, "useSubmitBehavior", js.undefined)
    
    inline def setValidationGroup(value: String): Self = StObject.set(x, "validationGroup", value.asInstanceOf[js.Any])
    
    inline def setValidationGroupUndefined: Self = StObject.set(x, "validationGroup", js.undefined)
  }
}

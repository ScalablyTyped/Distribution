package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Blur
import typings.devextreme.anon.DashStyle
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.ui.Format
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWidgetTooltip extends StObject {
  
  /**
    * Specifies the length of a tooltip&apos;s arrow in pixels.
    */
  var arrowLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures a tooltip&apos;s border.
    */
  var border: js.UndefOr[DashStyle] = js.undefined
  
  /**
    * Colors all tooltips.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the container in which to draw tooltips. The default container is the HTML DOM `` element.
    */
  var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Makes all the tooltip&apos;s corners rounded.
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables tooltips.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies tooltips&apos; font properties.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Formats a value before it is displayed it in a tooltip.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Specifies tooltips&apos; transparency.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Generates an empty space, measured in pixels, between a tooltip&apos;s left/right border and its text.
    */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Generates an empty space, measured in pixels, between a tooltip&apos;s top/bottom border and its text.
    */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures a tooltip&apos;s shadow.
    */
  var shadow: js.UndefOr[Blur] = js.undefined
  
  /**
    * Specifies a tooltip&apos;s z-index.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object BaseWidgetTooltip {
  
  inline def apply(): BaseWidgetTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWidgetTooltip]
  }
  
  extension [Self <: BaseWidgetTooltip](x: Self) {
    
    inline def setArrowLength(value: Double): Self = StObject.set(x, "arrowLength", value.asInstanceOf[js.Any])
    
    inline def setArrowLengthUndefined: Self = StObject.set(x, "arrowLength", js.undefined)
    
    inline def setBorder(value: DashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPaddingLeftRight(value: Double): Self = StObject.set(x, "paddingLeftRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftRightUndefined: Self = StObject.set(x, "paddingLeftRight", js.undefined)
    
    inline def setPaddingTopBottom(value: Double): Self = StObject.set(x, "paddingTopBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopBottomUndefined: Self = StObject.set(x, "paddingTopBottom", js.undefined)
    
    inline def setShadow(value: Blur): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}

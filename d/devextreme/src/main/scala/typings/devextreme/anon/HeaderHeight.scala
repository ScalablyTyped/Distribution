package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderHeight extends StObject {
  
  /**
    * Configures the group borders.
    */
  var border: js.UndefOr[ColorWidth] = js.undefined
  
  /**
    * Colors the group headers.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the height of the group headers in pixels.
    */
  var headerHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether groups change their style when a user pauses on them.
    */
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the appearance of groups in the hover state.
    */
  var hoverStyle: js.UndefOr[`7`] = js.undefined
  
  /**
    * Configures the group labels.
    */
  var label: js.UndefOr[TextOverflow] = js.undefined
  
  /**
    * Specifies the distance in pixels between group borders and content.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the appearance of groups in the selected state.
    */
  var selectionStyle: js.UndefOr[`7`] = js.undefined
}
object HeaderHeight {
  
  inline def apply(): HeaderHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderHeight]
  }
  
  extension [Self <: HeaderHeight](x: Self) {
    
    inline def setBorder(value: ColorWidth): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    inline def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverEnabledUndefined: Self = StObject.set(x, "hoverEnabled", js.undefined)
    
    inline def setHoverStyle(value: `7`): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setLabel(value: TextOverflow): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSelectionStyle(value: `7`): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}

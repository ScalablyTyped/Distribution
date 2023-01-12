package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidRangeColor extends StObject {
  
  /**
    * Specifies the color of the slider markers.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a callback function that returns the text to be displayed by slider markers.
    */
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.undefined
  
  /**
    * Specifies font properties for the text displayed by the range selector slider markers.
    */
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Formats a value before it is displayed in a slider marker.
    */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.Format] = js.undefined
  
  /**
    * Specifies the color used for the slider marker text when the currently selected range does not match the minRange and maxRange values.
    */
  var invalidRangeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the empty space between the marker&apos;s left and right borders and the marker&apos;s text.
    */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the empty space between the marker&apos;s top and bottom borders and the marker&apos;s text.
    */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the placeholder height of the slider marker.
    */
  var placeholderHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether or not the slider markers are visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object InvalidRangeColor {
  
  inline def apply(): InvalidRangeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidRangeColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidRangeColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCustomizeText(value: /* scaleValue */ ValueValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: typings.devextreme.mod.DevExpress.ui.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInvalidRangeColor(value: String): Self = StObject.set(x, "invalidRangeColor", value.asInstanceOf[js.Any])
    
    inline def setInvalidRangeColorUndefined: Self = StObject.set(x, "invalidRangeColor", js.undefined)
    
    inline def setPaddingLeftRight(value: Double): Self = StObject.set(x, "paddingLeftRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftRightUndefined: Self = StObject.set(x, "paddingLeftRight", js.undefined)
    
    inline def setPaddingTopBottom(value: Double): Self = StObject.set(x, "paddingTopBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopBottomUndefined: Self = StObject.set(x, "paddingTopBottom", js.undefined)
    
    inline def setPlaceholderHeight(value: Double): Self = StObject.set(x, "placeholderHeight", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderHeightUndefined: Self = StObject.set(x, "placeholderHeight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

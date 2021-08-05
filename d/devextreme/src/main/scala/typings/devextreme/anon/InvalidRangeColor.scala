package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidRangeColor extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.undefined
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  
  var invalidRangeColor: js.UndefOr[String] = js.undefined
  
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  
  var placeholderHeight: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object InvalidRangeColor {
  
  inline def apply(): InvalidRangeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidRangeColor]
  }
  
  extension [Self <: InvalidRangeColor](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCustomizeText(value: /* scaleValue */ ValueValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
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

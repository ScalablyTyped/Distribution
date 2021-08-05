package typings.devextreme.anon

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalLine extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var horizontalLine: js.UndefOr[DashStyle | Boolean] = js.undefined
  
  var label: js.UndefOr[BackgroundColorCustomizeText] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var verticalLine: js.UndefOr[DashStyle | Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object HorizontalLine {
  
  inline def apply(): HorizontalLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalLine]
  }
  
  extension [Self <: HorizontalLine](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: dash | dot | longDash | solid): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHorizontalLine(value: DashStyle | Boolean): Self = StObject.set(x, "horizontalLine", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
    
    inline def setLabel(value: BackgroundColorCustomizeText): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setVerticalLine(value: DashStyle | Boolean): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
    
    inline def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalLine extends StObject {
  
  /**
    * Specifies the color of the crosshair lines.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the dash style of the crosshair lines.
    */
  var dashStyle: js.UndefOr[typings.devextreme.mod.DevExpress.common.charts.DashStyle] = js.undefined
  
  /**
    * Enables the crosshair.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the horizontal crosshair line individually.
    */
  var horizontalLine: js.UndefOr[Label | Boolean] = js.undefined
  
  /**
    * Configures the crosshair labels.
    */
  var label: js.UndefOr[BackgroundColorCustomizeText] = js.undefined
  
  /**
    * Specifies how transparent the crosshair lines should be.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the vertical crosshair line individually.
    */
  var verticalLine: js.UndefOr[Label | Boolean] = js.undefined
  
  /**
    * Specifies the width of the crosshair lines.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object HorizontalLine {
  
  inline def apply(): HorizontalLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalLine] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: typings.devextreme.mod.DevExpress.common.charts.DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHorizontalLine(value: Label | Boolean): Self = StObject.set(x, "horizontalLine", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLineUndefined: Self = StObject.set(x, "horizontalLine", js.undefined)
    
    inline def setLabel(value: BackgroundColorCustomizeText): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setVerticalLine(value: Label | Boolean): Self = StObject.set(x, "verticalLine", value.asInstanceOf[js.Any])
    
    inline def setVerticalLineUndefined: Self = StObject.set(x, "verticalLine", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

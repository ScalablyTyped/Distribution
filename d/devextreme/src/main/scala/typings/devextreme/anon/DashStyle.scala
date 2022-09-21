package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashStyle extends StObject {
  
  /**
    * Colors a tooltip&apos;s border.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the dash style of a tooltip&apos;s border.
    */
  var dashStyle: js.UndefOr[typings.devextreme.mod.DevExpress.common.charts.DashStyle] = js.undefined
  
  /**
    * Specifies the transparency of a tooltip&apos;s border.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether a tooltip&apos;s border is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of a tooltip&apos;s border in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object DashStyle {
  
  inline def apply(): DashStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashStyle]
  }
  
  extension [Self <: DashStyle](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: typings.devextreme.mod.DevExpress.common.charts.DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

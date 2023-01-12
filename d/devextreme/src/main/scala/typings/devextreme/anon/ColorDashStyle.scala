package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorDashStyle extends StObject {
  
  /**
    * Specifies a border color for point labels.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a dash style for the borders of point labels.
    */
  var dashStyle: js.UndefOr[typings.devextreme.mod.DevExpress.common.charts.DashStyle] = js.undefined
  
  /**
    * Indicates whether borders are visible in point labels.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the border width for point labels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ColorDashStyle {
  
  inline def apply(): ColorDashStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorDashStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorDashStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: typings.devextreme.mod.DevExpress.common.charts.DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

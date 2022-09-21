package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashStyleHatching extends StObject {
  
  /**
    * An object defining the border properties for a selected series.
    */
  var border: js.UndefOr[ColorDashStyle] = js.undefined
  
  /**
    * Sets a color for a series when it is selected.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the dash style for the line in a selected series.
    */
  var dashStyle: js.UndefOr[typings.devextreme.mod.DevExpress.common.charts.DashStyle] = js.undefined
  
  /**
    * Specifies the hatching properties to be applied when a series is selected.
    */
  var hatching: js.UndefOr[Direction] = js.undefined
  
  /**
    * Specifies the width of a line in a selected series.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object DashStyleHatching {
  
  inline def apply(): DashStyleHatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashStyleHatching]
  }
  
  extension [Self <: DashStyleHatching](x: Self) {
    
    inline def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: typings.devextreme.mod.DevExpress.common.charts.DashStyle): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setHatching(value: Direction): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

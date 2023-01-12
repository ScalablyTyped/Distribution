package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines line style settings.
  */
trait ASPxClientLineStyle
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the dash style used to paint the line.
    */
  var dashStyle: String
  
  /**
    * Returns the join style for the ends of consecutive lines.
    */
  var lineJoin: String
  
  /**
    * Gets the thickness that corresponds to the value of the current ASPxClientLineStyle object.
    */
  var thickness: Double
}
object ASPxClientLineStyle {
  
  inline def apply(chart: ASPxClientWebChart, dashStyle: String, lineJoin: String, thickness: Double): ASPxClientLineStyle = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dashStyle = dashStyle.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLineStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientLineStyle] (val x: Self) extends AnyVal {
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}

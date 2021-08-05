package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the CrosshairValueItem class.
  */
trait ASPxClientCrosshairValueItem extends StObject {
  
  /**
    * Gets an index of a point for which this crosshair value item is displayed.
    */
  var pointIndex: Double
  
  /**
    * Gets the value that is displayed in a crosshair label.
    */
  var value: Double
}
object ASPxClientCrosshairValueItem {
  
  inline def apply(pointIndex: Double, value: Double): ASPxClientCrosshairValueItem = {
    val __obj = js.Dynamic.literal(pointIndex = pointIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairValueItem]
  }
  
  extension [Self <: ASPxClientCrosshairValueItem](x: Self) {
    
    inline def setPointIndex(value: Double): Self = StObject.set(x, "pointIndex", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

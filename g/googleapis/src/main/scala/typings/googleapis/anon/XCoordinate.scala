package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCoordinate extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xCoordinate: js.UndefOr[Double] = js.undefined
  
  var yCoordinate: js.UndefOr[Double] = js.undefined
}
object XCoordinate {
  
  inline def apply(): XCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XCoordinate]
  }
  
  extension [Self <: XCoordinate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXCoordinate(value: Double): Self = StObject.set(x, "xCoordinate", value.asInstanceOf[js.Any])
    
    inline def setXCoordinateUndefined: Self = StObject.set(x, "xCoordinate", js.undefined)
    
    inline def setYCoordinate(value: Double): Self = StObject.set(x, "yCoordinate", value.asInstanceOf[js.Any])
    
    inline def setYCoordinateUndefined: Self = StObject.set(x, "yCoordinate", js.undefined)
  }
}

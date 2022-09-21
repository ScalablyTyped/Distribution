package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of distance as a numeric value and a display string.
  */
trait Distance extends StObject {
  
  /**
    * A string representation of the distance value, using the
    * <code>UnitSystem</code> specified in the request.
    */
  var text: String
  
  /**
    * The distance in meters.
    */
  var value: Double
}
object Distance {
  
  inline def apply(text: String, value: Double): Distance = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  extension [Self <: Distance](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

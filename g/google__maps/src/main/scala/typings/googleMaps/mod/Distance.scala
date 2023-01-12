package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  /**
    * contains a human-readable representation of the distance, displayed in units as used at the origin
    * (or as overridden within the `units` parameter in the request).
    * (For example, miles and feet will be used for any origin within the United States.)
    */
  var text: String
  
  /** indicates the distance in meters. */
  var value: Double
}
object Distance {
  
  inline def apply(text: String, value: Double): Distance = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

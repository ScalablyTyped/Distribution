package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitStop extends StObject {
  
  /**
    * The location of this stop.
    */
  var location: LatLng
  
  /**
    * The name of this transit stop.
    */
  var name: String
}
object TransitStop {
  
  inline def apply(location: LatLng, name: String): TransitStop = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitStop] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

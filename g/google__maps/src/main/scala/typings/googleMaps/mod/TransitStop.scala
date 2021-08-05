package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitStop extends StObject {
  
  /** the location of the transit station/stop, represented as a `lat` and `lng` field. */
  var location: LatLngLiteral
  
  /** the name of the transit station/stop. eg. "Union Square". */
  var name: String
}
object TransitStop {
  
  inline def apply(location: LatLngLiteral, name: String): TransitStop = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitStop]
  }
  
  extension [Self <: TransitStop](x: Self) {
    
    inline def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

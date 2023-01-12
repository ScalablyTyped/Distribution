package typings.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Longitude extends StObject {
  
  var latitude: Any
  
  var longitude: Any
}
object Longitude {
  
  inline def apply(latitude: Any, longitude: Any): Longitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longitude]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Longitude] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: Any): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Any): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}

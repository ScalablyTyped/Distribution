package typings.expoLocation.locationTypesMod

import typings.expoLocation.anon.Accuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationObject extends StObject {
  
  var coords: Accuracy
  
  var timestamp: Double
}
object LocationObject {
  
  inline def apply(coords: Accuracy, timestamp: Double): LocationObject = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
  
  extension [Self <: LocationObject](x: Self) {
    
    inline def setCoords(value: Accuracy): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}

package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationObject extends StObject {
  
  /**
    * The coordinates of the position.
    */
  var coords: LocationObjectCoords
  
  /**
    * Whether the location coordinates is mocked or not.
    * @platform android
    */
  var mocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time at which this position information was obtained, in milliseconds since epoch.
    */
  var timestamp: Double
}
object LocationObject {
  
  inline def apply(coords: LocationObjectCoords, timestamp: Double): LocationObject = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationObject] (val x: Self) extends AnyVal {
    
    inline def setCoords(value: LocationObjectCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setMocked(value: Boolean): Self = StObject.set(x, "mocked", value.asInstanceOf[js.Any])
    
    inline def setMockedUndefined: Self = StObject.set(x, "mocked", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}

package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationRequest extends StObject {
  
  /**
    * defines the location(s) on the earth from which to return elevation data.
    * This parameter takes either a single location as a comma-separated {latitude,longitude} pair (e.g. "40.714728,-73.998672")
    * or multiple latitude/longitude pairs passed as an array or as an encoded polyline.
    */
  var locations: js.Array[LatLng] = js.native
}
object ElevationRequest {
  
  @scala.inline
  def apply(locations: js.Array[LatLng]): ElevationRequest = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationRequest]
  }
  
  @scala.inline
  implicit class ElevationRequestMutableBuilder[Self <: ElevationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[LatLng]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsVarargs(value: LatLng*): Self = StObject.set(x, "locations", js.Array(value :_*))
  }
}

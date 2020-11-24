package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationRequest extends js.Object {
  
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
  implicit class ElevationRequestOps[Self <: ElevationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationsVarargs(value: LatLng*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[LatLng]): Self = this.set("locations", value.asInstanceOf[js.Any])
  }
}

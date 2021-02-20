package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodingResponse[STATUSES] extends StObject {
  
  /**
    * When the geocoder returns a status code other than `OK`, there may be an additional `error_message` field
    * within the Geocoding response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  
  /**
    * contains an array of geocoded address information and geometry information.
    *
    * Generally, only one entry in the `"results"` array is returned for address lookups,though the geocoder may return several results
    * when address queries are ambiguous.
    */
  var results: js.Array[GeocodingResult] = js.native
  
  /** contains metadata on the request. */
  var status: STATUSES = js.native
}
object GeocodingResponse {
  
  @scala.inline
  def apply[STATUSES](error_message: String, results: js.Array[GeocodingResult], status: STATUSES): GeocodingResponse[STATUSES] = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodingResponse[STATUSES]]
  }
  
  @scala.inline
  implicit class GeocodingResponseMutableBuilder[Self <: GeocodingResponse[_], STATUSES] (val x: Self with GeocodingResponse[STATUSES]) extends AnyVal {
    
    @scala.inline
    def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[GeocodingResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: GeocodingResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: STATUSES): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

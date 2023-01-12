package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An elevation response returned by the {@link google.maps.ElevationService}
  * containing the list of {@link google.maps.ElevationResult}s matching the
  * locations of the {@link google.maps.LocationElevationRequest}.
  */
trait LocationElevationResponse extends StObject {
  
  /**
    * The list of {@link google.maps.ElevationResult}s matching the locations
    * of the {@link google.maps.LocationElevationRequest}.
    */
  var results: js.Array[ElevationResult]
}
object LocationElevationResponse {
  
  inline def apply(results: js.Array[ElevationResult]): LocationElevationResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationElevationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationElevationResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[ElevationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ElevationResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}

package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An elevation response returned by the {@link google.maps.ElevationService}
  * containing the list of {@link google.maps.ElevationResult}s evenly-spaced
  * along the path of the {@link google.maps.PathElevationRequest}.
  */
trait PathElevationResponse extends StObject {
  
  /**
    * The list of {@link google.maps.ElevationResult}s matching the samples of
    * the {@link google.maps.PathElevationRequest}.
    */
  var results: js.Array[ElevationResult]
}
object PathElevationResponse {
  
  inline def apply(results: js.Array[ElevationResult]): PathElevationResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathElevationResponse]
  }
  
  extension [Self <: PathElevationResponse](x: Self) {
    
    inline def setResults(value: js.Array[ElevationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ElevationResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}

package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathElevationResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[ElevationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ElevationResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}

package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderResponse extends StObject {
  
  /**
    * The list of {@link google.maps.GeocoderResult}s.
    */
  var results: js.Array[GeocoderResult]
}
object GeocoderResponse {
  
  inline def apply(results: js.Array[GeocoderResult]): GeocoderResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[GeocoderResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: GeocoderResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}

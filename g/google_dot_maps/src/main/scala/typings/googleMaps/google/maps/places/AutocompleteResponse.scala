package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Autocomplete response returned by the call to {@link
  * google.maps.places.AutocompleteService.getPlacePredictions} containing a
  * list of {@link google.maps.places.AutocompletePrediction}s.
  */
trait AutocompleteResponse extends StObject {
  
  /**
    * The list of {@link google.maps.places.AutocompletePrediction}s.
    */
  var predictions: js.Array[AutocompletePrediction]
}
object AutocompleteResponse {
  
  inline def apply(predictions: js.Array[AutocompletePrediction]): AutocompleteResponse = {
    val __obj = js.Dynamic.literal(predictions = predictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompleteResponse] (val x: Self) extends AnyVal {
    
    inline def setPredictions(value: js.Array[AutocompletePrediction]): Self = StObject.set(x, "predictions", value.asInstanceOf[js.Any])
    
    inline def setPredictionsVarargs(value: AutocompletePrediction*): Self = StObject.set(x, "predictions", js.Array(value*))
  }
}

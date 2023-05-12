package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAutocompletePrediction extends StObject {
  
  /**
    * This is the unformatted version of the query suggested by the Places
    * service.
    */
  var description: String
  
  /**
    * A set of substrings in the place&#39;s description that match elements in
    * the user&#39;s input, suitable for use in highlighting those substrings.
    * Each substring is identified by an offset and a length, expressed in
    * unicode characters.
    */
  var matched_substrings: js.Array[PredictionSubstring]
  
  /**
    * Only available if prediction is a place. A place ID that can be used to
    * retrieve details about this place using the place details service
    * (see {@link google.maps.places.PlacesService.getDetails}).
    */
  var place_id: js.UndefOr[String] = js.undefined
  
  /**
    * Information about individual terms in the above description. Categorical
    * terms come first (for example, &quot;restaurant&quot;). Address terms
    * appear from most to least specific. For example, &quot;San
    * Francisco&quot;, and &quot;CA&quot;.
    */
  var terms: js.Array[PredictionTerm]
}
object QueryAutocompletePrediction {
  
  inline def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    terms: js.Array[PredictionTerm]
  ): QueryAutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompletePrediction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryAutocompletePrediction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMatched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "matched_substrings", value.asInstanceOf[js.Any])
    
    inline def setMatched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "matched_substrings", js.Array(value*))
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPlace_idUndefined: Self = StObject.set(x, "place_id", js.undefined)
    
    inline def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}

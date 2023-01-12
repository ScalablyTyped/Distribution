package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single autocomplete prediction.
  */
trait AutocompletePrediction extends StObject {
  
  /**
    * This is the unformatted version of the query suggested by the Places
    * service.
    */
  var description: String
  
  /**
    * The distance in meters of the place from the {@link
    * google.maps.places.AutocompletionRequest.origin}.
    */
  var distance_meters: js.UndefOr[Double] = js.undefined
  
  /**
    * A set of substrings in the place&#39;s description that match elements in
    * the user&#39;s input, suitable for use in highlighting those substrings.
    * Each substring is identified by an offset and a length, expressed in
    * unicode characters.
    */
  var matched_substrings: js.Array[PredictionSubstring]
  
  /**
    * A place ID that can be used to retrieve details about this place using
    * the place details service (see {@link
    * google.maps.places.PlacesService.getDetails}).
    */
  var place_id: String
  
  /**
    * Structured information about the place&#39;s description, divided into a
    * main text and a secondary text, including an array of matched substrings
    * from the autocomplete input, identified by an offset and a length,
    * expressed in unicode characters.
    */
  var structured_formatting: StructuredFormatting
  
  /**
    * Information about individual terms in the above description, from most to
    * least specific. For example, &quot;Taco Bell&quot;, &quot;Willitis&quot;,
    * and &quot;CA&quot;.
    */
  var terms: js.Array[PredictionTerm]
  
  /**
    * An array of types that the prediction belongs to, for example
    * <code>'establishment'</code> or <code>'geocode'</code>.
    */
  var types: js.Array[String]
}
object AutocompletePrediction {
  
  inline def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    structured_formatting: StructuredFormatting,
    terms: js.Array[PredictionTerm],
    types: js.Array[String]
  ): AutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], structured_formatting = structured_formatting.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompletePrediction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompletePrediction] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDistance_meters(value: Double): Self = StObject.set(x, "distance_meters", value.asInstanceOf[js.Any])
    
    inline def setDistance_metersUndefined: Self = StObject.set(x, "distance_meters", js.undefined)
    
    inline def setMatched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "matched_substrings", value.asInstanceOf[js.Any])
    
    inline def setMatched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "matched_substrings", js.Array(value*))
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setStructured_formatting(value: StructuredFormatting): Self = StObject.set(x, "structured_formatting", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}

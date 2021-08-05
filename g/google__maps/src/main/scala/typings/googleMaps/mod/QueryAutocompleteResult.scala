package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAutocompleteResult extends StObject {
  
  /** contains the human-readable name for the returned result. For establishment results, this is usually the business name. */
  var description: String
  
  /**
    * contains an `offset` value and a `length`.
    * These describe the location of the entered term in the prediction result text, so that the term can be highlighted if desired.
    */
  var matched_substrings: js.Array[PredictionSubstring]
  
  /**
    * contains an array of terms identifying each section of the returned description
    * (a section of the description is generally terminated with a comma).
    */
  var terms: js.Array[PredictionTerm]
}
object QueryAutocompleteResult {
  
  inline def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    terms: js.Array[PredictionTerm]
  ): QueryAutocompleteResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompleteResult]
  }
  
  extension [Self <: QueryAutocompleteResult](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMatched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "matched_substrings", value.asInstanceOf[js.Any])
    
    inline def setMatched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "matched_substrings", js.Array(value :_*))
    
    inline def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value :_*))
  }
}

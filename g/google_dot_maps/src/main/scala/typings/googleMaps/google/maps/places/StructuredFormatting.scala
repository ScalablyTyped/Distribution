package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains structured information about the place&#39;s description, divided
  * into a main text and a secondary text, including an array of matched
  * substrings from the autocomplete input, identified by an offset and a
  * length, expressed in unicode characters.
  */
trait StructuredFormatting extends StObject {
  
  /**
    * This is the main text part of the unformatted description of the place
    * suggested by the Places service. Usually the name of the place.
    */
  var main_text: String
  
  /**
    * A set of substrings in the main text that match elements in the
    * user&#39;s input, suitable for use in highlighting those substrings. Each
    * substring is identified by an offset and a length, expressed in unicode
    * characters.
    */
  var main_text_matched_substrings: js.Array[PredictionSubstring]
  
  /**
    * This is the secondary text part of the unformatted description of the
    * place suggested by the Places service. Usually the location of the place.
    */
  var secondary_text: String
}
object StructuredFormatting {
  
  inline def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String
  ): StructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text.asInstanceOf[js.Any], main_text_matched_substrings = main_text_matched_substrings.asInstanceOf[js.Any], secondary_text = secondary_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredFormatting]
  }
  
  extension [Self <: StructuredFormatting](x: Self) {
    
    inline def setMain_text(value: String): Self = StObject.set(x, "main_text", value.asInstanceOf[js.Any])
    
    inline def setMain_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "main_text_matched_substrings", value.asInstanceOf[js.Any])
    
    inline def setMain_text_matched_substringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "main_text_matched_substrings", js.Array(value*))
    
    inline def setSecondary_text(value: String): Self = StObject.set(x, "secondary_text", value.asInstanceOf[js.Any])
  }
}

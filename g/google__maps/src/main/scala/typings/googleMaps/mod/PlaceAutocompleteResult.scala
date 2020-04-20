package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceAutocompleteResult extends js.Object {
  /**
    * contains the human-readable name for the returned result.
    * For `establishment` results, this is usually the business name.
    */
  var description: String
  /**
    * contains an array with `offset` value and `length`. These describe the location of
    * the entered term in the prediction result text, so that the term can be highlighted if desired.
    */
  var matched_substrings: js.Array[PredictionSubstring]
  /**
    * is a textual identifier that uniquely identifies a place.
    * To retrieve information about the place, pass this identifier in the `placeId` field of a Places API request.
    */
  var place_id: String
  /** contains details on the prediction. */
  var structured_formatting: StructuredFormatting
  /**
    * contains an array of terms identifying each section of the returned description
    * (a section of the description is generally terminated with a comma).
    */
  var terms: js.Array[PredictionTerm]
  /**
    * contains an array of types that apply to this place.
    * For example: `[ "political", "locality" ]` or `[ "establishment", "geocode" ]`.
    */
  var types: js.Array[AddressType]
}

object PlaceAutocompleteResult {
  @scala.inline
  def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    structured_formatting: StructuredFormatting,
    terms: js.Array[PredictionTerm],
    types: js.Array[AddressType]
  ): PlaceAutocompleteResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], structured_formatting = structured_formatting.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAutocompleteResult]
  }
}


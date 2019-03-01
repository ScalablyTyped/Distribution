package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompleteResult extends js.Object {
  /** contains the human-readable name for the returned result. For establishment results, this is usually the business name. */
  var description: java.lang.String
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
  @scala.inline
  def apply(
    description: java.lang.String,
    matched_substrings: js.Array[PredictionSubstring],
    terms: js.Array[PredictionTerm]
  ): QueryAutocompleteResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("matched_substrings")(matched_substrings)
    __obj.updateDynamic("terms")(terms)
    __obj.asInstanceOf[QueryAutocompleteResult]
  }
}


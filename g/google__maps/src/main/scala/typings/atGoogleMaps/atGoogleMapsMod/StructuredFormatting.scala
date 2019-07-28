package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredFormatting extends js.Object {
  /** contains the main text of a prediction, usually the name of the place. */
  var main_text: String
  /**
    * contains an array with `offset` value and `length`. These describe the location of
    * the entered term in the prediction result text, so that the term can be highlighted if desired.
    */
  var main_text_matched_substrings: js.Array[PredictionSubstring]
  /** contains the secondary text of a prediction, usually the location of the place. */
  var secondary_text: String
}

object StructuredFormatting {
  @scala.inline
  def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String
  ): StructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text, main_text_matched_substrings = main_text_matched_substrings, secondary_text = secondary_text)
  
    __obj.asInstanceOf[StructuredFormatting]
  }
}


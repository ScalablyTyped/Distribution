package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredFormatting extends js.Object {
  /** contains the main text of a prediction, usually the name of the place. */
  var main_text: java.lang.String
  /**
    * contains an array with `offset` value and `length`. These describe the location of
    * the entered term in the prediction result text, so that the term can be highlighted if desired.
    */
  var main_text_matched_substrings: js.Array[PredictionSubstring]
  /** contains the secondary text of a prediction, usually the location of the place. */
  var secondary_text: java.lang.String
}

object StructuredFormatting {
  @scala.inline
  def apply(
    main_text: java.lang.String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: java.lang.String
  ): StructuredFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("main_text")(main_text)
    __obj.updateDynamic("main_text_matched_substrings")(main_text_matched_substrings)
    __obj.updateDynamic("secondary_text")(secondary_text)
    __obj.asInstanceOf[StructuredFormatting]
  }
}


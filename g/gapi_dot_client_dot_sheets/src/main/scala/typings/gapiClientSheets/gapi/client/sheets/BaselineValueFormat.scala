package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaselineValueFormat extends js.Object {
  /** The comparison type of key value with baseline value. */
  var comparisonType: js.UndefOr[String] = js.undefined
  /**
    * Description which is appended after the baseline value.
    * This field is optional.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Color to be used, in case baseline value represents a negative change for
    * key value. This field is optional.
    */
  var negativeColor: js.UndefOr[Color] = js.undefined
  /**
    * Specifies the horizontal text positioning of baseline value.
    * This field is optional. If not specified, default positioning is used.
    */
  var position: js.UndefOr[TextPosition] = js.undefined
  /**
    * Color to be used, in case baseline value represents a positive change for
    * key value. This field is optional.
    */
  var positiveColor: js.UndefOr[Color] = js.undefined
  /** Text formatting options for baseline value. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}

object BaselineValueFormat {
  @scala.inline
  def apply(
    comparisonType: String = null,
    description: String = null,
    negativeColor: Color = null,
    position: TextPosition = null,
    positiveColor: Color = null,
    textFormat: TextFormat = null
  ): BaselineValueFormat = {
    val __obj = js.Dynamic.literal()
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positiveColor != null) __obj.updateDynamic("positiveColor")(positiveColor.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaselineValueFormat]
  }
}


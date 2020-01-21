package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValueFormat extends js.Object {
  /**
    * Specifies the horizontal text positioning of key value.
    * This field is optional. If not specified, default positioning is used.
    */
  var position: js.UndefOr[TextPosition] = js.undefined
  /** Text formatting options for key value. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}

object KeyValueFormat {
  @scala.inline
  def apply(position: TextPosition = null, textFormat: TextFormat = null): KeyValueFormat = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textFormat != null) __obj.updateDynamic("textFormat")(textFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueFormat]
  }
}


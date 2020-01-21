package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextPosition extends js.Object {
  /** Horizontal alignment setting for the piece of text. */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
}

object TextPosition {
  @scala.inline
  def apply(horizontalAlignment: String = null): TextPosition = {
    val __obj = js.Dynamic.literal()
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPosition]
  }
}


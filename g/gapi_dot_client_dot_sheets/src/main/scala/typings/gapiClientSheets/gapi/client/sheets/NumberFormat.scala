package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends js.Object {
  /**
    * Pattern string used for formatting.  If not set, a default pattern based on
    * the user's locale will be used if necessary for the given type.
    * See the [Date and Number Formats guide](/sheets/api/guides/formats) for
    * more information about the supported patterns.
    */
  var pattern: js.UndefOr[String] = js.undefined
  /**
    * The type of the number format.
    * When writing, this field must be set.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NumberFormat {
  @scala.inline
  def apply(pattern: String = null, `type`: String = null): NumberFormat = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
}


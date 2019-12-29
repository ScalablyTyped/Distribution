package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  /** The concrete color corresponding to the theme color type. */
  var color: js.UndefOr[ColorStyle] = js.undefined
  /** The type of the spreadsheet theme color. */
  var colorType: js.UndefOr[String] = js.undefined
}

object ThemeColorPair {
  @scala.inline
  def apply(color: ColorStyle = null, colorType: String = null): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorType != null) __obj.updateDynamic("colorType")(colorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorPair]
  }
}


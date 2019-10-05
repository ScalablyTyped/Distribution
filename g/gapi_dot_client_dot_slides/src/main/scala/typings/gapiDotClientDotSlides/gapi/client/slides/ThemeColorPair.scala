package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  /** The concrete color corresponding to the theme color type above. */
  var color: js.UndefOr[RgbColor] = js.undefined
  /** The type of the theme color. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ThemeColorPair {
  @scala.inline
  def apply(color: RgbColor = null, `type`: String = null): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThemeColorPair]
  }
}


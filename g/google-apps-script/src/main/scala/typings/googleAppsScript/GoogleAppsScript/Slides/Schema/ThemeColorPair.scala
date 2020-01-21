package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  var color: js.UndefOr[RgbColor] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ThemeColorPair {
  @scala.inline
  def apply(color: RgbColor = null, `type`: String = null): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorPair]
  }
}


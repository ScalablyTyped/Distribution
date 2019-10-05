package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorPair extends js.Object {
  var color: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.RgbColor] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ThemeColorPair {
  @scala.inline
  def apply(
    color: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.RgbColor = null,
    `type`: String = null
  ): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ThemeColorPair]
  }
}


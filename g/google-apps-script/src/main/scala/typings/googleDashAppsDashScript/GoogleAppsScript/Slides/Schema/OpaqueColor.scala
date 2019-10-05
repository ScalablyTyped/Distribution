package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueColor extends js.Object {
  var rgbColor: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.RgbColor] = js.undefined
  var themeColor: js.UndefOr[String] = js.undefined
}

object OpaqueColor {
  @scala.inline
  def apply(
    rgbColor: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.RgbColor = null,
    themeColor: String = null
  ): OpaqueColor = {
    val __obj = js.Dynamic.literal()
    if (rgbColor != null) __obj.updateDynamic("rgbColor")(rgbColor)
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor)
    __obj.asInstanceOf[OpaqueColor]
  }
}


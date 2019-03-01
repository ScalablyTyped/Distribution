package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  def asRgbColor(): RgbColor
  def asThemeColor(): ThemeColor
  def getColorType(): ColorType
}

object Color {
  @scala.inline
  def apply(
    asRgbColor: js.Function0[RgbColor],
    asThemeColor: js.Function0[ThemeColor],
    getColorType: js.Function0[ColorType]
  ): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asRgbColor")(asRgbColor)
    __obj.updateDynamic("asThemeColor")(asThemeColor)
    __obj.updateDynamic("getColorType")(getColorType)
    __obj.asInstanceOf[Color]
  }
}


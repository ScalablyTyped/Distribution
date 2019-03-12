package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScheme extends js.Object {
  def getConcreteColor(theme: ThemeColorType): Color
  def getThemeColors(): js.Array[ThemeColorType]
}

object ColorScheme {
  @scala.inline
  def apply(getConcreteColor: ThemeColorType => Color, getThemeColors: () => js.Array[ThemeColorType]): ColorScheme = {
    val __obj = js.Dynamic.literal(getConcreteColor = js.Any.fromFunction1(getConcreteColor), getThemeColors = js.Any.fromFunction0(getThemeColors))
  
    __obj.asInstanceOf[ColorScheme]
  }
}


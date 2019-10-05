package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorScheme extends js.Object {
  def getConcreteColor(theme: ThemeColorType): Color = js.native
  def getThemeColors(): js.Array[ThemeColorType] = js.native
  def setConcreteColor(`type`: ThemeColorType, color: Color): ColorScheme = js.native
  def setConcreteColor(`type`: ThemeColorType, hexColor: String): ColorScheme = js.native
  def setConcreteColor(`type`: ThemeColorType, red: Integer, green: Integer, blue: Integer): ColorScheme = js.native
}


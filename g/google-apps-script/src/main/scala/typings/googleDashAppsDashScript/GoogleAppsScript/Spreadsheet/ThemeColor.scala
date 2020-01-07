package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation for a theme color.
  */
trait ThemeColor extends js.Object {
  def getColorType(): ColorType
  def getThemeColorType(): ThemeColorType
}

object ThemeColor {
  @scala.inline
  def apply(getColorType: () => ColorType, getThemeColorType: () => ThemeColorType): ThemeColor = {
    val __obj = js.Dynamic.literal(getColorType = js.Any.fromFunction0(getColorType), getThemeColorType = js.Any.fromFunction0(getThemeColorType))
  
    __obj.asInstanceOf[ThemeColor]
  }
}


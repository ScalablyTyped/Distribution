package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.ColorType
import typings.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for ColorBuilder. To create a new builder, use SpreadsheetApp.newColor().
  */
trait ColorBuilder extends js.Object {
  def asRgbColor(): RgbColor
  def asThemeColor(): ThemeColor
  def build(): Color
  def getColorType(): ColorType
  def setRgbColor(cssString: String): ColorBuilder
  def setThemeColor(themeColorType: ThemeColorType): ColorBuilder
}

object ColorBuilder {
  @scala.inline
  def apply(
    asRgbColor: () => RgbColor,
    asThemeColor: () => ThemeColor,
    build: () => Color,
    getColorType: () => ColorType,
    setRgbColor: String => ColorBuilder,
    setThemeColor: ThemeColorType => ColorBuilder
  ): ColorBuilder = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), build = js.Any.fromFunction0(build), getColorType = js.Any.fromFunction0(getColorType), setRgbColor = js.Any.fromFunction1(setRgbColor), setThemeColor = js.Any.fromFunction1(setThemeColor))
    __obj.asInstanceOf[ColorBuilder]
  }
}


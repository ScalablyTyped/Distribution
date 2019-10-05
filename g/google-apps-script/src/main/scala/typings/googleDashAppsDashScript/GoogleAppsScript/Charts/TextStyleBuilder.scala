package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleBuilder extends js.Object {
  def build(): TextStyle
  def setColor(cssValue: String): TextStyleBuilder
  def setFontName(fontName: String): TextStyleBuilder
  def setFontSize(fontSize: Double): TextStyleBuilder
}

object TextStyleBuilder {
  @scala.inline
  def apply(
    build: () => TextStyle,
    setColor: String => TextStyleBuilder,
    setFontName: String => TextStyleBuilder,
    setFontSize: Double => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setColor = js.Any.fromFunction1(setColor), setFontName = js.Any.fromFunction1(setFontName), setFontSize = js.Any.fromFunction1(setFontSize))
  
    __obj.asInstanceOf[TextStyleBuilder]
  }
}


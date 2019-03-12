package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleBuilder extends js.Object {
  def build(): TextStyle
  def setColor(cssValue: java.lang.String): TextStyleBuilder
  def setFontName(fontName: java.lang.String): TextStyleBuilder
  def setFontSize(fontSize: stdLib.Number): TextStyleBuilder
}

object TextStyleBuilder {
  @scala.inline
  def apply(
    build: () => TextStyle,
    setColor: java.lang.String => TextStyleBuilder,
    setFontName: java.lang.String => TextStyleBuilder,
    setFontSize: stdLib.Number => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setColor = js.Any.fromFunction1(setColor), setFontName = js.Any.fromFunction1(setFontName), setFontSize = js.Any.fromFunction1(setFontSize))
  
    __obj.asInstanceOf[TextStyleBuilder]
  }
}


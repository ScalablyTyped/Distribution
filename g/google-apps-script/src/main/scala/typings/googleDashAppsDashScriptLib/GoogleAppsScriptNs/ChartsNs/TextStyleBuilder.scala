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
    build: js.Function0[TextStyle],
    setColor: js.Function1[java.lang.String, TextStyleBuilder],
    setFontName: js.Function1[java.lang.String, TextStyleBuilder],
    setFontSize: js.Function1[stdLib.Number, TextStyleBuilder]
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = build, setColor = setColor, setFontName = setFontName, setFontSize = setFontSize)
  
    __obj.asInstanceOf[TextStyleBuilder]
  }
}


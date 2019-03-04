package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  def getColor(): java.lang.String
  def getFontName(): java.lang.String
  def getFontSize(): stdLib.Number
}

object TextStyle {
  @scala.inline
  def apply(
    getColor: js.Function0[java.lang.String],
    getFontName: js.Function0[java.lang.String],
    getFontSize: js.Function0[stdLib.Number]
  ): TextStyle = {
    val __obj = js.Dynamic.literal(getColor = getColor, getFontName = getFontName, getFontSize = getFontSize)
  
    __obj.asInstanceOf[TextStyle]
  }
}


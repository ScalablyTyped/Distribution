package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  def getColor(): java.lang.String
  def getFontName(): java.lang.String
  def getFontSize(): scala.Double
}

object TextStyle {
  @scala.inline
  def apply(
    getColor: () => java.lang.String,
    getFontName: () => java.lang.String,
    getFontSize: () => scala.Double
  ): TextStyle = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction0(getColor), getFontName = js.Any.fromFunction0(getFontName), getFontSize = js.Any.fromFunction0(getFontSize))
  
    __obj.asInstanceOf[TextStyle]
  }
}


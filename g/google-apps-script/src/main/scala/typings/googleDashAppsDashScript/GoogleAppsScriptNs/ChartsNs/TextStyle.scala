package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  def getColor(): String
  def getFontName(): String
  def getFontSize(): Double
}

object TextStyle {
  @scala.inline
  def apply(getColor: () => String, getFontName: () => String, getFontSize: () => Double): TextStyle = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction0(getColor), getFontName = js.Any.fromFunction0(getFontName), getFontSize = js.Any.fromFunction0(getFontSize))
  
    __obj.asInstanceOf[TextStyle]
  }
}


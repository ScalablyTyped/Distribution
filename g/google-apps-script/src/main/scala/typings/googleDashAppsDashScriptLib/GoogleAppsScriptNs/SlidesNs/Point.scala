package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  def getX(): stdLib.Number
  def getY(): stdLib.Number
}

object Point {
  @scala.inline
  def apply(getX: js.Function0[stdLib.Number], getY: js.Function0[stdLib.Number]): Point = {
    val __obj = js.Dynamic.literal(getX = getX, getY = getY)
  
    __obj.asInstanceOf[Point]
  }
}


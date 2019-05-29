package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  def getX(): scala.Double
  def getY(): scala.Double
}

object Point {
  @scala.inline
  def apply(getX: () => scala.Double, getY: () => scala.Double): Point = {
    val __obj = js.Dynamic.literal(getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY))
  
    __obj.asInstanceOf[Point]
  }
}


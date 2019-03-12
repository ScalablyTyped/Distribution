package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  def getHeight(): scala.Double
  def getWidth(): scala.Double
}

object Dimensions {
  @scala.inline
  def apply(getHeight: () => scala.Double, getWidth: () => scala.Double): Dimensions = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
  
    __obj.asInstanceOf[Dimensions]
  }
}


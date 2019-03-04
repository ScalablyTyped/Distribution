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
  def apply(getHeight: js.Function0[scala.Double], getWidth: js.Function0[scala.Double]): Dimensions = {
    val __obj = js.Dynamic.literal(getHeight = getHeight, getWidth = getWidth)
  
    __obj.asInstanceOf[Dimensions]
  }
}


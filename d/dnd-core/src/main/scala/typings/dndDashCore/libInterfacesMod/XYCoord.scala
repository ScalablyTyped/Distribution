package typings.dndDashCore.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYCoord extends js.Object {
  var x: Double
  var y: Double
}

object XYCoord {
  @scala.inline
  def apply(x: Double, y: Double): XYCoord = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[XYCoord]
  }
}


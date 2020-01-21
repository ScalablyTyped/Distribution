package typings.dndCore.interfacesMod

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
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XYCoord]
  }
}


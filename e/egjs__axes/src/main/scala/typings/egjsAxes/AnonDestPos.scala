package typings.egjsAxes

import typings.egjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestPos extends js.Object {
  var destPos: Axis
  var duration: Double
}

object AnonDestPos {
  @scala.inline
  def apply(destPos: Axis, duration: Double): AnonDestPos = {
    val __obj = js.Dynamic.literal(destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDestPos]
  }
}


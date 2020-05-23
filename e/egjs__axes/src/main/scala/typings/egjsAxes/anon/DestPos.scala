package typings.egjsAxes.anon

import typings.egjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestPos extends js.Object {
  var destPos: Axis
  var duration: Double
}

object DestPos {
  @scala.inline
  def apply(destPos: Axis, duration: Double): DestPos = {
    val __obj = js.Dynamic.literal(destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestPos]
  }
}


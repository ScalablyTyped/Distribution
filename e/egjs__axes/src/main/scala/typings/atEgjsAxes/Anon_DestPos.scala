package typings.atEgjsAxes

import typings.atEgjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestPos extends js.Object {
  var destPos: Axis
  var duration: Double
}

object Anon_DestPos {
  @scala.inline
  def apply(destPos: Axis, duration: Double): Anon_DestPos = {
    val __obj = js.Dynamic.literal(destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DestPos]
  }
}


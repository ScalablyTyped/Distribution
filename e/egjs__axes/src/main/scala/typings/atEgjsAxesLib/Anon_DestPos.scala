package typings
package atEgjsAxesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestPos extends js.Object {
  var destPos: atEgjsAxesLib.axismanagerMod.Axis
  var duration: scala.Double
}

object Anon_DestPos {
  @scala.inline
  def apply(destPos: atEgjsAxesLib.axismanagerMod.Axis, duration: scala.Double): Anon_DestPos = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destPos")(destPos)
    __obj.updateDynamic("duration")(duration)
    __obj.asInstanceOf[Anon_DestPos]
  }
}


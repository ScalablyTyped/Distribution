package typings
package famousLib.componentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGesturePayload extends js.Object {
  var center: famousLib.mathMod.Vec2
  var centerDelta: famousLib.mathMod.Vec2
  var centerVelocity: famousLib.mathMod.Vec2
  var current: scala.Double
  var pointers: js.Array[IGesturePointer]
  var points: scala.Double
  var status: java.lang.String
  var time: scala.Double
}

object IGesturePayload {
  @scala.inline
  def apply(
    center: famousLib.mathMod.Vec2,
    centerDelta: famousLib.mathMod.Vec2,
    centerVelocity: famousLib.mathMod.Vec2,
    current: scala.Double,
    pointers: js.Array[IGesturePointer],
    points: scala.Double,
    status: java.lang.String,
    time: scala.Double
  ): IGesturePayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("centerDelta")(centerDelta)
    __obj.updateDynamic("centerVelocity")(centerVelocity)
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("pointers")(pointers)
    __obj.updateDynamic("points")(points)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[IGesturePayload]
  }
}


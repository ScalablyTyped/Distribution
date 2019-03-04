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
    val __obj = js.Dynamic.literal(center = center, centerDelta = centerDelta, centerVelocity = centerVelocity, current = current, pointers = pointers, points = points, status = status, time = time)
  
    __obj.asInstanceOf[IGesturePayload]
  }
}


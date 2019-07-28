package typings.famous.componentsMod

import typings.famous.mathMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGesturePayload extends js.Object {
  var center: Vec2
  var centerDelta: Vec2
  var centerVelocity: Vec2
  var current: Double
  var pointers: js.Array[IGesturePointer]
  var points: Double
  var status: String
  var time: Double
}

object IGesturePayload {
  @scala.inline
  def apply(
    center: Vec2,
    centerDelta: Vec2,
    centerVelocity: Vec2,
    current: Double,
    pointers: js.Array[IGesturePointer],
    points: Double,
    status: String,
    time: Double
  ): IGesturePayload = {
    val __obj = js.Dynamic.literal(center = center, centerDelta = centerDelta, centerVelocity = centerVelocity, current = current, pointers = pointers, points = points, status = status, time = time)
  
    __obj.asInstanceOf[IGesturePayload]
  }
}


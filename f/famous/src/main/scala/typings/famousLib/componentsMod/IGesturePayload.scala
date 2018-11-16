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


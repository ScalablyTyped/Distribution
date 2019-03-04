package typings
package famousLib.componentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGesturePointer extends js.Object {
  var delta: famousLib.mathMod.Vec2
  var position: famousLib.mathMod.Vec2
  var velocity: famousLib.mathMod.Vec2
}

object IGesturePointer {
  @scala.inline
  def apply(delta: famousLib.mathMod.Vec2, position: famousLib.mathMod.Vec2, velocity: famousLib.mathMod.Vec2): IGesturePointer = {
    val __obj = js.Dynamic.literal(delta = delta, position = position, velocity = velocity)
  
    __obj.asInstanceOf[IGesturePointer]
  }
}


package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeStyle extends js.Object {
  // properties
  var caps: String
  var joints: String
  var miterLimit: Double
  var width: Double
}

object StrokeStyle {
  @scala.inline
  def apply(caps: String, joints: String, miterLimit: Double, width: Double): StrokeStyle = {
    val __obj = js.Dynamic.literal(caps = caps.asInstanceOf[js.Any], joints = joints.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeStyle]
  }
}


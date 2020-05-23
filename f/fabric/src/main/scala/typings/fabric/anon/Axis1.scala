package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis1 extends js.Object {
  var axis1: js.Any
  var axis2: js.Any
  var dimension: js.Any
  var origin: Double
}

object Axis1 {
  @scala.inline
  def apply(axis1: js.Any, axis2: js.Any, dimension: js.Any, origin: Double): Axis1 = {
    val __obj = js.Dynamic.literal(axis1 = axis1.asInstanceOf[js.Any], axis2 = axis2.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis1]
  }
}


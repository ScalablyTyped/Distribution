package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis1 extends js.Object {
  var axis1: js.Any = js.native
  var axis2: js.Any = js.native
  var dimension: js.Any = js.native
  var origin: Double = js.native
}

object Axis1 {
  @scala.inline
  def apply(axis1: js.Any, axis2: js.Any, dimension: js.Any, origin: Double): Axis1 = {
    val __obj = js.Dynamic.literal(axis1 = axis1.asInstanceOf[js.Any], axis2 = axis2.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis1]
  }
  @scala.inline
  implicit class Axis1Ops[Self <: Axis1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxis1(value: js.Any): Self = this.set("axis1", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxis2(value: js.Any): Self = this.set("axis2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimension(value: js.Any): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: Double): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
  
}


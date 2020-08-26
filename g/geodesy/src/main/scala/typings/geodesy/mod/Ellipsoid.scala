package typings.geodesy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ellipsoid extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var f: Double = js.native
}

object Ellipsoid {
  @scala.inline
  def apply(a: Double, b: Double, f: Double): Ellipsoid = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipsoid]
  }
  @scala.inline
  implicit class EllipsoidOps[Self <: Ellipsoid] (val x: Self) extends AnyVal {
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
  }
  
}


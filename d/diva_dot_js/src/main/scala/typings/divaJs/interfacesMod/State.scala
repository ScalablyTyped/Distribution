package typings.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var f: Boolean = js.native
  var i: Boolean | String = js.native
  var n: Double = js.native
  var p: Boolean | Double = js.native
  var v: String = js.native
  var x: Boolean | Double = js.native
  var y: Boolean | Double = js.native
  var z: Double = js.native
}

object State {
  @scala.inline
  def apply(
    f: Boolean,
    i: Boolean | String,
    n: Double,
    p: Boolean | Double,
    v: String,
    x: Boolean | Double,
    y: Boolean | Double,
    z: Double
  ): State = {
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setF(value: Boolean): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setI(value: Boolean | String): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: Boolean | Double): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Boolean | Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Boolean | Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
  
}


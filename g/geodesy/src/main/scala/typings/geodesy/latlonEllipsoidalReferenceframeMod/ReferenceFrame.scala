package typings.geodesy.latlonEllipsoidalReferenceframeMod

import typings.geodesy.mod.Ellipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceFrame extends js.Object {
  var ellipsoid: Ellipsoid = js.native
  var epoch: Double = js.native
  var name: String = js.native
}

object ReferenceFrame {
  @scala.inline
  def apply(ellipsoid: Ellipsoid, epoch: Double, name: String): ReferenceFrame = {
    val __obj = js.Dynamic.literal(ellipsoid = ellipsoid.asInstanceOf[js.Any], epoch = epoch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceFrame]
  }
  @scala.inline
  implicit class ReferenceFrameOps[Self <: ReferenceFrame] (val x: Self) extends AnyVal {
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
    def setEllipsoid(value: Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpoch(value: Double): Self = this.set("epoch", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


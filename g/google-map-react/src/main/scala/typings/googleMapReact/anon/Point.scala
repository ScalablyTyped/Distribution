package typings.googleMapReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  var point: typings.googleMapReact.mod.Point = js.native
}

object Point {
  @scala.inline
  def apply(point: typings.googleMapReact.mod.Point): Point = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setPoint(value: typings.googleMapReact.mod.Point): Self = this.set("point", value.asInstanceOf[js.Any])
  }
  
}


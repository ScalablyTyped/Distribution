package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XCoordinate extends js.Object {
  var id: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var xCoordinate: js.UndefOr[Double] = js.native
  var yCoordinate: js.UndefOr[Double] = js.native
}

object XCoordinate {
  @scala.inline
  def apply(): XCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XCoordinate]
  }
  @scala.inline
  implicit class XCoordinateOps[Self <: XCoordinate] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXCoordinate(value: Double): Self = this.set("xCoordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXCoordinate: Self = this.set("xCoordinate", js.undefined)
    @scala.inline
    def setYCoordinate(value: Double): Self = this.set("yCoordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYCoordinate: Self = this.set("yCoordinate", js.undefined)
  }
  
}


package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvideoPosition extends js.Object {
  var cornerPosition: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object InvideoPosition {
  @scala.inline
  def apply(): InvideoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoPosition]
  }
  @scala.inline
  implicit class InvideoPositionOps[Self <: InvideoPosition] (val x: Self) extends AnyVal {
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
    def setCornerPosition(value: String): Self = this.set("cornerPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerPosition: Self = this.set("cornerPosition", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


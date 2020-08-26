package typings.devextreme.mod.global

import typings.devextreme.mod.DevExpress.events.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryEventObject extends event {
  var cancel: js.UndefOr[Boolean] = js.native
}

object JQueryEventObject {
  @scala.inline
  def apply(): JQueryEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryEventObject]
  }
  @scala.inline
  implicit class JQueryEventObjectOps[Self <: JQueryEventObject] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
  }
  
}


package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowColumnDragging extends js.Object {
  var allowColumnDragging: js.UndefOr[Boolean] = js.native
  var emptyPanelText: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean | auto] = js.native
}

object AllowColumnDragging {
  @scala.inline
  def apply(): AllowColumnDragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowColumnDragging]
  }
  @scala.inline
  implicit class AllowColumnDraggingOps[Self <: AllowColumnDragging] (val x: Self) extends AnyVal {
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
    def setAllowColumnDragging(value: Boolean): Self = this.set("allowColumnDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowColumnDragging: Self = this.set("allowColumnDragging", js.undefined)
    @scala.inline
    def setEmptyPanelText(value: String): Self = this.set("emptyPanelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyPanelText: Self = this.set("emptyPanelText", js.undefined)
    @scala.inline
    def setVisible(value: Boolean | auto): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buttons extends js.Object {
  var buttons: js.UndefOr[js.Array[dxButtonOptions]] = js.native
  var dragEnabled: js.UndefOr[Boolean] = js.native
  var message: js.UndefOr[String] = js.native
  var messageHtml: js.UndefOr[String] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object Buttons {
  @scala.inline
  def apply(): Buttons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buttons]
  }
  @scala.inline
  implicit class ButtonsOps[Self <: Buttons] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: dxButtonOptions*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[dxButtonOptions]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setDragEnabled(value: Boolean): Self = this.set("dragEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragEnabled: Self = this.set("dragEnabled", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessageHtml(value: String): Self = this.set("messageHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageHtml: Self = this.set("messageHtml", js.undefined)
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


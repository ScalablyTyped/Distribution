package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseColumnButton extends js.Object {
  /** @name GridBaseColumnButton.cssClass */
  var cssClass: js.UndefOr[String] = js.native
  /** @name GridBaseColumnButton.hint */
  var hint: js.UndefOr[String] = js.native
  /** @name GridBaseColumnButton.icon */
  var icon: js.UndefOr[String] = js.native
  /** @name GridBaseColumnButton.text */
  var text: js.UndefOr[String] = js.native
}

object GridBaseColumnButton {
  @scala.inline
  def apply(): GridBaseColumnButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseColumnButton]
  }
  @scala.inline
  implicit class GridBaseColumnButtonOps[Self <: GridBaseColumnButton] (val x: Self) extends AnyVal {
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
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


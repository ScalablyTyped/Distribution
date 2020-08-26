package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DPlayerContextMenuItem extends js.Object {
  var click: js.UndefOr[js.Function0[Unit]] = js.native
  var link: js.UndefOr[String] = js.native
  var text: String = js.native
}

object DPlayerContextMenuItem {
  @scala.inline
  def apply(text: String): DPlayerContextMenuItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerContextMenuItem]
  }
  @scala.inline
  implicit class DPlayerContextMenuItemOps[Self <: DPlayerContextMenuItem] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
  
}


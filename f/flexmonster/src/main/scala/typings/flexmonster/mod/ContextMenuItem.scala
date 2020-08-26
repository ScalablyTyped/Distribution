package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuItem extends js.Object {
  var `class`: js.UndefOr[String] = js.native
  var handler: js.UndefOr[js.Function0[Unit] | String] = js.native
  var isSelected: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var submenu: js.UndefOr[js.Array[ContextMenuItem]] = js.native
}

object ContextMenuItem {
  @scala.inline
  def apply(): ContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuItem]
  }
  @scala.inline
  implicit class ContextMenuItemOps[Self <: ContextMenuItem] (val x: Self) extends AnyVal {
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setHandlerFunction0(value: () => Unit): Self = this.set("handler", js.Any.fromFunction0(value))
    @scala.inline
    def setHandler(value: js.Function0[Unit] | String): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSubmenuVarargs(value: ContextMenuItem*): Self = this.set("submenu", js.Array(value :_*))
    @scala.inline
    def setSubmenu(value: js.Array[ContextMenuItem]): Self = this.set("submenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
  }
  
}


package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsideMenu extends js.Object {
  var asideMenu: js.UndefOr[Boolean] = js.native
  var bottomMenu: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[Boolean] = js.native
  var topMenu: js.UndefOr[Boolean] = js.native
}

object AsideMenu {
  @scala.inline
  def apply(): AsideMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsideMenu]
  }
  @scala.inline
  implicit class AsideMenuOps[Self <: AsideMenu] (val x: Self) extends AnyVal {
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
    def setAsideMenu(value: Boolean): Self = this.set("asideMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsideMenu: Self = this.set("asideMenu", js.undefined)
    @scala.inline
    def setBottomMenu(value: Boolean): Self = this.set("bottomMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomMenu: Self = this.set("bottomMenu", js.undefined)
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setTopMenu(value: Boolean): Self = this.set("topMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMenu: Self = this.set("topMenu", js.undefined)
  }
  
}


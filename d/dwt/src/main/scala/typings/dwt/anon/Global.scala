package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Global extends js.Object {
  var global: js.UndefOr[Location] = js.native
  var pager: js.UndefOr[Location] = js.native
  var tabName: js.UndefOr[Location] = js.native
  var topMenuRight: js.UndefOr[Location] = js.native
  var viewChange: js.UndefOr[Location] = js.native
  var viewMenu: js.UndefOr[Location] = js.native
  var viewMenuBlock: js.UndefOr[Location] = js.native
  var viewerCorner: js.UndefOr[Location] = js.native
}

object Global {
  @scala.inline
  def apply(): Global = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Global]
  }
  @scala.inline
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
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
    def setGlobal(value: Location): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setPager(value: Location): Self = this.set("pager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    @scala.inline
    def setTabName(value: Location): Self = this.set("tabName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabName: Self = this.set("tabName", js.undefined)
    @scala.inline
    def setTopMenuRight(value: Location): Self = this.set("topMenuRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopMenuRight: Self = this.set("topMenuRight", js.undefined)
    @scala.inline
    def setViewChange(value: Location): Self = this.set("viewChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewChange: Self = this.set("viewChange", js.undefined)
    @scala.inline
    def setViewMenu(value: Location): Self = this.set("viewMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMenu: Self = this.set("viewMenu", js.undefined)
    @scala.inline
    def setViewMenuBlock(value: Location): Self = this.set("viewMenuBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMenuBlock: Self = this.set("viewMenuBlock", js.undefined)
    @scala.inline
    def setViewerCorner(value: Location): Self = this.set("viewerCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewerCorner: Self = this.set("viewerCorner", js.undefined)
  }
  
}


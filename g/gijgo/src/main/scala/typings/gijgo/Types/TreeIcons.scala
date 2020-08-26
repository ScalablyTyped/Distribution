package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tree
@js.native
trait TreeIcons extends js.Object {
  var collapse: js.UndefOr[String] = js.native
  var expand: js.UndefOr[String] = js.native
}

object TreeIcons {
  @scala.inline
  def apply(): TreeIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeIcons]
  }
  @scala.inline
  implicit class TreeIconsOps[Self <: TreeIcons] (val x: Self) extends AnyVal {
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
    def setCollapse(value: String): Self = this.set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setExpand(value: String): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
  }
  
}


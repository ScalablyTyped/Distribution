package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxListItem extends CollectionWidgetItem {
  /** @name dxListItem.badge */
  var badge: js.UndefOr[String] = js.native
  /** @name dxListItem.icon */
  var icon: js.UndefOr[String] = js.native
  /** @name dxListItem.key */
  var key: js.UndefOr[String] = js.native
  /** @name dxListItem.showChevron */
  var showChevron: js.UndefOr[Boolean] = js.native
}

object dxListItem {
  @scala.inline
  def apply(): dxListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxListItem]
  }
  @scala.inline
  implicit class dxListItemOps[Self <: dxListItem] (val x: Self) extends AnyVal {
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
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setShowChevron(value: Boolean): Self = this.set("showChevron", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowChevron: Self = this.set("showChevron", js.undefined)
  }
  
}


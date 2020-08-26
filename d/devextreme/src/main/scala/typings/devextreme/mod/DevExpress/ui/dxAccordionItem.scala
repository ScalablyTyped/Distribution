package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxAccordionItem extends CollectionWidgetItem {
  /** @name dxAccordionItem.icon */
  var icon: js.UndefOr[String] = js.native
  /** @name dxAccordionItem.title */
  var title: js.UndefOr[String] = js.native
}

object dxAccordionItem {
  @scala.inline
  def apply(): dxAccordionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAccordionItem]
  }
  @scala.inline
  implicit class dxAccordionItemOps[Self <: dxAccordionItem] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


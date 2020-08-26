package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemOptions extends js.Object {
  /** Pass the id to update the menu item
    */
  var id: js.UndefOr[String] = js.native
  /** Pass the parent id to update the menu item
    */
  var parentId: js.UndefOr[String] = js.native
  /** Pass the sprite css class to update the menu item
    */
  var spriteCssClass: js.UndefOr[String] = js.native
  /** Pass the text to update the menu item
    */
  var text: js.UndefOr[String] = js.native
}

object MenuItemOptions {
  @scala.inline
  def apply(): MenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemOptions]
  }
  @scala.inline
  implicit class MenuItemOptionsOps[Self <: MenuItemOptions] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setSpriteCssClass(value: String): Self = this.set("spriteCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpriteCssClass: Self = this.set("spriteCssClass", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


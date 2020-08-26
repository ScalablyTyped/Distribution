package typings.ejWebAll.ej.DropDownList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  /** Used to group the items.
    */
  var groupBy: js.UndefOr[String] = js.native
  /** Defines the HTML attributes such as ID, class, and styles for the item.
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Defines the ID for the tag.
    */
  var id: js.UndefOr[String] = js.native
  /** Defines the image attributes such as height, width, styles, and so on.
    */
  var imageAttributes: js.UndefOr[String] = js.native
  /** Defines the imageURL for the image location.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /** Defines the tag value to be selected initially.
    */
  var selected: js.UndefOr[Boolean] = js.native
  /** Defines the sprite CSS for the image tag.
    */
  var spriteCssClass: js.UndefOr[String] = js.native
  /** Defines the table name for tag value or display text while rendering remote data.
    */
  var tableName: js.UndefOr[String] = js.native
  /** Defines the text content for the tag.
    */
  var text: js.UndefOr[String] = js.native
  /** Defines the tag value.
    */
  var value: js.UndefOr[String] = js.native
}

object Fields {
  @scala.inline
  def apply(): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
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
    def setGroupBy(value: String): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageAttributes(value: String): Self = this.set("imageAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageAttributes: Self = this.set("imageAttributes", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSpriteCssClass(value: String): Self = this.set("spriteCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpriteCssClass: Self = this.set("spriteCssClass", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


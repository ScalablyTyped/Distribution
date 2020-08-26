package typings.ejWebAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  /** Used to group the suggestion list items.
    */
  var groupBy: js.UndefOr[String] = js.native
  /** Defines the HTML attributes such as id, class, styles for the item.
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Defines the specific field name which contains unique key values for the list items.
    */
  var key: js.UndefOr[String] = js.native
  /** Defines the specific field name in the data source to load the suggestion list with data.
    */
  var text: js.UndefOr[String] = js.native
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


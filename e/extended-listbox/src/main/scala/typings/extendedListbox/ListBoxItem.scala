package typings.extendedListbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxItem extends js.Object {
  /** list of childItems */
  var childItems: js.UndefOr[js.Array[String | ListBoxItem]] = js.native
  /** determines if the item should be clickable */
  var disabled: js.UndefOr[Boolean] = js.native
  /** determines if the item has childItems */
  var groupHeader: js.UndefOr[Boolean] = js.native
  /** unique identifier, if not set it will be generated */
  var id: js.UndefOr[String] = js.native
  /** index position from the item in the list; only used for manual addItem api calls */
  var index: js.UndefOr[Double] = js.native
  /** display text or id of the parent; only used for manual addItem api calls */
  var parentGroupId: js.UndefOr[String] = js.native
  /** determines if the item is selected */
  var selected: js.UndefOr[Boolean] = js.native
  /** display text */
  var text: js.UndefOr[String] = js.native
}

object ListBoxItem {
  @scala.inline
  def apply(): ListBoxItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxItem]
  }
  @scala.inline
  implicit class ListBoxItemOps[Self <: ListBoxItem] (val x: Self) extends AnyVal {
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
    def setChildItemsVarargs(value: (String | ListBoxItem)*): Self = this.set("childItems", js.Array(value :_*))
    @scala.inline
    def setChildItems(value: js.Array[String | ListBoxItem]): Self = this.set("childItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildItems: Self = this.set("childItems", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setGroupHeader(value: Boolean): Self = this.set("groupHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHeader: Self = this.set("groupHeader", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setParentGroupId(value: String): Self = this.set("parentGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentGroupId: Self = this.set("parentGroupId", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


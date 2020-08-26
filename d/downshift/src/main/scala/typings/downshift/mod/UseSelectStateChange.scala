package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<downshift.downshift.UseSelectState<Item>> */
@js.native
trait UseSelectStateChange[Item] extends js.Object {
  var highlightedIndex: js.UndefOr[Double] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var selectedItem: js.UndefOr[Item | Null] = js.native
  var `type`: UseSelectStateChangeTypes = js.native
}

object UseSelectStateChange {
  @scala.inline
  def apply[Item](`type`: UseSelectStateChangeTypes): UseSelectStateChange[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectStateChange[Item]]
  }
  @scala.inline
  implicit class UseSelectStateChangeOps[Self <: UseSelectStateChange[_], Item] (val x: Self with UseSelectStateChange[Item]) extends AnyVal {
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
    def setType(value: UseSelectStateChangeTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedIndex: Self = this.set("highlightedIndex", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setSelectedItem(value: Item): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    @scala.inline
    def setSelectedItemNull: Self = this.set("selectedItem", null)
  }
  
}


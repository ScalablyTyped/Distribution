package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownshiftState[Item] extends js.Object {
  var highlightedIndex: Double | Null = js.native
  var inputValue: String | Null = js.native
  var isOpen: Boolean = js.native
  var selectedItem: Item | Null = js.native
}

object DownshiftState {
  @scala.inline
  def apply[Item](isOpen: Boolean): DownshiftState[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownshiftState[Item]]
  }
  @scala.inline
  implicit class DownshiftStateOps[Self <: DownshiftState[_], Item] (val x: Self with DownshiftState[Item]) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedIndexNull: Self = this.set("highlightedIndex", null)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputValueNull: Self = this.set("inputValue", null)
    @scala.inline
    def setSelectedItem(value: Item): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItemNull: Self = this.set("selectedItem", null)
  }
  
}


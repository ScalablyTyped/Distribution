package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseComboboxState[Item] extends js.Object {
  var highlightedIndex: Double = js.native
  var inputValue: String = js.native
  var isOpen: Boolean = js.native
  var selectedItem: Item | Null = js.native
}

object UseComboboxState {
  @scala.inline
  def apply[Item](highlightedIndex: Double, inputValue: String, isOpen: Boolean): UseComboboxState[Item] = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxState[Item]]
  }
  @scala.inline
  implicit class UseComboboxStateOps[Self <: UseComboboxState[_], Item] (val x: Self with UseComboboxState[Item]) extends AnyVal {
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
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItem(value: Item): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItemNull: Self = this.set("selectedItem", null)
  }
  
}


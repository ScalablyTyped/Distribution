package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMultipleSelectionState[Item] extends js.Object {
  var activeIndex: Double = js.native
  var selectedItems: js.Array[Item] = js.native
}

object UseMultipleSelectionState {
  @scala.inline
  def apply[Item](activeIndex: Double, selectedItems: js.Array[Item]): UseMultipleSelectionState[Item] = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionState[Item]]
  }
  @scala.inline
  implicit class UseMultipleSelectionStateOps[Self <: UseMultipleSelectionState[_], Item] (val x: Self with UseMultipleSelectionState[Item]) extends AnyVal {
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedItemsVarargs(value: Item*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[Item]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
  }
  
}


package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<downshift.downshift.UseMultipleSelectionState<Item>> */
@js.native
trait UseMultipleSelectionStateChange[Item] extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.native
  var selectedItems: js.UndefOr[js.Array[Item]] = js.native
  var `type`: UseMultipleSelectionStateChangeTypes = js.native
}

object UseMultipleSelectionStateChange {
  @scala.inline
  def apply[Item](`type`: UseMultipleSelectionStateChangeTypes): UseMultipleSelectionStateChange[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionStateChange[Item]]
  }
  @scala.inline
  implicit class UseMultipleSelectionStateChangeOps[Self <: UseMultipleSelectionStateChange[_], Item] (val x: Self with UseMultipleSelectionStateChange[Item]) extends AnyVal {
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
    def setType(value: UseMultipleSelectionStateChangeTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: Item*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[Item]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
  }
  
}


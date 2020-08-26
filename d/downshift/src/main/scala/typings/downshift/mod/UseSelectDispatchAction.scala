package typings.downshift.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSelectDispatchAction[Item] extends js.Object {
  var getItemNodeFromIndex: js.UndefOr[js.Function1[/* index */ Double, HTMLElement]] = js.native
  var highlightedIndex: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var inputValue: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var selectedItem: js.UndefOr[Item | Null] = js.native
  var shiftKey: js.UndefOr[Boolean] = js.native
  var `type`: UseSelectStateChangeTypes = js.native
}

object UseSelectDispatchAction {
  @scala.inline
  def apply[Item](`type`: UseSelectStateChangeTypes): UseSelectDispatchAction[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSelectDispatchAction[Item]]
  }
  @scala.inline
  implicit class UseSelectDispatchActionOps[Self <: UseSelectDispatchAction[_], Item] (val x: Self with UseSelectDispatchAction[Item]) extends AnyVal {
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
    def setGetItemNodeFromIndex(value: /* index */ Double => HTMLElement): Self = this.set("getItemNodeFromIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemNodeFromIndex: Self = this.set("getItemNodeFromIndex", js.undefined)
    @scala.inline
    def setHighlightedIndex(value: Double): Self = this.set("highlightedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedIndex: Self = this.set("highlightedIndex", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setSelectedItem(value: Item): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    @scala.inline
    def setSelectedItemNull: Self = this.set("selectedItem", null)
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftKey: Self = this.set("shiftKey", js.undefined)
  }
  
}


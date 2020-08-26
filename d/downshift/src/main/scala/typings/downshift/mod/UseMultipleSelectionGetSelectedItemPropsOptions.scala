package typings.downshift.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseMultipleSelectionGetSelectedItemPropsOptions[Item]
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with GetPropsWithRefKey {
  var index: js.UndefOr[Double] = js.native
  var selectedItem: Item = js.native
}

object UseMultipleSelectionGetSelectedItemPropsOptions {
  @scala.inline
  def apply[Item](selectedItem: Item): UseMultipleSelectionGetSelectedItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionGetSelectedItemPropsOptions[Item]]
  }
  @scala.inline
  implicit class UseMultipleSelectionGetSelectedItemPropsOptionsOps[Self <: UseMultipleSelectionGetSelectedItemPropsOptions[_], Item] (val x: Self with UseMultipleSelectionGetSelectedItemPropsOptions[Item]) extends AnyVal {
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
    def setSelectedItem(value: Item): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}


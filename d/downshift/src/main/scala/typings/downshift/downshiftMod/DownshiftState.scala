package typings.downshift.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownshiftState[Item] extends js.Object {
  var highlightedIndex: Double | Null
  var inputValue: String | Null
  var isOpen: Boolean
  var selectedItem: Item | Null
}

object DownshiftState {
  @scala.inline
  def apply[Item](
    isOpen: Boolean,
    highlightedIndex: Int | Double = null,
    inputValue: String = null,
    selectedItem: Item = null
  ): DownshiftState[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownshiftState[Item]]
  }
}


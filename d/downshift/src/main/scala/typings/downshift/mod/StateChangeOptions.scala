package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<downshift.downshift.DownshiftState<Item>> */
trait StateChangeOptions[Item] extends js.Object {
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var selectedItem: js.UndefOr[Item] = js.undefined
  var `type`: StateChangeTypes
}

object StateChangeOptions {
  @scala.inline
  def apply[Item](
    `type`: StateChangeTypes,
    highlightedIndex: Int | Double = null,
    inputValue: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    selectedItem: Item = null
  ): StateChangeOptions[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeOptions[Item]]
  }
}


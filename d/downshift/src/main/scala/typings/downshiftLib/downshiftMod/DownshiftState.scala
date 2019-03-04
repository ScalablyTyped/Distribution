package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownshiftState[Item] extends js.Object {
  var highlightedIndex: scala.Double | scala.Null
  var inputValue: java.lang.String | scala.Null
  var isOpen: scala.Boolean
  var selectedItem: Item | scala.Null
}

object DownshiftState {
  @scala.inline
  def apply[Item](
    isOpen: scala.Boolean,
    highlightedIndex: scala.Int | scala.Double = null,
    inputValue: java.lang.String = null,
    selectedItem: Item = null
  ): DownshiftState[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownshiftState[Item]]
  }
}


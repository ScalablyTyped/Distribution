package typings.downshift.mod

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
    highlightedIndex: Double = null.asInstanceOf[Double],
    inputValue: String = null,
    selectedItem: Item = null
  ): DownshiftState[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], highlightedIndex = highlightedIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownshiftState[Item]]
  }
}


package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseComboboxState[Item] extends js.Object {
  var highlightedIndex: Double
  var inputValue: String
  var isOpen: Boolean
  var selectedItem: Item
}

object UseComboboxState {
  @scala.inline
  def apply[Item](highlightedIndex: Double, inputValue: String, isOpen: Boolean, selectedItem: Item): UseComboboxState[Item] = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxState[Item]]
  }
}


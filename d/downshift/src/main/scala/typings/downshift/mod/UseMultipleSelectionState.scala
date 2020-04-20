package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionState[Item] extends js.Object {
  var activeIndex: Double
  var selectedItems: js.Array[Item]
}

object UseMultipleSelectionState {
  @scala.inline
  def apply[Item](activeIndex: Double, selectedItems: js.Array[Item]): UseMultipleSelectionState[Item] = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionState[Item]]
  }
}


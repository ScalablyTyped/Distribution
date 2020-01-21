package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectA11yMessageOptions[Item] extends js.Object {
  var isOpen: Boolean
  var items: js.Array[Item]
  var selectedItem: Item
  def itemToString(item: Item): String
}

object UseSelectA11yMessageOptions {
  @scala.inline
  def apply[Item](isOpen: Boolean, itemToString: Item => String, items: js.Array[Item], selectedItem: Item): UseSelectA11yMessageOptions[Item] = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], itemToString = js.Any.fromFunction1(itemToString), items = items.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseSelectA11yMessageOptions[Item]]
  }
}


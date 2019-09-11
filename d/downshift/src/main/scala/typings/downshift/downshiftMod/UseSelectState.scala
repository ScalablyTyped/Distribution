package typings.downshift.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectState[Item] extends js.Object {
  var highlightedIndex: Double
  var isOpen: Boolean
  var keySoFar: String
  var selectedItem: Item
}

object UseSelectState {
  @scala.inline
  def apply[Item](highlightedIndex: Double, isOpen: Boolean, keySoFar: String, selectedItem: Item): UseSelectState[Item] = {
    val __obj = js.Dynamic.literal(highlightedIndex = highlightedIndex, isOpen = isOpen, keySoFar = keySoFar, selectedItem = selectedItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseSelectState[Item]]
  }
}


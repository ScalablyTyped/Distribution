package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionActions[Item] extends js.Object {
  def addSelectedItem(item: Item): Unit
  def removeSelectedItem(item: Item): Unit
  def reset(): Unit
  def setActiveIndex(index: Double): Unit
  def setSelectedItems(items: js.Array[Item]): Unit
}

object UseMultipleSelectionActions {
  @scala.inline
  def apply[Item](
    addSelectedItem: Item => Unit,
    removeSelectedItem: Item => Unit,
    reset: () => Unit,
    setActiveIndex: Double => Unit,
    setSelectedItems: js.Array[Item] => Unit
  ): UseMultipleSelectionActions[Item] = {
    val __obj = js.Dynamic.literal(addSelectedItem = js.Any.fromFunction1(addSelectedItem), removeSelectedItem = js.Any.fromFunction1(removeSelectedItem), reset = js.Any.fromFunction0(reset), setActiveIndex = js.Any.fromFunction1(setActiveIndex), setSelectedItems = js.Any.fromFunction1(setSelectedItems))
    __obj.asInstanceOf[UseMultipleSelectionActions[Item]]
  }
}


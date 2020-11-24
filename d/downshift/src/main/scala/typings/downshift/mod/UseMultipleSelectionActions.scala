package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionActions[Item] extends js.Object {
  
  def addSelectedItem(item: Item): Unit = js.native
  
  def removeSelectedItem(item: Item): Unit = js.native
  
  def reset(): Unit = js.native
  
  def setActiveIndex(index: Double): Unit = js.native
  
  def setSelectedItems(items: js.Array[Item]): Unit = js.native
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
  
  @scala.inline
  implicit class UseMultipleSelectionActionsOps[Self <: UseMultipleSelectionActions[_], Item] (val x: Self with UseMultipleSelectionActions[Item]) extends AnyVal {
    
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
    def setAddSelectedItem(value: Item => Unit): Self = this.set("addSelectedItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSelectedItem(value: Item => Unit): Self = this.set("removeSelectedItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActiveIndex(value: Double => Unit): Self = this.set("setActiveIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectedItems(value: js.Array[Item] => Unit): Self = this.set("setSelectedItems", js.Any.fromFunction1(value))
  }
}

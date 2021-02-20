package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseMultipleSelectionActions[Item] extends StObject {
  
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
  implicit class UseMultipleSelectionActionsMutableBuilder[Self <: UseMultipleSelectionActions[_], Item] (val x: Self with UseMultipleSelectionActions[Item]) extends AnyVal {
    
    @scala.inline
    def setAddSelectedItem(value: Item => Unit): Self = StObject.set(x, "addSelectedItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSelectedItem(value: Item => Unit): Self = StObject.set(x, "removeSelectedItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActiveIndex(value: Double => Unit): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectedItems(value: js.Array[Item] => Unit): Self = StObject.set(x, "setSelectedItems", js.Any.fromFunction1(value))
  }
}

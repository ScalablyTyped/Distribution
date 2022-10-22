package typings.downshift.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions[Item] extends StObject {
  
  def clearItems(): Unit = js.native
  
  def clearSelection(): Unit = js.native
  def clearSelection(cb: Callback): Unit = js.native
  
  def closeMenu(): Unit = js.native
  def closeMenu(cb: Callback): Unit = js.native
  
  // props
  def itemToString(): String = js.native
  def itemToString(item: Item): String = js.native
  
  def openMenu(): Unit = js.native
  def openMenu(cb: Callback): Unit = js.native
  
  def reset(): Unit = js.native
  def reset(otherStateToSet: Unit, cb: Callback): Unit = js.native
  def reset(otherStateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def reset(otherStateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  
  def selectHighlightedItem(): Unit = js.native
  def selectHighlightedItem(otherStateToSet: Unit, cb: Callback): Unit = js.native
  def selectHighlightedItem(otherStateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def selectHighlightedItem(otherStateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  
  def selectItem(): Unit = js.native
  def selectItem(item: Item): Unit = js.native
  def selectItem(item: Item, otherStateToSet: Unit, cb: Callback): Unit = js.native
  def selectItem(item: Item, otherStateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def selectItem(item: Item, otherStateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  def selectItem(item: Null, otherStateToSet: Unit, cb: Callback): Unit = js.native
  def selectItem(item: Null, otherStateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def selectItem(item: Null, otherStateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  
  def selectItemAtIndex(index: Double): Unit = js.native
  def selectItemAtIndex(index: Double, otherStateToSet: Unit, cb: Callback): Unit = js.native
  def selectItemAtIndex(index: Double, otherStateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def selectItemAtIndex(index: Double, otherStateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  
  def setHighlightedIndex(index: Double): Unit = js.native
  def setHighlightedIndex(index: Double, otherStateToSet: Unit, cb: Callback): Unit = js.native
  def setHighlightedIndex(index: Double, otherStateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def setHighlightedIndex(index: Double, otherStateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  
  def setItemCount(count: Double): Unit = js.native
  
  def setState(stateToSet: StateChangeFunction[Item]): Unit = js.native
  def setState(stateToSet: StateChangeFunction[Item], cb: Callback): Unit = js.native
  def setState(stateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def setState(stateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  
  def toggleMenu(): Unit = js.native
  def toggleMenu(otherStateToSet: Unit, cb: Callback): Unit = js.native
  def toggleMenu(otherStateToSet: Partial[StateChangeOptions[Item]]): Unit = js.native
  def toggleMenu(otherStateToSet: Partial[StateChangeOptions[Item]], cb: Callback): Unit = js.native
  
  def unsetItemCount(): Unit = js.native
}

package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions[Item] extends js.Object {
  def clearItems(): scala.Unit = js.native
  def clearSelection(): scala.Unit = js.native
  def clearSelection(cb: downshiftLib.Callback): scala.Unit = js.native
  def closeMenu(): scala.Unit = js.native
  def closeMenu(cb: downshiftLib.Callback): scala.Unit = js.native
  // props
  def itemToString(item: Item): java.lang.String = js.native
  def openMenu(): scala.Unit = js.native
  def openMenu(cb: downshiftLib.Callback): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def reset(otherStateToSet: stdLib.Partial[StateChangeOptions[Item]]): scala.Unit = js.native
  def reset(otherStateToSet: stdLib.Partial[StateChangeOptions[Item]], cb: downshiftLib.Callback): scala.Unit = js.native
  def selectHighlightedItem(): scala.Unit = js.native
  def selectHighlightedItem(otherStateToSet: stdLib.Partial[StateChangeOptions[Item]]): scala.Unit = js.native
  def selectHighlightedItem(otherStateToSet: stdLib.Partial[StateChangeOptions[Item]], cb: downshiftLib.Callback): scala.Unit = js.native
  def selectItem(item: Item): scala.Unit = js.native
  def selectItem(item: Item, otherStateToSet: stdLib.Partial[StateChangeOptions[Item]]): scala.Unit = js.native
  def selectItem(item: Item, otherStateToSet: stdLib.Partial[StateChangeOptions[Item]], cb: downshiftLib.Callback): scala.Unit = js.native
  def selectItemAtIndex(index: scala.Double): scala.Unit = js.native
  def selectItemAtIndex(index: scala.Double, otherStateToSet: stdLib.Partial[StateChangeOptions[Item]]): scala.Unit = js.native
  def selectItemAtIndex(
    index: scala.Double,
    otherStateToSet: stdLib.Partial[StateChangeOptions[Item]],
    cb: downshiftLib.Callback
  ): scala.Unit = js.native
  def setHighlightedIndex(index: scala.Double): scala.Unit = js.native
  def setHighlightedIndex(index: scala.Double, otherStateToSet: stdLib.Partial[StateChangeOptions[Item]]): scala.Unit = js.native
  def setHighlightedIndex(
    index: scala.Double,
    otherStateToSet: stdLib.Partial[StateChangeOptions[Item]],
    cb: downshiftLib.Callback
  ): scala.Unit = js.native
  def setItemCount(count: scala.Double): scala.Unit = js.native
  def setState(stateToSet: downshiftLib.StateChangeFunction[Item]): scala.Unit = js.native
  def setState(stateToSet: downshiftLib.StateChangeFunction[Item], cb: downshiftLib.Callback): scala.Unit = js.native
  def setState(stateToSet: stdLib.Partial[StateChangeOptions[Item]]): scala.Unit = js.native
  def setState(stateToSet: stdLib.Partial[StateChangeOptions[Item]], cb: downshiftLib.Callback): scala.Unit = js.native
  def toggleMenu(): scala.Unit = js.native
  def toggleMenu(otherStateToSet: stdLib.Partial[StateChangeOptions[Item]]): scala.Unit = js.native
  def toggleMenu(otherStateToSet: stdLib.Partial[StateChangeOptions[Item]], cb: downshiftLib.Callback): scala.Unit = js.native
  def unsetItemCount(): scala.Unit = js.native
}


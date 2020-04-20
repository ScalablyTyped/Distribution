package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLCMenu extends js.Object {
  /** This method is used to dynamically add items in the context menu.
    * @param {ej.Spreadsheet.ContextMenuType} Specifies the context menu type in which the item to be inserted.
    * @param {any[]} Pass the items to be inserted
    * @param {string} Specifies the type of operation to be performed
    * @param {number} Specifies the item index
    * @returns {void}
    */
  def addItem(target: ContextMenuType, itemColl: js.Array[_], operation: String, itemIdx: Double): Unit
  /** This method is used to change data source in the context menu.
    * @param {string} Specifies the context menu type to bind the data source.
    * @param {any[]} Pass the data source to be binded
    * @returns {void}
    */
  def changeDataSource(target: String, data: js.Array[_]): Unit
  /** This method is used to disable the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be disabled.
    * @param {any[]} Specifies the Menu Item id collection to be disabled
    * @returns {void}
    */
  def disableItem(target: String, idxColl: js.Array[_]): Unit
  /** This method is used to enable the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be enabled.
    * @param {any[]} Specifies the Menu Item id collection to be enabled
    * @returns {void}
    */
  def enableItem(target: String, idxColl: js.Array[_]): Unit
  /** This method is used to hide the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be hides.
    * @param {any[]} Specifies the Menu Item id collection to be hides
    * @returns {void}
    */
  def hideItem(cMenuType: String, idxColl: js.Array[_]): Unit
  /** This method is used to remove the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be removed.
    * @param {any[]} Specifies the Menu Item id collection to be removed
    * @returns {void}
    */
  def removeItem(target: String, idxColl: js.Array[_]): Unit
  /** This method is used to show the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be shown.
    * @param {any[]} Specifies the Menu Item id collection to be shown
    * @returns {void}
    */
  def showItem(cMenuType: String, idxColl: js.Array[_]): Unit
}

object XLCMenu {
  @scala.inline
  def apply(
    addItem: (ContextMenuType, js.Array[_], String, Double) => Unit,
    changeDataSource: (String, js.Array[_]) => Unit,
    disableItem: (String, js.Array[_]) => Unit,
    enableItem: (String, js.Array[_]) => Unit,
    hideItem: (String, js.Array[_]) => Unit,
    removeItem: (String, js.Array[_]) => Unit,
    showItem: (String, js.Array[_]) => Unit
  ): XLCMenu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction4(addItem), changeDataSource = js.Any.fromFunction2(changeDataSource), disableItem = js.Any.fromFunction2(disableItem), enableItem = js.Any.fromFunction2(enableItem), hideItem = js.Any.fromFunction2(hideItem), removeItem = js.Any.fromFunction2(removeItem), showItem = js.Any.fromFunction2(showItem))
    __obj.asInstanceOf[XLCMenu]
  }
}


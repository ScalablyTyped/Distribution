package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  def addItem(target: ContextMenuType, itemColl: js.Array[_], operation: java.lang.String, itemIdx: scala.Double): scala.Unit
  /** This method is used to change data source in the context menu.
    * @param {string} Specifies the context menu type to bind the data source.
    * @param {any[]} Pass the data source to be binded
    * @returns {void}
    */
  def changeDataSource(target: java.lang.String, data: js.Array[_]): scala.Unit
  /** This method is used to disable the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be disabled.
    * @param {any[]} Specifies the Menu Item id collection to be disabled
    * @returns {void}
    */
  def disableItem(target: java.lang.String, idxColl: js.Array[_]): scala.Unit
  /** This method is used to enable the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be enabled.
    * @param {any[]} Specifies the Menu Item id collection to be enabled
    * @returns {void}
    */
  def enableItem(target: java.lang.String, idxColl: js.Array[_]): scala.Unit
  /** This method is used to hide the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be hides.
    * @param {any[]} Specifies the Menu Item id collection to be hides
    * @returns {void}
    */
  def hideItem(cMenuType: java.lang.String, idxColl: js.Array[_]): scala.Unit
  /** This method is used to remove the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be removed.
    * @param {any[]} Specifies the Menu Item id collection to be removed
    * @returns {void}
    */
  def removeItem(target: java.lang.String, idxColl: js.Array[_]): scala.Unit
  /** This method is used to show the items in the context menu.
    * @param {string} Specifies the context menu type in which the item to be shown.
    * @param {any[]} Specifies the Menu Item id collection to be shown
    * @returns {void}
    */
  def showItem(cMenuType: java.lang.String, idxColl: js.Array[_]): scala.Unit
}

object XLCMenu {
  @scala.inline
  def apply(
    addItem: (ContextMenuType, js.Array[_], java.lang.String, scala.Double) => scala.Unit,
    changeDataSource: (java.lang.String, js.Array[_]) => scala.Unit,
    disableItem: (java.lang.String, js.Array[_]) => scala.Unit,
    enableItem: (java.lang.String, js.Array[_]) => scala.Unit,
    hideItem: (java.lang.String, js.Array[_]) => scala.Unit,
    removeItem: (java.lang.String, js.Array[_]) => scala.Unit,
    showItem: (java.lang.String, js.Array[_]) => scala.Unit
  ): XLCMenu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction4(addItem), changeDataSource = js.Any.fromFunction2(changeDataSource), disableItem = js.Any.fromFunction2(disableItem), enableItem = js.Any.fromFunction2(enableItem), hideItem = js.Any.fromFunction2(hideItem), removeItem = js.Any.fromFunction2(removeItem), showItem = js.Any.fromFunction2(showItem))
  
    __obj.asInstanceOf[XLCMenu]
  }
}


package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLRibbon extends js.Object {
  /** This method is used to add a new item in the backstage.
    * @param {Spreadsheet.BackstageOptions} Pass Object BackstageOptions.
    * @param {number} pass the index of the item to be added in the backstage.
    * @returns {void}
    */
  def addBackStageItem(pageItem: BackstageOptions, index: Double): Unit = js.native
  /** This method is used to dynamically add the contextual tabs in the ribbon.
    * @param {Spreadsheet.ContextualTabOptions} Pass Object ContextualTabOptions.
    * @param {number} pass the index of the contextual tab.
    * @returns {void}
    */
  def addContextualTabs(contextualTabSet: ContextualTabOptions, index: Double): Unit = js.native
  /** This method is used to dynamically add the menu item in the file menu.
    * @param {any[]} Specifies the item to be added
    * @param {number} pass the index of the menu item.
    * @returns {void}
    */
  def addMenuItem(item: js.Array[_], index: Double): Unit = js.native
  /** This method is used to add a new name in the Spreadsheet name manager.
    * @param {string} Pass the name that you want to define in name manager.
    * @param {string} Pass the cell reference.
    * @param {string} Optional. Pass comment, if you want.
    * @param {number} Optional. Pass the sheet index.
    * @param {string} Optional. Pass the scope of the name manager.
    * @returns {void}
    */
  def addNamedRange(name: String, refersTo: String, comment: String, sheetIdx: Double, scope: String): Unit = js.native
  /** This method is used to dynamically add the tab in the ribbon.
    * @param {string} Specifies the text to be displayed in the tab.
    * @param {any[]} pass the groups to be displayed in the ribbon tab.
    * @param {number} pass the index of the tab.
    * @returns {void}
    */
  def addTab(tabText: String, ribbonGroups: js.Array[_], index: Double): Unit = js.native
  /** This method is used to dynamically add the tab group in the ribbon.
    * @param {number} Specifies the ribbon tab index.
    * @param {Spreadsheet.TabOptions} Pass Object TabOptions.
    * @param {number} pass the index of the ribbon group.
    * @returns {void}
    */
  def addTabGroup(tabIndex: Double, tabGroup: TabOptions, groupIndex: Double): Unit = js.native
  /** This method is used to insert the few type (SUM, MAX, MIN, AVG, COUNT) of formulas in the selected range of cells in the Spreadsheet.
    * @param {string} To pass the type("SUM","MAX","MIN","AVG","COUNT").
    * @param {string|any[]} If range is specified, it will apply auto sum for the specified range else it will use the current selected range.
    * @returns {void}
    */
  def autoSum(`type`: String, range: String): Unit = js.native
  def autoSum(`type`: String, range: js.Array[_]): Unit = js.native
  /** This method is used to hide the file menu in the ribbon tab.
    * @returns {void}
    */
  def hideMenu(): Unit = js.native
  /** This method is used to remove the item from the backstage in the spreadsheet.
    * @param {number} Specifies the index of the item to be removed from backstage.
    * @returns {void}
    */
  def removeBackStageItem(index: Double): Unit = js.native
  /** This method is used to remove the menu item form file menu in spreadsheet.
    * @param {number} Specifies the index of the item to be removed from the file menu.
    * @returns {void}
    */
  def removeMenuItem(index: Double): Unit = js.native
  /** This method is used to delete the defined name in the Spreadsheet name manager.
    * @param {string} Pass the defined name that you want to remove from name manager.
    * @param {string} Optional. Pass the scope of the name manager.
    * @returns {void}
    */
  def removeNamedRange(name: String, scope: String): Unit = js.native
  /** This method is used to remove the tab form ribbon in the spreadsheet.
    * @param {number} Specifies the index of the tab to be removed from the ribbon.
    * @param {boolean} pass the boolean value to remove the tab from ribbon
    * @returns {void}
    */
  def removeTab(index: Double, isRemoveMenu: Boolean): Unit = js.native
  /** This method is used to remove the tab group form ribbon in the spreadsheet.
    * @param {number} Specifies the index of the tab group to be removed from the ribbon.
    * @param {string} Specifies the text to be displayed in the tab group
    * @returns {void}
    */
  def removeTabGroup(tabIndex: Double, groupText: String): Unit = js.native
  /** This method is used to show the file menu in the ribbon tab.
    * @returns {void}
    */
  def showMenu(): Unit = js.native
  /** This method is used to update the menu item in the file menu.
    * @param {Spreadsheet.MenuItemOptions} Pass Object MenuItemOptions.
    * @param {number} pass the index of the item to be updated
    * @returns {void}
    */
  def updateMenuItem(item: MenuItemOptions, index: Double): Unit = js.native
  /** This method is used to update the ribbon icons in the Spreadsheet.
    * @returns {void}
    */
  def updateRibbonIcons(): Unit = js.native
}


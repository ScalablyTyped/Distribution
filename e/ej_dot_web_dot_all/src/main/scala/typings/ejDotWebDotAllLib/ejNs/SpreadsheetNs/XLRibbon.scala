package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLRibbon extends js.Object {
  /** This method is used to add a new item in the backstage.
               * @param {any} Specifies the item to be added in the backstage.
               * @param {number} pass the index of the item to be added in the backstage.
               * @returns {void}
               */
  def addBackStageItem(pageItem: js.Any, index: scala.Double): scala.Unit = js.native
  /** This method is used to dynamically add the contextual tabs in the ribbon.
               * @param {any} Specifies the contextual tab set object.
               * @param {number} pass the index of the contextual tab.
               * @returns {void}
               */
  def addContextualTabs(contextualTabSet: js.Any, index: scala.Double): scala.Unit = js.native
  /** This method is used to dynamically add the menu item in the file menu.
               * @param {any[]} Specifies the item to be added
               * @param {number} pass the index of the menu item.
               * @returns {void}
               */
  def addMenuItem(item: js.Array[_], index: scala.Double): scala.Unit = js.native
  /** This method is used to add a new name in the Spreadsheet name manager.
               * @param {string} Pass the name that you want to define in name manager.
               * @param {string} Pass the cell reference.
               * @param {string} Optional. Pass comment, if you want.
               * @param {number} Optional. Pass the sheet index.
               * @returns {void}
               */
  def addNamedRange(
    name: java.lang.String,
    refersTo: java.lang.String,
    comment: java.lang.String,
    sheetIdx: scala.Double
  ): scala.Unit = js.native
  /** This method is used to dynamically add the tab in the ribbon.
               * @param {string} Specifies the text to be displayed in the tab.
               * @param {any[]} pass the groups to be displayed in the ribbon tab.
               * @param {number} pass the index of the tab.
               * @returns {void}
               */
  def addTab(tabText: java.lang.String, ribbonGroups: js.Array[_], index: scala.Double): scala.Unit = js.native
  /** This method is used to dynamically add the tab group in the ribbon.
               * @param {number} Specifies the ribbon tab index.
               * @param {any} pass the groups to be displayed in the ribbon tab.
               * @param {number} pass the index of the ribbon group.
               * @returns {void}
               */
  def addTabGroup(tabIndex: scala.Double, tabGroup: js.Any, groupIndex: scala.Double): scala.Unit = js.native
  /** This method is used to insert the few type (SUM, MAX, MIN, AVG, COUNT) of formulas in the selected range of cells in the Spreadsheet.
               * @param {string} To pass the type("SUM","MAX","MIN","AVG","COUNT").
               * @param {string|any[]} If range is specified, it will apply auto sum for the specified range else it will use the current selected range.
               * @returns {void}
               */
  def autoSum(`type`: java.lang.String, range: java.lang.String): scala.Unit = js.native
  /** This method is used to insert the few type (SUM, MAX, MIN, AVG, COUNT) of formulas in the selected range of cells in the Spreadsheet.
               * @param {string} To pass the type("SUM","MAX","MIN","AVG","COUNT").
               * @param {string|any[]} If range is specified, it will apply auto sum for the specified range else it will use the current selected range.
               * @returns {void}
               */
  def autoSum(`type`: java.lang.String, range: js.Array[_]): scala.Unit = js.native
  /** This method is used to hide the file menu in the ribbon tab.
               * @returns {void}
               */
  def hideMenu(): scala.Unit = js.native
  /** This method is used to remove the item from the backstage in the spreadsheet.
               * @param {number} Specifies the index of the item to be removed from backstage.
               * @returns {void}
               */
  def removeBackStageItem(index: scala.Double): scala.Unit = js.native
  /** This method is used to remove the menu item form file menu in spreadsheet.
               * @param {number} Specifies the index of the item to be removed from the file menu.
               * @returns {void}
               */
  def removeMenuItem(index: scala.Double): scala.Unit = js.native
  /** This method is used to delete the defined name in the Spreadsheet name manager.
               * @param {string} Pass the defined name that you want to remove from name manager.
               * @returns {void}
               */
  def removeNamedRange(name: java.lang.String): scala.Unit = js.native
  /** This method is used to remove the tab form ribbon in the spreadsheet.
               * @param {number} Specifies the index of the tab to be removed from the ribbon.
               * @param {boolean} pass the boolean value to remove the tab from ribbon
               * @returns {void}
               */
  def removeTab(index: scala.Double, isRemoveMenu: scala.Boolean): scala.Unit = js.native
  /** This method is used to remove the tab group form ribbon in the spreadsheet.
               * @param {number} Specifies the index of the tab group to be removed from the ribbon.
               * @param {string} Specifies the text to be displayed in the tab group
               * @returns {void}
               */
  def removeTabGroup(tabIndex: scala.Double, groupText: java.lang.String): scala.Unit = js.native
  /** This method is used to show the file menu in the ribbon tab.
               * @returns {void}
               */
  def showMenu(): scala.Unit = js.native
  /** This method is used to update the menu item in the file menu.
               * @param {any} Specifies the menu item to be updated in the ribbon
               * @param {number} pass the index of the item to be updated
               * @returns {void}
               */
  def updateMenuItem(item: js.Any, index: scala.Double): scala.Unit = js.native
  /** This method is used to update the ribbon icons in the Spreadsheet.
               * @returns {void}
               */
  def updateRibbonIcons(): scala.Unit = js.native
}


package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom menu in an instance of the user interface for a Google App. A script can only interact
  * with the UI for the current instance of an open document or form, and only if the script is container-bound to the document or form. For more
  * information, see the guide to menus.
  *
  *     // Add a custom menu to the active spreadsheet, including a separator and a sub-menu.
  *     function onOpen(e) {
  *       SpreadsheetApp.getUi()
  *           .createMenu('My Menu')
  *           .addItem('My Menu Item', 'myFunction')
  *           .addSeparator()
  *           .addSubMenu(SpreadsheetApp.getUi().createMenu('My Submenu')
  *               .addItem('One Submenu Item', 'mySecondFunction')
  *               .addItem('Another Submenu Item', 'myThirdFunction'))
  *           .addToUi();
  *     }
  */
trait Menu extends js.Object {
  def addItem(caption: String, functionName: String): Menu
  def addSeparator(): Menu
  def addSubMenu(menu: Menu): Menu
  def addToUi(): Unit
}

object Menu {
  @scala.inline
  def apply(
    addItem: (String, String) => Menu,
    addSeparator: () => Menu,
    addSubMenu: Menu => Menu,
    addToUi: () => Unit
  ): Menu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), addSeparator = js.Any.fromFunction0(addSeparator), addSubMenu = js.Any.fromFunction1(addSubMenu), addToUi = js.Any.fromFunction0(addToUi))
  
    __obj.asInstanceOf[Menu]
  }
}


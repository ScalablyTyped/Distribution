package typings.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Menu extends StObject {
  
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
  
  @scala.inline
  implicit class MenuMutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddItem(value: (String, String) => Menu): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddSeparator(value: () => Menu): Self = StObject.set(x, "addSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddSubMenu(value: Menu => Menu): Self = StObject.set(x, "addSubMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToUi(value: () => Unit): Self = StObject.set(x, "addToUi", js.Any.fromFunction0(value))
  }
}

package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait Menu extends js.Object {
  
  def addItem(caption: String, functionName: String): Menu = js.native
  
  def addSeparator(): Menu = js.native
  
  def addSubMenu(menu: Menu): Menu = js.native
  
  def addToUi(): Unit = js.native
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
  implicit class MenuOps[Self <: Menu] (val x: Self) extends AnyVal {
    
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
    def setAddItem(value: (String, String) => Menu): Self = this.set("addItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddSeparator(value: () => Menu): Self = this.set("addSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddSubMenu(value: Menu => Menu): Self = this.set("addSubMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToUi(value: () => Unit): Self = this.set("addToUi", js.Any.fromFunction0(value))
  }
}

package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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


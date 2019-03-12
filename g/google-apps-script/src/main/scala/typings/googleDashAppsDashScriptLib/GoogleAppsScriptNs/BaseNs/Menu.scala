package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Menu extends js.Object {
  def addItem(caption: java.lang.String, functionName: java.lang.String): Menu
  def addSeparator(): Menu
  def addSubMenu(menu: Menu): Menu
  def addToUi(): scala.Unit
}

object Menu {
  @scala.inline
  def apply(
    addItem: (java.lang.String, java.lang.String) => Menu,
    addSeparator: () => Menu,
    addSubMenu: Menu => Menu,
    addToUi: () => scala.Unit
  ): Menu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem), addSeparator = js.Any.fromFunction0(addSeparator), addSubMenu = js.Any.fromFunction1(addSubMenu), addToUi = js.Any.fromFunction0(addToUi))
  
    __obj.asInstanceOf[Menu]
  }
}


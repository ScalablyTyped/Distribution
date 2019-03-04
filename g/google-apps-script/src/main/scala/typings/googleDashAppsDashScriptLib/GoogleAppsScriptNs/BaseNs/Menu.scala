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
    addItem: js.Function2[java.lang.String, java.lang.String, Menu],
    addSeparator: js.Function0[Menu],
    addSubMenu: js.Function1[Menu, Menu],
    addToUi: js.Function0[scala.Unit]
  ): Menu = {
    val __obj = js.Dynamic.literal(addItem = addItem, addSeparator = addSeparator, addSubMenu = addSubMenu, addToUi = addToUi)
  
    __obj.asInstanceOf[Menu]
  }
}


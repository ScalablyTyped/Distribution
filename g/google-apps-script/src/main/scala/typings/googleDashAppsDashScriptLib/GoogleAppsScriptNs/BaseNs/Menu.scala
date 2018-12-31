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


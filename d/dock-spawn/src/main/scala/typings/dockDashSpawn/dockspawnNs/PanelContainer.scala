package typings.dockDashSpawn.dockspawnNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dockspawn.PanelContainer")
@js.native
class PanelContainer protected () extends js.Object {
  def this(element: HTMLElement, dockManager: DockManager) = this()
  def this(element: HTMLElement, dockManager: DockManager, title: String) = this()
  var height: Double = js.native
  var width: Double = js.native
  def setTitle(title: String): Unit = js.native
  def setTitleIcon(iconName: String): Unit = js.native
}


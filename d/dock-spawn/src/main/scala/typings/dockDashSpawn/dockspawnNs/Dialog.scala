package typings.dockDashSpawn.dockspawnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dockspawn.Dialog")
@js.native
class Dialog protected () extends js.Object {
  def this(panel: PanelContainer, dockManager: DockManager) = this()
  def bringToFront(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setTitleIcon(iconName: String): Unit = js.native
}

/* static members */
@JSGlobal("dockspawn.Dialog")
@js.native
object Dialog extends js.Object {
  def fromElement(id: String, dockManager: DockManager): Dialog = js.native
}


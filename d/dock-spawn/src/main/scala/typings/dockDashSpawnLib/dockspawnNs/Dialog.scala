package typings
package dockDashSpawnLib.dockspawnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dockspawn.Dialog")
@js.native
class Dialog protected () extends js.Object {
  def this(panel: PanelContainer, dockManager: DockManager) = this()
  def bringToFront(): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setTitleIcon(iconName: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("dockspawn.Dialog")
@js.native
object Dialog extends js.Object {
  def fromElement(id: java.lang.String, dockManager: dockDashSpawnLib.dockspawnNs.DockManager): dockDashSpawnLib.dockspawnNs.Dialog = js.native
}


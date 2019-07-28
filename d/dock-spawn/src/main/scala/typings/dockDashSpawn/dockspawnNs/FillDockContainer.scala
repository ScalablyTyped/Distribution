package typings.dockDashSpawn.dockspawnNs

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dockspawn.FillDockContainer")
@js.native
class FillDockContainer protected () extends js.Object {
  def this(dockManager: DockManager) = this()
  def this(dockManager: DockManager, tabStripDirection: TabStripDirection) = this()
  var containerType: String = js.native
  var dockManager: DockManager = js.native
  var element: HTMLDivElement = js.native
  var minimumAllowedChildNodes: Double = js.native
  var name: String = js.native
  var tabHost: TabHost = js.native
  var tabOrientation: TabStripDirection = js.native
}


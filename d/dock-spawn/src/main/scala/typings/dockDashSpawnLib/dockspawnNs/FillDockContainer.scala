package typings
package dockDashSpawnLib.dockspawnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dockspawn.FillDockContainer")
@js.native
class FillDockContainer protected () extends js.Object {
  def this(dockManager: DockManager) = this()
  def this(dockManager: DockManager, tabStripDirection: TabStripDirection) = this()
  var containerType: java.lang.String = js.native
  var dockManager: DockManager = js.native
  var element: stdLib.HTMLDivElement = js.native
  var minimumAllowedChildNodes: scala.Double = js.native
  var name: java.lang.String = js.native
  var tabHost: TabHost = js.native
  var tabOrientation: TabStripDirection = js.native
}


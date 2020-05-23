package typings.dockSpawn.dockspawn

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillDockContainer extends js.Object {
  var containerType: String
  var dockManager: DockManager
  var element: HTMLDivElement
  var minimumAllowedChildNodes: Double
  var name: String
  var tabHost: TabHost
  var tabOrientation: TabStripDirection
}

object FillDockContainer {
  @scala.inline
  def apply(
    containerType: String,
    dockManager: DockManager,
    element: HTMLDivElement,
    minimumAllowedChildNodes: Double,
    name: String,
    tabHost: TabHost,
    tabOrientation: TabStripDirection
  ): FillDockContainer = {
    val __obj = js.Dynamic.literal(containerType = containerType.asInstanceOf[js.Any], dockManager = dockManager.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], minimumAllowedChildNodes = minimumAllowedChildNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tabHost = tabHost.asInstanceOf[js.Any], tabOrientation = tabOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillDockContainer]
  }
}


package typings.dockSpawn.dockspawn

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document manager is then central area of the dock layout hierarchy.
  * This is where more important panels are placed (e.g. the text editor in an IDE,
  * 3D view in a modelling package etc
  */
trait DocumentManagerContainer extends FillDockContainer {
  var selectedTab: TabPage
  def saveState(state: String): Unit
}

object DocumentManagerContainer {
  @scala.inline
  def apply(
    containerType: String,
    dockManager: DockManager,
    element: HTMLDivElement,
    minimumAllowedChildNodes: Double,
    name: String,
    saveState: String => Unit,
    selectedTab: TabPage,
    tabHost: TabHost,
    tabOrientation: TabStripDirection
  ): DocumentManagerContainer = {
    val __obj = js.Dynamic.literal(containerType = containerType.asInstanceOf[js.Any], dockManager = dockManager.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], minimumAllowedChildNodes = minimumAllowedChildNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], saveState = js.Any.fromFunction1(saveState), selectedTab = selectedTab.asInstanceOf[js.Any], tabHost = tabHost.asInstanceOf[js.Any], tabOrientation = tabOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentManagerContainer]
  }
}


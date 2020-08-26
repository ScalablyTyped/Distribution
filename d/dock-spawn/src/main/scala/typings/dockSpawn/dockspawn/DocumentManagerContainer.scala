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
@js.native
trait DocumentManagerContainer extends FillDockContainer {
  var selectedTab: TabPage = js.native
  def saveState(state: String): Unit = js.native
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
  @scala.inline
  implicit class DocumentManagerContainerOps[Self <: DocumentManagerContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSaveState(value: String => Unit): Self = this.set("saveState", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectedTab(value: TabPage): Self = this.set("selectedTab", value.asInstanceOf[js.Any])
  }
  
}


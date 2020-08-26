package typings.dockSpawn.dockspawn

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillDockContainer extends js.Object {
  var containerType: String = js.native
  var dockManager: DockManager = js.native
  var element: HTMLDivElement = js.native
  var minimumAllowedChildNodes: Double = js.native
  var name: String = js.native
  var tabHost: TabHost = js.native
  var tabOrientation: TabStripDirection = js.native
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
  @scala.inline
  implicit class FillDockContainerOps[Self <: FillDockContainer] (val x: Self) extends AnyVal {
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
    def setContainerType(value: String): Self = this.set("containerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDockManager(value: DockManager): Self = this.set("dockManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: HTMLDivElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumAllowedChildNodes(value: Double): Self = this.set("minimumAllowedChildNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabHost(value: TabHost): Self = this.set("tabHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabOrientation(value: TabStripDirection): Self = this.set("tabOrientation", value.asInstanceOf[js.Any])
  }
  
}


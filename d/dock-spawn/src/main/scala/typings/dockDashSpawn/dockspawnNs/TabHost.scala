package typings.dockDashSpawn.dockspawnNs

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tab Host control contains tabs known as TabPages.
  * The tab strip can be aligned in different orientations
  */
@JSGlobal("dockspawn.TabHost")
@js.native
class TabHost () extends js.Object {
  def this(tabStripDirection: TabStripDirection) = this()
  def this(tabStripDirection: TabStripDirection, displayCloseButton: Boolean) = this()
  var contentElement: HTMLDivElement = js.native
  var displayCloseButton: Boolean = js.native
  var hostElement: HTMLDivElement = js.native
  var pages: js.Array[TabPage] = js.native
  var separatorElement: HTMLDivElement = js.native
  var tabListElement: HTMLDivElement = js.native
  var tabStripDirection: TabStripDirection = js.native
  /** Set the selected TabPage. */
  def onTabPageSelected(page: TabPage): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setActiveTab(container: PanelContainer): Unit = js.native
}


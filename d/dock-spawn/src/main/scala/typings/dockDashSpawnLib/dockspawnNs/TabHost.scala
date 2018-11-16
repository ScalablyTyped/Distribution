package typings
package dockDashSpawnLib.dockspawnNs

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
  def this(tabStripDirection: TabStripDirection, displayCloseButton: scala.Boolean) = this()
  var contentElement: stdLib.HTMLDivElement = js.native
  var displayCloseButton: scala.Boolean = js.native
  var hostElement: stdLib.HTMLDivElement = js.native
  var pages: js.Array[TabPage] = js.native
  var separatorElement: stdLib.HTMLDivElement = js.native
  var tabListElement: stdLib.HTMLDivElement = js.native
  var tabStripDirection: TabStripDirection = js.native
  /** Set the selected TabPage. */
  def onTabPageSelected(page: TabPage): scala.Unit = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setActiveTab(container: PanelContainer): scala.Unit = js.native
}


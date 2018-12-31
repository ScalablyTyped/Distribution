package typings
package dockDashSpawnLib.dockspawnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The document manager is then central area of the dock layout hierarchy.
  * This is where more important panels are placed (e.g. the text editor in an IDE,
  * 3D view in a modelling package etc
  */
@JSGlobal("dockspawn.DocumentManagerContainer")
@js.native
class DocumentManagerContainer protected () extends FillDockContainer {
  def this(dockManager: DockManager) = this()
  var selectedTab: TabPage = js.native
  def saveState(state: java.lang.String): scala.Unit = js.native
}


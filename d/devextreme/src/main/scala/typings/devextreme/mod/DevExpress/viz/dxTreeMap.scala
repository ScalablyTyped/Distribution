package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeMap extends BaseWidget {
  /** Deselects all nodes in the widget. */
  def clearSelection(): Unit = js.native
  /** Drills one level up. */
  def drillUp(): Unit = js.native
  /** Gets the current node. */
  def getCurrentNode(): dxTreeMapNode = js.native
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Gets the root node. */
  def getRootNode(): dxTreeMapNode = js.native
  /** Hides the tooltip. */
  def hideTooltip(): Unit = js.native
  /** Resets the drill down level. */
  def resetDrillDown(): Unit = js.native
}


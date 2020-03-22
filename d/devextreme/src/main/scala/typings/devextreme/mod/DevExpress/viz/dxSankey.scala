package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSankey extends BaseWidget {
  /** Gets all sankey links. */
  def getAllLinks(): js.Array[dxSankeyLink] = js.native
  /** Gets all sankey nodes. */
  def getAllNodes(): js.Array[dxSankeyNode] = js.native
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Hides all widget tooltips. */
  def hideTooltip(): Unit = js.native
}


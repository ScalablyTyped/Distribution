package typings.devextreme.mod.default.viz

import typings.devextreme.mod.DevExpress.viz.dxSankeyConnectionInfoObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz.dxSankeyLink")
@js.native
class dxSankeyLink ()
  extends typings.devextreme.mod.DevExpress.viz.dxSankeyLink {
  /** An object that describes the connection. */
  /* CompleteClass */
  override var connection: dxSankeyConnectionInfoObject = js.native
  /** Hides the sankey link's tooltip. */
  /* CompleteClass */
  override def hideTooltip(): Unit = js.native
  /** Changes the sankey link's hover state. */
  /* CompleteClass */
  override def hover(state: Boolean): Unit = js.native
  /** Indicates whether the sankey link is in the hover state. */
  /* CompleteClass */
  override def isHovered(): Boolean = js.native
  /** Shows the sankey link's tooltip. */
  /* CompleteClass */
  override def showTooltip(): Unit = js.native
}


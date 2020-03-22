package typings.devextreme.mod.default.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "viz.dxSankeyNode")
@js.native
class dxSankeyNode ()
  extends typings.devextreme.mod.DevExpress.viz.dxSankeyNode {
  /** The node's label. */
  /* CompleteClass */
  override var label: String = js.native
  /** The node's incoming links. */
  /* CompleteClass */
  override var linksIn: js.Array[_] = js.native
  /** The node's outgoing links. */
  /* CompleteClass */
  override var linksOut: js.Array[_] = js.native
  /** @deprecated Use [label](/api-reference/20%20Data%20Visualization%20Widgets/dxSankey/6%20Node/2%20Fields/label.md '/Documentation/ApiReference/Data_Visualization_Widgets/dxSankey/Node/Fields/#label') instead. */
  /** The node's label. */
  /* CompleteClass */
  override var title: String = js.native
  /** Hides the sankey node's tooltip. */
  /* CompleteClass */
  override def hideTooltip(): Unit = js.native
  /** Changes the sankey node's hover state. */
  /* CompleteClass */
  override def hover(state: Boolean): Unit = js.native
  /** Indicates whether the sankey node is in the hover state. */
  /* CompleteClass */
  override def isHovered(): Boolean = js.native
  /** Shows the sankey node's tooltip. */
  /* CompleteClass */
  override def showTooltip(): Unit = js.native
}


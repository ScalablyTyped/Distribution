package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  /** Enable or disable connector's segment overlapping with each other when executing the layout with multiple parents.
    * @Default {false}
    */
  var avoidSegmentOverlapping: js.UndefOr[Boolean] = js.native
  /** Specifies the custom bounds to arrange/align the layout
    * @Default {ej.datavisualization.Diagram.Rectangle()}
    */
  var bounds: js.UndefOr[js.Any] = js.native
  /** Defines the fixed node with reference to which, the layout will be arranged and fixed node will not be repositioned
    */
  var fixedNode: js.UndefOr[String] = js.native
  /** Defines a method to customize the segments based on source and target nodes.
    * @Default {null}
    */
  var getConnectorSegments: js.UndefOr[js.Any] = js.native
  /** Customizes the orientation of trees/sub trees. For orientations, see Chart Orientations. For chart types, see Chart Types
    * @Default {null}
    */
  var getLayoutInfo: js.UndefOr[js.Any] = js.native
  /** Defines how to horizontally align the layout within the layout bounds
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  /** Sets the space to be horizontally left between nodes
    * @Default {30}
    */
  var horizontalSpacing: js.UndefOr[Double] = js.native
  /** Defines the space to be left between layout bounds and layout.
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {1000}
    */
  var maxIteration: js.UndefOr[Double] = js.native
  /** Sets the orientation/direction to arrange the diagram elements.
    * @Default {ej.datavisualization.Diagram.LayoutOrientations.TopToBottom}
    */
  var orientation: js.UndefOr[LayoutOrientations | String] = js.native
  /** Sets the value is used to define the root node of the layout.
    * @Default {30}
    */
  var root: js.UndefOr[String] = js.native
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {0.442}
    */
  var springFactor: js.UndefOr[Double] = js.native
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {100}
    */
  var springLength: js.UndefOr[Double] = js.native
  /** Sets the type of the layout based on which the elements will be arranged.
    * @Default {ej.datavisualization.Diagram.LayoutTypes.None}
    */
  var `type`: js.UndefOr[LayoutTypes | String] = js.native
  /** Defines how to vertically align the layout within the layout bounds
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  /** Sets the space to be vertically left between nodes
    * @Default {30}
    */
  var verticalSpacing: js.UndefOr[Double] = js.native
}

object Layout {
  @scala.inline
  def apply(): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
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
    def setAvoidSegmentOverlapping(value: Boolean): Self = this.set("avoidSegmentOverlapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidSegmentOverlapping: Self = this.set("avoidSegmentOverlapping", js.undefined)
    @scala.inline
    def setBounds(value: js.Any): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setFixedNode(value: String): Self = this.set("fixedNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedNode: Self = this.set("fixedNode", js.undefined)
    @scala.inline
    def setGetConnectorSegments(value: js.Any): Self = this.set("getConnectorSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetConnectorSegments: Self = this.set("getConnectorSegments", js.undefined)
    @scala.inline
    def setGetLayoutInfo(value: js.Any): Self = this.set("getLayoutInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetLayoutInfo: Self = this.set("getLayoutInfo", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: HorizontalAlignment | String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setHorizontalSpacing(value: Double): Self = this.set("horizontalSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalSpacing: Self = this.set("horizontalSpacing", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaxIteration(value: Double): Self = this.set("maxIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIteration: Self = this.set("maxIteration", js.undefined)
    @scala.inline
    def setOrientation(value: LayoutOrientations | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSpringFactor(value: Double): Self = this.set("springFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringFactor: Self = this.set("springFactor", js.undefined)
    @scala.inline
    def setSpringLength(value: Double): Self = this.set("springLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringLength: Self = this.set("springLength", js.undefined)
    @scala.inline
    def setType(value: LayoutTypes | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setVerticalSpacing(value: Double): Self = this.set("verticalSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSpacing: Self = this.set("verticalSpacing", js.undefined)
  }
  
}


package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  /** Enable or disable connector's segment overlapping with each other when executing the layout with multiple parents.
    * @Default {false}
    */
  var avoidSegmentOverlapping: js.UndefOr[Boolean] = js.undefined
  /** Specifies the custom bounds to arrange/align the layout
    * @Default {ej.datavisualization.Diagram.Rectangle()}
    */
  var bounds: js.UndefOr[js.Any] = js.undefined
  /** Defines the fixed node with reference to which, the layout will be arranged and fixed node will not be repositioned
    */
  var fixedNode: js.UndefOr[String] = js.undefined
  /** Defines a method to customize the segments based on source and target nodes.
    * @Default {null}
    */
  var getConnectorSegments: js.UndefOr[js.Any] = js.undefined
  /** Customizes the orientation of trees/sub trees. For orientations, see Chart Orientations. For chart types, see Chart Types
    * @Default {null}
    */
  var getLayoutInfo: js.UndefOr[js.Any] = js.undefined
  /** Defines how to horizontally align the layout within the layout bounds
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.undefined
  /** Sets the space to be horizontally left between nodes
    * @Default {30}
    */
  var horizontalSpacing: js.UndefOr[Double] = js.undefined
  /** Defines the space to be left between layout bounds and layout.
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {1000}
    */
  var maxIteration: js.UndefOr[Double] = js.undefined
  /** Sets the orientation/direction to arrange the diagram elements.
    * @Default {ej.datavisualization.Diagram.LayoutOrientations.TopToBottom}
    */
  var orientation: js.UndefOr[LayoutOrientations | String] = js.undefined
  /** Sets the value is used to define the root node of the layout.
    * @Default {30}
    */
  var root: js.UndefOr[String] = js.undefined
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {0.442}
    */
  var springFactor: js.UndefOr[Double] = js.undefined
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {100}
    */
  var springLength: js.UndefOr[Double] = js.undefined
  /** Sets the type of the layout based on which the elements will be arranged.
    * @Default {ej.datavisualization.Diagram.LayoutTypes.None}
    */
  var `type`: js.UndefOr[LayoutTypes | String] = js.undefined
  /** Defines how to vertically align the layout within the layout bounds
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.undefined
  /** Sets the space to be vertically left between nodes
    * @Default {30}
    */
  var verticalSpacing: js.UndefOr[Double] = js.undefined
}

object Layout {
  @scala.inline
  def apply(
    avoidSegmentOverlapping: js.UndefOr[Boolean] = js.undefined,
    bounds: js.Any = null,
    fixedNode: String = null,
    getConnectorSegments: js.Any = null,
    getLayoutInfo: js.Any = null,
    horizontalAlignment: HorizontalAlignment | String = null,
    horizontalSpacing: js.UndefOr[Double] = js.undefined,
    margin: js.Any = null,
    maxIteration: js.UndefOr[Double] = js.undefined,
    orientation: LayoutOrientations | String = null,
    root: String = null,
    springFactor: js.UndefOr[Double] = js.undefined,
    springLength: js.UndefOr[Double] = js.undefined,
    `type`: LayoutTypes | String = null,
    verticalAlignment: VerticalAlignment | String = null,
    verticalSpacing: js.UndefOr[Double] = js.undefined
  ): Layout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidSegmentOverlapping)) __obj.updateDynamic("avoidSegmentOverlapping")(avoidSegmentOverlapping.get.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (fixedNode != null) __obj.updateDynamic("fixedNode")(fixedNode.asInstanceOf[js.Any])
    if (getConnectorSegments != null) __obj.updateDynamic("getConnectorSegments")(getConnectorSegments.asInstanceOf[js.Any])
    if (getLayoutInfo != null) __obj.updateDynamic("getLayoutInfo")(getLayoutInfo.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalSpacing)) __obj.updateDynamic("horizontalSpacing")(horizontalSpacing.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIteration)) __obj.updateDynamic("maxIteration")(maxIteration.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(springFactor)) __obj.updateDynamic("springFactor")(springFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(springLength)) __obj.updateDynamic("springLength")(springLength.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSpacing)) __obj.updateDynamic("verticalSpacing")(verticalSpacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}


package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  /** Enable or disable connector's segment overlapping with each other when executing the layout with multiple parents.
    * @Default {false}
    */
  var avoidSegmentOverlapping: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the custom bounds to arrange/align the layout
    * @Default {ej.datavisualization.Diagram.Rectangle()}
    */
  var bounds: js.UndefOr[js.Any] = js.undefined
  /** Defines the fixed node with reference to which, the layout will be arranged and fixed node will not be repositioned
    */
  var fixedNode: js.UndefOr[java.lang.String] = js.undefined
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
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | java.lang.String] = js.undefined
  /** Sets the space to be horizontally left between nodes
    * @Default {30}
    */
  var horizontalSpacing: js.UndefOr[scala.Double] = js.undefined
  /** Defines the space to be left between layout bounds and layout.
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {1000}
    */
  var maxIteration: js.UndefOr[scala.Double] = js.undefined
  /** Sets the orientation/direction to arrange the diagram elements.
    * @Default {ej.datavisualization.Diagram.LayoutOrientations.TopToBottom}
    */
  var orientation: js.UndefOr[LayoutOrientations | java.lang.String] = js.undefined
  /** Sets the value is used to define the root node of the layout.
    * @Default {30}
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {0.442}
    */
  var springFactor: js.UndefOr[scala.Double] = js.undefined
  /** Defines how long edges should be, ideally. This will be the resting length for the springs.
    * @Default {100}
    */
  var springLength: js.UndefOr[scala.Double] = js.undefined
  /** Sets the type of the layout based on which the elements will be arranged.
    * @Default {ej.datavisualization.Diagram.LayoutTypes.None}
    */
  var `type`: js.UndefOr[LayoutTypes | java.lang.String] = js.undefined
  /** Defines how to vertically align the layout within the layout bounds
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | java.lang.String] = js.undefined
  /** Sets the space to be vertically left between nodes
    * @Default {30}
    */
  var verticalSpacing: js.UndefOr[scala.Double] = js.undefined
}

object Layout {
  @scala.inline
  def apply(
    avoidSegmentOverlapping: js.UndefOr[scala.Boolean] = js.undefined,
    bounds: js.Any = null,
    fixedNode: java.lang.String = null,
    getConnectorSegments: js.Any = null,
    getLayoutInfo: js.Any = null,
    horizontalAlignment: HorizontalAlignment | java.lang.String = null,
    horizontalSpacing: scala.Int | scala.Double = null,
    margin: js.Any = null,
    maxIteration: scala.Int | scala.Double = null,
    orientation: LayoutOrientations | java.lang.String = null,
    root: java.lang.String = null,
    springFactor: scala.Int | scala.Double = null,
    springLength: scala.Int | scala.Double = null,
    `type`: LayoutTypes | java.lang.String = null,
    verticalAlignment: VerticalAlignment | java.lang.String = null,
    verticalSpacing: scala.Int | scala.Double = null
  ): Layout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidSegmentOverlapping)) __obj.updateDynamic("avoidSegmentOverlapping")(avoidSegmentOverlapping)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (fixedNode != null) __obj.updateDynamic("fixedNode")(fixedNode)
    if (getConnectorSegments != null) __obj.updateDynamic("getConnectorSegments")(getConnectorSegments)
    if (getLayoutInfo != null) __obj.updateDynamic("getLayoutInfo")(getLayoutInfo)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (horizontalSpacing != null) __obj.updateDynamic("horizontalSpacing")(horizontalSpacing.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxIteration != null) __obj.updateDynamic("maxIteration")(maxIteration.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root)
    if (springFactor != null) __obj.updateDynamic("springFactor")(springFactor.asInstanceOf[js.Any])
    if (springLength != null) __obj.updateDynamic("springLength")(springLength.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (verticalSpacing != null) __obj.updateDynamic("verticalSpacing")(verticalSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
}


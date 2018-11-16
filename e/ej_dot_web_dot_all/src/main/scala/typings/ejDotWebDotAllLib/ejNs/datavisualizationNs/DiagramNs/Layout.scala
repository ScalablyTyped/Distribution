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


package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /** Defines the type of BPMN Activity. Applicable, if the node is a BPMN activity.
    * @Default {ej.datavisualization.Diagram.BPMNActivity.Task}
    */
  var activity: js.UndefOr[BPMNActivity | java.lang.String] = js.undefined
  /** To maintain additional information about nodes
    * @Default {{}}
    */
  var addInfo: js.UndefOr[js.Any] = js.undefined
  /** Defines the additional information of a process. It is not directly related to the message flows or sequence flows of the process.
    * @Default {ej.datavisualization.Diagram.BPMNTextAnnotation()}
    */
  var annotation: js.UndefOr[NodesAnnotation] = js.undefined
  /** Sets the border color of node
    * @Default {black}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the pattern of dashes and gaps to stroke the border
    */
  var borderDashArray: js.UndefOr[java.lang.String] = js.undefined
  /** defines the node border with a smooth transition from one color to another color.
    * @Default {null}
    */
  var borderGradient: js.UndefOr[js.Any] = js.undefined
  /** Sets the border width of the node
    * @Default {1}
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines whether the group can be ungrouped or not
    * @Default {true}
    */
  var canUngroup: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of JSON objects where each object represents a child node/connector
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the name, attributes and methods of a Class. Applicable, if the node is a Class.
    * @Default {null}
    */
  var `class`: js.UndefOr[NodesClass] = js.undefined
  /** Sets the type of UML classifier. Applicable, if the node is a UML Class Diagram shape.
    * @Default {ej.datavisualization.Diagram.ClassifierShapes.Class}
    */
  var classifier: js.UndefOr[ClassifierShapes | java.lang.String] = js.undefined
  /** Defines the state of the node is collapsed.
    */
  var collapseIcon: js.UndefOr[NodesCollapseIcon] = js.undefined
  /** Defines the distance to be left between a node and its connections(In coming and out going connections).
    * @Default {0}
    */
  var connectorPadding: js.UndefOr[scala.Double] = js.undefined
  /** Enables or disables the default behaviors of the node.
    * @Default {ej.datavisualization.Diagram.NodeConstraints.Default}
    */
  var constraints: js.UndefOr[NodeConstraints | java.lang.String] = js.undefined
  /** Defines how the child objects need to be arranged(Either in any predefined manner or automatically). Applicable, if the node is a group.
    * @Default {null}
    */
  var container: js.UndefOr[NodesContainer] = js.undefined
  /** Defines the corner radius of rectangular shapes.
    * @Default {0}
    */
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  /** This property allows you to customize nodes appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the BPMN data object
    */
  var data: js.UndefOr[NodesData] = js.undefined
  /** Defines an Enumeration in a UML Class Diagram
    * @Default {null}
    */
  var enumeration: js.UndefOr[NodesEnumeration] = js.undefined
  /** Sets the type of the BPMN Events. Applicable, if the node is a BPMN event.
    * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
    */
  var event: js.UndefOr[BPMNEvents | java.lang.String] = js.undefined
  /** Defines whether the node can be automatically arranged using layout or not
    * @Default {false}
    */
  var excludeFromLayout: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the state of the node is expanded or collapsed.
    */
  var expandIcon: js.UndefOr[NodesExpandIcon] = js.undefined
  /** Defines the fill color of the node
    * @Default {white}
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the type of the BPMN Gateway. Applicable, if the node is a BPMN gateway.
    * @Default {ej.datavisualization.Diagram.BPMNGateways.None}
    */
  var gateway: js.UndefOr[BPMNGateways | java.lang.String] = js.undefined
  /** Paints the node with a smooth transition from one color to another color
    */
  var gradient: js.UndefOr[NodesGradient] = js.undefined
  /** Defines the header of a swimlane/lane
    * @Default {{ text: Title, fontSize: 11 }}
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /** Defines the height of the node
    * @Default {0}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Sets the horizontal alignment of the node. Applicable, if the parent of the node is a container.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
    */
  var horizontalAlign: js.UndefOr[HorizontalAlignment | java.lang.String] = js.undefined
  /** A read only collection of the incoming connectors/edges of the node
    * @Default {[]}
    */
  var inEdges: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines an interface in a UML Class Diagram
    * @Default {null}
    */
  var interface: js.UndefOr[NodesInterface] = js.undefined
  /** Defines whether the sub tree of the node is expanded or collapsed
    * @Default {true}
    */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the node as a swimlane
    * @Default {false}
    */
  var isSwimlane: js.UndefOr[scala.Boolean] = js.undefined
  /** A collection of objects where each object represents a label
    * @Default {[]}
    */
  var labels: js.UndefOr[js.Array[NodesLabel]] = js.undefined
  /** An array of objects where each object represents a lane. Applicable, if the node is a swimlane.
    * @Default {[]}
    */
  var lanes: js.UndefOr[js.Array[NodesLane]] = js.undefined
  /** Defines the minimum space to be left between the bottom of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginBottom: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum space to be left between the left of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginLeft: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum space to be left between the right of the parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginRight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum space to be left between the top of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginTop: js.UndefOr[scala.Double] = js.undefined
  /** Defines the maximum height limit of the node
    * @Default {0}
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the maximum width limit of the node
    * @Default {0}
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum height limit of the node
    * @Default {0}
    */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum width limit of the node
    * @Default {0}
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** Sets the unique identifier of the node
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the position of the node on X-Axis
    * @Default {0}
    */
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  /** Defines the position of the node on Y-Axis
    * @Default {0}
    */
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  /** Defines the opaque of the node
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Defines the orientation of nodes. Applicable, if the node is a swimlane.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /** A read only collection of outgoing connectors/edges of the node
    * @Default {[]}
    */
  var outEdges: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the minimum padding value to be left between the bottom most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingBottom: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum padding value to be left between the left most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingLeft: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum padding value to be left between the right most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingRight: js.UndefOr[scala.Double] = js.undefined
  /** Defines the minimum padding value to be left between the top most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingTop: js.UndefOr[scala.Double] = js.undefined
  /** Defines the size and preview size of the node to add that to symbol palette
    * @Default {null}
    */
  var paletteItem: js.UndefOr[NodesPaletteItem] = js.undefined
  /** Sets the name of the parent group
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the path geometry that defines the shape of a path node
    */
  var pathData: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the height of the phase headers
    * @Default {0}
    */
  var phaseSize: js.UndefOr[scala.Double] = js.undefined
  /** An array of objects, where each object represents a smaller region(phase) of a swimlane.
    * @Default {[]}
    */
  var phases: js.UndefOr[js.Array[NodesPhase]] = js.undefined
  /** Sets the ratio/ fractional value relative to node, based on which the node will be transformed(positioning, scaling and rotation)
    * @Default {ej.datavisualization.Diagram.Points(0.5,0.5)}
    */
  var pivot: js.UndefOr[js.Any] = js.undefined
  /** Defines a collection of points to draw a polygon. Applicable, if the shape is a polygon.
    * @Default {[]}
    */
  var points: js.UndefOr[js.Array[_]] = js.undefined
  /** An array of objects where each object represents a port
    * @Default {[]}
    */
  var ports: js.UndefOr[js.Array[NodesPort]] = js.undefined
  /** Sets the angle to which the node should be rotated
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[scala.Double] = js.undefined
  /** Defines the opacity and the position of shadow
    * @Default {ej.datavisualization.Diagram.Shadow()}
    */
  var shadow: js.UndefOr[NodesShadow] = js.undefined
  /** Sets the shape of the node. It depends upon the type of node.
    * @Default {ej.datavisualization.Diagram.BasicShapes.Rectangle}
    */
  var shape: js.UndefOr[BasicShapes | FlowShapes | BPMNShapes | UMLActivityShapes | java.lang.String] = js.undefined
  /** Sets the source path of the image. Applicable, if the type of the node is image.
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the sub process of a BPMN Activity. Applicable, if the type of the BPMN activity is sub process.
    * @Default {ej.datavisualization.Diagram.BPMNSubProcess()}
    */
  var subProcess: js.UndefOr[NodesSubProcess] = js.undefined
  /** Defines the task of the BPMN activity. Applicable, if the type of activity is set as task.
    * @Default {ej.datavisualization.Diagram.BPMNTask()}
    */
  var task: js.UndefOr[NodesTask] = js.undefined
  /** Sets the id of svg/html templates. Applicable, if the node is HTML or native.
    */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
  /** Defines the textBlock of a text node
    * @Default {null}
    */
  var textBlock: js.UndefOr[js.Any] = js.undefined
  /** Defines the tooltip that should be shown when the mouse hovers over node. For tooltip properties, refer Tooltip
    * @Default {null}
    */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** Sets the type of BPMN Event Triggers.
    * @Default {ej.datavisualization.Diagram.BPMNTriggers.None}
    */
  var trigger: js.UndefOr[BPMNTriggers | java.lang.String] = js.undefined
  /** Defines the type of the node.
    * @Default {ej.datavisualization.Diagram.Shapes.Basic}
    */
  var `type`: js.UndefOr[Shapes | java.lang.String] = js.undefined
  /** Sets the vertical alignment of a node. Applicable, if the parent of a node is a container.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
    */
  var verticalAlign: js.UndefOr[VerticalAlignment | java.lang.String] = js.undefined
  /** Defines the visibility of the node
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the width of the node
    * @Default {0}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Defines the z-index of the node
    * @Default {0}
    */
  var zOrder: js.UndefOr[scala.Double] = js.undefined
}


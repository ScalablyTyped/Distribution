package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /** Defines the type of BPMN Activity. Applicable, if the node is a BPMN activity.
    * @Default {ej.datavisualization.Diagram.BPMNActivity.Task}
    */
  var activity: js.UndefOr[BPMNActivity | String] = js.native
  /** To maintain additional information about nodes
    * @Default {{}}
    */
  var addInfo: js.UndefOr[js.Any] = js.native
  /** Defines the additional information of a process. It is not directly related to the message flows or sequence flows of the process.
    * @Default {ej.datavisualization.Diagram.BPMNTextAnnotation()}
    */
  var annotation: js.UndefOr[NodesAnnotation] = js.native
  /** Sets the border color of node
    * @Default {black}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Sets the pattern of dashes and gaps to stroke the border
    */
  var borderDashArray: js.UndefOr[String] = js.native
  /** defines the node border with a smooth transition from one color to another color.
    * @Default {null}
    */
  var borderGradient: js.UndefOr[js.Any] = js.native
  /** Sets the border width of the node
    * @Default {1}
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /** Defines whether the group can be ungrouped or not
    * @Default {true}
    */
  var canUngroup: js.UndefOr[Boolean] = js.native
  /** Array of JSON objects where each object represents a child node/connector
    * @Default {[]}
    */
  var children: js.UndefOr[js.Array[_]] = js.native
  /** Defines the name, attributes and methods of a Class. Applicable, if the node is a Class.
    * @Default {null}
    */
  var `class`: js.UndefOr[NodesClass] = js.native
  /** Sets the type of UML classifier. Applicable, if the node is a UML Class Diagram shape.
    * @Default {ej.datavisualization.Diagram.ClassifierShapes.Class}
    */
  var classifier: js.UndefOr[ClassifierShapes | String] = js.native
  /** Defines the state of the node is collapsed.
    */
  var collapseIcon: js.UndefOr[NodesCollapseIcon] = js.native
  /** Defines the distance to be left between a node and its connections(In coming and out going connections).
    * @Default {0}
    */
  var connectorPadding: js.UndefOr[Double] = js.native
  /** Enables or disables the default behaviors of the node.
    * @Default {ej.datavisualization.Diagram.NodeConstraints.Default}
    */
  var constraints: js.UndefOr[NodeConstraints | String] = js.native
  /** Defines how the child objects need to be arranged(Either in any predefined manner or automatically). Applicable, if the node is a group.
    * @Default {null}
    */
  var container: js.UndefOr[NodesContainer] = js.native
  /** Defines the corner radius of rectangular shapes.
    * @Default {0}
    */
  var cornerRadius: js.UndefOr[Double] = js.native
  /** This property allows you to customize nodes appearance using user-defined CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Defines the BPMN data object
    */
  var data: js.UndefOr[NodesData] = js.native
  /** Defines an Enumeration in a UML Class Diagram
    * @Default {null}
    */
  var enumeration: js.UndefOr[NodesEnumeration] = js.native
  /** Sets the type of the BPMN Events. Applicable, if the node is a BPMN event.
    * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
    */
  var event: js.UndefOr[BPMNEvents | String] = js.native
  /** Defines whether the node can be automatically arranged using layout or not
    * @Default {false}
    */
  var excludeFromLayout: js.UndefOr[Boolean] = js.native
  /** Defines the state of the node is expanded or collapsed.
    */
  var expandIcon: js.UndefOr[NodesExpandIcon] = js.native
  /** Defines the fill color of the node
    * @Default {white}
    */
  var fillColor: js.UndefOr[String] = js.native
  /** Sets the type of the BPMN Gateway. Applicable, if the node is a BPMN gateway.
    * @Default {ej.datavisualization.Diagram.BPMNGateways.None}
    */
  var gateway: js.UndefOr[BPMNGateways | String] = js.native
  /** Paints the node with a smooth transition from one color to another color
    */
  var gradient: js.UndefOr[NodesGradient] = js.native
  /** Defines the header of a swimlane/lane
    * @Default {{ text: Title, fontSize: 11 }}
    */
  var header: js.UndefOr[js.Any] = js.native
  /** Defines the height of the node
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** Sets the horizontal alignment of the node. Applicable, if the parent of the node is a container.
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
    */
  var horizontalAlign: js.UndefOr[HorizontalAlignment | String] = js.native
  /** A read only collection of the incoming connectors/edges of the node
    * @Default {[]}
    */
  var inEdges: js.UndefOr[js.Array[_]] = js.native
  /** Defines an interface in a UML Class Diagram
    * @Default {null}
    */
  var interface: js.UndefOr[NodesInterface] = js.native
  /** Defines whether the sub tree of the node is expanded or collapsed
    * @Default {true}
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /** Sets the node as a swimlane
    * @Default {false}
    */
  var isSwimlane: js.UndefOr[Boolean] = js.native
  /** A collection of objects where each object represents a label
    * @Default {[]}
    */
  var labels: js.UndefOr[js.Array[NodesLabel]] = js.native
  /** An array of objects where each object represents a lane. Applicable, if the node is a swimlane.
    * @Default {[]}
    */
  var lanes: js.UndefOr[js.Array[NodesLane]] = js.native
  /** Defines the minimum space to be left between the bottom of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginBottom: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the left of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginLeft: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the right of the parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginRight: js.UndefOr[Double] = js.native
  /** Defines the minimum space to be left between the top of parent bounds and the node. Applicable, if the parent is a container.
    * @Default {0}
    */
  var marginTop: js.UndefOr[Double] = js.native
  /** Defines the maximum height limit of the node
    * @Default {0}
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /** Defines the maximum width limit of the node
    * @Default {0}
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /** Defines the minimum height limit of the node
    * @Default {0}
    */
  var minHeight: js.UndefOr[Double] = js.native
  /** Defines the minimum width limit of the node
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.native
  /** Sets the unique identifier of the node
    */
  var name: js.UndefOr[String] = js.native
  /** Defines the position of the node on X-Axis
    * @Default {0}
    */
  var offsetX: js.UndefOr[Double] = js.native
  /** Defines the position of the node on Y-Axis
    * @Default {0}
    */
  var offsetY: js.UndefOr[Double] = js.native
  /** Defines the opaque of the node
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Defines the orientation of nodes. Applicable, if the node is a swimlane.
    * @Default {vertical}
    */
  var orientation: js.UndefOr[String] = js.native
  /** A read only collection of outgoing connectors/edges of the node
    * @Default {[]}
    */
  var outEdges: js.UndefOr[js.Array[_]] = js.native
  /** Defines the minimum padding value to be left between the bottom most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingBottom: js.UndefOr[Double] = js.native
  /** Defines the minimum padding value to be left between the left most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingLeft: js.UndefOr[Double] = js.native
  /** Defines the minimum padding value to be left between the right most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingRight: js.UndefOr[Double] = js.native
  /** Defines the minimum padding value to be left between the top most position of a group and its children. Applicable, if the group is a container.
    * @Default {0}
    */
  var paddingTop: js.UndefOr[Double] = js.native
  /** Defines the size and preview size of the node to add that to symbol palette
    * @Default {null}
    */
  var paletteItem: js.UndefOr[NodesPaletteItem] = js.native
  /** Sets the name of the parent group
    */
  var parent: js.UndefOr[String] = js.native
  /** Sets the path geometry that defines the shape of a path node
    */
  var pathData: js.UndefOr[String] = js.native
  /** Sets the height of the phase headers
    * @Default {0}
    */
  var phaseSize: js.UndefOr[Double] = js.native
  /** An array of objects, where each object represents a smaller region(phase) of a swimlane.
    * @Default {[]}
    */
  var phases: js.UndefOr[js.Array[NodesPhase]] = js.native
  /** Sets the ratio/ fractional value relative to node, based on which the node will be transformed(positioning, scaling and rotation)
    * @Default {ej.datavisualization.Diagram.Points(0.5,0.5)}
    */
  var pivot: js.UndefOr[js.Any] = js.native
  /** Defines a collection of points to draw a polygon. Applicable, if the shape is a polygon.
    * @Default {[]}
    */
  var points: js.UndefOr[js.Array[_]] = js.native
  /** An array of objects where each object represents a port
    * @Default {[]}
    */
  var ports: js.UndefOr[js.Array[NodesPort]] = js.native
  /** Sets the angle to which the node should be rotated
    * @Default {0}
    */
  var rotateAngle: js.UndefOr[Double] = js.native
  /** Defines the opacity and the position of shadow
    * @Default {ej.datavisualization.Diagram.Shadow()}
    */
  var shadow: js.UndefOr[NodesShadow] = js.native
  /** Sets the shape of the node. It depends upon the type of node.
    * @Default {ej.datavisualization.Diagram.BasicShapes.Rectangle}
    */
  var shape: js.UndefOr[BasicShapes | FlowShapes | BPMNShapes | UMLActivityShapes | String] = js.native
  /** Sets the source path of the image. Applicable, if the type of the node is image.
    */
  var source: js.UndefOr[String] = js.native
  /** Defines the sub process of a BPMN Activity. Applicable, if the type of the BPMN activity is sub process.
    * @Default {ej.datavisualization.Diagram.BPMNSubProcess()}
    */
  var subProcess: js.UndefOr[NodesSubProcess] = js.native
  /** Defines the task of the BPMN activity. Applicable, if the type of activity is set as task.
    * @Default {ej.datavisualization.Diagram.BPMNTask()}
    */
  var task: js.UndefOr[NodesTask] = js.native
  /** Sets the id of svg/html templates. Applicable, if the node is HTML or native.
    */
  var templateId: js.UndefOr[String] = js.native
  /** Defines the textBlock of a text node
    * @Default {null}
    */
  var textBlock: js.UndefOr[js.Any] = js.native
  /** Defines the tooltip that should be shown when the mouse hovers over node. For tooltip properties, refer Tooltip
    * @Default {null}
    */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** Sets the type of BPMN Event Triggers.
    * @Default {ej.datavisualization.Diagram.BPMNTriggers.None}
    */
  var trigger: js.UndefOr[BPMNTriggers | String] = js.native
  /** Defines the type of the node.
    * @Default {ej.datavisualization.Diagram.Shapes.Basic}
    */
  var `type`: js.UndefOr[Shapes | String] = js.native
  /** Sets the vertical alignment of a node. Applicable, if the parent of a node is a container.
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
    */
  var verticalAlign: js.UndefOr[VerticalAlignment | String] = js.native
  /** Defines the visibility of the node
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
  /** Defines the width of the node
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
  /** Defines the z-index of the node
    * @Default {0}
    */
  var zOrder: js.UndefOr[Double] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setActivity(value: BPMNActivity | String): Self = this.set("activity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivity: Self = this.set("activity", js.undefined)
    @scala.inline
    def setAddInfo(value: js.Any): Self = this.set("addInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddInfo: Self = this.set("addInfo", js.undefined)
    @scala.inline
    def setAnnotation(value: NodesAnnotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderDashArray(value: String): Self = this.set("borderDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderDashArray: Self = this.set("borderDashArray", js.undefined)
    @scala.inline
    def setBorderGradient(value: js.Any): Self = this.set("borderGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderGradient: Self = this.set("borderGradient", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCanUngroup(value: Boolean): Self = this.set("canUngroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanUngroup: Self = this.set("canUngroup", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClass(value: NodesClass): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setClassifier(value: ClassifierShapes | String): Self = this.set("classifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassifier: Self = this.set("classifier", js.undefined)
    @scala.inline
    def setCollapseIcon(value: NodesCollapseIcon): Self = this.set("collapseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseIcon: Self = this.set("collapseIcon", js.undefined)
    @scala.inline
    def setConnectorPadding(value: Double): Self = this.set("connectorPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorPadding: Self = this.set("connectorPadding", js.undefined)
    @scala.inline
    def setConstraints(value: NodeConstraints | String): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setContainer(value: NodesContainer): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setData(value: NodesData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEnumeration(value: NodesEnumeration): Self = this.set("enumeration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumeration: Self = this.set("enumeration", js.undefined)
    @scala.inline
    def setEvent(value: BPMNEvents | String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setExcludeFromLayout(value: Boolean): Self = this.set("excludeFromLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeFromLayout: Self = this.set("excludeFromLayout", js.undefined)
    @scala.inline
    def setExpandIcon(value: NodesExpandIcon): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setGateway(value: BPMNGateways | String): Self = this.set("gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateway: Self = this.set("gateway", js.undefined)
    @scala.inline
    def setGradient(value: NodesGradient): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHorizontalAlign(value: HorizontalAlignment | String): Self = this.set("horizontalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlign: Self = this.set("horizontalAlign", js.undefined)
    @scala.inline
    def setInEdgesVarargs(value: js.Any*): Self = this.set("inEdges", js.Array(value :_*))
    @scala.inline
    def setInEdges(value: js.Array[_]): Self = this.set("inEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInEdges: Self = this.set("inEdges", js.undefined)
    @scala.inline
    def setInterface(value: NodesInterface): Self = this.set("interface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterface: Self = this.set("interface", js.undefined)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    @scala.inline
    def setIsSwimlane(value: Boolean): Self = this.set("isSwimlane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSwimlane: Self = this.set("isSwimlane", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: NodesLabel*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[NodesLabel]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLanesVarargs(value: NodesLane*): Self = this.set("lanes", js.Array(value :_*))
    @scala.inline
    def setLanes(value: js.Array[NodesLane]): Self = this.set("lanes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanes: Self = this.set("lanes", js.undefined)
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOutEdgesVarargs(value: js.Any*): Self = this.set("outEdges", js.Array(value :_*))
    @scala.inline
    def setOutEdges(value: js.Array[_]): Self = this.set("outEdges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutEdges: Self = this.set("outEdges", js.undefined)
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPaletteItem(value: NodesPaletteItem): Self = this.set("paletteItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaletteItem: Self = this.set("paletteItem", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPathData(value: String): Self = this.set("pathData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathData: Self = this.set("pathData", js.undefined)
    @scala.inline
    def setPhaseSize(value: Double): Self = this.set("phaseSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhaseSize: Self = this.set("phaseSize", js.undefined)
    @scala.inline
    def setPhasesVarargs(value: NodesPhase*): Self = this.set("phases", js.Array(value :_*))
    @scala.inline
    def setPhases(value: js.Array[NodesPhase]): Self = this.set("phases", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhases: Self = this.set("phases", js.undefined)
    @scala.inline
    def setPivot(value: js.Any): Self = this.set("pivot", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivot: Self = this.set("pivot", js.undefined)
    @scala.inline
    def setPointsVarargs(value: js.Any*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[_]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setPortsVarargs(value: NodesPort*): Self = this.set("ports", js.Array(value :_*))
    @scala.inline
    def setPorts(value: js.Array[NodesPort]): Self = this.set("ports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    @scala.inline
    def setRotateAngle(value: Double): Self = this.set("rotateAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateAngle: Self = this.set("rotateAngle", js.undefined)
    @scala.inline
    def setShadow(value: NodesShadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShape(value: BasicShapes | FlowShapes | BPMNShapes | UMLActivityShapes | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSubProcess(value: NodesSubProcess): Self = this.set("subProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubProcess: Self = this.set("subProcess", js.undefined)
    @scala.inline
    def setTask(value: NodesTask): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    @scala.inline
    def setTextBlock(value: js.Any): Self = this.set("textBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBlock: Self = this.set("textBlock", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTrigger(value: BPMNTriggers | String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setType(value: Shapes | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignment | String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZOrder(value: Double): Self = this.set("zOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZOrder: Self = this.set("zOrder", js.undefined)
  }
  
}


package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ConnectorConstraints")
@js.native
object ConnectorConstraints extends js.Object {
  //Allows the object to drop over the connector.
  @js.native
  sealed trait AllowDrop
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables or disables bridging over a connector, if bridging constraints disabled..
  @js.native
  sealed trait BridgeObstacle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables bridging to the connector
  @js.native
  sealed trait Bridging
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables the contrast between clean edges of connector over rendering speed and geometric precision
  @js.native
  sealed trait CrispEdges
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables all constraints
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables connector to be Deleted
  @js.native
  sealed trait Delete
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables connector to be Dragged
  @js.native
  sealed trait Drag
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables label of node to be Dragged
  @js.native
  sealed trait DragLabel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables the contrast between clean edges of connector over rendering speed and geometric precision
  @js.native
  sealed trait DragLimit
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables control point and end point of every segment in a connector for editing
  @js.native
  sealed trait DragSegmentThumb
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables connectors source end to be selected
  @js.native
  sealed trait DragSourceEnd
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables connectors target end to be selected
  @js.native
  sealed trait DragTargetEnd
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Inherit the bridging option defined in the diagram constraints.
  @js.native
  sealed trait InheritBridging
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables the contrast between clean edges of connector over rendering speed and geometric precision
  @js.native
  sealed trait InheritCrispEdges
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Inherit the routing option defined in the diagram constraints.
  @js.native
  sealed trait InheritRouting
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Inherit the tooltip option defined in the diagram constraints.
  @js.native
  sealed trait InheritTooltip
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables connector to be selected and dragged.
  @js.native
  sealed trait Interaction
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Disable all connector Constraints
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables user interaction to the connector
  @js.native
  sealed trait PointerEvents
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables the Routing for an connector
  @js.native
  sealed trait Routing
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  //Enables connector to be selected
  @js.native
  sealed trait Select
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints
  
  val AllowDrop: AllowDrop with java.lang.String = js.native
  val BridgeObstacle: BridgeObstacle with java.lang.String = js.native
  val Bridging: Bridging with java.lang.String = js.native
  val CrispEdges: CrispEdges with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Delete: Delete with java.lang.String = js.native
  val Drag: Drag with java.lang.String = js.native
  val DragLabel: DragLabel with java.lang.String = js.native
  val DragLimit: DragLimit with java.lang.String = js.native
  val DragSegmentThumb: DragSegmentThumb with java.lang.String = js.native
  val DragSourceEnd: DragSourceEnd with java.lang.String = js.native
  val DragTargetEnd: DragTargetEnd with java.lang.String = js.native
  val InheritBridging: InheritBridging with java.lang.String = js.native
  val InheritCrispEdges: InheritCrispEdges with java.lang.String = js.native
  val InheritRouting: InheritRouting with java.lang.String = js.native
  val InheritTooltip: InheritTooltip with java.lang.String = js.native
  val Interaction: Interaction with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val PointerEvents: PointerEvents with java.lang.String = js.native
  val Routing: Routing with java.lang.String = js.native
  val Select: Select with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints with java.lang.String
  ] = js.native
}


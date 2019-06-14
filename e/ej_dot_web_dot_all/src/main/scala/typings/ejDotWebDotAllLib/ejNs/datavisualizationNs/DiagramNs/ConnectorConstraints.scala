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
  
  /* 10 */ val AllowDrop: AllowDrop with scala.Double = js.native
  /* 16 */ val BridgeObstacle: BridgeObstacle with scala.Double = js.native
  /* 7 */ val Bridging: Bridging with scala.Double = js.native
  /* 13 */ val CrispEdges: CrispEdges with scala.Double = js.native
  /* 20 */ val Default: Default with scala.Double = js.native
  /* 2 */ val Delete: Delete with scala.Double = js.native
  /* 3 */ val Drag: Drag with scala.Double = js.native
  /* 8 */ val DragLabel: DragLabel with scala.Double = js.native
  /* 15 */ val DragLimit: DragLimit with scala.Double = js.native
  /* 6 */ val DragSegmentThumb: DragSegmentThumb with scala.Double = js.native
  /* 4 */ val DragSourceEnd: DragSourceEnd with scala.Double = js.native
  /* 5 */ val DragTargetEnd: DragTargetEnd with scala.Double = js.native
  /* 9 */ val InheritBridging: InheritBridging with scala.Double = js.native
  /* 14 */ val InheritCrispEdges: InheritCrispEdges with scala.Double = js.native
  /* 19 */ val InheritRouting: InheritRouting with scala.Double = js.native
  /* 11 */ val InheritTooltip: InheritTooltip with scala.Double = js.native
  /* 17 */ val Interaction: Interaction with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 12 */ val PointerEvents: PointerEvents with scala.Double = js.native
  /* 18 */ val Routing: Routing with scala.Double = js.native
  /* 1 */ val Select: Select with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.ConnectorConstraints with scala.Double
  ] = js.native
}


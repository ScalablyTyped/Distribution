package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait AllowDrop extends ConnectorConstraints
  
  //Enables or disables bridging over a connector, if bridging constraints disabled..
  @js.native
  sealed trait BridgeObstacle extends ConnectorConstraints
  
  //Enables bridging to the connector
  @js.native
  sealed trait Bridging extends ConnectorConstraints
  
  //Enables the contrast between clean edges of connector over rendering speed and geometric precision
  @js.native
  sealed trait CrispEdges extends ConnectorConstraints
  
  //Enables all constraints
  @js.native
  sealed trait Default extends ConnectorConstraints
  
  //Enables connector to be Deleted
  @js.native
  sealed trait Delete extends ConnectorConstraints
  
  //Enables connector to be Dragged
  @js.native
  sealed trait Drag extends ConnectorConstraints
  
  //Enables label of node to be Dragged
  @js.native
  sealed trait DragLabel extends ConnectorConstraints
  
  //Enables the contrast between clean edges of connector over rendering speed and geometric precision
  @js.native
  sealed trait DragLimit extends ConnectorConstraints
  
  //Enables control point and end point of every segment in a connector for editing
  @js.native
  sealed trait DragSegmentThumb extends ConnectorConstraints
  
  //Enables connectors source end to be selected
  @js.native
  sealed trait DragSourceEnd extends ConnectorConstraints
  
  //Enables connectors target end to be selected
  @js.native
  sealed trait DragTargetEnd extends ConnectorConstraints
  
  //Inherit the bridging option defined in the diagram constraints.
  @js.native
  sealed trait InheritBridging extends ConnectorConstraints
  
  //Enables the contrast between clean edges of connector over rendering speed and geometric precision
  @js.native
  sealed trait InheritCrispEdges extends ConnectorConstraints
  
  //Inherit the routing option defined in the diagram constraints.
  @js.native
  sealed trait InheritRouting extends ConnectorConstraints
  
  //Inherit the tooltip option defined in the diagram constraints.
  @js.native
  sealed trait InheritTooltip extends ConnectorConstraints
  
  //Enables connector to be selected and dragged.
  @js.native
  sealed trait Interaction extends ConnectorConstraints
  
  //Disable all connector Constraints
  @js.native
  sealed trait None extends ConnectorConstraints
  
  //Enables user interaction to the connector
  @js.native
  sealed trait PointerEvents extends ConnectorConstraints
  
  //Enables the Routing for an connector
  @js.native
  sealed trait Routing extends ConnectorConstraints
  
  //Enables connector to be selected
  @js.native
  sealed trait Select extends ConnectorConstraints
  
  /* 10 */ val AllowDrop: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.AllowDrop with Double = js.native
  /* 16 */ val BridgeObstacle: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.BridgeObstacle with Double = js.native
  /* 7 */ val Bridging: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.Bridging with Double = js.native
  /* 13 */ val CrispEdges: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.CrispEdges with Double = js.native
  /* 20 */ val Default: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.Default with Double = js.native
  /* 2 */ val Delete: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.Delete with Double = js.native
  /* 3 */ val Drag: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.Drag with Double = js.native
  /* 8 */ val DragLabel: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.DragLabel with Double = js.native
  /* 15 */ val DragLimit: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.DragLimit with Double = js.native
  /* 6 */ val DragSegmentThumb: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.DragSegmentThumb with Double = js.native
  /* 4 */ val DragSourceEnd: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.DragSourceEnd with Double = js.native
  /* 5 */ val DragTargetEnd: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.DragTargetEnd with Double = js.native
  /* 9 */ val InheritBridging: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritBridging with Double = js.native
  /* 14 */ val InheritCrispEdges: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritCrispEdges with Double = js.native
  /* 19 */ val InheritRouting: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritRouting with Double = js.native
  /* 11 */ val InheritTooltip: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.InheritTooltip with Double = js.native
  /* 17 */ val Interaction: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.Interaction with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.None with Double = js.native
  /* 12 */ val PointerEvents: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.PointerEvents with Double = js.native
  /* 18 */ val Routing: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.Routing with Double = js.native
  /* 1 */ val Select: typings.ejDotWebDotAll.ej.datavisualization.Diagram.ConnectorConstraints.Select with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectorConstraints with Double] = js.native
}


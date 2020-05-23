package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}


package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectorConstraints with Double] = js.native
  /* 10 */ @js.native
  object AllowDrop extends TopLevel[AllowDrop with Double]
  
  /* 16 */ @js.native
  object BridgeObstacle extends TopLevel[BridgeObstacle with Double]
  
  /* 7 */ @js.native
  object Bridging extends TopLevel[Bridging with Double]
  
  /* 13 */ @js.native
  object CrispEdges extends TopLevel[CrispEdges with Double]
  
  /* 20 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 3 */ @js.native
  object Drag extends TopLevel[Drag with Double]
  
  /* 8 */ @js.native
  object DragLabel extends TopLevel[DragLabel with Double]
  
  /* 15 */ @js.native
  object DragLimit extends TopLevel[DragLimit with Double]
  
  /* 6 */ @js.native
  object DragSegmentThumb extends TopLevel[DragSegmentThumb with Double]
  
  /* 4 */ @js.native
  object DragSourceEnd extends TopLevel[DragSourceEnd with Double]
  
  /* 5 */ @js.native
  object DragTargetEnd extends TopLevel[DragTargetEnd with Double]
  
  /* 9 */ @js.native
  object InheritBridging extends TopLevel[InheritBridging with Double]
  
  /* 14 */ @js.native
  object InheritCrispEdges extends TopLevel[InheritCrispEdges with Double]
  
  /* 19 */ @js.native
  object InheritRouting extends TopLevel[InheritRouting with Double]
  
  /* 11 */ @js.native
  object InheritTooltip extends TopLevel[InheritTooltip with Double]
  
  /* 17 */ @js.native
  object Interaction extends TopLevel[Interaction with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 12 */ @js.native
  object PointerEvents extends TopLevel[PointerEvents with Double]
  
  /* 18 */ @js.native
  object Routing extends TopLevel[Routing with Double]
  
  /* 1 */ @js.native
  object Select extends TopLevel[Select with Double]
  
}


package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.NodeConstraints")
@js.native
object NodeConstraints extends js.Object {
  //Enables panning should be done while node dragging
  @js.native
  sealed trait AllowPan extends NodeConstraints
  
  //Enables Proportional resize for node
  @js.native
  sealed trait AspectRatio extends NodeConstraints
  
  //Enables node to be connected
  @js.native
  sealed trait Connect extends NodeConstraints
  
  //Enables contrast between clean edges for the node over rendering speed and geometric precision
  @js.native
  sealed trait CrispEdges extends NodeConstraints
  
  //Enables default node interactions such as select,delete,drag,rotate,resize,connect,inheritCrispEdges and inheritTooltip
  @js.native
  sealed trait Default extends NodeConstraints
  
  //Enables node to be Deleted
  @js.native
  sealed trait Delete extends NodeConstraints
  
  //Enables node to be Dragged
  @js.native
  sealed trait Drag extends NodeConstraints
  
  //Enables label of node to be Dragged
  @js.native
  sealed trait DragLabel extends NodeConstraints
  
  //Disable all node Constraints
  @js.native
  sealed trait None extends NodeConstraints
  
  //Enables the user interaction with the node
  @js.native
  sealed trait PointerEvents extends NodeConstraints
  
  //Enables node to be Resized
  @js.native
  sealed trait Resize extends NodeConstraints
  
  //Enables node to be resize east
  @js.native
  sealed trait ResizeEast extends NodeConstraints
  
  //Enables node to be resize north
  @js.native
  sealed trait ResizeNorth extends NodeConstraints
  
  //Enables node to be resize north east
  @js.native
  sealed trait ResizeNorthEast extends NodeConstraints
  
  //Enables node to be resize north west
  @js.native
  sealed trait ResizeNorthWest extends NodeConstraints
  
  //Enables node to be resize south
  @js.native
  sealed trait ResizeSouth extends NodeConstraints
  
  //Enables node to be resize south east
  @js.native
  sealed trait ResizeSouthEast extends NodeConstraints
  
  //Enables node to be resize south west
  @js.native
  sealed trait ResizeSouthWest extends NodeConstraints
  
  //Enables node to be resize west
  @js.native
  sealed trait ResizeWest extends NodeConstraints
  
  //Enables node to be Rotated
  @js.native
  sealed trait Rotate extends NodeConstraints
  
  //Enables node to be selected
  @js.native
  sealed trait Select extends NodeConstraints
  
  //Enables shadow
  @js.native
  sealed trait Shadow extends NodeConstraints
  
  /* 17 */ val AllowPan: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.AllowPan with Double = js.native
  /* 18 */ val AspectRatio: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.AspectRatio with Double = js.native
  /* 5 */ val Connect: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Connect with Double = js.native
  /* 20 */ val CrispEdges: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.CrispEdges with Double = js.native
  /* 21 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Default with Double = js.native
  /* 2 */ val Delete: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Delete with Double = js.native
  /* 3 */ val Drag: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Drag with Double = js.native
  /* 16 */ val DragLabel: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.DragLabel with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.None with Double = js.native
  /* 19 */ val PointerEvents: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.PointerEvents with Double = js.native
  /* 14 */ val Resize: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Resize with Double = js.native
  /* 7 */ val ResizeEast: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeEast with Double = js.native
  /* 13 */ val ResizeNorth: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeNorth with Double = js.native
  /* 6 */ val ResizeNorthEast: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeNorthEast with Double = js.native
  /* 12 */ val ResizeNorthWest: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeNorthWest with Double = js.native
  /* 9 */ val ResizeSouth: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeSouth with Double = js.native
  /* 8 */ val ResizeSouthEast: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeSouthEast with Double = js.native
  /* 10 */ val ResizeSouthWest: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeSouthWest with Double = js.native
  /* 11 */ val ResizeWest: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.ResizeWest with Double = js.native
  /* 4 */ val Rotate: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Rotate with Double = js.native
  /* 1 */ val Select: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Select with Double = js.native
  /* 15 */ val Shadow: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.NodeConstraints.Shadow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeConstraints with Double] = js.native
}


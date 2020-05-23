package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}


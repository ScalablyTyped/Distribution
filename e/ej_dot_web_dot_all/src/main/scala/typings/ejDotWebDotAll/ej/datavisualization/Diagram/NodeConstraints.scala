package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeConstraints with Double] = js.native
  /* 17 */ @js.native
  object AllowPan extends TopLevel[AllowPan with Double]
  
  /* 18 */ @js.native
  object AspectRatio extends TopLevel[AspectRatio with Double]
  
  /* 5 */ @js.native
  object Connect extends TopLevel[Connect with Double]
  
  /* 20 */ @js.native
  object CrispEdges extends TopLevel[CrispEdges with Double]
  
  /* 21 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 3 */ @js.native
  object Drag extends TopLevel[Drag with Double]
  
  /* 16 */ @js.native
  object DragLabel extends TopLevel[DragLabel with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 19 */ @js.native
  object PointerEvents extends TopLevel[PointerEvents with Double]
  
  /* 14 */ @js.native
  object Resize extends TopLevel[Resize with Double]
  
  /* 7 */ @js.native
  object ResizeEast extends TopLevel[ResizeEast with Double]
  
  /* 13 */ @js.native
  object ResizeNorth extends TopLevel[ResizeNorth with Double]
  
  /* 6 */ @js.native
  object ResizeNorthEast extends TopLevel[ResizeNorthEast with Double]
  
  /* 12 */ @js.native
  object ResizeNorthWest extends TopLevel[ResizeNorthWest with Double]
  
  /* 9 */ @js.native
  object ResizeSouth extends TopLevel[ResizeSouth with Double]
  
  /* 8 */ @js.native
  object ResizeSouthEast extends TopLevel[ResizeSouthEast with Double]
  
  /* 10 */ @js.native
  object ResizeSouthWest extends TopLevel[ResizeSouthWest with Double]
  
  /* 11 */ @js.native
  object ResizeWest extends TopLevel[ResizeWest with Double]
  
  /* 4 */ @js.native
  object Rotate extends TopLevel[Rotate with Double]
  
  /* 1 */ @js.native
  object Select extends TopLevel[Select with Double]
  
  /* 15 */ @js.native
  object Shadow extends TopLevel[Shadow with Double]
  
}


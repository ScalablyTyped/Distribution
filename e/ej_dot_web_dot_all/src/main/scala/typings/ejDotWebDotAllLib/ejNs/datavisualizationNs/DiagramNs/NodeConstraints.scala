package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait AllowPan
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables Proportional resize for node
  @js.native
  sealed trait AspectRatio
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be connected
  @js.native
  sealed trait Connect
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables contrast between clean edges for the node over rendering speed and geometric precision
  @js.native
  sealed trait CrispEdges
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables default node interactions such as select,delete,drag,rotate,resize,connect,inheritCrispEdges and inheritTooltip
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be Deleted
  @js.native
  sealed trait Delete
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be Dragged
  @js.native
  sealed trait Drag
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables label of node to be Dragged
  @js.native
  sealed trait DragLabel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Disable all node Constraints
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables the user interaction with the node
  @js.native
  sealed trait PointerEvents
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be Resized
  @js.native
  sealed trait Resize
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize east
  @js.native
  sealed trait ResizeEast
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize north
  @js.native
  sealed trait ResizeNorth
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize north east
  @js.native
  sealed trait ResizeNorthEast
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize north west
  @js.native
  sealed trait ResizeNorthWest
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize south
  @js.native
  sealed trait ResizeSouth
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize south east
  @js.native
  sealed trait ResizeSouthEast
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize south west
  @js.native
  sealed trait ResizeSouthWest
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be resize west
  @js.native
  sealed trait ResizeWest
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be Rotated
  @js.native
  sealed trait Rotate
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables node to be selected
  @js.native
  sealed trait Select
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  //Enables shadow
  @js.native
  sealed trait Shadow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints
  
  /* 17 */ val AllowPan: AllowPan with scala.Double = js.native
  /* 18 */ val AspectRatio: AspectRatio with scala.Double = js.native
  /* 5 */ val Connect: Connect with scala.Double = js.native
  /* 20 */ val CrispEdges: CrispEdges with scala.Double = js.native
  /* 21 */ val Default: Default with scala.Double = js.native
  /* 2 */ val Delete: Delete with scala.Double = js.native
  /* 3 */ val Drag: Drag with scala.Double = js.native
  /* 16 */ val DragLabel: DragLabel with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 19 */ val PointerEvents: PointerEvents with scala.Double = js.native
  /* 14 */ val Resize: Resize with scala.Double = js.native
  /* 7 */ val ResizeEast: ResizeEast with scala.Double = js.native
  /* 13 */ val ResizeNorth: ResizeNorth with scala.Double = js.native
  /* 6 */ val ResizeNorthEast: ResizeNorthEast with scala.Double = js.native
  /* 12 */ val ResizeNorthWest: ResizeNorthWest with scala.Double = js.native
  /* 9 */ val ResizeSouth: ResizeSouth with scala.Double = js.native
  /* 8 */ val ResizeSouthEast: ResizeSouthEast with scala.Double = js.native
  /* 10 */ val ResizeSouthWest: ResizeSouthWest with scala.Double = js.native
  /* 11 */ val ResizeWest: ResizeWest with scala.Double = js.native
  /* 4 */ val Rotate: Rotate with scala.Double = js.native
  /* 1 */ val Select: Select with scala.Double = js.native
  /* 15 */ val Shadow: Shadow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints with scala.Double
  ] = js.native
}


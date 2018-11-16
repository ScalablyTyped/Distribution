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
  
  val AllowPan: AllowPan with java.lang.String = js.native
  val AspectRatio: AspectRatio with java.lang.String = js.native
  val Connect: Connect with java.lang.String = js.native
  val CrispEdges: CrispEdges with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Delete: Delete with java.lang.String = js.native
  val Drag: Drag with java.lang.String = js.native
  val DragLabel: DragLabel with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val PointerEvents: PointerEvents with java.lang.String = js.native
  val Resize: Resize with java.lang.String = js.native
  val ResizeEast: ResizeEast with java.lang.String = js.native
  val ResizeNorth: ResizeNorth with java.lang.String = js.native
  val ResizeNorthEast: ResizeNorthEast with java.lang.String = js.native
  val ResizeNorthWest: ResizeNorthWest with java.lang.String = js.native
  val ResizeSouth: ResizeSouth with java.lang.String = js.native
  val ResizeSouthEast: ResizeSouthEast with java.lang.String = js.native
  val ResizeSouthWest: ResizeSouthWest with java.lang.String = js.native
  val ResizeWest: ResizeWest with java.lang.String = js.native
  val Rotate: Rotate with java.lang.String = js.native
  val Select: Select with java.lang.String = js.native
  val Shadow: Shadow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.NodeConstraints with java.lang.String
  ] = js.native
}


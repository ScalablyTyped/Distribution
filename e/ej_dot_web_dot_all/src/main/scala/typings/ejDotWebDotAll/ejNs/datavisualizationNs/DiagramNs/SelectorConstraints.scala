package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectorConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.SelectorConstraints")
@js.native
object SelectorConstraints extends js.Object {
  //Sets the visibility of all selection handles as visible
  @js.native
  sealed trait All extends SelectorConstraints
  
  //Show/Hide the selection handles when it is overlapped with each other's.
  @js.native
  sealed trait AutoHideThumbs extends SelectorConstraints
  
  //Enables dragging while selecting the multiple nodes and click on the empty region of the selection rectangle.
  @js.native
  sealed trait DragOnEmptySpace extends SelectorConstraints
  
  //Hides the selector
  @js.native
  sealed trait None extends SelectorConstraints
  
  //Sets the visibility of resize handles as visible
  @js.native
  sealed trait Resizer extends SelectorConstraints
  
  //Sets the visibility of rotation handle as visible
  @js.native
  sealed trait Rotator extends SelectorConstraints
  
  //Enables the default tooltip of the diagram control.
  @js.native
  sealed trait Tooltip extends SelectorConstraints
  
  //Sets the visibility of user handles as visible
  @js.native
  sealed trait UserHandles extends SelectorConstraints
  
  /* 7 */ val All: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.All with Double = js.native
  /* 6 */ val AutoHideThumbs: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.AutoHideThumbs with Double = js.native
  /* 5 */ val DragOnEmptySpace: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.DragOnEmptySpace with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.None with Double = js.native
  /* 2 */ val Resizer: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.Resizer with Double = js.native
  /* 1 */ val Rotator: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.Rotator with Double = js.native
  /* 4 */ val Tooltip: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.Tooltip with Double = js.native
  /* 3 */ val UserHandles: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints.UserHandles with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectorConstraints with Double] = js.native
}


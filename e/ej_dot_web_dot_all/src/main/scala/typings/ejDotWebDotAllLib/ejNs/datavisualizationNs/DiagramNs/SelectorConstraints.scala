package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  //Show/Hide the selection handles when it is overlapped with each other's.
  @js.native
  sealed trait AutoHideThumbs
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  //Enables dragging while selecting the multiple nodes and click on the empty region of the selection rectangle.
  @js.native
  sealed trait DragOnEmptySpace
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  //Hides the selector
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  //Sets the visibility of resize handles as visible
  @js.native
  sealed trait Resizer
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  //Sets the visibility of rotation handle as visible
  @js.native
  sealed trait Rotator
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  //Enables the default tooltip of the diagram control.
  @js.native
  sealed trait Tooltip
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  //Sets the visibility of user handles as visible
  @js.native
  sealed trait UserHandles
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints
  
  val All: All with java.lang.String = js.native
  val AutoHideThumbs: AutoHideThumbs with java.lang.String = js.native
  val DragOnEmptySpace: DragOnEmptySpace with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Resizer: Resizer with java.lang.String = js.native
  val Rotator: Rotator with java.lang.String = js.native
  val Tooltip: Tooltip with java.lang.String = js.native
  val UserHandles: UserHandles with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SelectorConstraints with java.lang.String
  ] = js.native
}


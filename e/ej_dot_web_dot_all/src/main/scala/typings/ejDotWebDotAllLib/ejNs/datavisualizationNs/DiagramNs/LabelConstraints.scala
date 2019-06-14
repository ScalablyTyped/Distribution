package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LabelConstraints")
@js.native
object LabelConstraints extends js.Object {
  //Enables all label constraints
  @js.native
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints
  
  //Enables label to be Dragged
  @js.native
  sealed trait Draggable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints
  
  //Disable all label Constraints
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints
  
  //Enables label to be Resized
  @js.native
  sealed trait Resizable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints
  
  //Enables label to be Rotated
  @js.native
  sealed trait Rotatable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints
  
  //Enables label to be selected
  @js.native
  sealed trait Selectable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints
  
  /* 5 */ val All: All with scala.Double = js.native
  /* 2 */ val Draggable: Draggable with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Resizable: Resizable with scala.Double = js.native
  /* 4 */ val Rotatable: Rotatable with scala.Double = js.native
  /* 1 */ val Selectable: Selectable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints with scala.Double
  ] = js.native
}


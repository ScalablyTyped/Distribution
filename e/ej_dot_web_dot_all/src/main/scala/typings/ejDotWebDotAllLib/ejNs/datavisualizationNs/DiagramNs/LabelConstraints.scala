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
  
  val All: All with java.lang.String = js.native
  val Draggable: Draggable with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Resizable: Resizable with java.lang.String = js.native
  val Rotatable: Rotatable with java.lang.String = js.native
  val Selectable: Selectable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelConstraints with java.lang.String
  ] = js.native
}


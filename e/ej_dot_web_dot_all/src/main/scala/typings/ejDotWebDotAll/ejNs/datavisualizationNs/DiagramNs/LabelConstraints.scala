package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait All extends LabelConstraints
  
  //Enables label to be Dragged
  @js.native
  sealed trait Draggable extends LabelConstraints
  
  //Disable all label Constraints
  @js.native
  sealed trait None extends LabelConstraints
  
  //Enables label to be Resized
  @js.native
  sealed trait Resizable extends LabelConstraints
  
  //Enables label to be Rotated
  @js.native
  sealed trait Rotatable extends LabelConstraints
  
  //Enables label to be selected
  @js.native
  sealed trait Selectable extends LabelConstraints
  
  /* 5 */ val All: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelConstraints.All with Double = js.native
  /* 2 */ val Draggable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelConstraints.Draggable with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelConstraints.None with Double = js.native
  /* 3 */ val Resizable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelConstraints.Resizable with Double = js.native
  /* 4 */ val Rotatable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelConstraints.Rotatable with Double = js.native
  /* 1 */ val Selectable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelConstraints.Selectable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelConstraints with Double] = js.native
}


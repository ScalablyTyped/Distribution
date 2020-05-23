package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}


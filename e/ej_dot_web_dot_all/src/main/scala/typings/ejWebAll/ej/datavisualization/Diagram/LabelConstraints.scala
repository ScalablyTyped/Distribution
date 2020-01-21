package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelConstraints with Double] = js.native
  /* 5 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Draggable extends TopLevel[Draggable with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Resizable extends TopLevel[Resizable with Double]
  
  /* 4 */ @js.native
  object Rotatable extends TopLevel[Rotatable with Double]
  
  /* 1 */ @js.native
  object Selectable extends TopLevel[Selectable with Double]
  
}


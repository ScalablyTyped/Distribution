package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActiveTool extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ActiveTool")
@js.native
object ActiveTool extends js.Object {
  //Activate the port tool to drag when the mouse is moved over the port
  @js.native
  sealed trait Drag extends ActiveTool
  
  //Activate the draw tool to draw when the mouse is moved over the port
  @js.native
  sealed trait Draw extends ActiveTool
  
  //Set the default Tool
  @js.native
  sealed trait None extends ActiveTool
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActiveTool with Double] = js.native
  /* 1 */ @js.native
  object Drag extends TopLevel[Drag with Double]
  
  /* 2 */ @js.native
  object Draw extends TopLevel[Draw with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}


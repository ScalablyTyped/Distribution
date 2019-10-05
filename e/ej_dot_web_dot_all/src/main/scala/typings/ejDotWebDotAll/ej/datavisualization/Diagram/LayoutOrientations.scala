package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayoutOrientations extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LayoutOrientations")
@js.native
object LayoutOrientations extends js.Object {
  //Used to set LayoutOrientation from bottom to top
  @js.native
  sealed trait BottomToTop extends LayoutOrientations
  
  //Used to set LayoutOrientation from left to right
  @js.native
  sealed trait LeftToRight extends LayoutOrientations
  
  //Used to set LayoutOrientation from right to left
  @js.native
  sealed trait RightToLeft extends LayoutOrientations
  
  //Used to set LayoutOrientation from top to bottom
  @js.native
  sealed trait TopToBottom extends LayoutOrientations
  
  /* 1 */ val BottomToTop: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutOrientations.BottomToTop with Double = js.native
  /* 2 */ val LeftToRight: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutOrientations.LeftToRight with Double = js.native
  /* 3 */ val RightToLeft: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutOrientations.RightToLeft with Double = js.native
  /* 0 */ val TopToBottom: typings.ejDotWebDotAll.ej.datavisualization.Diagram.LayoutOrientations.TopToBottom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayoutOrientations with Double] = js.native
}


package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayoutOrientations with Double] = js.native
  /* 1 */ @js.native
  object BottomToTop extends TopLevel[BottomToTop with Double]
  
  /* 2 */ @js.native
  object LeftToRight extends TopLevel[LeftToRight with Double]
  
  /* 3 */ @js.native
  object RightToLeft extends TopLevel[RightToLeft with Double]
  
  /* 0 */ @js.native
  object TopToBottom extends TopLevel[TopToBottom with Double]
  
}


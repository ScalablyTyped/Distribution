package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GridLines extends js.Object

@JSGlobal("ej.Grid.GridLines")
@js.native
object GridLines extends js.Object {
  ///Displays both the horizontal and vertical grid lines.
  @js.native
  sealed trait Both extends GridLines
  
  ///Displays the horizontal grid lines only.
  @js.native
  sealed trait Horizontal extends GridLines
  
  ///No grid lines are displayed.
  @js.native
  sealed trait None extends GridLines
  
  ///Displays the vertical grid lines only.
  @js.native
  sealed trait Vertical extends GridLines
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GridLines with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 1 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}


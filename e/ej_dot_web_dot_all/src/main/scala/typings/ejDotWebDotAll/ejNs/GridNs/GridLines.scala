package typings.ejDotWebDotAll.ejNs.GridNs

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
  
  /* 0 */ val Both: typings.ejDotWebDotAll.ejNs.GridNs.GridLines.Both with Double = js.native
  /* 1 */ val Horizontal: typings.ejDotWebDotAll.ejNs.GridNs.GridLines.Horizontal with Double = js.native
  /* 3 */ val None: typings.ejDotWebDotAll.ejNs.GridNs.GridLines.None with Double = js.native
  /* 2 */ val Vertical: typings.ejDotWebDotAll.ejNs.GridNs.GridLines.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GridLines with Double] = js.native
}


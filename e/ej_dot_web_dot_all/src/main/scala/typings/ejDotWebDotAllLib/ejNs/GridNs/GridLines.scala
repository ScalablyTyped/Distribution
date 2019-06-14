package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.GridNs.GridLines
  
  ///Displays the horizontal grid lines only.
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.GridNs.GridLines
  
  ///No grid lines are displayed.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.GridNs.GridLines
  
  ///Displays the vertical grid lines only.
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.GridNs.GridLines
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 1 */ val Horizontal: Horizontal with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  /* 2 */ val Vertical: Vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.GridLines with scala.Double] = js.native
}


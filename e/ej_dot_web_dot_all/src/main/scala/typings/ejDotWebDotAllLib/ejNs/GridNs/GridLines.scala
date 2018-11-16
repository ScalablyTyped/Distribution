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
  
  val Both: Both with java.lang.String = js.native
  val Horizontal: Horizontal with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.GridLines with java.lang.String] = js.native
}


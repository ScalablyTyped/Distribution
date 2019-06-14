package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("ej.Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.Orientation
  
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.Orientation
  
  /* 0 */ val Horizontal: Horizontal with scala.Double = js.native
  /* 1 */ val Vertical: Vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation with scala.Double] = js.native
}


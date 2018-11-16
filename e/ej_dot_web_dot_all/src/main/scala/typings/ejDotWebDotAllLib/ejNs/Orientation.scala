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
  
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation with java.lang.String] = js.native
}


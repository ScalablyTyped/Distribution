package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualScrollMode extends js.Object

@JSGlobal("ej.Grid.VirtualScrollMode")
@js.native
object VirtualScrollMode extends js.Object {
  ///virtual scroll mode is continuous.
  @js.native
  sealed trait Continuous
    extends ejDotWebDotAllLib.ejNs.GridNs.VirtualScrollMode
  
  ///virtual scroll mode is normal.
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.GridNs.VirtualScrollMode
  
  /* 1 */ val Continuous: Continuous with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.VirtualScrollMode with scala.Double] = js.native
}


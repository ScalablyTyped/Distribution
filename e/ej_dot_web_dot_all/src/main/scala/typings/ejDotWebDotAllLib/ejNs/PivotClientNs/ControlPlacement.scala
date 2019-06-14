package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlPlacement extends js.Object

@JSGlobal("ej.PivotClient.ControlPlacement")
@js.native
object ControlPlacement extends js.Object {
  ///Displays PivotChart and PivotGrid widgets in separate tabs.
  @js.native
  sealed trait Tab
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.ControlPlacement
  
  ///Displays PivotChart and PivotGrid widgets one above the other.
  @js.native
  sealed trait Tile
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.ControlPlacement
  
  /* 0 */ val Tab: Tab with scala.Double = js.native
  /* 1 */ val Tile: Tile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotClientNs.ControlPlacement with scala.Double] = js.native
}


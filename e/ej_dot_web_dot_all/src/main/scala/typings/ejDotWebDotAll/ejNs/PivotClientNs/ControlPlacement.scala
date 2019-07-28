package typings.ejDotWebDotAll.ejNs.PivotClientNs

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
  sealed trait Tab extends ControlPlacement
  
  ///Displays PivotChart and PivotGrid widgets one above the other.
  @js.native
  sealed trait Tile extends ControlPlacement
  
  /* 0 */ val Tab: typings.ejDotWebDotAll.ejNs.PivotClientNs.ControlPlacement.Tab with Double = js.native
  /* 1 */ val Tile: typings.ejDotWebDotAll.ejNs.PivotClientNs.ControlPlacement.Tile with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlPlacement with Double] = js.native
}


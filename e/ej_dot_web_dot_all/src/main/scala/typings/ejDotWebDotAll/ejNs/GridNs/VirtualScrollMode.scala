package typings.ejDotWebDotAll.ejNs.GridNs

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
    extends typings.ejDotWebDotAll.ejNs.GridNs.VirtualScrollMode
  
  ///virtual scroll mode is normal.
  @js.native
  sealed trait Normal
    extends typings.ejDotWebDotAll.ejNs.GridNs.VirtualScrollMode
  
  /* 1 */ val Continuous: typings.ejDotWebDotAll.ejNs.GridNs.VirtualScrollMode.Continuous with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ejNs.GridNs.VirtualScrollMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.GridNs.VirtualScrollMode with Double] = js.native
}


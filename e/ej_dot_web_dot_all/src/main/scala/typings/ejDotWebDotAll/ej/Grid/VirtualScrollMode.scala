package typings.ejDotWebDotAll.ej.Grid

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
    extends typings.ejDotWebDotAll.ej.Grid.VirtualScrollMode
  
  ///virtual scroll mode is normal.
  @js.native
  sealed trait Normal
    extends typings.ejDotWebDotAll.ej.Grid.VirtualScrollMode
  
  /* 1 */ val Continuous: typings.ejDotWebDotAll.ej.Grid.VirtualScrollMode.Continuous with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.Grid.VirtualScrollMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Grid.VirtualScrollMode with Double] = js.native
}


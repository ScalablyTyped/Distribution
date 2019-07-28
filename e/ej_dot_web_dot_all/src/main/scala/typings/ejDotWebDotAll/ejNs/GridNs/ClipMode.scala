package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClipMode extends js.Object

@JSGlobal("ej.Grid.ClipMode")
@js.native
object ClipMode extends js.Object {
  ///Truncate the text in the cell
  @js.native
  sealed trait Clip extends ClipMode
  
  ///Shows ellipsis for the overflown cell.
  @js.native
  sealed trait Ellipsis extends ClipMode
  
  ///Shows ellipsis and tooltip for the overflown cell.
  @js.native
  sealed trait EllipsisWithTooltip extends ClipMode
  
  /* 1 */ val Clip: typings.ejDotWebDotAll.ejNs.GridNs.ClipMode.Clip with Double = js.native
  /* 0 */ val Ellipsis: typings.ejDotWebDotAll.ejNs.GridNs.ClipMode.Ellipsis with Double = js.native
  /* 2 */ val EllipsisWithTooltip: typings.ejDotWebDotAll.ejNs.GridNs.ClipMode.EllipsisWithTooltip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClipMode with Double] = js.native
}


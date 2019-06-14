package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Clip
    extends ejDotWebDotAllLib.ejNs.GridNs.ClipMode
  
  ///Shows ellipsis for the overflown cell.
  @js.native
  sealed trait Ellipsis
    extends ejDotWebDotAllLib.ejNs.GridNs.ClipMode
  
  ///Shows ellipsis and tooltip for the overflown cell.
  @js.native
  sealed trait EllipsisWithTooltip
    extends ejDotWebDotAllLib.ejNs.GridNs.ClipMode
  
  /* 1 */ val Clip: Clip with scala.Double = js.native
  /* 0 */ val Ellipsis: Ellipsis with scala.Double = js.native
  /* 2 */ val EllipsisWithTooltip: EllipsisWithTooltip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.ClipMode with scala.Double] = js.native
}


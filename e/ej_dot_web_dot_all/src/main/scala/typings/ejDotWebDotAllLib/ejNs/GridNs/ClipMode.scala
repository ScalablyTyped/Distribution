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
  
  val Clip: Clip with java.lang.String = js.native
  val Ellipsis: Ellipsis with java.lang.String = js.native
  val EllipsisWithTooltip: EllipsisWithTooltip with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.ClipMode with java.lang.String] = js.native
}


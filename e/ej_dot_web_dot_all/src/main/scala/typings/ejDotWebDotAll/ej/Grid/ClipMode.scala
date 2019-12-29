package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClipMode with Double] = js.native
  /* 1 */ @js.native
  object Clip extends TopLevel[Clip with Double]
  
  /* 0 */ @js.native
  object Ellipsis extends TopLevel[Ellipsis with Double]
  
  /* 2 */ @js.native
  object EllipsisWithTooltip extends TopLevel[EllipsisWithTooltip with Double]
  
}


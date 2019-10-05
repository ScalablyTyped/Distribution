package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClipMode extends js.Object

@JSGlobal("ej.TreeGrid.ClipMode")
@js.native
object ClipMode extends js.Object {
  ///Truncate the text in the cell.
  @js.native
  sealed trait Clip extends ClipMode
  
  ///Shows ellipsis for the overflown cell.
  @js.native
  sealed trait Ellipsis extends ClipMode
  
  /* 1 */ val Clip: typings.ejDotWebDotAll.ej.TreeGrid.ClipMode.Clip with Double = js.native
  /* 0 */ val Ellipsis: typings.ejDotWebDotAll.ej.TreeGrid.ClipMode.Ellipsis with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClipMode with Double] = js.native
}


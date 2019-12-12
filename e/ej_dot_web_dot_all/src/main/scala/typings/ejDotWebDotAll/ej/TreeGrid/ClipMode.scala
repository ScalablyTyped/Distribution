package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.ClipMode.Clip
import typings.ejDotWebDotAll.ej.TreeGrid.ClipMode.Ellipsis
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClipMode with Double] = js.native
  /* 1 */ @js.native
  object Clip extends TopLevel[Clip with Double]
  
  /* 0 */ @js.native
  object Ellipsis extends TopLevel[Ellipsis with Double]
  
}


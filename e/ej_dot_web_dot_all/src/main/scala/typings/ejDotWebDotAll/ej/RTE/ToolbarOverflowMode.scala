package typings.ejDotWebDotAll.ej.RTE

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.RTE.ToolbarOverflowMode.Inline
import typings.ejDotWebDotAll.ej.RTE.ToolbarOverflowMode.Popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarOverflowMode extends js.Object

@JSGlobal("ej.RTE.ToolbarOverflowMode")
@js.native
object ToolbarOverflowMode extends js.Object {
  ///To display the RTE toolbar overflow items as inline toolbar
  @js.native
  sealed trait Inline extends ToolbarOverflowMode
  
  ///To display the RTE toolbar overflow items as popup
  @js.native
  sealed trait Popup extends ToolbarOverflowMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarOverflowMode with Double] = js.native
  /* 1 */ @js.native
  object Inline extends TopLevel[Inline with Double]
  
  /* 0 */ @js.native
  object Popup extends TopLevel[Popup with Double]
  
}


package typings.ejDotWebDotAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CloseMode extends js.Object

@JSGlobal("ej.Tooltip.CloseMode")
@js.native
object CloseMode extends js.Object {
  ///Sets the delay for Tooltip close
  @js.native
  sealed trait Auto extends CloseMode
  
  ///The Tooltip will be display normally.
  @js.native
  sealed trait None extends CloseMode
  
  ///Enables close button in Tooltip.
  @js.native
  sealed trait Sticky extends CloseMode
  
  /* 1 */ val Auto: typings.ejDotWebDotAll.ej.Tooltip.CloseMode.Auto with Double = js.native
  /* 2 */ val None: typings.ejDotWebDotAll.ej.Tooltip.CloseMode.None with Double = js.native
  /* 0 */ val Sticky: typings.ejDotWebDotAll.ej.Tooltip.CloseMode.Sticky with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseMode with Double] = js.native
}


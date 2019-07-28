package typings.ejDotWebDotAll.ejNs.TooltipNs

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
  
  /* 1 */ val Auto: typings.ejDotWebDotAll.ejNs.TooltipNs.CloseMode.Auto with Double = js.native
  /* 2 */ val None: typings.ejDotWebDotAll.ejNs.TooltipNs.CloseMode.None with Double = js.native
  /* 0 */ val Sticky: typings.ejDotWebDotAll.ejNs.TooltipNs.CloseMode.Sticky with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseMode with Double] = js.native
}


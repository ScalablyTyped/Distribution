package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

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
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.TooltipNs.CloseMode
  
  ///The Tooltip will be display normally.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.TooltipNs.CloseMode
  
  ///Enables close button in Tooltip.
  @js.native
  sealed trait Sticky
    extends ejDotWebDotAllLib.ejNs.TooltipNs.CloseMode
  
  /* 1 */ val Auto: Auto with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 0 */ val Sticky: Sticky with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.CloseMode with scala.Double] = js.native
}


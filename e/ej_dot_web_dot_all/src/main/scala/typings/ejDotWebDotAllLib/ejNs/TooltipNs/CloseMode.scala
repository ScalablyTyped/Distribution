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
  
  val Auto: Auto with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Sticky: Sticky with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.CloseMode with java.lang.String] = js.native
}


package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Associate extends js.Object

@JSGlobal("ej.Tooltip.Associate")
@js.native
object Associate extends js.Object {
  ///Sets the position related to (x,y) co-ordinates.
  @js.native
  sealed trait Axis
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Associate
  
  ///Sets the position related to mouse, first entry to the target element.
  @js.native
  sealed trait MouseEnter
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Associate
  
  ///Sets the position related to mouse.
  @js.native
  sealed trait MouseFollow
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Associate
  
  ///Sets the position related to target element.
  @js.native
  sealed trait Target
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Associate
  
  ///Sets the position related to browser window.
  @js.native
  sealed trait Window
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Associate
  
  /* 3 */ val Axis: Axis with scala.Double = js.native
  /* 2 */ val MouseEnter: MouseEnter with scala.Double = js.native
  /* 1 */ val MouseFollow: MouseFollow with scala.Double = js.native
  /* 0 */ val Target: Target with scala.Double = js.native
  /* 4 */ val Window: Window with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.Associate with scala.Double] = js.native
}


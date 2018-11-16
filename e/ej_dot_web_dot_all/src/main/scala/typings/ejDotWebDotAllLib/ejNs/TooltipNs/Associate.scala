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
  
  val Axis: Axis with java.lang.String = js.native
  val MouseEnter: MouseEnter with java.lang.String = js.native
  val MouseFollow: MouseFollow with java.lang.String = js.native
  val Target: Target with java.lang.String = js.native
  val Window: Window with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.Associate with java.lang.String] = js.native
}


package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait effect extends js.Object

@JSGlobal("ej.Tooltip.effect")
@js.native
object effect extends js.Object {
  ///Fade the Tooltip in and out of visibility.
  @js.native
  sealed trait Fade
    extends ejDotWebDotAllLib.ejNs.TooltipNs.effect
  
  ///No animation takes place when showing/hiding the Tooltip
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.TooltipNs.effect
  
  ///Sliding effect takes place when showing/hiding the Tooltip
  @js.native
  sealed trait Slide
    extends ejDotWebDotAllLib.ejNs.TooltipNs.effect
  
  /* 2 */ val Fade: Fade with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Slide: Slide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.effect with scala.Double] = js.native
}


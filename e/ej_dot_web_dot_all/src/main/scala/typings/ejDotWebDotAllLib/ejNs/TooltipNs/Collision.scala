package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Collision extends js.Object

@JSGlobal("ej.Tooltip.Collision")
@js.native
object Collision extends js.Object {
  ///Shift the Tooltip popup away from the edge of the window(collision side) that means adjacent position.
  @js.native
  sealed trait Fit
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Collision
  
  ///Flips the Tooltip to the opposite side of the target, if collision is occurs.
  @js.native
  sealed trait Flip
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Collision
  
  ///Ensure as much of the element is visible as possible to showcase.
  @js.native
  sealed trait FlipFit
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Collision
  
  ///No collision detection is take place
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Collision
  
  /* 1 */ val Fit: Fit with scala.Double = js.native
  /* 0 */ val Flip: Flip with scala.Double = js.native
  /* 2 */ val FlipFit: FlipFit with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.Collision with scala.Double] = js.native
}


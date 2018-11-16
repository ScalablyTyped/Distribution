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
  
  val Fit: Fit with java.lang.String = js.native
  val Flip: Flip with java.lang.String = js.native
  val FlipFit: FlipFit with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.Collision with java.lang.String] = js.native
}


package typings.ejDotWebDotAll.ejNs.TooltipNs

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
  sealed trait Fit extends Collision
  
  ///Flips the Tooltip to the opposite side of the target, if collision is occurs.
  @js.native
  sealed trait Flip extends Collision
  
  ///Ensure as much of the element is visible as possible to showcase.
  @js.native
  sealed trait FlipFit extends Collision
  
  ///No collision detection is take place
  @js.native
  sealed trait None extends Collision
  
  /* 1 */ val Fit: typings.ejDotWebDotAll.ejNs.TooltipNs.Collision.Fit with Double = js.native
  /* 0 */ val Flip: typings.ejDotWebDotAll.ejNs.TooltipNs.Collision.Flip with Double = js.native
  /* 2 */ val FlipFit: typings.ejDotWebDotAll.ejNs.TooltipNs.Collision.FlipFit with Double = js.native
  /* 3 */ val None: typings.ejDotWebDotAll.ejNs.TooltipNs.Collision.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Collision with Double] = js.native
}


package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

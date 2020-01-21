package typings.ejWebAll.ej.Tooltip

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Axis extends Associate
  
  ///Sets the position related to mouse, first entry to the target element.
  @js.native
  sealed trait MouseEnter extends Associate
  
  ///Sets the position related to mouse.
  @js.native
  sealed trait MouseFollow extends Associate
  
  ///Sets the position related to target element.
  @js.native
  sealed trait Target extends Associate
  
  ///Sets the position related to browser window.
  @js.native
  sealed trait Window extends Associate
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Associate with Double] = js.native
  /* 3 */ @js.native
  object Axis extends TopLevel[Axis with Double]
  
  /* 2 */ @js.native
  object MouseEnter extends TopLevel[MouseEnter with Double]
  
  /* 1 */ @js.native
  object MouseFollow extends TopLevel[MouseFollow with Double]
  
  /* 0 */ @js.native
  object Target extends TopLevel[Target with Double]
  
  /* 4 */ @js.native
  object Window extends TopLevel[Window with Double]
  
}


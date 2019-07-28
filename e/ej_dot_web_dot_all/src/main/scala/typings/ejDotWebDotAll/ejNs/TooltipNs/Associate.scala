package typings.ejDotWebDotAll.ejNs.TooltipNs

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
  
  /* 3 */ val Axis: typings.ejDotWebDotAll.ejNs.TooltipNs.Associate.Axis with Double = js.native
  /* 2 */ val MouseEnter: typings.ejDotWebDotAll.ejNs.TooltipNs.Associate.MouseEnter with Double = js.native
  /* 1 */ val MouseFollow: typings.ejDotWebDotAll.ejNs.TooltipNs.Associate.MouseFollow with Double = js.native
  /* 0 */ val Target: typings.ejDotWebDotAll.ejNs.TooltipNs.Associate.Target with Double = js.native
  /* 4 */ val Window: typings.ejDotWebDotAll.ejNs.TooltipNs.Associate.Window with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Associate with Double] = js.native
}


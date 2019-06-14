package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Trigger extends js.Object

@JSGlobal("ej.Tooltip.Trigger")
@js.native
object Trigger extends js.Object {
  ///The Tooltip to be shown when the target element is clicked.
  @js.native
  sealed trait Click
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Trigger
  
  ///Enables the Tooltip when focus is set to target element.
  @js.native
  sealed trait Focus
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Trigger
  
  ///Enables the Tooltip when hover on the target element.
  @js.native
  sealed trait Hover
    extends ejDotWebDotAllLib.ejNs.TooltipNs.Trigger
  
  /* 0 */ val Click: Click with scala.Double = js.native
  /* 2 */ val Focus: Focus with scala.Double = js.native
  /* 1 */ val Hover: Hover with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.Trigger with scala.Double] = js.native
}


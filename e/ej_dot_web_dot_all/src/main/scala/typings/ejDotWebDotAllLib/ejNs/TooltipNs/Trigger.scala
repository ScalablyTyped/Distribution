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
  
  val Click: Click with java.lang.String = js.native
  val Focus: Focus with java.lang.String = js.native
  val Hover: Hover with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TooltipNs.Trigger with java.lang.String] = js.native
}


package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarOverflowMode extends js.Object

@JSGlobal("ej.RTE.ToolbarOverflowMode")
@js.native
object ToolbarOverflowMode extends js.Object {
  ///To display the RTE toolbar overflow items as inline toolbar
  @js.native
  sealed trait Inline
    extends ejDotWebDotAllLib.ejNs.RTENs.ToolbarOverflowMode
  
  ///To display the RTE toolbar overflow items as popup
  @js.native
  sealed trait Popup
    extends ejDotWebDotAllLib.ejNs.RTENs.ToolbarOverflowMode
  
  /* 1 */ val Inline: Inline with scala.Double = js.native
  /* 0 */ val Popup: Popup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RTENs.ToolbarOverflowMode with scala.Double] = js.native
}


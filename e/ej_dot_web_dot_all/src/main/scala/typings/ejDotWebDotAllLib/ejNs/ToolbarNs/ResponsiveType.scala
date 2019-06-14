package typings
package ejDotWebDotAllLib.ejNs.ToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponsiveType extends js.Object

@JSGlobal("ej.Toolbar.ResponsiveType")
@js.native
object ResponsiveType extends js.Object {
  ///To display the toolbar overflow items as inline toolbar
  @js.native
  sealed trait Inline
    extends ejDotWebDotAllLib.ejNs.ToolbarNs.ResponsiveType
  
  ///To display the toolbar overflow items as popup
  @js.native
  sealed trait Popup
    extends ejDotWebDotAllLib.ejNs.ToolbarNs.ResponsiveType
  
  /* 1 */ val Inline: Inline with scala.Double = js.native
  /* 0 */ val Popup: Popup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ToolbarNs.ResponsiveType with scala.Double] = js.native
}


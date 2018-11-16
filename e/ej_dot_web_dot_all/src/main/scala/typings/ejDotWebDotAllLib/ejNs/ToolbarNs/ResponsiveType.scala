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
  
  val Inline: Inline with java.lang.String = js.native
  val Popup: Popup with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ToolbarNs.ResponsiveType with java.lang.String] = js.native
}


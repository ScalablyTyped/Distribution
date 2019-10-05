package typings.ejDotWebDotAll.ej.Toolbar

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
  sealed trait Inline extends ResponsiveType
  
  ///To display the toolbar overflow items as popup
  @js.native
  sealed trait Popup extends ResponsiveType
  
  /* 1 */ val Inline: typings.ejDotWebDotAll.ej.Toolbar.ResponsiveType.Inline with Double = js.native
  /* 0 */ val Popup: typings.ejDotWebDotAll.ej.Toolbar.ResponsiveType.Popup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponsiveType with Double] = js.native
}


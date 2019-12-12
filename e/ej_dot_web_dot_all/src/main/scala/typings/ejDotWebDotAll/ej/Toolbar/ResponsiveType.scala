package typings.ejDotWebDotAll.ej.Toolbar

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Toolbar.ResponsiveType.Inline
import typings.ejDotWebDotAll.ej.Toolbar.ResponsiveType.Popup
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponsiveType with Double] = js.native
  /* 1 */ @js.native
  object Inline extends TopLevel[Inline with Double]
  
  /* 0 */ @js.native
  object Popup extends TopLevel[Popup with Double]
  
}

